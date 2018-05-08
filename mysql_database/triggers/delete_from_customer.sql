DROP TRIGGER IF EXISTS delete_customer;
DELIMITER //
CREATE TRIGGER `delete_customer` 
BEFORE DELETE ON `Customer` FOR EACH ROW 
BEGIN 
   DELETE FROM CustomerShadow WHERE CustomerShadow.customer_no = OLD.no; 
END
//
DELIMITER ;