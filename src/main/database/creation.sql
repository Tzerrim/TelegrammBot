CREATE DATABASE telegram_bot_zathras;

USE telegram_bot_zathras;

CREATE TABLE tabletops (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    description VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE books (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(200) NOT NULL,
    tabletops_id INTEGER NOT NULL,
    FOREIGN KEY (tabletops_id) REFERENCES tabletops(id),
    PRIMARY KEY (id)
);

CREATE TABLE players (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(200) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE characters (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(200) NOT NULL,
    player_id INTEGER NOT NULL,
    tabletops_id INTEGER NOT NULL,
    FOREIGN KEY (tabletops_id) REFERENCES tabletops(id),
    FOREIGN KEY (player_id) REFERENCES players(id),
    PRIMARY KEY (id)
);