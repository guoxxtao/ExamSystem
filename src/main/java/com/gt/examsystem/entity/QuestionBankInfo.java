package com.gt.examsystem.entity;

/**
 * Created by guotao on 2017/5/5.
 */
public class QuestionBankInfo {

    private Integer questionId;
    /**
    * 题目类型
    * */
    private Integer questionType;
    /**
    * 题目
    * */
    private String questionTitle;
    /**
    * 标准答案
    * */
    private String questionAnswer;

    private String questionOptionA;
    private String questionOptionB;
    private String questionOptionC;
    private String questionOptionD;
    /**
    * 题目解析
    * */
    private String questionParse;
    /**
     * 题目知识点ID
     */
    private Integer questionDirectionId;

    public Integer getQuestionDirectionId() {
        return questionDirectionId;
    }

    public void setQuestionDirectionId(Integer questionDirectionId) {
        this.questionDirectionId = questionDirectionId;
    }

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
