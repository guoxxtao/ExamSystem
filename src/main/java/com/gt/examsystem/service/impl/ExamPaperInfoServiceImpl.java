package com.gt.examsystem.service.impl;

import com.gt.examsystem.dto.*;
import com.gt.examsystem.mapper.ExamPaperInfoMapper;
import com.gt.examsystem.service.ExamPaperInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guotao on 2017/6/2.
 */
@Service("examPaperInfoServiceImpl")
public class ExamPaperInfoServiceImpl implements ExamPaperInfoService {

	@Autowired
	ExamPaperInfoMapper examPaperInfoMapper;

	@Override
	public ResBaseDTO<Integer> insertExamInfo(ReqInsertExamInfo reqInsertExamInfo) {

		ResBaseDTO<Integer> resBaseDTO = new ResBaseDTO<Integer>();
		ReqCreateOption reqCreateOption = new ReqCreateOption();
		ReqCreateFillIn reqCreateFillIn = new ReqCreateFillIn();
		ReqCreateQuestion reqCreateQuestion = new ReqCreateQuestion();

		Integer examId = reqInsertExamInfo.getExamId();
		Double optionScore = reqInsertExamInfo.getOptionScore();
		Double fillInScore = reqInsertExamInfo.getFillInScore();
		Double questionScore = reqInsertExamInfo.getQuestionScore();
		Integer optionNumber = reqInsertExamInfo.getOptionNumber();
		Integer fillInNumber = reqInsertExamInfo.getFillInNumber();
		Integer questionNumber = reqInsertExamInfo.getQuestionNumber();


		List<Integer> optionQuestionId = new ArrayList<Integer>();
		optionQuestionId = examPaperInfoMapper.selectQuestionId(0,optionNumber);
		List<Integer> fillInQuestionId = new ArrayList<Integer>();
		fillInQuestionId = examPaperInfoMapper.selectQuestionId(1,fillInNumber);
		List<Integer> questionQuestionId = new ArrayList<Integer>();
		questionQuestionId = examPaperInfoMapper.selectQuestionId(2,questionNumber);

		reqCreateOption.setExamId(examId);
		reqCreateOption.setQuestionId(optionQuestionId);
		reqCreateOption.setOptionScore(optionScore);
		reqCreateFillIn.setExamId(examId);
		reqCreateFillIn.setQuestionId(fillInQuestionId);
		reqCreateFillIn.setFillInScore(fillInScore);
		reqCreateQuestion.setExamId(examId);
		reqCreateQuestion.setQuestionId(questionQuestionId);
		reqCreateQuestion.setQuestionScore(questionScore);

		createFillIn(reqCreateFillIn);
		createOption(reqCreateOption);
		createQuestion(reqCreateQuestion);

		Integer insertExamInfo = null;
		if (reqInsertExamInfo != null) {
			insertExamInfo = examPaperInfoMapper.insertExamInfo(reqInsertExamInfo);
		}
		if (insertExamInfo > 0) {
			resBaseDTO.setFlag(1);
			resBaseDTO.setMessage("ok");
			resBaseDTO.setData(null);
			return resBaseDTO;
		}
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("error");
		resBaseDTO.setData(null);
		return resBaseDTO;
	}

	@Override
	public ResBaseDTO<Integer> createOption(ReqCreateOption reqCreateOption) {

		ResBaseDTO<Integer> resBaseDTO = new ResBaseDTO<Integer>();

		Integer createOption = examPaperInfoMapper.createOption(reqCreateOption);

		if (createOption > 0) {
			resBaseDTO.setFlag(1);
			resBaseDTO.setMessage("选择题生成成功");
			resBaseDTO.setData(null);
			return resBaseDTO;
		}
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("error");
		resBaseDTO.setData(null);
		return resBaseDTO;
	}

	@Override
	public ResBaseDTO<Integer> createFillIn(ReqCreateFillIn reqCreateFillIn) {
		ResBaseDTO<Integer> resBaseDTO = new ResBaseDTO<Integer>();

		Integer createFillIn = examPaperInfoMapper.createFillIn(reqCreateFillIn);

		if (createFillIn > 0) {
			resBaseDTO.setFlag(1);
			resBaseDTO.setMessage("填空题生成成功");
			resBaseDTO.setData(null);
			return resBaseDTO;
		}
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("error");
		resBaseDTO.setData(null);
		return resBaseDTO;
	}

	@Override
	public ResBaseDTO<Integer> createQuestion(ReqCreateQuestion reqCreateQuestion) {
		ResBaseDTO<Integer> resBaseDTO = new ResBaseDTO<Integer>();

		Integer createQuestion = examPaperInfoMapper.createQuestion(reqCreateQuestion);

		if (createQuestion > 0) {
			resBaseDTO.setFlag(1);
			resBaseDTO.setMessage("问答题生成成功");
			resBaseDTO.setData(null);
			return resBaseDTO;
		}
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("error");
		resBaseDTO.setData(null);
		return resBaseDTO;
	}
}
