-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ExerciseTracker
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `ExerciseTracker` ;

-- -----------------------------------------------------
-- Schema ExerciseTracker
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ExerciseTracker` DEFAULT CHARACTER SET utf8 ;
USE `ExerciseTracker` ;

-- -----------------------------------------------------
-- Table `dummy`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dummy` ;

CREATE TABLE IF NOT EXISTS `dummy` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS fitness@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'fitness'@'localhost' IDENTIFIED BY 'superfit1';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'fitness'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `dummy`
-- -----------------------------------------------------
START TRANSACTION;
USE `ExerciseTracker`;
INSERT INTO `dummy` (`id`, `name`) VALUES (1, 'exercise');

COMMIT;

