DROP TABLE IF EXISTS Products;

CREATE TABLE Products (
  ID INT NOT NULL PRIMARY KEY,
  ProductName VARCHAR(255) NOT NULL,
  Price DOUBLE PRECISION,
  PictureUrl VARCHAR(255)
);

insert into Products (ID, ProductName, Price, PictureUrl) values (17, 'Red Fedora', 34.99, 'http://placehold.it/200x100');
insert into Products (ID, ProductName, Price, PictureUrl) values (18, 'Forge Laptop Sticker', 8.50, 'http://placehold.it/200x100');
insert into Products (ID, ProductName, Price, PictureUrl) values (19, 'Solid Performance Polo', 17.80, 'http://placehold.it/200x100');
insert into Products (ID, ProductName, Price, PictureUrl) values (20, 'Ogio Caliber Polo', 28.75, 'http://placehold.it/200x100');
insert into Products (ID, ProductName, Price, PictureUrl) values (21, '16 oz. Vortex Tumbler', 6.00, 'http://placehold.it/200x100');
insert into Products (ID, ProductName, Price, PictureUrl) values (22, 'Pebble Smart Watch', 24.00, 'http://placehold.it/200x100');
insert into Products (ID, ProductName, Price, PictureUrl) values (23, 'Oculus Rift', 106.00, 'http://placehold.it/200x100');
insert into Products (ID, ProductName, Price, PictureUrl) values (24, 'Lytro Camera', 44.30, 'http://placehold.it/200x100');