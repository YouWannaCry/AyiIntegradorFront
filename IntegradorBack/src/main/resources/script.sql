CREATE TABLE IF NOT EXISTS `persona` (
  name varchar (50) NOT NULL,
  cellphone varchar(50) NOT NULL,
  latitude varchar(50) NOT NULL,
  longitude int(11) NOT NULL,
  contacts varchar(15) NOT NULL,
  PRIMARY KEY (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;