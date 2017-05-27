package com.gt.examsystem.controller;

import com.gt.examsystem.dto.*;
import com.gt.examsystem.entity.QuestionBankInfo;
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
import java.util.List;

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

    @RequestMapping(value = "/addQuestion.do", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<String> addQuestion( @RequestBody @Validated ReqAddQuestion reqAddQuestion, BindingResult bindingResult, HttpSession httpSession ) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("addQuestion(reqAddQuestion = {}) - start", reqAddQuestion);
        }

        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

        if (bindingResult.hasErrors()) {
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage(bindingResult.getAllErrors().get(0).getDefaultMessage());
            resBaseDTO.setData(null);
        } else {
            resBaseDTO = questionBankService.addQuestion(reqAddQuestion);
        }

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("addQuestion(resBaseDTO = {}) - end", resBaseDTO);
        }

        return resBaseDTO;
    }

    @RequestMapping(value = "/deleteQuestion.do", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<String> deleteQuestion( @RequestBody ReqQuestionDTO reqQuestionDTO, HttpSession httpSession ) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("deleteQuestion(questionId = {}) - start", reqQuestionDTO.getQuestionId());
        }

        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

        resBaseDTO = questionBankService.deleteQuestion(reqQuestionDTO.getQuestionId());

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("deleteQuestion(resBaseDTO = {}) - end", resBaseDTO);
        }
        return resBaseDTO;
    }

    @RequestMapping(value = "/updateQuestion.do", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<String> updateQuestion( @RequestBody ReqUpdateQuestion reqUpdateQuestion, HttpSession httpSession ) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("updateQuestion(reqUpdateQuestion = {}) - start", reqUpdateQuestion);
        }

        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

        resBaseDTO = questionBankService.updateQuestion(reqUpdateQuestion);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("updateQuestion(resBaseDTO = {}) - end", resBaseDTO);
        }
        return resBaseDTO;
    }

    @RequestMapping(value = "/selectQuestion.do", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<List<QuestionBankInfo>> selectQuestion( @RequestBody ReqSelectQuestion reqSelectQuestion, HttpSession httpSession ) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("selectQuestion(reqSelectQuestion = {}) - start", reqSelectQuestion);
        }

        ResBaseDTO<List<QuestionBankInfo>> resBaseDTO = new ResBaseDTO<List<QuestionBankInfo>>();

        resBaseDTO = questionBankService.selectQuestion(reqSelectQuestion);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("selectQuestion(resBaseDTO = {}) - end", resBaseDTO);
        }
        return resBaseDTO;
    }

    @RequestMapping(value = "/selectQuestionById.do", method = RequestMethod.POST)
    @ResponseBody
    public ResBaseDTO<List<QuestionBankInfo>> selectQuestionById( @RequestBody List<Integer> questionId) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("selectQuestionById(questionId = {}) - start", questionId);
        }

        ResBaseDTO<List<QuestionBankInfo>> resBaseDTO = new ResBaseDTO<List<QuestionBankInfo>>();

        resBaseDTO = questionBankService.selectQuestionById(questionId);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("selectQuestion(resBaseDTO = {}) - end", resBaseDTO);
        }
        return resBaseDTO;
    }
}
