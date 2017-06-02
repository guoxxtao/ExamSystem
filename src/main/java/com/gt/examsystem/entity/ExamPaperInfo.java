package com.gt.examsystem.entity;

import java.util.Date;

/**
 * Created by guotao on 2017/6/2.
 */
public class ExamPaperInfo {
	/**
	 * 考试ID
	 */
	private Integer examId;
	/**
	 * 考试开始时间
	 */
	private Date  examStartTime;
	/**
	 * 考试结束时间
	 */
	private Date  examEndTime;
	/**
	 * 考试时长
	 */
	private Integer examTimeLength;
	/**
	 * 出题教师ID
	 */
	private Integer teacherId;
	/**
	 * 选择题分数设置
	 */
	private Double optionScore;
	/**
	 * 填空题分数设置
	 */
	private Double fillInScore;
	/**
	 * 问答题题分数设置
	 */
	private Double questionScore;
	/**
	 * 选择题数
	 */
	private Integer optionNumber;
	/**
	 * 填空题数
	 */
	private Integer fillInNumber;
	/**
	 * 问答题数
	 */
	private Integer questionNumber;
	/**
	 * 总分数设置
	 */
	private Double totalScore;

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public Date getExamStartTime() {
		return examStartTime;
	}

	public void setExamStartTime(Date examStartTime) {
		this.examStartTime = examStartTime;
	}

	public Date getExamEndTime() {
		return examEndTime;
	}

	public void setExamEndTime(Date examEndTime) {
		this.examEndTime = examEndTime;
	}

	public Integer getExamTimeLength() {
		return examTimeLength;
	}

	public void setExamTimeLength(Integer examTimeLength) {
		this.examTimeLength = examTimeLength;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public Double getOptionScore() {
		return optionScore;
	}

	public void setOptionScore(Double optionScore) {
		this.optionScore = optionScore;
	}

	public Double getFillInScore() {
		return fillInScore;
	}

	public void setFillInScore(Double fillInScore) {
		this.fillInScore = fillInScore;
	}

	public Double getQuestionScore() {
		return questionScore;
	}

	public void setQuestionScore(Double questionScore) {
		this.questionScore = questionScore;
	}

	public Integer getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(Integer optionNumber) {
		this.optionNumber = optionNumber;
	}

	public Integer getFillInNumber() {
		return fillInNumber;
	}

	public void setFillInNumber(Integer fillInNumber) {
		this.fillInNumber = fillInNumber;
	}

	public Integer getQuestionNumber() {
		return questionNumber;
	}

	public void setQuestionNumber(Integer questionNumber) {
		this.questionNumber = questionNumber;
	}

	public Double getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Double totalScore) {
		this.totalScore = totalScore;
	}
}
