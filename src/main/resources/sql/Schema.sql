CREATE TABLE IF NOT EXISTS Employee(idEmployee INTEGER AUTO_INCREMENT PRIMARY KEY,
 EmployeeName varchar(45) not null,
 EmployeePosition varchar(45) not null,
 Company varchar(45) not null,
 EmployeePhoneNumber varchar(45),
 EmployeeMail varchar(255)
);