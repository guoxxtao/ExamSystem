package com.gt.examsystem.mapper;

import com.gt.examsystem.dto.ReqAddQuestion;
import com.gt.examsystem.dto.ReqSelectQuestion;
import com.gt.examsystem.entity.QuestionBankInfo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by guotao on 2017/5/5.
 */
public interface QuestionBankMapper {
    /**
     * 增加题目
     *
     * @param reqAddQuestion
     * @return
     */
    Integer addQuestion(@Param("reqAddQuestion") ReqAddQuestion reqAddQuestion );
    /**
     * 删除题目
     *
     * @param questionId
     * @return
     */
    Integer deleteQuestion(@Param("questionId") Integer questionId );
    /**
     * 更新题目
     *
     * @param reqAddQuestion
     * @return
     */
    Integer updateQuestion(@Param("questionBankInfo") ReqAddQuestion reqAddQuestion );
    /**
     * 查询题目（支持模糊查询）
     *
     * @param reqSelectQuestion
     * @return
     */
    QuestionBankInfo selectQuestion(@Param("reqSelectQuestion") ReqSelectQuestion reqSelectQuestion );

}
