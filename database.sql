/*
SQLyog Ultimate v9.02 
MySQL - 5.6.16 : Database - db_contacto
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_contacto` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_contacto`;

/*Table structure for table `contacto` */

DROP TABLE IF EXISTS `contacto`;

CREATE TABLE `contacto` (
  `id_contacto` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(128) DEFAULT NULL,
  `telefono` varchar(32) DEFAULT NULL,
  `direccion` varchar(128) DEFAULT NULL,
  `correo` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id_contacto`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*Data for the table `contacto` */

insert  into `contacto`(`id_contacto`,`nombre`,`telefono`,`direccion`,`correo`) values (1,'Juan Perez','66309980','Guatemala, Guatemala','jp@gmail.com'),(2,'Maria Saenz','66309980','Guatemala, Mixco','msaenz@gmail.com'),(4,'Nombre','Telefono','Direccion','correo@gmail.com'),(5,'Nombre','Telefono','Direccion','correo@gmail.com'),(6,'Nombre','Telefono','Direccion','correo@gmail.com'),(7,'Nombre','Telefono','Direccion','correo@gmail.com'),(8,'Nombre','Telefono','Direccion','correo@gmail.com'),(15,'Nuevo registro','Telefono','Direccion','correo@gmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
