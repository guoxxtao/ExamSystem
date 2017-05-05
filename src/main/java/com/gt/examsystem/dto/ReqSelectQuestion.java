package com.gt.examsystem.dto;

/**
 * Created by guotao on 2017/5/5.
 */
public class ReqSelectQuestion {
    /**
    * 模糊查询题目
    * */
    private String questionTitleLike;

    private String questionId;

    public String getQuestionTitleLike() {
        return questionTitleLike;
    }

    public void setQuestionTitleLike( String questionTitleLike ) {
        this.questionTitleLike = questionTitleLike;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId( String questionId ) {
        this.questionId = questionId;
    }
}
