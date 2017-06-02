package com.gt.examsystem.controller;

import com.gt.examsystem.dto.ReqInsertExamInfo;
import com.gt.examsystem.dto.ResBaseDTO;
import com.gt.examsystem.service.ExamPaperInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by guotao on 2017/6/2.
 */
@Controller
@RequestMapping(value = "examPaperInfo")
public class ExamInfoController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExamInfoController.class);

	@Autowired
	@Qualifier("examPaperInfoServiceImpl")
	private ExamPaperInfoService examPaperInfoService;

	@RequestMapping(value = "/insertExamPaperInfo.do", method = RequestMethod.POST)
	@ResponseBody
	public ResBaseDTO<Integer> insertExamPaperInfo(@RequestBody @Validated ReqInsertExamInfo reqInsertExamInfo, BindingResult bindingResult){

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("insertExamPaperInfo(reqInsertExamInfo = {}) - start", reqInsertExamInfo);
		}

		ResBaseDTO<Integer> resBaseDTO = new ResBaseDTO<Integer>();

		if (bindingResult.hasErrors()) {
			resBaseDTO.setFlag(0);
			resBaseDTO.setMessage(bindingResult.getAllErrors().get(0).getDefaultMessage());
			resBaseDTO.setData(null);
		} else {
			resBaseDTO = examPaperInfoService.insertExamInfo(reqInsertExamInfo);
		}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("insertExamPaperInfo(resBaseDTO = {}) - end", resBaseDTO);
		}

		return resBaseDTO;

	}
}
