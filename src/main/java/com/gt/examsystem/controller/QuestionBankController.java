package com.gt.examsystem.controller;

import com.gt.examsystem.dto.ReqAddQuestion;
import com.gt.examsystem.dto.ResBaseDTO;
import com.gt.examsystem.service.QuestionBankService;
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

import javax.servlet.http.HttpSession;

/**
 * Created by guotao on 2017/5/5.
 */
@Controller
@RequestMapping(value = "questionBank")
public class QuestionBankController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionBankController.class);

    @Autowired
    @Qualifier("questionBankServiceImpl")
    private QuestionBankService questionBankService;

    @RequestMapping(value = "/addQuestion", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<String> addQuestion( @RequestBody @Validated ReqAddQuestion reqAddQuestion, BindingResult bindingResult, HttpSession httpSession ) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("addQuestion(questionBankInfo = {}) - start", reqAddQuestion);
        }

        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();
        if (httpSession.getAttribute("isLogin") == "1") {
            if (!bindingResult.hasErrors()) {
                resBaseDTO = questionBankService.addQuestion(reqAddQuestion);
                resBaseDTO.setData("");
                resBaseDTO.setFlag(1);
                resBaseDTO.setMessage("ok");
            }
        } else {
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage(bindingResult.getAllErrors().get(0).getDefaultMessage());
            resBaseDTO.setData(null);
        }

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("addQuestion(resBaseDTO = {}) - end", resBaseDTO);
        }

        return resBaseDTO;
    }
}
