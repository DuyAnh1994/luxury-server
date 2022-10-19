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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `addressId` int NOT NULL AUTO_INCREMENT,
  `detail` longtext,
  `nameCity` varchar(100) DEFAULT NULL,
  `nameCountry` varchar(100) DEFAULT NULL,
  `postalCode` int DEFAULT NULL,
  `userId` int DEFAULT NULL,
  `hotelId` int DEFAULT NULL,
  PRIMARY KEY (`addressId`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (4,'Vũng Tàu ',NULL,'Việt Nam',NULL,NULL,4),(5,'Vũng Tàu ',NULL,'Việt Nam',NULL,NULL,5),(6,'Vũng Tàu ',NULL,'Việt Nam',NULL,NULL,6),(7,'Vũng Tàu ',NULL,'Việt Nam',NULL,NULL,7),(8,'Vũng Tàu ',NULL,'Việt Nam',NULL,NULL,8),(9,'Đà Nẵng ',NULL,'Việt Nam',NULL,NULL,13),(10,'Đà Nẵng ',NULL,'Việt Nam',NULL,NULL,14),(11,'Đà Nẵng ',NULL,'Việt Nam',NULL,NULL,15),(12,'Đà Nẵng ',NULL,'Việt Nam',NULL,NULL,16),(13,'Đà Nẵng ',NULL,'Việt Nam',NULL,NULL,17),(14,'Hà Nội ',NULL,'Việt Nam',NULL,NULL,18),(15,'Hà Nội ',NULL,'Việt Nam',NULL,NULL,19),(16,'Hà Nội ',NULL,'Việt Nam',NULL,NULL,20),(17,'Hà Nội ',NULL,'Việt Nam',NULL,NULL,21),(18,'Hà Nội ',NULL,'Việt Nam',NULL,NULL,22),(19,'Tp.HCM',NULL,'Việt Nam',NULL,NULL,23),(20,'Tp.HCM',NULL,'Việt Nam',NULL,NULL,24),(21,'Tp.HCM',NULL,'Việt Nam',NULL,NULL,25),(22,'Tp.HCM',NULL,'Việt Nam',NULL,NULL,26),(23,'Tp.HCM',NULL,'Việt Nam',NULL,NULL,27),(24,'Hạ Long',NULL,'Việt Nam',NULL,NULL,28),(25,'Hạ Long',NULL,'Việt Nam',NULL,NULL,29),(26,'Hạ Long',NULL,'Việt Nam',NULL,NULL,30),(27,'Hạ Long',NULL,'Việt Nam',NULL,NULL,31),(28,'Hạ Long',NULL,'Việt Nam',NULL,NULL,32),(29,NULL,NULL,'',NULL,NULL,NULL);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-19 12:53:08
