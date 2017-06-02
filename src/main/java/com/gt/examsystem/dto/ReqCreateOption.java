package com.gt.examsystem.dto;

import java.util.List;

/**
 * Created by guotao on 2017/6/2.
 */
public class ReqCreateOption {

	private Integer examId;

	private List<Integer> questionId;

	private Double optionScore;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public List<Integer> getQuestionId() {
		return questionId;
	}

	public void setQuestionId(List<Integer> questionId) {
		this.questionId = questionId;
	}

	public Double getOptionScore() {
		return optionScore;
	}

	public void setOptionScore(Double optionScore) {
		this.optionScore = optionScore;
	}

	@Override
	public String toString() {
		return "ReqCreateOption{" +
				"examId=" + examId +
				", questionId=" + questionId +
				", optionScore=" + optionScore +
				'}';
	}
}
