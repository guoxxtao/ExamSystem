/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : examsystem

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-06-02 19:33:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `user_age` int(10) DEFAULT NULL,
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `t_exam_info`;
CREATE TABLE `t_exam_info` (
  `exam_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '考试试卷号',
  `exam_end_time` datetime DEFAULT NULL,
  `exam_start_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '考试开始时间',
  `exam_time_length` int(11) NOT NULL COMMENT '考试时间长度',
  `exam_teacher_name` varchar(255) DEFAULT NULL COMMENT '教师姓名',
  `teacher_id` int(11) DEFAULT NULL COMMENT '创建考试教师ID',
  `option_score` double(11,1) DEFAULT NULL,
  `option_number` int(11) DEFAULT NULL,
  `fillIn_score` double(11,1) DEFAULT NULL,
  `fillIn_number` int(11) DEFAULT NULL,
  `question_score` double(11,1) DEFAULT NULL,
  `question_number` int(11) DEFAULT NULL,
  `total_score` double(11,1) DEFAULT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_exam_question_info
-- ----------------------------
DROP TABLE IF EXISTS `t_exam_question_info`;
CREATE TABLE `t_exam_question_info` (
  `id` bigint(20) NOT NULL,
  `exam_id` bigint(20) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  `score` double DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_login_info
-- ----------------------------
DROP TABLE IF EXISTS `t_login_info`;
CREATE TABLE `t_login_info` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `login_user_id` varchar(50) NOT NULL COMMENT '登录账号',
  `login_action` varchar(50) NOT NULL COMMENT '登录行为',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=189 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_question_bank
-- ----------------------------
DROP TABLE IF EXISTS `t_question_bank`;
CREATE TABLE `t_question_bank` (
  `question_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `question_type` int(1) NOT NULL COMMENT '题目类型 0-选择  1-填空  2-问答',
  `question_direction_id` int(255) DEFAULT NULL,
  `question_title` varchar(255) NOT NULL,
  `question_optionA` varchar(255) DEFAULT NULL,
  `question_optionB` varchar(255) DEFAULT NULL,
  `question_optionC` varchar(255) DEFAULT NULL,
  `question_optionD` varchar(255) DEFAULT NULL,
  `question_answer` varchar(255) DEFAULT NULL,
  `question_parse` varchar(255) DEFAULT NULL,
  `usable_state` int(1) DEFAULT '1' COMMENT '0 不可用  1 可用',
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='试题信息表';

-- ----------------------------
-- Table structure for t_question_info
-- ----------------------------
DROP TABLE IF EXISTS `t_question_info`;
CREATE TABLE `t_question_info` (
  `id` int(11) NOT NULL,
  `question_direcation` varchar(255) DEFAULT NULL,
  `question_direcation_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_score_info
-- ----------------------------
DROP TABLE IF EXISTS `t_score_info`;
CREATE TABLE `t_score_info` (
  `user_id` bigint(20) NOT NULL,
  `exam_id` bigint(20) NOT NULL,
  `user_question_score` double(10,2) DEFAULT NULL,
  `user_fillIn_score` double(10,2) DEFAULT NULL,
  `user_option_score` double(10,2) DEFAULT NULL,
  `user_total_score` double(10,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for t_user_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(20) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_type` int(2) DEFAULT NULL COMMENT '0- 学生 1- 教师',
  `user_password` varchar(255) NOT NULL,
  `usable_state` int(1) NOT NULL DEFAULT '1' COMMENT '状态 0-不可用 1-可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
