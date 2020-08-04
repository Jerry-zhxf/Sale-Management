/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : saletest

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-06-14 09:08:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cpy
-- ----------------------------
DROP TABLE IF EXISTS `cpy`;
CREATE TABLE `cpy` (
  `Item_no` char(13) NOT NULL,
  `Stock_qty` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Item_no`),
  CONSTRAINT `cpy_ibfk_1` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cpy
-- ----------------------------
INSERT INTO `cpy` VALUES ('6904231013294', '740');
INSERT INTO `cpy` VALUES ('6907992810737', '500');
INSERT INTO `cpy` VALUES ('6907992811611', '500');
INSERT INTO `cpy` VALUES ('6907992811703', '10');
INSERT INTO `cpy` VALUES ('6907992812021', '10');
INSERT INTO `cpy` VALUES ('6907992812489', '200');
INSERT INTO `cpy` VALUES ('6907992812786', '900');
INSERT INTO `cpy` VALUES ('6907992812960', '100');
INSERT INTO `cpy` VALUES ('6926859259229', '10');
INSERT INTO `cpy` VALUES ('6926859259861', '10');
INSERT INTO `cpy` VALUES ('6926859289813', '10');
INSERT INTO `cpy` VALUES ('6937383600043', '100');
INSERT INTO `cpy` VALUES ('6937383600463', '100');
INSERT INTO `cpy` VALUES ('6937763087860', '500');
INSERT INTO `cpy` VALUES ('6939501682993', '700');

-- ----------------------------
-- Table structure for degree
-- ----------------------------
DROP TABLE IF EXISTS `degree`;
CREATE TABLE `degree` (
  `Degree` char(5) NOT NULL,
  `Discount` float DEFAULT NULL,
  PRIMARY KEY (`Degree`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of degree
-- ----------------------------
INSERT INTO `degree` VALUES ('V0', '0');
INSERT INTO `degree` VALUES ('V1', '0.95');
INSERT INTO `degree` VALUES ('V2', '0.9');
INSERT INTO `degree` VALUES ('V3', '0.85');
INSERT INTO `degree` VALUES ('V4', '0.8');
INSERT INTO `degree` VALUES ('V5', '0.75');
INSERT INTO `degree` VALUES ('V6', '0.7');
INSERT INTO `degree` VALUES ('V7', '0.65');
INSERT INTO `degree` VALUES ('V8', '0.6');
INSERT INTO `degree` VALUES ('V9', '0.55');

-- ----------------------------
-- Table structure for delivery
-- ----------------------------
DROP TABLE IF EXISTS `delivery`;
CREATE TABLE `delivery` (
  `Delivery_no` char(13) NOT NULL,
  `Order_no` char(25) NOT NULL,
  PRIMARY KEY (`Delivery_no`,`Order_no`),
  KEY `Order_no` (`Order_no`),
  CONSTRAINT `delivery_ibfk_1` FOREIGN KEY (`Order_no`) REFERENCES `order_detail` (`Order_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of delivery
-- ----------------------------
INSERT INTO `delivery` VALUES ('7068581480637', '1CHN300000001190522172100');

-- ----------------------------
-- Table structure for item_info
-- ----------------------------
DROP TABLE IF EXISTS `item_info`;
CREATE TABLE `item_info` (
  `Item_no` char(13) NOT NULL,
  `Item_name` char(20) DEFAULT NULL,
  `Item_type` char(10) DEFAULT NULL,
  `Unit` char(5) DEFAULT NULL,
  PRIMARY KEY (`Item_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item_info
-- ----------------------------
INSERT INTO `item_info` VALUES ('6904231013294', '风衣', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992810737', '大衣', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992811611', '夹克', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992811703', '卫衣', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992812021', '小西装', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992812304', '运动衫', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992812328', '马甲', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992812410', 'T恤', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992812489', '披风', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992812786', '小背心', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992812960', '衬衫', '上衣', '件');
INSERT INTO `item_info` VALUES ('6907992813790', '针织衫', '上衣', '件');
INSERT INTO `item_info` VALUES ('6912345678910', '短袜', '袜子', '双');
INSERT INTO `item_info` VALUES ('6926859259229', '运动鞋', '鞋', '双');
INSERT INTO `item_info` VALUES ('6926859259281', '跑鞋', '鞋', '双');
INSERT INTO `item_info` VALUES ('6926859259410', '凉鞋', '鞋', '双');
INSERT INTO `item_info` VALUES ('6926859259861', '休闲鞋', '鞋', '双');
INSERT INTO `item_info` VALUES ('6926859289813', '板鞋', '鞋', '双');
INSERT INTO `item_info` VALUES ('6926859290086', '拖鞋', '鞋', '双');
INSERT INTO `item_info` VALUES ('6931643472982', '直筒裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6931643475983', '紧身裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6931643476980', '灯笼裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6931643477987', '铅笔裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6931643479981', '工装裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6931643484985', '哈伦裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6935809688095', '短裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6935809688118', '牛仔裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6937383600043', '阔腿裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6937383600463', '背带裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6937763087860', '西裤', '裤子', '件');
INSERT INTO `item_info` VALUES ('6939501682993', '裙裤', '裤子', '件');

-- ----------------------------
-- Table structure for local_temporary_record
-- ----------------------------
DROP TABLE IF EXISTS `local_temporary_record`;
CREATE TABLE `local_temporary_record` (
  `Order_no` char(25) NOT NULL,
  `VIP_no` char(11) DEFAULT NULL,
  `accu_points` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of local_temporary_record
-- ----------------------------
INSERT INTO `local_temporary_record` VALUES ('1CHN300000001190522190100', '15608460296', '100');

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `Order_no` char(25) NOT NULL,
  `Item_no` char(13) NOT NULL,
  `Item_qty` bigint(20) DEFAULT NULL,
  `Item_price` float(8,2) DEFAULT NULL,
  PRIMARY KEY (`Order_no`,`Item_no`),
  KEY `order_detail_item_no` (`Item_no`),
  KEY `Order_no` (`Order_no`),
  CONSTRAINT `order_detail_item_no` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('1CHN300000001190522172100', '6907992812489', '1', '700.00');

-- ----------------------------
-- Table structure for presale
-- ----------------------------
DROP TABLE IF EXISTS `presale`;
CREATE TABLE `presale` (
  `Presale` char(25) NOT NULL,
  `VIP_no` char(12) NOT NULL,
  `Store_no` char(13) NOT NULL,
  `Item_no` char(13) NOT NULL,
  `Subscription` float(8,2) DEFAULT NULL,
  `Reserve_date` datetime DEFAULT NULL,
  `Is_remainder` char(3) DEFAULT NULL,
  PRIMARY KEY (`Presale`),
  KEY `VIP_no` (`VIP_no`),
  KEY `Store_no` (`Store_no`),
  KEY `Item_no` (`Item_no`),
  CONSTRAINT `presale_ibfk_1` FOREIGN KEY (`VIP_no`) REFERENCES `vip` (`VIP_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `presale_ibfk_2` FOREIGN KEY (`Store_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `presale_ibfk_3` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of presale
-- ----------------------------
INSERT INTO `presale` VALUES ('123124214', '15616012058', '1CHN300000002', '6907992811611', '100.00', '2019-10-30 00:00:00', '是');
INSERT INTO `presale` VALUES ('12u4i12u4io', '15616012058', '1CHN300000003', '6907992811703', '100.00', '2010-10-09 00:00:00', '是');
INSERT INTO `presale` VALUES ('1CHN123456', '15608460296', '1CHN300000001', '6907992812021', '100.00', '2010-10-30 00:00:00', '否');
INSERT INTO `presale` VALUES ('1CHN123890809', '15608460296', '1CHN300000002', '6907992812410', '100.00', '2019-06-12 00:00:00', '否');
INSERT INTO `presale` VALUES ('1CHN12412948123', '15616012058', '0CHN410000001', '6907992812786', '20.00', '2019-06-12 00:00:00', '否');
INSERT INTO `presale` VALUES ('1CHN124318249890', '15608460296', '1CHN300000001', '6907992812489', '120.00', '2019-06-12 23:42:23', '是');
INSERT INTO `presale` VALUES ('1CHN300000001190522172815', '15616012058', '1CHN300000001', '6937763087860', '100.00', '2019-05-22 00:00:00', '否');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` char(32) NOT NULL,
  `name` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('402881625c20430b015c204690360000', '超级管理员');
INSERT INTO `role` VALUES ('402881625c20430b015c204710b50001', '售货员');

-- ----------------------------
-- Table structure for sale
-- ----------------------------
DROP TABLE IF EXISTS `sale`;
CREATE TABLE `sale` (
  `Order_no` char(25) NOT NULL,
  `Store_no` char(13) NOT NULL,
  `VIP_no` char(12) NOT NULL,
  `Staff_no` char(10) NOT NULL,
  `Sale_date` datetime DEFAULT NULL,
  `Total_amount` float(8,2) DEFAULT NULL,
  `Pay_amount` float(8,2) DEFAULT NULL,
  `Discount` float DEFAULT NULL,
  `Payment` char(4) DEFAULT NULL,
  `isDelivery` char(3) DEFAULT NULL,
  PRIMARY KEY (`Order_no`),
  KEY `Store_no` (`Store_no`),
  KEY `VIP_no` (`VIP_no`),
  KEY `Staff_no` (`Staff_no`),
  CONSTRAINT `sale_ibfk_1` FOREIGN KEY (`Store_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sale_ibfk_2` FOREIGN KEY (`VIP_no`) REFERENCES `vip` (`VIP_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sale_ibfk_3` FOREIGN KEY (`Staff_no`) REFERENCES `staff_info` (`Staff_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `saleorder_ibfk_2` FOREIGN KEY (`Order_no`) REFERENCES `order_detail` (`Order_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sale
-- ----------------------------
INSERT INTO `sale` VALUES ('1CHN300000001190522172100', '1CHN300000001', '15616012058', '0000000005', '2019-06-14 00:24:46', '200.00', '160.00', '0.8', '现金', '0');

-- ----------------------------
-- Table structure for send
-- ----------------------------
DROP TABLE IF EXISTS `send`;
CREATE TABLE `send` (
  `Store_no` char(13) NOT NULL,
  `Item_no` char(13) NOT NULL,
  `Send_date` datetime NOT NULL,
  `Send_price` float(8,2) DEFAULT NULL,
  `Send_qty` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Store_no`,`Item_no`),
  KEY `Item_no` (`Item_no`),
  CONSTRAINT `send_ibfk_1` FOREIGN KEY (`Store_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `send_ibfk_2` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of send
-- ----------------------------
INSERT INTO `send` VALUES ('1CHN300000001', '6904231013294', '2019-06-13 23:43:57', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN300000001', '6907992811611', '2019-06-12 12:45:18', '700.00', '2');
INSERT INTO `send` VALUES ('1CHN300000001', '6907992812489', '2019-06-13 21:56:06', '700.00', '1');
INSERT INTO `send` VALUES ('1CHN300000002', '6904231013294', '2019-06-13 23:12:27', '700.00', '10');
INSERT INTO `send` VALUES ('1CHN300000002', '6907992812786', '2011-01-07 00:00:00', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN300000003', '6907992812960', '2011-04-03 00:00:00', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN300000004', '6937763087860', '2011-02-09 00:00:00', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN300000005', '6904231013294', '2011-02-07 00:00:00', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN300000005', '6939501682993', '2011-02-08 00:00:00', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN410000001', '6939501682993', '2011-03-05 00:00:00', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN410000002', '6939501682993', '2011-04-07 00:00:00', '700.00', '100');
INSERT INTO `send` VALUES ('1CHN410000003', '6907992811611', '2011-02-07 00:00:00', '700.00', '100');

-- ----------------------------
-- Table structure for staff_info
-- ----------------------------
DROP TABLE IF EXISTS `staff_info`;
CREATE TABLE `staff_info` (
  `Staff_no` char(10) NOT NULL,
  `Store_no` char(13) DEFAULT NULL,
  `Staff_name` char(20) DEFAULT NULL,
  `Basic_salary` bigint(20) DEFAULT NULL,
  `Commission` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Staff_no`),
  KEY `Store_no` (`Store_no`),
  CONSTRAINT `staff_info_ibfk_1` FOREIGN KEY (`Store_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff_info
-- ----------------------------
INSERT INTO `staff_info` VALUES ('0000000001', '0CHN410000001', '孫國建', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000002', '1CHN410000001', '許光強', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000003', '1CHN410000002', '唐小妮', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000004', '1CHN410000003', '李先生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000005', '1CHN300000001', '李先生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000006', '1CHN300000002', '文先生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000007', '1CHN300000003', '林生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000008', '1CHN300000004', '羅生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000009', '1CHN300000005', '賀小姐', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000010', '0CHN410000001', '肖生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000011', '1CHN410000001', '劉小姐', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000012', '1CHN410000002', '王先生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000013', '1CHN410000003', '何先生', '4000', null);
INSERT INTO `staff_info` VALUES ('0000000014', '1CHN300000001', '劉生', '4000', null);

-- ----------------------------
-- Table structure for store_info
-- ----------------------------
DROP TABLE IF EXISTS `store_info`;
CREATE TABLE `store_info` (
  `Store_no` char(13) NOT NULL,
  `Store_name` char(20) DEFAULT NULL,
  `Store_addr` char(20) DEFAULT NULL,
  `Manager` char(20) DEFAULT NULL,
  `Tel` char(55) DEFAULT NULL,
  PRIMARY KEY (`Store_no`),
  KEY `Store_no` (`Store_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_info
-- ----------------------------
INSERT INTO `store_info` VALUES ('0CHN410000001', '线上旗舰店', '线上', 'Derek J. Hinks', '0755-88861812;');
INSERT INTO `store_info` VALUES ('1CHN300000001', '天津门店001', '天津南开区', 'MIKE CHEN', '0769-85311311;');
INSERT INTO `store_info` VALUES ('1CHN300000002', '天津门店002', '天津南开区', 'KERRIN HARRISON', '0769-87885976;');
INSERT INTO `store_info` VALUES ('1CHN300000003', '天津门店003', '天津南开区', 'Grace Wong　', '0755-84258668;');
INSERT INTO `store_info` VALUES ('1CHN300000004', '天津门店004', '天津南开区', 'xnckdf dfkjncv　', '0755-27247535;');
INSERT INTO `store_info` VALUES ('1CHN300000005', '天津门店005', '天津南开区', 'Prabahar　', '0755-27153092;');
INSERT INTO `store_info` VALUES ('1CHN410000001', '长沙门店001', '长沙岳麓区', 'MICHAEL O’TOOLE', '0752-263196;13556637185;');
INSERT INTO `store_info` VALUES ('1CHN410000002', '长沙门店002', '长沙岳麓区', 'ZENTA KRUZE', '0755-82533518;');
INSERT INTO `store_info` VALUES ('1CHN410000003', '长沙门店003', '长沙岳麓区', 'MR YEHOUDA POURMAN', '0769-83568702;');

-- ----------------------------
-- Table structure for store_itemsale
-- ----------------------------
DROP TABLE IF EXISTS `store_itemsale`;
CREATE TABLE `store_itemsale` (
  `Store_no` char(13) NOT NULL,
  `Item_no` char(13) NOT NULL,
  `Sale_qty` bigint(20) DEFAULT NULL,
  `Amount` float(8,2) DEFAULT NULL,
  `Sale_date` datetime NOT NULL,
  PRIMARY KEY (`Store_no`,`Item_no`),
  KEY `store_itemsale_ibfk_2` (`Item_no`),
  CONSTRAINT `store_itemsale_ibfk_1` FOREIGN KEY (`Store_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_itemsale_ibfk_2` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_itemsale
-- ----------------------------
INSERT INTO `store_itemsale` VALUES ('1CHN300000001', '6907992812489', '1', '700.00', '2019-05-22 19:07:00');

-- ----------------------------
-- Table structure for store_stock_info
-- ----------------------------
DROP TABLE IF EXISTS `store_stock_info`;
CREATE TABLE `store_stock_info` (
  `Store_no` char(13) NOT NULL,
  `Item_no` char(13) NOT NULL,
  `Sale_price` float(8,2) DEFAULT NULL,
  `Quality` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`Store_no`,`Item_no`),
  KEY `store_stock_info_ibfk_2` (`Item_no`),
  CONSTRAINT `store_stock_info_ibfk_1` FOREIGN KEY (`Store_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `store_stock_info_ibfk_2` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of store_stock_info
-- ----------------------------
INSERT INTO `store_stock_info` VALUES ('1CHN300000001', '6904231013294', '700.00', '80');
INSERT INTO `store_stock_info` VALUES ('1CHN300000001', '6907992812489', '700.00', '100');
INSERT INTO `store_stock_info` VALUES ('1CHN300000002', '6904231013294', '700.00', '140');
INSERT INTO `store_stock_info` VALUES ('1CHN300000002', '6907992812786', '700.00', '100');
INSERT INTO `store_stock_info` VALUES ('1CHN300000003', '6904231013294', '700.00', '10');
INSERT INTO `store_stock_info` VALUES ('1CHN300000003', '6907992812960', '700.00', '100');
INSERT INTO `store_stock_info` VALUES ('1CHN300000004', '6937763087860', '700.00', '100');
INSERT INTO `store_stock_info` VALUES ('1CHN300000005', '6904231013294', '700.00', '100');
INSERT INTO `store_stock_info` VALUES ('1CHN300000005', '6939501682993', '700.00', '101');
INSERT INTO `store_stock_info` VALUES ('1CHN410000001', '6939501682993', '700.00', '99');
INSERT INTO `store_stock_info` VALUES ('1CHN410000002', '6939501682993', '700.00', '100');
INSERT INTO `store_stock_info` VALUES ('1CHN410000003', '6907992811611', '700.00', '100');

-- ----------------------------
-- Table structure for supply
-- ----------------------------
DROP TABLE IF EXISTS `supply`;
CREATE TABLE `supply` (
  `Vendor_no` char(16) NOT NULL,
  `Item_no` char(13) NOT NULL,
  `Supply_date` datetime NOT NULL,
  `Supply_quality` bigint(20) DEFAULT NULL,
  `Supply_price` float(8,2) DEFAULT NULL,
  PRIMARY KEY (`Vendor_no`,`Item_no`),
  KEY `supply_ibfk_2` (`Item_no`),
  CONSTRAINT `supply_ibfk_1` FOREIGN KEY (`Vendor_no`) REFERENCES `supply_info` (`Vendor_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `supply_ibfk_2` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supply
-- ----------------------------
INSERT INTO `supply` VALUES ('PD100', '6904231013294', '2010-03-06 00:00:00', '100', '100.00');
INSERT INTO `supply` VALUES ('PF101', '6939501682993', '2010-01-08 00:00:00', '400', '100.00');
INSERT INTO `supply` VALUES ('PH166', '6904231013294', '2019-06-13 20:16:56', '100', '120.00');
INSERT INTO `supply` VALUES ('PH166', '6907992812786', '2019-06-13 20:11:50', '111', '120.00');
INSERT INTO `supply` VALUES ('PH175', '6907992811703', '2019-06-13 20:06:19', '100', '120.00');
INSERT INTO `supply` VALUES ('PH175', '6907992812786', '2010-04-06 00:00:00', '900', '300.00');
INSERT INTO `supply` VALUES ('PJ031', '6937383600043', '2010-09-23 00:00:00', '100', '100.00');
INSERT INTO `supply` VALUES ('PJ045', '6939501682993', '2010-04-05 00:00:00', '300', '200.00');
INSERT INTO `supply` VALUES ('PJ079', '6907992812960', '2010-06-03 00:00:00', '100', '200.00');
INSERT INTO `supply` VALUES ('PJ082', '6907992811611', '2010-06-04 00:00:00', '500', '400.00');
INSERT INTO `supply` VALUES ('PK141', '6937763087860', '2010-02-09 00:00:00', '300', '200.00');
INSERT INTO `supply` VALUES ('PS206', '6907992810737', '2010-02-06 00:00:00', '200', '300.00');
INSERT INTO `supply` VALUES ('PS234', '6904231013294', '2010-04-12 00:00:00', '200', '300.00');
INSERT INTO `supply` VALUES ('PS262', '6907992810737', '2010-01-08 00:00:00', '300', '200.00');
INSERT INTO `supply` VALUES ('PS263', '6907992812489', '2010-02-09 00:00:00', '200', '200.00');
INSERT INTO `supply` VALUES ('PW167', '6937383600463', '1923-02-02 00:00:00', '100', '200.00');
INSERT INTO `supply` VALUES ('PX014B', '6937763087860', '2010-08-07 00:00:00', '200', '300.00');

-- ----------------------------
-- Table structure for supply_info
-- ----------------------------
DROP TABLE IF EXISTS `supply_info`;
CREATE TABLE `supply_info` (
  `Vendor_no` char(16) NOT NULL,
  `Vendor_name` char(20) DEFAULT NULL,
  `Vendor_tel` char(55) DEFAULT NULL,
  `Vendor_email` char(30) DEFAULT NULL,
  `Vendor_addr` char(30) DEFAULT NULL,
  PRIMARY KEY (`Vendor_no`),
  KEY `Vendor_no` (`Vendor_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supply_info
-- ----------------------------
INSERT INTO `supply_info` VALUES ('PD095', '達鑫商貿(東莞)有限公司', '0769-83109319;13509224011;', 'jnolan@wheelchairman.com.au　', '香港新界屯门 建生商场103地铺　');
INSERT INTO `supply_info` VALUES ('PD100', '大立光電股份有限公司', '008864-23593728', 'olli.kalmari@welho.com　', '台北市安和路二段１７５号３楼　');
INSERT INTO `supply_info` VALUES ('PF070A', '鳳凰光學(上海)有限公司', '0760-5591988-808;13380897966;', 'MIOTOOL@OZEMAIL.COM.AU', '台北市建国北路二段６５号１２楼　');
INSERT INTO `supply_info` VALUES ('PF101', '深圳市方圓電子展銷柜', '0755-33369909', 'olayem1@yahoo.com　', '桃园县杨梅镇民丰路７５１号　');
INSERT INTO `supply_info` VALUES ('PH166', '和齊電子(上海)有限公司', '021-69526540', 'miotool@ozemail.com.au　', '香港九龙油麻地 弥敦道494-496号 晋利商业大厦16楼　');
INSERT INTO `supply_info` VALUES ('PH175', '慧創就電子（深圳）有限公司', '00852-24163281;13143993370;', 'succeed@pub1.qz.fj.cn　', 'TIS HQT STUDIO:23 STUBBS RD　');
INSERT INTO `supply_info` VALUES ('PJ031', '東莞今皇光電科技有限公司', '0769-86240999;13215322040;', 'JEEPER@JEEPER.CO.IL', '台北市南京东路４段１２０巷２９弄１１号１楼　');
INSERT INTO `supply_info` VALUES ('PJ045', '上海積晟電子貿易有限公司', '021-54484466-8625', 'Grace Wong　', '台北县深坑乡草地尾９４巷１４号４楼之６　');
INSERT INTO `supply_info` VALUES ('PJ050', '長春東亞光學有限公司', '0755-61333300;13798360210;', 'yamat31@club-internet.fr　', '香港坚尼地城 卑路乍街28号I号铺　');
INSERT INTO `supply_info` VALUES ('PJ079', '景旺電子（深圳）有限公司', ' 0755-29977580', 'sky@cm-sports.com　', '台北市金山南路二段２２２号１楼　');
INSERT INTO `supply_info` VALUES ('PJ082', '深圳市捷信泰電子有限公司', ' 0755-86171422', 'tookd@thaimail.com　', '台北县新店市中兴路三段１３４号３楼　');
INSERT INTO `supply_info` VALUES ('PK141', '长沙市数据库有限公司', '12312312312', '1342512@126.com', '长沙市岳麓区科技园');
INSERT INTO `supply_info` VALUES ('PS206', '深圳市三德冠精密電路科技有限公司', ' 0755-27083480', 'mdu_prabahar@sancharnet.in　', '台北市新明路２９８巷１４弄５号　');
INSERT INTO `supply_info` VALUES ('PS221', '深圳思達電子有限公司', '0755-82878200;', 'linto@apollo.lv', '台北市民权东路二段９２巷１弄２４号　');
INSERT INTO `supply_info` VALUES ('PS234', '思考技研(香港)有限公司', '00852-26666702', 'may.soung@msa.hinet.net　', '桃园县龙潭乡中丰路４６５号　');
INSERT INTO `supply_info` VALUES ('PS255', '世平國際（香港）有限公司', ' 0755-26711655', '1@scooterxp.com　', '香港新界荃湾 美环街1-6号 时贸中心7楼702室　');
INSERT INTO `supply_info` VALUES ('PS262', '湖南省开发有限公司', '11111111111', '123@163.com', '湖南省长沙市岳麓区天马街道');
INSERT INTO `supply_info` VALUES ('PS263', '廣州盛川貿易有限公司', ' 020-85270826', 'scooter@product.cc　', '台北市罗斯福路五段２２５之１号　');
INSERT INTO `supply_info` VALUES ('PW167', '深圳市萬基隆數字通迅有限公司', '0755-82871769', 'CHENZHENBO@YAHOO.COM.CN', '台北市大同区重庆北路三段３号　');
INSERT INTO `supply_info` VALUES ('PX014B', '深圳市迅馳科技有限公司', '0755-83479048', 'SALES@PGNZ.COM', '台北市南京东路五段２９１巷５２号　');

-- ----------------------------
-- Table structure for transfer
-- ----------------------------
DROP TABLE IF EXISTS `transfer`;
CREATE TABLE `transfer` (
  `OutStore_no` char(13) NOT NULL,
  `InStore_no` char(13) NOT NULL,
  `Item_no` char(13) NOT NULL,
  `Transfer_date` datetime NOT NULL,
  `Transfer_qty` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`OutStore_no`,`InStore_no`,`Item_no`),
  KEY `InStore_no` (`InStore_no`),
  KEY `Item_no` (`Item_no`),
  CONSTRAINT `transfer_ibfk_1` FOREIGN KEY (`OutStore_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transfer_ibfk_2` FOREIGN KEY (`InStore_no`) REFERENCES `store_info` (`Store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transfer_ibfk_3` FOREIGN KEY (`Item_no`) REFERENCES `item_info` (`Item_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of transfer
-- ----------------------------
INSERT INTO `transfer` VALUES ('1CHN300000001', '1CHN300000002', '6904231013294', '2019-06-13 23:44:46', '30');
INSERT INTO `transfer` VALUES ('1CHN300000001', '1CHN300000003', '6904231013294', '2019-06-13 23:17:49', '10');
INSERT INTO `transfer` VALUES ('1CHN300000002', '1CHN300000002', '6907992812304', '2019-06-12 12:38:27', '1');
INSERT INTO `transfer` VALUES ('1CHN410000001', '1CHN300000005', '6939501682993', '2019-05-22 19:10:00', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` char(32) NOT NULL,
  `name` char(30) DEFAULT NULL,
  `password` char(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `identify` FOREIGN KEY (`id`) REFERENCES `role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('402881625c20430b015c204690360000', 'admin', 'admin');
INSERT INTO `user` VALUES ('402881625c20430b015c204710b50001', 'sale', 'sale');

-- ----------------------------
-- Table structure for vip
-- ----------------------------
DROP TABLE IF EXISTS `vip`;
CREATE TABLE `vip` (
  `VIP_no` char(12) NOT NULL,
  `Current_point` bigint(20) DEFAULT NULL,
  `Total_point` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`VIP_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vip
-- ----------------------------
INSERT INTO `vip` VALUES ('00000000001', '0', '0');
INSERT INTO `vip` VALUES ('15608460296', '100', '100');
INSERT INTO `vip` VALUES ('15616012058', '100', '100');
