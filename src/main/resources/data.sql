DROP TABLE IF EXISTS `cajas`;
DROP table IF EXISTS `almacenes`;


CREATE TABLE `almacenes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `lugar` varchar(100) DEFAULT NULL,
  `capacidad` INT DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `cajas` (
  `numreferencia` char(5) NOT NULL,
  `contenido` varchar(100) DEFAULT NULL,
  `valor` INT DEFAULT NULL,
  `almacen` INT DEFAULT NULL,
  PRIMARY KEY (`numreferencia`),
  CONSTRAINT `almacenes_fk` FOREIGN KEY (`almacen`) REFERENCES `almacenes` (`id`)
);


insert into almacenes (lugar,capacidad)values('A',3000);
insert into almacenes (lugar,capacidad)values('B',3500);
insert into almacenes (lugar,capacidad)values('C',2000);
insert into almacenes (lugar,capacidad)values('E',1000);
insert into almacenes (lugar,capacidad)values('D',3500);

insert into cajas (numreferencia, contenido, valor, almacen) values ('12345','lapices',200,1);
insert into cajas (numreferencia, contenido, valor, almacen) values ('12346','bolis',300,1);
insert into cajas (numreferencia, contenido, valor, almacen) values ('12347','bobinas',500,2);
insert into cajas (numreferencia, contenido, valor, almacen) values ('12348','transistores',100,3);
insert into cajas (numreferencia, contenido, valor, almacen) values ('12349','condensadores',2500,4);


