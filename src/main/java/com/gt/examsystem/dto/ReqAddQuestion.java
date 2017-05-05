package com.gt.examsystem.dto;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by guotao on 2017/5/5.
 */
public class ReqAddQuestion {

    /*
    * 题目类型
    * */
    @NotNull(message = "题目类型为空")
    private Integer questionType;
    /*
    * 题目
    * */
    @NotBlank(message = "题目不能为空")
    private String questionTitle;
    /*
    * 标准答案
    * */
    private String questionAnswer;

    private String questionOptionA;
    private String questionOptionB;
    private String questionOptionC;
    private String questionOptionD;
    /*
    * 题目解析
    * */
    private String questionParse;

    public Integer getQuestionType() {
        return questionType;
    }

    public void setQuestionType( Integer questionType ) {
        this.questionType = questionType;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle( String questionTitle ) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer( String questionAnswer ) {
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionOptionA() {
        return questionOptionA;
    }

    public void setQuestionOptionA( String questionOptionA ) {
        this.questionOptionA = questionOptionA;
    }

    public String getQuestionOptionB() {
        return questionOptionB;
    }

    public void setQuestionOptionB( String questionOptionB ) {
        this.questionOptionB = questionOptionB;
    }

    public String getQuestionOptionC() {
        return questionOptionC;
    }

    public void setQuestionOptionC( String questionOptionC ) {
        this.questionOptionC = questionOptionC;
    }

    public String getQuestionOptionD() {
        return questionOptionD;
    }

    public void setQuestionOptionD( String questionOptionD ) {
        this.questionOptionD = questionOptionD;
    }

    public String getQuestionParse() {
        return questionParse;
    }

    public void setQuestionParse( String questionParse ) {
        this.questionParse = questionParse;
    }
}
