source ./create_database/create_database.sql;
source ./create_database/add_example.sql;

USE PROJE;
source ./procedures/userControl.sql
source ./procedures/adminControl.sql

USE PROJE;
source ./triggers/delete_from_customer.sql
source ./triggers/delete_from_admin.sql
source ./triggers/delete_from_payment.sql
source ./triggers/delete_from_product.sql

source ./create_user/create_user.sql
