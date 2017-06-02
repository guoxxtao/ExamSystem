package com.gt.examsystem.service;

import com.gt.examsystem.dto.*;
import org.springframework.stereotype.Service;

/**
 * Created by guotao on 2017/6/2.
 */
@Service
public interface ExamPaperInfoService {

	/**
	 * 创建考试设置考试信息
	 * @param reqInsertExamInfo
	 * @return ResBaseDTO
	 */
	ResBaseDTO<Integer> insertExamInfo(ReqInsertExamInfo reqInsertExamInfo);
	/**
	 * 自动生成选择题
	 * @param
	 * @return ResBaseDTO
	 */
	ResBaseDTO<Integer> createOption(ReqCreateOption reqCreateOption);
	/**
	 * 自动生成填空题
	 * @param
	 * @return ResBaseDTO
	 */
	ResBaseDTO<Integer> createFillIn(ReqCreateFillIn reqCreateFillIn);
	/**
	 * 自动生成问答题
	 * @param
	 * @return ResBaseDTO
	 */
	ResBaseDTO<Integer> createQuestion(ReqCreateQuestion reqCreateQuestion);
}
