DROP TRIGGER IF EXISTS delete_product;
DELIMITER //
CREATE TRIGGER `delete_product` 
BEFORE DELETE ON `Product` FOR EACH ROW 
BEGIN 
   DELETE FROM Orders WHERE Orders.product_no = OLD.no;
END
//
DELIMITER ;