CREATE DATABASE rest;

CREATE TABLE rest.products
(id int NOT NULL PRIMARY KEY,
name varchar(200) NOT NULL,
price DOUBLE NOT NULL,
quantityAvailable INTEGER,
quantityAvailableAtStore INTEGER,
timeDaysToShip INTEGER
);

INSERT into rest.products values (1,'prodotto_prova',1,10,5,1);
