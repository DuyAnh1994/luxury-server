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
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotel` (
  `hotelId` int NOT NULL AUTO_INCREMENT,
  `name` longtext,
  `image` longtext,
  `accommodationPolicies` longtext,
  `description` longtext,
  `star` float DEFAULT NULL,
  `idCity` int DEFAULT NULL,
  PRIMARY KEY (`hotelId`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel`
--

LOCK TABLES `hotel` WRITE;
/*!40000 ALTER TABLE `hotel` DISABLE KEYS */;
INSERT INTO `hotel` VALUES (4,'Premier Pearl Hotel Vung Tau','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20048096-5e7d93f6902a545646fd029de2f4a726.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon4','Thoáng mát, sạch sẽ',4.6,4),(5,'Khách sạn Ocean Star','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10022089-800x500-FIT_AND_TRIM-87c904a9e762f1c5b8637600459aec9d.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon4','Thoáng mát, sạch sẽ',4.7,4),(6,'Fusion Suites Vung Tau','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20034514-99e8e4cdd02a802002d32c1892622948.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon4','Thoáng mát, sạch sẽ',4.7,4),(7,'Hong Hai 2 Hotel','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20023925-94fdc45f2ae8009669b23c14cbef3f41.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon4','Thoáng mát, sạch sẽ',5,4),(8,'Vung Tau Riva Hotel','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20022759-bc1373995692f4946fc83333c506082b.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon4','Thoáng mát, sạch sẽ',5,4),(13,'Seashore Hotel & Apartment','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20011770-35b9497e0cc027dccd92cf149c52be74.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon5','Thoáng mát, sạch sẽ',4.7,5),(14,'Raon Danang Beach Hotel','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10040953-1dfae9c26d5dbaab975c3541447be44b.png?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon5','Thoáng mát, sạch sẽ',4.7,5),(15,'Khách sạn Melia Vinpearl Condotel Riverfront Đà Nẵng','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20012109-a6bc5420777174c47fb6c8dcb92cd663.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon5','Thoáng mát, sạch sẽ',4.8,5),(16,'The Herriott Hotel & Suite','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20004789-a5cf524963f270785dc36a9659125e03.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon5','Thoáng mát, sạch sẽ',4.9,5),(17,'Menora Grand Da Nang','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20057020-1c38bde5010c7f11e85ee0dcf1648fec.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon5','Thoáng mát, sạch sẽ',5,5),(18,'Classy Holiday Hotel & Spa','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030792-432c7afcadf0ed7695139afd7b62d31c.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon6','Thoáng mát, sạch sẽ',5,6),(19,'Khách sạn Hanoi Chic Boutique','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10020275-b6bec11207074771ed50a65b6bf1971d.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon6','Thoáng mát, sạch sẽ',5,6),(20,'Khách Sạn Hanoi Boutique','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10027360-cff97390cc347791375b0259ce594671.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon6','Thoáng mát, sạch sẽ',5,6),(21,'Khách sạn Melia Hà Nội','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10027360-cff97390cc347791375b0259ce594671.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon6','Thoáng mát, sạch sẽ',5,6),(22,'Dolce by Wyndham Hanoi Golden Lake','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20044113-0418ae734d3124a3169c76b0c05303d5.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon6','Thoáng mát, sạch sẽ',5,6),(23,'ACE Hotel Saigon','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10029650-840x460-FIT_AND_TRIM-4ea0ff8417715477c230d60ff8b4da8b.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon7','Thoáng mát, sạch sẽ',4.5,7),(24,'La Vela Saigon Hotel','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20035611-042f7c207731b62cefb836119b40cc9b.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon7','Thoáng mát, sạch sẽ',4.6,7),(25,'The Hotel Nicecy','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10032282-a0661bf616421ed67fb2a92e7149dadb.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon7','Thoáng mát, sạch sẽ',4.7,7),(26,'Havana Airport Hotel','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20040079-728b186f555d9d49b40707f16d67652d.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon7','Thoáng mát, sạch sẽ',4.8,7),(27,'Khách sạn Mường Thanh Luxury Sài Gòn','https://ik.imagekit.io/tvlk/apr-asset/Ixf4aptF5N2Qdfmh4fGGYhTN274kJXuNMkUAzpL5HuD9jzSxIGG5kZNhhHY-p7nw/hotel/asset/67792655-ad3427ac9d5806721457f5ae7d59faea.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon7','Thoáng mát, sạch sẽ',4.9,7),(28,'The Secret Ha Long Hotel','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20058146-f521960a5620d59f6416ec4ffe5e76da.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon3','Thoáng mát, sạch sẽ',4.5,3),(29,'FLC Halong Bay Golf Club & Luxury Resort','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20019359-653058f6a84b366b584825792f89760a.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon3','Thoáng mát, sạch sẽ',4.6,3),(30,'The Twin Hotel','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20027994-c775117272ab88aa6e1da597bc35529f.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon3','Thoáng mát, sạch sẽ',4.7,3),(31,'Khách sạn Mường Thanh Grand Hạ Long','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/10030661-800x532-FIT_AND_TRIM-dd5228b3ca9d1bac126acf31e0c08dbe.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon3','Thoáng mát, sạch sẽ',4.8,3),(32,'Khách sạn D\'Lecia Ha Long','https://ik.imagekit.io/tvlk/apr-asset/dgXfoyh24ryQLRcGq00cIdKHRmotrWLNlvG-TxlcLxGkiDwaUSggleJNPRgIHCX6/hotel/asset/20043169-ae4e3656de1e9d88ad9fd5b29b3733e1.jpeg?_src=imagekit&tr=c-at_max,h-488,q-40,w-768','accoummon3','Thoáng mát, sạch sẽ',4.9,3);
/*!40000 ALTER TABLE `hotel` ENABLE KEYS */;
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
