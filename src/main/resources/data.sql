DROP TABLE IF EXISTS customer;
CREATE TABLE customer
(
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    customer_name VARCHAR(50) NOT NULL,
    customer_surname VARCHAR (50) NOT NULL,
    customer_income INT NOT NULL,
    customer_phone INT UNIQUE NOT NULL,
    customer_identity_number INT UNIQUE NOT NULL
);



----//////////////////////
----Sample Test Values
----//////////////////////

INSERT INTO customer(customer_name, customer_surname, customer_income , customer_phone,customer_identity_number)
            VALUES  ('Burkay', 'Ozturk',8000,43322,54321),
                    ('Onur', 'Cicek',10000,43321,43210),
                    ('Emre', 'Pep',3000,02211,32109);