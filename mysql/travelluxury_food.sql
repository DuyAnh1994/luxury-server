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
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food` (
  `foodID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` int DEFAULT NULL,
  `count` int DEFAULT NULL,
  `shipPrice` int DEFAULT NULL,
  `totalPrice` int DEFAULT NULL,
  `image` longtext,
  PRIMARY KEY (`foodID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES (1,'Bánh mì',30000,2,20000,80000,'https://firebasestorage.googleapis.com/v0/b/baby-photo-fb591.appspot.com/o/food1.jpg?alt=media&token=930a10e1-e979-455c-9183-65bb976ae260'),(2,'Bún đậu',25000,1,10000,35000,'https://firebasestorage.googleapis.com/v0/b/baby-photo-fb591.appspot.com/o/food2.jpg?alt=media&token=723d0d6f-80aa-4f45-8f54-d75d610de346'),(3,'Xúc xích',10000,5,15000,65000,'https://firebasestorage.googleapis.com/v0/b/baby-photo-fb591.appspot.com/o/food3.jpg?alt=media&token=bc519813-25e0-4c00-8bde-d0f64c671c85'),(4,'Nem chua',6000,10,20000,80000,'https://firebasestorage.googleapis.com/v0/b/baby-photo-fb591.appspot.com/o/food4.jpg?alt=media&token=cb6fe513-f486-421d-91a1-b1efc275aba5'),(5,'Bún chả',35000,6,20000,230000,'https://firebasestorage.googleapis.com/v0/b/baby-photo-fb591.appspot.com/o/food5.jpg?alt=media&token=d0a00b76-68db-4e1a-9bde-3d1d7ac36c38');
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
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
