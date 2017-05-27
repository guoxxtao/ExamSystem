package com.gt.examsystem.dto;

/**
 * Created by guotao on 2017/5/5.
 */
public class ReqSelectQuestion {
	/**
	 * 模糊查询题目
	 */
	private String questionTitleLike;

	private Integer questionId;

	private Integer questionDirectionId;

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
}
