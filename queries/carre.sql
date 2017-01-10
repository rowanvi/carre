/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : carre

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2017-01-10 17:39:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for catalogus
-- ----------------------------
DROP TABLE IF EXISTS `catalogus`;
CREATE TABLE `catalogus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `naam` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of catalogus
-- ----------------------------

-- ----------------------------
-- Table structure for categorie
-- ----------------------------
DROP TABLE IF EXISTS `categorie`;
CREATE TABLE `categorie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `naam` varchar(45) NOT NULL,
  `catalogusid` int(11) DEFAULT NULL,
  `naam_engels` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of categorie
-- ----------------------------
INSERT INTO `categorie` VALUES ('1', 'Koude dranken', '1', 'Cold drinks');
INSERT INTO `categorie` VALUES ('2', 'Warme dranken', '1', 'Hot drinks');
INSERT INTO `categorie` VALUES ('3', 'Bier', '2', 'Beer');
INSERT INTO `categorie` VALUES ('4', 'Wijn', '1', 'Wine');
INSERT INTO `categorie` VALUES ('5', 'Noten en olijven', '0', 'Nuts & Olives');
INSERT INTO `categorie` VALUES ('6', 'Snacks', '1', 'Snack');
INSERT INTO `categorie` VALUES ('7', 'IJs', '0', 'Ice cream');
INSERT INTO `categorie` VALUES ('11', 'Test', '0', 'test');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL DEFAULT '',
  `country` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '123456', 'Nederland');
INSERT INTO `person` VALUES ('2', '123', '123');
INSERT INTO `person` VALUES ('3', '123', '123');
INSERT INTO `person` VALUES ('4', '123', '12321321');
INSERT INTO `person` VALUES ('5', '1212', '133131');

-- ----------------------------
-- Table structure for producten
-- ----------------------------
DROP TABLE IF EXISTS `producten`;
CREATE TABLE `producten` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `productnaam` varchar(45) NOT NULL,
  `prijs` double NOT NULL,
  `omschrijving` varchar(45) DEFAULT NULL,
  `image` varchar(200) NOT NULL,
  `voorraad` int(11) DEFAULT NULL,
  `categorieid` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of producten
-- ----------------------------
INSERT INTO `producten` VALUES ('1', 'Pepsi Cola', '2.8', '', 'pepsiColaBlik.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('2', 'Pepsi Cola Light', '2.8', '', 'pepsiColaLightBlikje.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('3', 'Sourcy Blauw', '2.8', null, 'sourcyBlauw.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('4', 'Sourcy Rood', '2.8', null, 'sourcyRood.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('5', 'Sisi Orange', '2.8', null, 'sisiOrange.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('6', '7UP', '2.8', null, '7UP.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('7', 'Lipton Ice tea', '2.8', null, 'liptonIceTea.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('8', 'Rivella', '2.8', null, 'rivella.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('9', 'Royal Club Bitter Lemon', '2.8', null, 'royalClubBitterLemon.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('10', 'Royal Club Tonic', '2.8', null, 'royalClubTonic.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('11', 'Royal Club Ginger Ale', '2.8', null, 'royalClubGingerAle.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('12', 'Royal Club Cassis', '2.8', null, 'royalClubCassis.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('13', 'Royal Club Appelsap', '2.8', null, 'royalClubAppelsap.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('14', 'Royal Club Jus DOrange', '2.8', null, 'RoyalClubJusDOrange.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('15', 'Chocomel', '2.8', null, 'chocomelBlikje.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('16', 'Sourcy Blauw petfles 0,5ltr', '3', null, 'sourcyBlauwPetfles.jpg', '0', '1', '1');
INSERT INTO `producten` VALUES ('17', 'Koffie', '2.75', null, 'koffie.jpg', '0', '2', '1');
INSERT INTO `producten` VALUES ('18', 'Thee', '2.75', null, 'thee.jpg', '0', '2', '1');
INSERT INTO `producten` VALUES ('19', 'Espresso', '2.75', null, 'espresso.jpg', '0', '2', '1');
INSERT INTO `producten` VALUES ('20', 'Dubbele Espresso', '3.5', null, 'dubbeleEspresso.jpeg', '0', '2', '1');
INSERT INTO `producten` VALUES ('21', 'Cappuccino', '2.9', null, 'cappuccino.jpg', '0', '2', '1');
INSERT INTO `producten` VALUES ('22', 'Koffie Verkeerd', '2.9', null, 'koffieVerkeerd.jpg', '0', '2', '1');
INSERT INTO `producten` VALUES ('23', 'Heineken', '3', null, 'heineken.jpg', '0', '3', '1');
INSERT INTO `producten` VALUES ('24', 'Affligem Blond', '4', null, 'affligemBlond.jpg', '0', '3', '1');
INSERT INTO `producten` VALUES ('25', 'Affligem Dubbel', '4', null, 'affligemDubbel.jpg', '0', '3', '1');
INSERT INTO `producten` VALUES ('26', 'Affligem Tripel', '4', null, 'affligemTripel.jpg', '0', '3', '1');
INSERT INTO `producten` VALUES ('27', 'Amstel 0.0%', '3', null, 'amstel0.jpg', '0', '3', '1');
INSERT INTO `producten` VALUES ('28', 'Bokbier', '3.5', null, 'bokbier.jpg', '0', '3', '1');
INSERT INTO `producten` VALUES ('29', 'Cuvée Carré Blanc glas', '4', null, 'cuvéeCarréBlancGlas.jpg', '0', '4', '1');
INSERT INTO `producten` VALUES ('30', 'Cuvée Carré Rouge glas', '4', null, 'cuvéeCarréRougeGlas.jpg', '0', '4', '1');
INSERT INTO `producten` VALUES ('31', 'Chateau Gassier Cuvée Esprit glas', '4', null, 'chateauGassierCuvéeEspritGlas.jpg', '0', '4', '1');
INSERT INTO `producten` VALUES ('32', 'Hele Fles wijn, alle soorten', '23.5', null, 'flesWijn.jpg', '0', '4', '1');
INSERT INTO `producten` VALUES ('33', 'Amstelmix Noten', '4', null, 'amstelmixNoten.png', '0', '5', '1');
INSERT INTO `producten` VALUES ('34', 'Cashewnoten', '4', null, 'cashewNoten.jpg', '0', '5', '1');
INSERT INTO `producten` VALUES ('35', 'Olijven Chili & Oregano', '2.5', null, 'olijvenChili.jpg', '0', '5', '1');
INSERT INTO `producten` VALUES ('36', 'Olijven Basilicum & Knoflook', '2.5', null, 'olijvenBasilicum.jpg', '0', '5', '1');
INSERT INTO `producten` VALUES ('37', 'Groentechips', '2.5', null, 'groenteChips.jpg', '0', '5', '1');
INSERT INTO `producten` VALUES ('38', 'Appeltaartje van Holtkampa', '3', '', 'appeltaartHoltkamp.jpg', '0', '6', '1');
INSERT INTO `producten` VALUES ('39', 'Appeltaartje & Koffie/Thee', '4.75', null, 'appeltaartKoffie.jpg', '0', '6', '1');
INSERT INTO `producten` VALUES ('40', 'Winegums', '3', null, 'winegums.jpg', '0', '6', '1');
INSERT INTO `producten` VALUES ('41', 'Dropstaafjes', '3', null, 'dropstaafjes.jpg', '0', '6', '1');
INSERT INTO `producten` VALUES ('42', 'Chocolade Amandelen van Chokay', '2', null, 'chocoladeAmandelenVanChokay.jpg', '0', '6', '1');
INSERT INTO `producten` VALUES ('43', 'Chocolade Pindas van Chokay', '2', null, 'chocoladeAmandelenVanChokay.jpg', '0', '6', '1');
INSERT INTO `producten` VALUES ('44', 'Tony Chocolonely Reep', '2', null, 'tonysChocolonely.jpg', '0', '6', '1');
INSERT INTO `producten` VALUES ('45', 'IJS vanille', '2.5', null, 'ijscuypje.jpg', '0', '7', '1');
INSERT INTO `producten` VALUES ('46', 'IJS chocoladekoekjes', '2.5', null, 'ijscuypje.jpg', '0', '7', '1');
INSERT INTO `producten` VALUES ('47', 'IJS yoghurt-kers', '2.5', null, 'ijscuypje.jpg', '0', '7', '1');
INSERT INTO `producten` VALUES ('48', 'IJS sorbetijs van het seizoen', '2.5', '', 'ijscuypje.jpg', '0', '7', '1');
INSERT INTO `producten` VALUES ('52', 'test', '1.5', '123213', 'pepsiColaBlik.jpg', '0', '1', '1');

-- ----------------------------
-- Table structure for productorder
-- ----------------------------
DROP TABLE IF EXISTS `productorder`;
CREATE TABLE `productorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productid` int(11) NOT NULL,
  `aantal` int(11) NOT NULL DEFAULT '1',
  `sessieid` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`,`productid`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of productorder
-- ----------------------------
INSERT INTO `productorder` VALUES ('94', '5', '5', '891f9b77e5ac1d33352782f91c14');
INSERT INTO `productorder` VALUES ('95', '3', '1', '891f9b77e5ac1d33352782f91c14');
INSERT INTO `productorder` VALUES ('98', '1', '2', '893f024589816a86420259eec8ad');
INSERT INTO `productorder` VALUES ('99', '2', '1', '8962f788d3c8aa4ffd949a603443');
INSERT INTO `productorder` VALUES ('100', '29', '1', '89ddfa86790b7662c82c920de7a8');
INSERT INTO `productorder` VALUES ('101', '1', '2', '89f79f091da5049c2aa746d68a30');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `rank` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'admin', '1');
INSERT INTO `users` VALUES ('2', 'test', 'test', '1');

-- ----------------------------
-- Table structure for voorstelling
-- ----------------------------
DROP TABLE IF EXISTS `voorstelling`;
CREATE TABLE `voorstelling` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `naam` varchar(45) NOT NULL,
  `datum` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of voorstelling
-- ----------------------------
INSERT INTO `voorstelling` VALUES ('26', 'DE VERLEIDERS - SLIKKEN EN STIKKEN', '2017-01-11');
INSERT INTO `voorstelling` VALUES ('27', 'Test', '2017-10-10');

-- ----------------------------
-- Table structure for winkelwagen
-- ----------------------------
DROP TABLE IF EXISTS `winkelwagen`;
CREATE TABLE `winkelwagen` (
  `winkelwagenid` int(11) NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL,
  `voorstellingid` int(11) NOT NULL,
  `voornaam` varchar(45) NOT NULL,
  `achternaam` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `sessieid` varchar(45) NOT NULL,
  `status` int(11) NOT NULL,
  PRIMARY KEY (`winkelwagenid`,`date`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of winkelwagen
-- ----------------------------
INSERT INTO `winkelwagen` VALUES ('36', 'Tue Jan 10 14:31:53 CET 2017', '26', 'Evert', 'Smits', 'evert@gmail.com', '891f9b77e5ac1d33352782f91c14', '1');
INSERT INTO `winkelwagen` VALUES ('37', 'Tue Jan 10 14:34:21 CET 2017', '26', 'Rowan', 'Vissefr', '', '893f024589816a86420259eec8ad', '1');
INSERT INTO `winkelwagen` VALUES ('38', 'Tue Jan 10 14:42:44 CET 2017', '26', 'abc', 'abc', 'rowan.visser@hotmail.com', '8962f788d3c8aa4ffd949a603443', '1');
INSERT INTO `winkelwagen` VALUES ('39', 'Tue Jan 10 14:44:29 CET 2017', '26', 'sadsadsad', 'sdsa', 'sa1dlasda@23.nl', '89ddfa86790b7662c82c920de7a8', '1');
SET FOREIGN_KEY_CHECKS=1;
