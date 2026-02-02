CREATE DATABASE HotelManagement_system;
USE HotelManagement_system;
CREATE TABLE customers (
    sr_no INT,
    customerName VARCHAR(50),
    BillAmount DECIMAL(10,2),
    Food_order VARCHAR(100)
);
INSERT INTO customers (sr_no, customerName, BillAmount, Food_order) VALUES
(1, 'Sudarshan', 450.00, 'Burger'),
(2, 'Sakshi', 800.50, 'Pizza'),
(3, 'Ujal', 1200.00, 'Thali'),
(4, 'Ashish', 650.75, 'Pasta'),
(5, 'Apurav', 300.00, 'Sandwich');
SELECT * FROM customers;
ALTER TABLE customers
ADD COLUMN Token_no INT;
UPDATE customers SET Token_no = 101 WHERE customerName = 'Sudarshan';
UPDATE customers SET Token_no = 102 WHERE customerName = 'Sakshi';
UPDATE customers SET Token_no = 103 WHERE customerName = 'Ujal';
UPDATE customers SET Token_no = 104 WHERE customerName = 'Ashish';
UPDATE customers SET Token_no = 105 WHERE customerName = 'Apurva';
SELECT * FROM customers;
ALTER TABLE customers
DROP COLUMN sr_no;
DELETE FROM customers
WHERE Token_no IN (102, 104);
SELECT * FROM customers;