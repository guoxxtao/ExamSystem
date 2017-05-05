package com.gt.examsystem.service.impl;

import com.gt.examsystem.dto.ReqAddQuestion;
import com.gt.examsystem.dto.ReqSelectQuestion;
import com.gt.examsystem.dto.ReqUpdateQuestion;
import com.gt.examsystem.dto.ResBaseDTO;
import com.gt.examsystem.entity.QuestionBankInfo;
import com.gt.examsystem.mapper.QuestionBankMapper;
import com.gt.examsystem.service.QuestionBankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by guotao on 2017/5/5.
 */
@Service("questionBankServiceImpl")
public class QuestionBankServiceImpl implements QuestionBankService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionBankServiceImpl.class);

    @Autowired
    QuestionBankMapper questionBankMapper;

    @Override
    public ResBaseDTO<String> addQuestion( ReqAddQuestion reqAddQuestion ) {

        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

        if (reqAddQuestion != null) {

            Integer flag = questionBankMapper.addQuestion(reqAddQuestion);
            if (flag > 0) {
                resBaseDTO.setData("");
                resBaseDTO.setFlag(1);
                resBaseDTO.setMessage("ok");
            }
        } else {
            resBaseDTO.setData("");
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage("题目添加错误！");
        }
        return resBaseDTO;
    }

    @Override
    public ResBaseDTO<String> deleteQuestion( Integer questionId ) {

        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();
        if (questionId != null) {
            Integer flag = questionBankMapper.deleteQuestion(questionId);

            if (flag > 0) {
                resBaseDTO.setData("");
                resBaseDTO.setFlag(1);
                resBaseDTO.setMessage("ok");
            }
        } else {
            resBaseDTO.setData("");
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage("题目删除错误！");
        }
        return resBaseDTO;
    }

    @Override
    public ResBaseDTO<String> updateQuestion( ReqUpdateQuestion reqUpdateQuestion ) {
        ResBaseDTO<String> resBaseDTO = new ResBaseDTO<String>();

        if (reqUpdateQuestion != null) {
            Integer flag = questionBankMapper.updateQuestion(reqUpdateQuestion);

            if (flag > 0) {
                resBaseDTO.setData("");
                resBaseDTO.setFlag(1);
                resBaseDTO.setMessage("ok");
            }
        } else {
            resBaseDTO.setData("");
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage("题目更新错误！");
        }
        return resBaseDTO;
    }

    @Override
    public ResBaseDTO<QuestionBankInfo> selectQuestion( ReqSelectQuestion reqSelectQuestion ) {
        ResBaseDTO<QuestionBankInfo> resBaseDTO = new ResBaseDTO<QuestionBankInfo>();
        QuestionBankInfo questionBankInfo = new QuestionBankInfo();

        if (reqSelectQuestion != null) {
            questionBankInfo = questionBankMapper.selectQuestion(reqSelectQuestion);

            if (questionBankInfo != null) {
                resBaseDTO.setFlag(1);
                resBaseDTO.setMessage("ok");
                resBaseDTO.setData(questionBankInfo);
            }
        } else {
            resBaseDTO.setData(null);
            resBaseDTO.setFlag(0);
            resBaseDTO.setMessage("查询条件不匹配！");
        }

        return resBaseDTO;
    }
}
