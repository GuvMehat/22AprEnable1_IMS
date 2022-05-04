drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;


-- IMS 13
CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

-- IMS 14
CREATE TABLE IF NOT EXISTS `ims`.`items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `item_name` VARCHAR(40) DEFAULT NULL,
    `value` DOUBLE(6,2) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
