package com.gt.examsystem.service;

import com.gt.examsystem.dto.ReqAddQuestion;
import com.gt.examsystem.dto.ReqSelectQuestion;
import com.gt.examsystem.dto.ReqUpdateQuestion;
import com.gt.examsystem.dto.ResBaseDTO;
import com.gt.examsystem.entity.QuestionBankInfo;
import org.springframework.stereotype.Service;

/**
 * Created by guotao on 2017/5/5.
 */
@Service("questionBankService")
public interface QuestionBankService {

    ResBaseDTO<String> addQuestion( ReqAddQuestion reqAddQuestion );

    ResBaseDTO<String> deleteQuestion( Integer questionId );

    ResBaseDTO<String> updateQuestion( ReqUpdateQuestion reqUpdateQuestion );

    ResBaseDTO<QuestionBankInfo> selectQuestion( ReqSelectQuestion reqSelectQuestion );
}
