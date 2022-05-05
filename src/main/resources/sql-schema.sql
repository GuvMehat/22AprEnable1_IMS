drop schema ims;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;


CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);


CREATE TABLE IF NOT EXISTS `items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) DEFAULT NULL,
    `value` DOUBLE(10) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `orders` (
	`id` INT(11) NOT NULL AUTO_INCREMENT, 
	`customer_id` INT(11) NOT NULL ,
    `cost` DOUBLE(10) DEFAULT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`customer_id`) REFERENCES customers(`id`)
);


CREATE TABLE IF NOT EXISTS `orders_items` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`order_id` INT(11) NOT NULL,
	`item_id` INT(11) NOT NULL,
	PRIMARY KEY(`id`),
	FOREIGN KEY (`order_id`) REFERENCES orders(id),
	FOREIGN KEY (`item_id`) REFERENCES items(id)
);