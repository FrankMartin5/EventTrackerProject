-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema subscriptiontrackerdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `subscriptiontrackerdb` ;

-- -----------------------------------------------------
-- Schema subscriptiontrackerdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `subscriptiontrackerdb` DEFAULT CHARACTER SET utf8 ;
USE `subscriptiontrackerdb` ;

-- -----------------------------------------------------
-- Table `subscription`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `subscription` ;

CREATE TABLE IF NOT EXISTS `subscription` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `renewal_date` DATETIME NOT NULL,
  `cost` DOUBLE NOT NULL,
  `created_at` DATETIME NOT NULL,
  `updated_at` DATETIME NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS subscription@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'subscription'@'localhost' IDENTIFIED BY 'subscription';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'subscription'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `subscription`
-- -----------------------------------------------------
START TRANSACTION;
USE `subscriptiontrackerdb`;
INSERT INTO `subscription` (`id`, `name`, `renewal_date`, `cost`, `created_at`, `updated_at`) VALUES (1, 'netflix', '2020-05-12', 15.99, '2020-04-12', '2020-04-12');

COMMIT;

