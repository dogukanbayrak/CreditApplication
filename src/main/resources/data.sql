
CREATE TABLE customer(
    id INT GENERATED BY DEFAULT AS IDENTIFY PRIMARY KEY,
    customer_name               VARCHAR(50)     NOT NULL,
    customer_surname            VARCHAR(50)     NOT NULL,
    customer_income             INT(10)         NOT NULL,
    customer_phone              INT(20)         UNIQUE NOT NULL,
    customer_identitynumber     INT (20)        UNIQUE NOT NULL,
    customer_creditscore        INT                            ,

);



--//////////////////////
--Sample Test Values
--//////////////////////

INSERT INTO customer(customer_name, customer_surname, customer_income ,
            customer_phone,customer_identitynumber, customer_creditscore)
            VALUES  ('Burkay', 'Ozturk','8000','5554443322','987654321'),
                    ('Onur', 'Cicek','10000','5554443321','876543210'),
                    ('Emre', 'Pep','3000','5550002211','765432109');