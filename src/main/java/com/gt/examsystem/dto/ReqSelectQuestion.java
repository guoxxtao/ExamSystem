package com.gt.examsystem.dto;

/**
 * Created by guotao on 2017/5/5.
 */
public class ReqSelectQuestion {
	/**
	 * 模糊字段查询题目
	 */
	private String questionTitleLike;

	private Integer questionId;
	/**
	 * 题目知识点
	 */
	private Integer questionDirectionId;
	/**
	 * 题目类型
	 */
	private Integer questionType;

	public Integer getQuestionDirectionId() {
		return questionDirectionId;
	}

	public void setQuestionDirectionId(Integer questionDirectionId) {
		this.questionDirectionId = questionDirectionId;
	}

	public String getQuestionTitleLike() {
		return questionTitleLike;
	}

	public void setQuestionTitleLike(String questionTitleLike) {
		this.questionTitleLike = questionTitleLike;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getQuestionType() {
		return questionType;
	}

	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}
}
