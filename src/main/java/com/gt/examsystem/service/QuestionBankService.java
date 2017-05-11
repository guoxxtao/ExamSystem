package com.gt.examsystem.service;

import com.gt.examsystem.dto.*;
import com.gt.examsystem.entity.QuestionBankInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by guotao on 2017/5/5.
 */
@Service("questionBankService")
public interface QuestionBankService {

    ResBaseDTO<String> addQuestion( ReqAddQuestion reqAddQuestion );

    ResBaseDTO<String> deleteQuestion( Integer questionId );

    ResBaseDTO<String> updateQuestion( ReqUpdateQuestion reqUpdateQuestion );

    ResBaseDTO<List<QuestionBankInfo>> selectQuestion( ReqSelectQuestion reqSelectQuestion );
}
