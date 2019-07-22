-- TABLETOPS
INSERT IGNORE INTO telegram_bot_zathras.tabletops VALUES (1,'Shadowrun My', 'Shadowrun 5-th edition');
INSERT IGNORE INTO telegram_bot_zathras.tabletops VALUES (2,'Pathfinder', 'Pathfinder 1-st edition');
INSERT IGNORE INTO telegram_bot_zathras.tabletops VALUES (3,'Earth dawn', '3-d Edition');
INSERT IGNORE INTO telegram_bot_zathras.tabletops VALUES (4,'Travaller', '2-nd edition');
INSERT IGNORE INTO telegram_bot_zathras.tabletops VALUES (5,'Shadowrun Ashley', 'Shadowrun 5-th edition');

-- BOOKS
-- Pathfinder books
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (1, 'Pathfinder - Core Rulebook', 'Basic book', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (2, 'Pathfinder Advanced Players Guide', 'The most importaint addition', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (3, 'Ultimate Magic', 'Booka about magic, spells and so on', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (4, 'Ultimate Combat', 'Books about combat, fightn and so on', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (5, 'Advanced Race Guide', 'Books about races', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (6, 'Ultimate Equipment', 'Book about equipment', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (7, 'Advanced Class Guide', 'Books about classes, hybrid classes', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (8, 'Occult Adventures', 'Book about occultism, spirit classes', 2 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (9, 'Ultimate Intrigue', 'Book for faces and social', 2 );

-- Shadowrun books
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (10, 'Shadowrun 5th-ed Core Rulebook', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (11, 'Aetherology', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (12, 'Bloody Business', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (13, 'Book of the Lost', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (14, 'Bullets & Bandages', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (15, 'Chrome Flesh', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (16, 'Court of Shadows', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (17, 'Cutting Aces', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (18, 'Dark Terrors', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (19, 'Data Trails', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (20, 'Forbidden Arcana', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (21, 'Gun H(e)aven', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (22, 'Hard Targets', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (23, 'Howling Shadows', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (24, 'Kill Code', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (25, 'Rigger 5.0', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (26, 'Run & Gun', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (27, 'Run Faster', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (28, 'Shadow Spells', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (29, 'Stolen Souls', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (30, 'Street Grimoire', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (31, 'The Assassins Primer', 'Basic book', 1 );
INSERT IGNORE INTO telegram_bot_zathras.books VALUES (32, 'The Complete Trog', 'Basic book', 1 );

-- PLAYERS
INSERT IGNORE INTO telegram_bot_zathras.players VALUES (1, 'Stepan Rapinchuk', 'Danstep' );
INSERT IGNORE INTO telegram_bot_zathras.players VALUES (2, 'Roman Timosuk', 'Orome' );
INSERT IGNORE INTO telegram_bot_zathras.players VALUES (3, 'Kirill Kravets', 'VJ Ray' );
INSERT IGNORE INTO telegram_bot_zathras.players VALUES (4, 'Ashley Holmes', 'Ashley' );
INSERT IGNORE INTO telegram_bot_zathras.players VALUES (5, 'Tatsiana Rudaja', 'Itazis' );
INSERT IGNORE INTO telegram_bot_zathras.players VALUES (6, 'Valeryia Shekhautsova ', 'UNKONOWN' );

-- CHARACTERS (ID , Char_name, Description, link to tabletop, link to player)
-- Pathfinder Characters
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (1, 'Marcus', 'DEAD' ,'Magus dhampir', 1, 2);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (2, 'Arvin Yrolem', 'ACTIVE' , 'Tiefling infernal sorcerer', 2, 2);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (3, 'Wilheml', 'INACTIVE' ,'Human oracle of life', 3, 2);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (4, 'Net', 'ACTIVE' ,'Shapeshifter swashbuckler', 3, 2);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (5, 'Larhon', 'ACTIVE' ,'Oread cleric of Saerenrae', 4, 2);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (6, 'Ler Dante', 'DEAD' , 'Aasimar Iomedae paladin', 1, 2);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (7, 'Morgana', 'ACTIVE' ,'Mefolk ranger', 5, 2);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (8, 'As`hata', 'ACTIVE' ,'Half-orc barbarian', 6, 2);

-- My Shadowrun Characters
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (9, 'Handzo', 'DEAD' , 'Human adept street samurai', 1, 1);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (10, 'Damien', 'ACTIVE' , 'Human dragon awakened face teamleader', 4, 1);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (11, 'Nataniel', 'ACTIVE' , 'Elf augumented sniper-enforcer', 1, 1);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (12, 'Heckyl', 'DEAD' , 'Human Black mage face', 5, 1);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (13, 'Ametyl', 'ACTIVE' , 'Human  mage ', 5, 1);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (14, 'Lynx', 'ACTIVE' , 'Human  decked augumented by DEUS ', 3, 1);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (15, 'Vivier', 'DEAD' , 'Human  wide spectre specialist ', 3, 1);
INSERT IGNORE INTO telegram_bot_zathras.characters VALUES (16, 'Thion', 'ACTIVE' , 'Elf  fire shaman ', 2, 1);

-- Ashley Shadowrun Characters


-- HOMERULES
INSERT IGNORE INTO telegram_bot_zathras.houserules VALUES (1, 'Every character got I fix after creation', NULL);
INSERT IGNORE INTO telegram_bot_zathras.houserules VALUES (1, 'Every character got I fix after creation', NULL);
