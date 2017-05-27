/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50635
Source Host           : localhost:3306
Source Database       : examsystem

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-05-27 09:49:17
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
-- Records of test
-- ----------------------------
INSERT INTO `test` VALUES ('23', '1', 'guotao');
INSERT INTO `test` VALUES ('23', '2', 'guo');

-- ----------------------------
-- Table structure for t_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `t_exam_info`;
CREATE TABLE `t_exam_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `exam_id` bigint(20) NOT NULL COMMENT '考试试卷号',
  `exam_start_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '考试开始时间',
  `exam_time_length` int(11) DEFAULT NULL COMMENT '考试时间长度',
  `exam_teacher_name` varchar(255) DEFAULT NULL COMMENT '教师姓名',
  `teacher_id` int(11) DEFAULT NULL COMMENT '创建考试教师ID',
  `option_score` double(11,1) DEFAULT NULL,
  `option_number` int(11) DEFAULT NULL,
  `fillIn_score` double(11,1) DEFAULT NULL,
  `fillIn_number` int(11) DEFAULT NULL,
  `question_score` double(11,1) DEFAULT NULL,
  `question_number` int(11) DEFAULT NULL,
  `total_score` double(11,1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_exam_info
-- ----------------------------

-- ----------------------------
-- Table structure for t_exam_question_info
-- ----------------------------
DROP TABLE IF EXISTS `t_exam_question_info`;
CREATE TABLE `t_exam_question_info` (
  `id` bigint(20) NOT NULL,
  `exam_id` bigint(20) DEFAULT NULL,
  `question_id` int(11) DEFAULT NULL,
  `operator` int(11) DEFAULT '0' COMMENT '操作人（0-电脑 user_id-教师）',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_exam_question_info
-- ----------------------------

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
) ENGINE=InnoDB AUTO_INCREMENT=183 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_login_info
-- ----------------------------
INSERT INTO `t_login_info` VALUES ('172', '131114204', '????', '2017-05-04 16:25:25', '2017-05-04 16:25:25');
INSERT INTO `t_login_info` VALUES ('173', '131114204', '?????????', '2017-05-04 16:26:57', '2017-05-04 16:26:57');
INSERT INTO `t_login_info` VALUES ('174', '131114204', '????', '2017-05-04 18:46:21', '2017-05-04 18:46:21');
INSERT INTO `t_login_info` VALUES ('175', '131114204', '????', '2017-05-04 18:53:00', '2017-05-04 18:53:00');
INSERT INTO `t_login_info` VALUES ('176', '131114204', '????', '2017-05-04 18:54:38', '2017-05-04 18:54:38');
INSERT INTO `t_login_info` VALUES ('177', '131114204', '????', '2017-05-04 18:54:59', '2017-05-04 18:54:59');
INSERT INTO `t_login_info` VALUES ('178', '131114204', '????', '2017-05-04 18:55:26', '2017-05-04 18:55:26');
INSERT INTO `t_login_info` VALUES ('179', '131114204', '????', '2017-05-05 10:44:13', '2017-05-05 10:44:13');
INSERT INTO `t_login_info` VALUES ('180', '131114204', '????', '2017-05-05 11:07:30', '2017-05-05 11:07:30');
INSERT INTO `t_login_info` VALUES ('181', '131114204', '?????????', '2017-05-05 11:07:40', '2017-05-05 11:07:40');
INSERT INTO `t_login_info` VALUES ('182', '131114204', '????', '2017-05-05 16:01:59', '2017-05-05 16:01:59');

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
-- Records of t_question_bank
-- ----------------------------
INSERT INTO `t_question_bank` VALUES ('1', '0', null, '下列各进制数中最大的数是( )', '227O', '227O', '227O', '227O', '227O', '好好学习', '1');
INSERT INTO `t_question_bank` VALUES ('2', '1', null, '不是微型计算机必须的工作环境。', null, null, null, null, '恒温', '天天向上', '1');
INSERT INTO `t_question_bank` VALUES ('3', '2', null, '《计算机软件条例》中所称的计算机软件(简称软件)是指( )', null, null, null, null, '0', '自问自答', '1');
INSERT INTO `t_question_bank` VALUES ('30', '2', null, 'wo', null, null, null, null, 'wo', null, '1');
INSERT INTO `t_question_bank` VALUES ('31', '2', null, '131114204', '131114204', '13', '131114204', '13', '13', '13', '1');
INSERT INTO `t_question_bank` VALUES ('32', '2', null, '????', '', '', '', '', '??', '13', '1');
INSERT INTO `t_question_bank` VALUES ('33', '2', null, '????', '', '', '', '', '??', '13', '1');
INSERT INTO `t_question_bank` VALUES ('34', '2', null, '131114204', '131114204', '13', '131114204', '13', '13', '13', '1');
INSERT INTO `t_question_bank` VALUES ('35', '1', null, '131114204', '131114204', '13', '131114204', '13', '13', '13', '1');
INSERT INTO `t_question_bank` VALUES ('36', '1', null, '131114204', null, null, null, null, null, null, '1');

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
-- Records of t_question_info
-- ----------------------------

-- ----------------------------
-- Table structure for t_score_info
-- ----------------------------
DROP TABLE IF EXISTS `t_score_info`;
CREATE TABLE `t_score_info` (
  `user_id` bigint(20) NOT NULL,
  `exam_id` bigint(20) NOT NULL,
  `user_score_question` double(10,2) DEFAULT NULL,
  `user_score_fillIn` double(10,2) DEFAULT NULL,
  `user_score_option` double(10,2) DEFAULT NULL,
  `user_score` double(10,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_score_info
-- ----------------------------

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

-- ----------------------------
-- Records of t_user_info
-- ----------------------------
INSERT INTO `t_user_info` VALUES ('1', '131114204', '郭涛', '0', '123', '1');
INSERT INTO `t_user_info` VALUES ('2', '13111424', '郭小涛', '0', '123', '1');
INSERT INTO `t_user_info` VALUES ('3', '31114204', '郭老师', '1', '123', '1');
