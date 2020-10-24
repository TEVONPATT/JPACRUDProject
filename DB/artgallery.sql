-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema artgallerydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `artgallerydb` ;

-- -----------------------------------------------------
-- Schema artgallerydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `artgallerydb` DEFAULT CHARACTER SET utf8 ;
USE `artgallerydb` ;

-- -----------------------------------------------------
-- Table `artgallery`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `artgallery` ;

CREATE TABLE IF NOT EXISTS `artgallery` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO artgalleryuser@localhost;
 DROP USER artgalleryuser@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'artgalleryuser'@'localhost' IDENTIFIED BY 'artgalleryuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'artgalleryuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `artgallery`
-- -----------------------------------------------------
START TRANSACTION;
USE `artgallerydb`;
INSERT INTO `artgallery` (`id`, `first_name`) VALUES (1, 'Vincent');

COMMIT;
