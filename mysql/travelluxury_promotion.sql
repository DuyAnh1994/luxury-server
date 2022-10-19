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
-- Table structure for table `promotion`
--

DROP TABLE IF EXISTS `promotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotion` (
  `promotionId` int NOT NULL AUTO_INCREMENT,
  `image` longtext NOT NULL,
  PRIMARY KEY (`promotionId`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotion`
--

LOCK TABLES `promotion` WRITE;
/*!40000 ALTER TABLE `promotion` DISABLE KEYS */;
INSERT INTO `promotion` VALUES (4,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583289401-adc72300ced3a247a1c542715830178e.jpeg?tr=q-75,w-256'),(5,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583337197-6d5fd2a53cdaf99eec94eac9bdc1b60a.jpeg?tr=q-75,w-256'),(6,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583349252-2cef76c933cf9bcb3be3827f5c727544.jpeg?tr=q-75,w-256'),(7,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583360535-698fca46a6317ed3df05c4d9995d2b4c.jpeg?tr=q-75,w-256'),(8,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583385313-79e490b9520f460c29b6651f8829c617.jpeg?tr=q-75,w-256'),(9,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583936039-34b6f9430454eebb6e93acb8fac840d7.jpeg?tr=q-75,w-256'),(10,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583948082-f1d8342422ce45e241dedc0e6e789d32.jpeg?tr=q-75,w-256'),(11,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583943435-5c38c09410cef71fe734e994e35e52cb.jpeg?tr=q-75,w-256'),(12,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583391482-981979d27f1697eac4e0fe3f83af7fdf.jpeg?tr=q-75,w-256'),(13,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583401388-8a6dffd616ee0d5c4230d86ec3b1f723.jpeg?tr=q-75,w-256'),(14,'https://ik.imagekit.io/tvlk/image/imageResource/2022/09/19/1663583964631-c0602b9e68a647a40971e1778902277a.jpeg?tr=q-75,w-256');
/*!40000 ALTER TABLE `promotion` ENABLE KEYS */;
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
