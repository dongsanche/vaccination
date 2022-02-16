DROP Database if exists `hospital`;
CREATE DATABASE `hospital`;

USE `hospital`;

DROP TABLE IF EXISTS `hospital`;

CREATE TABLE `hospital`
(
    `id`        bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `name`      varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '医院名称',
    `addressDesc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci;


insert into `hospital`(`id`,  `name`  , `addressDesc`)
values (1, '医院1', '北京市东城区东交民巷44号'),
       (2, '医院2', '北京市海淀区丹棱街3号'),
       (3, '医院3', '北京市东城区美术馆后街23号'),
       (4, '医院4', '北京市朝阳区朝阳门南大街14号'),
       (5, '医院5', '北京市西城区三里河路南三巷3号'),
       (6, '医院6', '北京市顺义区高丽营镇金马工业区18号');


DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    `id`       bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `inorder`  int(10)                             DEFAULT NULL COMMENT '是否预约（1：未 2：已）',
    `name`      varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '姓名',
    `password`  varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户密码',
    `orderTime` date                            DEFAULT NULL COMMENT '预约时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 19
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci;


insert into `user`(`id`, `inorder`, `name` , `password`, `orderTime`)
values (1, 0, '1234567', '123', '1983-10-10'),
       (2, 0, '李明', '456', '1983-12-10'),
       (5, 0, '韩路彪', '789', '1984-06-05');


