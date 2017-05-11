package com.gt.examsystem.mapper;

import com.gt.examsystem.dto.ReqAddQuestion;
import com.gt.examsystem.dto.ReqSelectQuestion;
import com.gt.examsystem.dto.ReqUpdateQuestion;
import com.gt.examsystem.entity.QuestionBankInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     * @param reqUpdateQuestion
     * @return
     */
    Integer updateQuestion(@Param("reqUpdateQuestion") ReqUpdateQuestion reqUpdateQuestion );
    /**
     * 查询题目（支持模糊查询）
     *
     * @param reqSelectQuestion
     * @return
     */
    List<QuestionBankInfo> selectQuestion( @Param("reqSelectQuestion") ReqSelectQuestion reqSelectQuestion );

}
