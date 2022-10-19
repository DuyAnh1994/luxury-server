-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: Localhost    Database: travelluxury
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `roomId` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` longtext,
  `currentPrice` double DEFAULT '0',
  `idHotel` int DEFAULT '0',
  PRIMARY KEY (`roomId`)
) ENGINE=InnoDB AUTO_INCREMENT=275 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (140,'phòng 101','view thoáng mát, sạch đẹp',999999.9,4),(141,'phòng 102','view thoáng mát, sạch đẹp',999999.9,4),(142,'phòng 103','view thoáng mát, sạch đẹp',999999.9,4),(143,'phòng 104','view thoáng mát, sạch đẹp',999999.9,4),(144,'phòng 105','view thoáng mát, sạch đẹp',999999.9,4),(145,'phòng 101','view thoáng mát, sạch đẹp',999999.9,5),(146,'phòng 102','view thoáng mát, sạch đẹp',999999.9,5),(147,'phòng 103','view thoáng mát, sạch đẹp',999999.9,5),(148,'phòng 104','view thoáng mát, sạch đẹp',999999.9,5),(149,'phòng 105','view thoáng mát, sạch đẹp',999999.9,5),(150,'phòng 101','view thoáng mát, sạch đẹp',999999.9,6),(151,'phòng 102','view thoáng mát, sạch đẹp',999999.9,6),(152,'phòng 103','view thoáng mát, sạch đẹp',999999.9,6),(153,'phòng 104','view thoáng mát, sạch đẹp',999999.9,6),(154,'phòng 105','view thoáng mát, sạch đẹp',999999.9,6),(155,'phòng 101','view thoáng mát, sạch đẹp',999999.9,7),(156,'phòng 102','view thoáng mát, sạch đẹp',999999.9,7),(157,'phòng 103','view thoáng mát, sạch đẹp',999999.9,7),(158,'phòng 104','view thoáng mát, sạch đẹp',999999.9,7),(159,'phòng 105','view thoáng mát, sạch đẹp',999999.9,7),(160,'phòng 101','view thoáng mát, sạch đẹp',999999.9,8),(161,'phòng 102','view thoáng mát, sạch đẹp',999999.9,8),(162,'phòng 103','view thoáng mát, sạch đẹp',999999.9,8),(163,'phòng 104','view thoáng mát, sạch đẹp',999999.9,8),(164,'phòng 105','view thoáng mát, sạch đẹp',999999.9,8),(165,'phòng 101','view thoáng mát, sạch đẹp',999999.9,13),(166,'phòng 102','view thoáng mát, sạch đẹp',999999.9,13),(167,'phòng 103','view thoáng mát, sạch đẹp',999999.9,13),(168,'phòng 104','view thoáng mát, sạch đẹp',999999.9,13),(169,'phòng 105','view thoáng mát, sạch đẹp',999999.9,13),(170,'phòng 101','view thoáng mát, sạch đẹp',999999.9,14),(171,'phòng 102','view thoáng mát, sạch đẹp',999999.9,14),(172,'phòng 103','view thoáng mát, sạch đẹp',999999.9,14),(173,'phòng 104','view thoáng mát, sạch đẹp',999999.9,14),(174,'phòng 105','view thoáng mát, sạch đẹp',999999.9,14),(175,'phòng 101','view thoáng mát, sạch đẹp',999999.9,15),(176,'phòng 102','view thoáng mát, sạch đẹp',999999.9,15),(177,'phòng 103','view thoáng mát, sạch đẹp',999999.9,15),(178,'phòng 104','view thoáng mát, sạch đẹp',999999.9,15),(179,'phòng 105','view thoáng mát, sạch đẹp',999999.9,15),(180,'phòng 101','view thoáng mát, sạch đẹp',999999.9,16),(181,'phòng 102','view thoáng mát, sạch đẹp',999999.9,16),(182,'phòng 103','view thoáng mát, sạch đẹp',999999.9,16),(183,'phòng 104','view thoáng mát, sạch đẹp',999999.9,16),(184,'phòng 105','view thoáng mát, sạch đẹp',999999.9,16),(185,'phòng 101','view thoáng mát, sạch đẹp',999999.9,17),(186,'phòng 102','view thoáng mát, sạch đẹp',999999.9,17),(187,'phòng 103','view thoáng mát, sạch đẹp',999999.9,17),(188,'phòng 104','view thoáng mát, sạch đẹp',999999.9,17),(189,'phòng 105','view thoáng mát, sạch đẹp',999999.9,17),(190,'phòng 101','view thoáng mát, sạch đẹp',999999.9,18),(191,'phòng 102','view thoáng mát, sạch đẹp',999999.9,18),(192,'phòng 103','view thoáng mát, sạch đẹp',999999.9,18),(193,'phòng 104','view thoáng mát, sạch đẹp',999999.9,18),(194,'phòng 105','view thoáng mát, sạch đẹp',999999.9,18),(195,'phòng 101','view thoáng mát, sạch đẹp',999999.9,19),(196,'phòng 102','view thoáng mát, sạch đẹp',999999.9,19),(197,'phòng 103','view thoáng mát, sạch đẹp',999999.9,19),(198,'phòng 104','view thoáng mát, sạch đẹp',999999.9,19),(199,'phòng 105','view thoáng mát, sạch đẹp',999999.9,19),(200,'phòng 101','view thoáng mát, sạch đẹp',999999.9,20),(201,'phòng 102','view thoáng mát, sạch đẹp',999999.9,20),(202,'phòng 103','view thoáng mát, sạch đẹp',999999.9,20),(203,'phòng 104','view thoáng mát, sạch đẹp',999999.9,20),(204,'phòng 105','view thoáng mát, sạch đẹp',999999.9,20),(205,'phòng 101','view thoáng mát, sạch đẹp',999999.9,21),(206,'phòng 102','view thoáng mát, sạch đẹp',999999.9,21),(207,'phòng 103','view thoáng mát, sạch đẹp',999999.9,21),(208,'phòng 104','view thoáng mát, sạch đẹp',999999.9,21),(209,'phòng 105','view thoáng mát, sạch đẹp',999999.9,21),(210,'phòng 101','view thoáng mát, sạch đẹp',999999.9,22),(211,'phòng 102','view thoáng mát, sạch đẹp',999999.9,22),(212,'phòng 103','view thoáng mát, sạch đẹp',999999.9,22),(213,'phòng 104','view thoáng mát, sạch đẹp',999999.9,22),(214,'phòng 105','view thoáng mát, sạch đẹp',999999.9,22),(215,'phòng 101','view thoáng mát, sạch đẹp',999999.9,23),(216,'phòng 102','view thoáng mát, sạch đẹp',999999.9,23),(217,'phòng 103','view thoáng mát, sạch đẹp',999999.9,23),(218,'phòng 104','view thoáng mát, sạch đẹp',999999.9,23),(219,'phòng 105','view thoáng mát, sạch đẹp',999999.9,23),(220,'phòng 101','view thoáng mát, sạch đẹp',999999.9,24),(221,'phòng 102','view thoáng mát, sạch đẹp',999999.9,24),(222,'phòng 103','view thoáng mát, sạch đẹp',999999.9,24),(223,'phòng 104','view thoáng mát, sạch đẹp',999999.9,24),(224,'phòng 105','view thoáng mát, sạch đẹp',999999.9,24),(225,'phòng 101','view thoáng mát, sạch đẹp',999999.9,25),(226,'phòng 102','view thoáng mát, sạch đẹp',999999.9,25),(227,'phòng 103','view thoáng mát, sạch đẹp',999999.9,25),(228,'phòng 104','view thoáng mát, sạch đẹp',999999.9,25),(229,'phòng 105','view thoáng mát, sạch đẹp',999999.9,25),(230,'phòng 101','view thoáng mát, sạch đẹp',999999.9,26),(231,'phòng 102','view thoáng mát, sạch đẹp',999999.9,26),(232,'phòng 103','view thoáng mát, sạch đẹp',999999.9,26),(233,'phòng 104','view thoáng mát, sạch đẹp',999999.9,26),(234,'phòng 105','view thoáng mát, sạch đẹp',999999.9,26),(235,'phòng 101','view thoáng mát, sạch đẹp',999999.9,27),(236,'phòng 102','view thoáng mát, sạch đẹp',999999.9,27),(237,'phòng 103','view thoáng mát, sạch đẹp',999999.9,27),(238,'phòng 104','view thoáng mát, sạch đẹp',999999.9,27),(239,'phòng 105','view thoáng mát, sạch đẹp',999999.9,27),(240,'phòng 101','view thoáng mát, sạch đẹp',999999.9,28),(241,'phòng 102','view thoáng mát, sạch đẹp',999999.9,28),(242,'phòng 103','view thoáng mát, sạch đẹp',999999.9,28),(243,'phòng 104','view thoáng mát, sạch đẹp',999999.9,28),(244,'phòng 105','view thoáng mát, sạch đẹp',999999.9,28),(245,'phòng 101','view thoáng mát, sạch đẹp',999999.9,29),(246,'phòng 102','view thoáng mát, sạch đẹp',999999.9,29),(247,'phòng 103','view thoáng mát, sạch đẹp',999999.9,29),(248,'phòng 104','view thoáng mát, sạch đẹp',999999.9,29),(249,'phòng 105','view thoáng mát, sạch đẹp',999999.9,29),(250,'phòng 101','view thoáng mát, sạch đẹp',999999.9,30),(251,'phòng 102','view thoáng mát, sạch đẹp',999999.9,30),(252,'phòng 103','view thoáng mát, sạch đẹp',999999.9,30),(253,'phòng 104','view thoáng mát, sạch đẹp',999999.9,30),(254,'phòng 105','view thoáng mát, sạch đẹp',999999.9,30),(255,'phòng 101','view thoáng mát, sạch đẹp',999999.9,31),(256,'phòng 102','view thoáng mát, sạch đẹp',999999.9,31),(257,'phòng 103','view thoáng mát, sạch đẹp',999999.9,31),(258,'phòng 104','view thoáng mát, sạch đẹp',999999.9,31),(259,'phòng 105','view thoáng mát, sạch đẹp',999999.9,31),(260,'phòng 101','view thoáng mát, sạch đẹp',999999.9,32),(261,'phòng 102','view thoáng mát, sạch đẹp',999999.9,32),(262,'phòng 103','view thoáng mát, sạch đẹp',999999.9,32),(263,'phòng 104','view thoáng mát, sạch đẹp',999999.9,32),(264,'phòng 105','view thoáng mát, sạch đẹp',999999.9,32),(265,'phòng 101','view thoáng mát, sạch đẹp',999999.9,4),(266,'phòng 102','view thoáng mát, sạch đẹp',999999.9,4),(267,'phòng 103','view thoáng mát, sạch đẹp',999999.9,4),(268,'phòng 104','view thoáng mát, sạch đẹp',999999.9,4),(269,'phòng 105','view thoáng mát, sạch đẹp',999999.9,4),(270,'phòng 101','view thoáng mát, sạch đẹp',999999.9,4),(271,'phòng 102','view thoáng mát, sạch đẹp',999999.9,4),(272,'phòng 103','view thoáng mát, sạch đẹp',999999.9,4),(273,'phòng 104','view thoáng mát, sạch đẹp',999999.9,4),(274,'phòng 105','view thoáng mát, sạch đẹp',999999.9,4);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-19 12:53:09
