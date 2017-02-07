/*
Navicat MySQL Data Transfer

Source Server         : JAVA
Source Server Version : 50540
Source Host           : localhost:3306
Source Database       : demo

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-02-07 18:21:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `personId` int(11) NOT NULL AUTO_INCREMENT,
  `firstName` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `middleName` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `lastName` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `phone` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`personId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', 'Ramazan', null, 'ABAŞ', 'ramazan.abas@gmail.com', '5555555555');
INSERT INTO `person` VALUES ('2', 'Funda', null, 'KORKMAZ', 'funda.korkmaz@gmail.com', '5333333333');
INSERT INTO `person` VALUES ('3', 'Yasin', null, 'ERDOĞAN', 'yasin.erdogan@gmail.com', '5444444444');
INSERT INTO `person` VALUES ('4', 'Faik', null, 'TURAN', 'turanfaik@hotmail.com', '5666666666');
