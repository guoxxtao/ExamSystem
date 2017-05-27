package com.gt.examsystem.service.impl;

import com.gt.examsystem.dto.*;
import com.gt.examsystem.entity.QuestionBankInfo;
import com.gt.examsystem.mapper.QuestionBankMapper;
import com.gt.examsystem.service.QuestionBankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guotao on 2017/5/5.
 */
@Service("questionBankServiceImpl")
public class QuestionBankServiceImpl implements QuestionBankService {

	private static final Logger LOGGER = LoggerFactory.getLogger(QuestionBankServiceImpl.class);

	@Autowired
	QuestionBankMapper questionBankMapper;

	@Override
	public ResBaseDTO<String> addQuestion(ReqAddQuestion reqAddQuestion) {

		ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

		if (reqAddQuestion != null) {

			Integer flag = questionBankMapper.addQuestion(reqAddQuestion);
			if (flag > 0) {
				resBaseDTO.setData("");
				resBaseDTO.setFlag(1);
				resBaseDTO.setMessage("ok");
				return resBaseDTO;
			}
		}
		resBaseDTO.setData("");
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("题目添加错误！");

		return resBaseDTO;
	}

	@Override
	public ResBaseDTO<String> deleteQuestion(Integer questionId) {

		ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();
		if (questionId != null) {
			Integer flag = questionBankMapper.deleteQuestion(questionId);

			if (flag > 0) {
				resBaseDTO.setData("");
				resBaseDTO.setFlag(1);
				resBaseDTO.setMessage("ok");
				return resBaseDTO;
			}
		}
		resBaseDTO.setData("");
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("题目删除错误！");

		return resBaseDTO;
	}

	@Override
	public ResBaseDTO<String> updateQuestion(ReqUpdateQuestion reqUpdateQuestion) {
		ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

		if (reqUpdateQuestion != null) {
			Integer flag = questionBankMapper.updateQuestion(reqUpdateQuestion);

			if (flag > 0) {
				resBaseDTO.setData("");
				resBaseDTO.setFlag(1);
				resBaseDTO.setMessage("ok");
				return resBaseDTO;
			}
		}
		resBaseDTO.setData("");
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("题目更新错误！");

		return resBaseDTO;
	}

	@Override
	public ResBaseDTO<List<QuestionBankInfo>> selectQuestion(ReqSelectQuestion reqSelectQuestion) {
		ResBaseDTO<List<QuestionBankInfo>> resBaseDTO = new ResBaseDTO<List<QuestionBankInfo>>();
		List<QuestionBankInfo> questionBankInfoList = new ArrayList<QuestionBankInfo>();

		ResSelectQuestionDTO resSelectQuestionDTO = new ResSelectQuestionDTO();
		if (reqSelectQuestion != null) {
			questionBankInfoList = questionBankMapper.selectQuestion(reqSelectQuestion);

			if (questionBankInfoList != null && questionBankInfoList.size() > 0) {

				resBaseDTO.setFlag(1);
				resBaseDTO.setMessage("ok");
				resBaseDTO.setData(questionBankInfoList);
				return resBaseDTO;
			}
		}
		resBaseDTO.setData(null);
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("查询条件不匹配！");


		return resBaseDTO;
	}

	@Override
	public ResBaseDTO<List<QuestionBankInfo>> selectQuestionById(List<Integer> questionId) {

		ResBaseDTO<List<QuestionBankInfo>> resBaseDTO = new ResBaseDTO<List<QuestionBankInfo>>();
		List<QuestionBankInfo> questionBankInfoList = new ArrayList<QuestionBankInfo>();
		if (questionId != null && questionId.size() > 0) {
			questionBankInfoList = questionBankMapper.selectQuestionById(questionId);

			if (questionBankInfoList != null) {

				resBaseDTO.setFlag(1);
				resBaseDTO.setMessage("ok");
				resBaseDTO.setData(questionBankInfoList);
				return resBaseDTO;
			}
		}
		resBaseDTO.setData(null);
		resBaseDTO.setFlag(0);
		resBaseDTO.setMessage("查询条件不匹配！");


		return resBaseDTO;
	}
}
