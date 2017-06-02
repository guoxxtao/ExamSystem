package com.gt.examsystem.entity;

/**
 * Created by guotao on 2017/6/2.
 */
public class ExamScoreInfo {

	/**
	 * 	 学生ID
	 */
	private Integer userId;
	/**
	 * 	 考试ID
	 */
	private Integer examId;
	/**
	 * 选择题分数
	 */
	private Double userOptionScore;
	/**
	 * 填空题分数
	 */
	private Double userFillInScore;
	/**
	 * 问答题分数
	 */
	private Double userQuestionScore;
	/**
	 * 总分数
	 */
	private Double userTotalScore;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Double getUserOptionScore() {
		return userOptionScore;
	}

	public void setUserOptionScore(Double userOptionScore) {
		this.userOptionScore = userOptionScore;
	}

	public Double getUserFillInScore() {
		return userFillInScore;
	}

	public void setUserFillInScore(Double userFillInScore) {
		this.userFillInScore = userFillInScore;
	}

	public Double getUserQuestionScore() {
		return userQuestionScore;
	}

	public void setUserQuestionScore(Double userQuestionScore) {
		this.userQuestionScore = userQuestionScore;
	}

	public Double getUserTotalScore() {
		return userTotalScore;
	}

	public void setUserTotalScore(Double userTotalScore) {
		this.userTotalScore = userTotalScore;
	}
}
