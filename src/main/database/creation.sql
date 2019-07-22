CREATE DATABASE IF NOT EXISTS telegram_bot_zathras;

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
    description VARCHAR(200) NOT NULL DEFAULT 'UNKNOWN',
    players_status VARCHAR(8) DEFAULT 'ACTIVE',
    PRIMARY KEY (id)
);

CREATE TABLE characters (
    id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL UNIQUE,
    description VARCHAR(200) NOT NULL,
    character_status  VARCHAR(8) DEFAULT 'ACTIVE',
    player_id INTEGER NOT NULL,
    tabletops_id INTEGER NOT NULL,
    FOREIGN KEY (tabletops_id) REFERENCES tabletops(id),
    FOREIGN KEY (player_id) REFERENCES players(id),
    PRIMARY KEY (id)
);

-- NOTE: if "tabletops_id" is NULL - means that this houserules is universal to all tabletops
CREATE TABLE houserules (
    id INTEGER NOT NULL AUTO_INCREMENT,
    description TEXT NOT NULL,
    tabletops_id INTEGER NULL,
    FOREIGN KEY (tabletops_id) REFERENCES tabletops(id),
    PRIMARY KEY (id)
);