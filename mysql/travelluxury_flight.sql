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
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight` (
  `flightId` int NOT NULL AUTO_INCREMENT,
  `image` longtext NOT NULL,
  `title` varchar(100) NOT NULL,
  `date` longtext NOT NULL,
  PRIMARY KEY (`flightId`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES (6,'https://ik.imagekit.io/tvlk/image/imageResource/2019/03/13/1552466374013-a57dacdbc92a9c508c1dbc4c4ceeb5cd.jpeg?tr=q-75,w-247','Hà Nội → TP HCM','29/9 - 31/12/2022'),(7,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851505067-e5745050cc951e5c9c11b01c1d0ff920.png?tr=q-75,w-247','TP HCM  →  Hà Nội','29/9 - 31/12/2022'),(8,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851894841-e5d7f8e7abc30ff0f1f07f6d7a64eac1.png?tr=q-75,w-247','TP HCM  →  Đà Nẵng','29/9 - 31/12/2022'),(9,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851434599-dcf536c231f9d231e9e3de8ecbe97d30.png?tr=q-75,w-247','Hà Nội  →  Phú Quốc','29/9 - 31/12/2022'),(10,'https://ik.imagekit.io/tvlk/image/imageResource/2019/12/17/1576562552167-c0b352557fc46d88eb18b7966824db8f.jpeg?tr=q-75,w-247','Đà Nẵng  →  Đà Lạt','29/9 - 31/12/2022'),(11,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851600794-f02453e5e7d6bc0533503519b44bd817.png?tr=q-75,w-247','Hà Nội  →  Nha Trang','29/9 - 31/12/2022'),(12,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851982469-0e1a7537a701f0b2d534bbd5f08b4493.png?tr=q-75,w-247','TP HCM  →  Hải Phòng','29/9 - 31/12/2022'),(13,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851926063-b75082c32167c1a2c083aecbe9965d0f.png?tr=q-75,w-247','TP HCM  →  Vinh','29/9 - 31/12/2022'),(14,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851829758-a18630d215ad967f5132e1a0b7d2c3c5.png?tr=q-75,w-247','Hà Nội  →  Quy Nhơn','29/9 - 31/12/2022'),(15,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637851729792-29cd8e14887d135daf14173e38a1528f.jpeg?tr=q-75,w-247','TP HCM  →  Huế','29/9 - 31/12/2022'),(16,'https://ik.imagekit.io/tvlk/image/imageResource/2021/11/25/1637852023686-1f579f78e562b691ae4c8c05800f7e6b.png?tr=q-75,w-247','Hà Nội  →  Chu Lai','29/9 - 31/12/2022');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
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
