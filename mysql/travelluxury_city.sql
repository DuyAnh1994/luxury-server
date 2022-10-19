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
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city` (
  `cityId` int NOT NULL AUTO_INCREMENT,
  `name` longtext,
  `image` longtext,
  PRIMARY KEY (`cityId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
INSERT INTO `city` VALUES (3,'Ha Long','https://firebasestorage.googleapis.com/v0/b/travel-luxury-4f5df.appspot.com/o/ha_long.png?alt=media&token=820c9948-929c-41a3-b376-7e1df5049ed2'),(4,'Vung Tau','https://firebasestorage.googleapis.com/v0/b/travel-luxury-4f5df.appspot.com/o/vung_tau.png?alt=media&token=e20da326-27e3-4461-8748-4baff841f585'),(5,'Da Nang','https://firebasestorage.googleapis.com/v0/b/travel-luxury-4f5df.appspot.com/o/da_nang.png?alt=media&token=db3cac9d-e959-4970-b406-b3d4c84477cc'),(6,'Ha Noi','https://firebasestorage.googleapis.com/v0/b/travel-luxury-4f5df.appspot.com/o/ha_long.png?alt=media&token=820c9948-929c-41a3-b376-7e1df5049ed2'),(7,'Tp.HCM','https://firebasestorage.googleapis.com/v0/b/travel-luxury-4f5df.appspot.com/o/ha_long.png?alt=media&token=820c9948-929c-41a3-b376-7e1df5049ed2');
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
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
