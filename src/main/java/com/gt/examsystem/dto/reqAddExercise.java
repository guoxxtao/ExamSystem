package com.gt.examsystem.dto;

/**
 * Created by guotao on 2017/5/5.
 */
public class reqAddExercise {

    private Integer questionId;
    /*
    * 题目类型
    * */
    private Integer questionType;
    /*
    * 题目
    * */
    private String questionTitle;
    /*
    * 标准答案
    * */
    private String questionAnswer;

    /*
    * 题目解析
    * */
    private String questionParse;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId( Integer questionId ) {
        this.questionId = questionId;
    }

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

    public String getQuestionParse() {
        return questionParse;
    }

    public void setQuestionParse( String questionParse ) {
        this.questionParse = questionParse;
    }
}
