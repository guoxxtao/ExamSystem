package com.gt.examsystem.dto;

import java.util.List;

/**
 * Created by guotao on 2017/6/2.
 */
public class ReqCreateFillIn {

	private Integer examId;

	private Double fillInScore;

	private List<Integer> questionId;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Double getFillInScore() {
		return fillInScore;
	}

	public void setFillInScore(Double fillInScore) {
		this.fillInScore = fillInScore;
	}

	public List<Integer> getQuestionId() {
		return questionId;
	}

	public void setQuestionId(List<Integer> questionId) {
		this.questionId = questionId;
	}

	@Override
	public String toString() {
		return "ReqCreateFillIn{" +
				"examId=" + examId +
				", fillInScore=" + fillInScore +
				", questionId=" + questionId +
				'}';
	}
}
