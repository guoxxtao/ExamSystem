package com.gt.examsystem.mapper;

import com.gt.examsystem.dto.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guotao on 2017/6/2.
 */
public interface ExamPaperInfoMapper {

/**
 * 创建考试，设置考试信息
 */
	Integer insertExamInfo(@Param("reqInsertExamInfo") ReqInsertExamInfo reqInsertExamInfo);
	/**
	 * 自动生成选择题
	 */
	Integer createOption(@Param("reqCreateOption")ReqCreateOption reqCreateOption);
	/**
	 * 自动生成问答题
	 */
	Integer createQuestion(@Param("reqCreateQuestion")ReqCreateQuestion reqCreateQuestion);
	/**
	 * 自动生成填空题
	 */
	Integer createFillIn(@Param("reqCreateFillIn")ReqCreateFillIn reqCreateFillIn);
	/**
	 * 根据条件，随机锁定题号
	 */
	List<Integer> selectQuestionId(@Param("questionType") Integer questionType,@Param("count")Integer count);
}
