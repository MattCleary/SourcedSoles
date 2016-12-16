# --- Sample dataset

# --- !Ups

insert into category(id,name) values(1,'Adidas');
insert into category(id,name) values(2,'Nike');
insert into category(id,name) values(3,'Air Jordan');

insert into product (id,name,brand,size,stock,category_id,price) values ( 1,'Yeezy Boost 350 Turtle Dove','Adidas',9,7,1,800);
insert into product (id,name,brand,size,stock,category_id,price) values ( 2,'Yeezy Boost 750 Triple Black','Adidas',8,4,1,1200);
insert into product (id,name,brand,size,stock,category_id,price) values ( 3,'CARHARTT X EMINEM','Air Jordan',10.5,1,3,20000);
insert into product (id,name,brand,size,stock,category_id,price) values ( 4,'BAPE NMD Green Camo','Adidas',10,8,1,1600);
insert into product (id,name,brand,size,stock,category_id,price) values ( 5,'NMD Japan Black','Adidas',8,1,1,14000);
insert into product (id,name,brand,size,stock,category_id,price) values ( 6,'Yeezy 350 V2 Beluga','Adidas',8,30,1,650);
insert into product (id,name,brand,size,stock,category_id,price) values ( 7,'Pharrell Human Race','Adidas',9.5,7,1,450);
insert into product (id,name,brand,size,stock,category_id,price) values ( 8,'NMD MasterMind','Adidas',7,10,1,700);
insert into product (id,name,brand,size,stock,category_id,price) values ( 9,'Air Mag','Nike',12,1,2,10000);
insert into product (id,name,brand,size,stock,category_id,price) values ( 10,'Air Pikey','Nike',14,1,2,30000);
insert into product (id,name,brand,size,stock,category_id,price) values ( 11,'Air Jordan 1 Reverse Backboard','Nike',9,22,2,380);
insert into product (id,name,brand,size,stock,category_id,price) values ( 12,'Tubular','Adidas',9,60,1,120);


insert into user (email,role,name,password) values ('iandaly@sourcedsoles.com','admin','Ian Daly','sneakers');
insert into user (email,role,name,password) values ('shanecotter@sourcedsoles.com','admin','Shane Cotter','sneakers');
insert into user (email,role,name,password) values ('matthewcleary@sourcedsoles.com','admin','Matthew Cleary','sneakers');
