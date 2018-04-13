﻿# Host: localhost  (Version: 5.5.15)
# Date: 2017-01-09 14:46:48
# Generator: MySQL-Front 5.3  (Build 4.214)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "about"
#

DROP TABLE IF EXISTS `about`;
CREATE TABLE `about` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `about_id` int(10) NOT NULL DEFAULT '1' COMMENT '唯一',
  `viedo` varchar(100) DEFAULT NULL COMMENT '视频',
  `title` varchar(100) DEFAULT NULL COMMENT '小标题',
  `title_content` text COMMENT '小标题内容',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `about_id` (`about_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

#
# Data for table "about"
#

INSERT INTO `about` VALUES (1,0,NULL,'部落简介','          爪哇部落是一支由广东金融学院学子自发组织成立的兴趣型计算机技术学习交流团队。\n         <p> 2011年6月，爪哇部落由广东金融学院2009级计科系的几位充满热血的师兄师姐创立诞生，经过6年的发展，已成为一支极具计算机专业性质的团队。爪哇部落立志于向广金学子提供一个计算机专业的学习交流平台，为学院不同专业，不同年级同学提供专业的学习和就业指导。团队秉承着海纳百川的态度，积极热情的展开各种学习交流活动，结合广东金融学院金融的特色，在创新创业的狂潮中，不断进步。</p>\n       <p>  团队宗旨：博采众长，共同进步</p>'),(2,1,NULL,'团队架构',NULL),(3,2,NULL,'加入我们',NULL);
