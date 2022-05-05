INSERT INTO `customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');


INSERT INTO `items` (`name`, `value`) VALUES ('Key', '9.99');
INSERT INTO `items` (`name`, `value`) VALUES ('book', '19.99');
INSERT INTO `items` (`name`, `value`) VALUES ('case', '5.50');
INSERT INTO `items` (`name`, `value`) VALUES ('pen', '0.99');


INSERT INTO `orders` (`customer_id`, `cost`) VALUES (1, '0.0');


INSERT INTO `orders_items` (`order_id`, `item_id`) VALUES (1, 1);