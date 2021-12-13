-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema bdProyectoFinalOsnaya
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdProyectoFinalOsnaya
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdProyectoFinalOsnaya` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `bdProyectoFinalOsnaya` ;

-- -----------------------------------------------------
-- Table `bdProyectoFinalOsnaya`.`paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdProyectoFinalOsnaya`.`paciente` (
  `id_paciente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_pat` VARCHAR(45) NULL DEFAULT NULL,
  `apellido_mat` VARCHAR(45) NULL DEFAULT NULL,
  `edad` VARCHAR(45) NULL DEFAULT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `direccion` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_paciente`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bdProyectoFinalOsnaya`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdProyectoFinalOsnaya`.`usuario` (
  `id_usuario` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(145) NULL DEFAULT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `bdProyectoFinalOsnaya`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdProyectoFinalOsnaya`.`rol` (
  `id_rol` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `id_usuario` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_rol`),
  INDEX `id_rol_usuario_idx` (`id_usuario` ASC) VISIBLE,
  CONSTRAINT `id_rol_usuario`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `bdProyectoFinalOsnaya`.`usuario` (`id_usuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
