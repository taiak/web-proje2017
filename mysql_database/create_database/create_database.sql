DROP DATABASE IF EXISTS PROJE;
CREATE DATABASE PROJE;

USE PROJE;

CREATE TABLE `Customer` (
  no      INT(64) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name    VARCHAR(32) NOT NULL,
  surname VARCHAR(32) NOT NULL,
  email   VARCHAR(50) NOT NULL unique
);

CREATE TABLE `Product` (
  no      INT(64) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name    VARCHAR(32)      NOT NULL,
  stock   INT(32)          NOT NULL DEFAULT '0',
  price   DECIMAL(12, 2)   NOT NULL DEFAULT '0.0',
  photo   VARCHAR(200)     NOT NULL,
  comment TEXT 
);

CREATE TABLE `CustomerShadow` (
  customer_no  INT(64) UNSIGNED PRIMARY KEY,
  password     VARCHAR(64) NOT NULL DEFAULT 'password_NaN',
  FOREIGN KEY  (customer_no) REFERENCES Customer (no)
);

CREATE TABLE `Admin` (
  no   INT(64) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(64) NOT NULL unique
);

CREATE TABLE `AdminShadow` (
  admin_no    INT(64) UNSIGNED PRIMARY KEY,
  password    VARCHAR(64) NOT NULL,
  FOREIGN KEY (admin_no) REFERENCES Admin (no)
);

CREATE TABLE `Payment` (
  no       INT(5) UNSIGNED AUTO_INCREMENT NOT NULL PRIMARY KEY,
  name     VARCHAR(15)  NOT NULL,
  comment  VARCHAR(150)
);

CREATE TABLE `Orders` (
  order_no    INT(64) NOT NULL AUTO_INCREMENT,
  customer_no INT(64) UNSIGNED NOT NULL,
  product_no  INT(64) UNSIGNED NOT NULL,
  order_date  VARCHAR(20)      NOT NULL,
  payment_no  INT(5) UNSIGNED  NOT NULL,
  PRIMARY KEY (order_no, customer_no, product_no, order_date)
);