CREATE TABLE products
{
id LONG AUTO_INCREMENT;
name VARCHAR(200);
price DOUBLE;
quantityAvailable INTEGER;
quantityAvailableAtStore INTEGER;
timeDaysToShip INTEGER;
PRIMARY KEY(id);
}
