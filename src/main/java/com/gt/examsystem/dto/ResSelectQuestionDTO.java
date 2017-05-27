package com.gt.examsystem.dto;

import com.gt.examsystem.entity.QuestionBankInfo;

import java.util.List;

/**
 * Created by guotao on 2017/5/8.
 */
public class ResSelectQuestionDTO {

    List<QuestionBankInfo> questionBankInfoList;

    private List<QuestionBankInfo> getQuestionBankInfoList() {
        return questionBankInfoList;
    }

    public void setQuestionBankInfoList( List<QuestionBankInfo> questionBankInfoList ) {
        this.questionBankInfoList = questionBankInfoList;
    }

}
