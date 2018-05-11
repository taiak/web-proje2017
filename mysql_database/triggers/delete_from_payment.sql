DROP TRIGGER IF EXISTS delete_payment;
DELIMITER //
CREATE TRIGGER `delete_payment` 
BEFORE DELETE ON `Payment` FOR EACH ROW 
BEGIN
   DELETE FROM Orders WHERE Orders.payment_no = OLD.no;
END
//
DELIMITER ;