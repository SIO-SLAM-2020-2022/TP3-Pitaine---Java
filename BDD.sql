create table bateau (
    id int auto_increment,
    nom text NOT NULL,
    longueur int NOT NULL,
    largeur int NOT NULL,
    vitesse int NOT NULL,
    image text NOT NULL,
    poidsMax int NOT NULL,
    type text NOT NULL,

    PRIMARY KEY (id)
);

create table equipement (
    id int auto_increment,
    libelle mediumtext NOT NULL,
    PRIMARY KEY (id)
);

create table posseder(
    possederID int auto_increment,
    idBat int,
    idEquip int,

    PRIMARY KEY (possederID),
    FOREIGN KEY (idBat) REFERENCES bateau(id),
    FOREIGN KEY (idEquip) REFERENCES equipement(id)
);


insert into bateau (nom, longueur, largeur, vitesse, image, poidsMax, type) VALUES ('Titanic', 152.6, 14.3, 29, 'img/batVoy_1.png', 25000, 'v');
insert into bateau (nom, longueur, largeur, vitesse, image, poidsMax, type)
values ('Chalupe', 189.6, 14.9,29,'img/batVoy_2.png',14500,'f');
insert into bateau (nom, longueur, largeur, vitesse, image, poidsMax, type)
values ('Costa concordia',258.47,100.66,58,'img/batVoy_3.png',2600,'v');

insert into equipement (libelle)
values ('Accès handicapé');
insert into equipement (libelle)
values ('Bar');
insert into equipement (libelle)
values ('Pont Promenade');
insert into equipement (libelle)
values ('Salon vidéo');

