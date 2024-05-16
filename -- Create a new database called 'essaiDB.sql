-- Create a new database called 'essaiDB'
-- Connect to the 'master' database to run this snippet

CREATE DATABASE essaiDB

Create Table etudiant(
    matricule VarChar(10) primary key,
    nom Char(20),
    prenom Char(20),
    datenais date
);
Create Table matiere(
    codeMat VarChar(10) primary key,
    libelle Char(60),
    coefficient int
);
Create Table ficheNote(
    codeFiche VarChar(10) primary key,
    dateFiche date,
    matricule VarChar(15),
    codeMat char(10),
    note float,
    constraint ficheNote_matricule foreign key (ficheNote) references etudiant(matricule),
    constraint ficheNote_codeMat foreign key(ficheNote) references matiere(codeMat)
);
