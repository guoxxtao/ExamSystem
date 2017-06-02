package com.gt.examsystem.dto;

import java.util.List;

/**
 * Created by guotao on 2017/6/2.
 */
public class ReqCreateQuestion {

	private Integer examId;

	private Double questionScore;

	private List<Integer> questionId;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Double getQuestionScore() {
		return questionScore;
	}

	public List<Integer> getQuestionId() {
		return questionId;
	}

	public void setQuestionId(List<Integer> questionId) {
		this.questionId = questionId;
	}

	public void setQuestionScore(Double questionScore) {
		this.questionScore = questionScore;
	}



	@Override
	public String toString() {
		return "ReqCreateQuestion{" +
				"examId=" + examId +
				", questionScore=" + questionScore +
				", questionId=" + questionId +
				'}';
	}
}
