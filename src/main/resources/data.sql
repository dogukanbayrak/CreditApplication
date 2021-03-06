DROP TABLE IF EXISTS customer;
CREATE TABLE customer
(
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    surname VARCHAR (50) NOT NULL,
    income INT NOT NULL,
    phone VARCHAR(11) UNIQUE NOT NULL,
    identity_number VARCHAR(11) UNIQUE NOT NULL
);



----//////////////////////
----Sample Test Values
----//////////////////////

INSERT INTO customer(name, surname, income , phone, identity_number)
            VALUES  ('Burkay', 'Ozturk',8000,'43322','12345678911'),
                    ('Onur', 'Cicek',10000,'43321','98765432193'),
                    ('Emre', 'Pep',3000,'02211','32109045692');