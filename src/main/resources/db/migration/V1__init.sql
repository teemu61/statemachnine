CREATE TABLE `entity` (
  `id`    INT PRIMARY KEY AUTO_INCREMENT,
  `name`  VARCHAR(255) NOT NULL UNIQUE,
  `state` VARCHAR(255) NOT NULL
);