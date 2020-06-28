DROP TABLE IF EXISTS `testcase`;

CREATE TABLE `testcase` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `caseName` varchar(50) NOT NULL DEFAULT '',
  `outTime` int(10) NOT NULL DEFAULT '0',
  `caseDesc` varchar(50) NOT NULL DEFAULT '',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

insert  into `testcase`(`id`,`caseName`,`outTime`,`caseDesc`,`createTime`) values (1,'test',2,'描述','2020-06-25 16:52:00');
