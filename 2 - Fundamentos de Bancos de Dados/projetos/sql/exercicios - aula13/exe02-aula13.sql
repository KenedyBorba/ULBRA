/*

navio (id numeric pk, nome char, capacidade numeric); 
porto(id numeric pk, nome char); 
rota_navio_porto(id_navio fk, id_porto int fk) 
    id_navio referencia navio(id) 
    id_porto referencia porto(id) 
agente(id numeric pk, nome char, id_porto numeric fk) 
    id_porto referencia porto(id) 
carga(numero numeric pk, peso numeric, data_maxima_desembarque date, id_agente numeric fk, 
id_porto numeric fk, id_navio numeric fk) 
    id_agente referencia agente(id) 
    id_porto referencia porto(id) 
    id_navio referencia navio(id) 
perecivel(numero_carga numeric fk, data_validade date) 
    numero_carga referencia carga(numero) 
sensivel(numero_carga numeric fk, temperatura_maxima numeric) 
    numero_carga referencia carga(numero)

*/

CREATE DATABASE navio_do_porto;

USE navio_do_porto;

CREATE TABLE navio
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT null,
    capacidade INT NOT null
);

CREATE TABLE porto
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT null
);

CREATE TABLE rota_navio_porto
(
    
);

CREATE TABLE agente
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT null,
    id_porto INT FOREIGN KEY,
    CONSTRAINT agente_tem_porto
        FOREIGN KEY (id_porto)
            REFERENCES porto(id)
);

CREATE TABLE carga
(
    numero INT PRIMARY KEY,
    peso INT NOT null,
    data_maxima_desembarque DATE,
    id_agente INT FOREIGN KEY,
    id_porto INT FOREIGN KEY,
    id_navio INT FOREIGN KEY,
    CONSTRAINT carga_tem_agente
        FOREIGN KEY (id_agente)
            REFERENCES agente(id)
    CONSTRAINT carga_tem_porto
        FOREIGN KEY (id_porto)
            REFERENCES porto(id)
    CONSTRAINT carga_tem_navio
        FOREIGN KEY (id_navio)
            REFERENCES navio(id)
);

CREATE TABLE perecivel
(
    numero_carga INT FOREIGN KEY,
    data_validade DATE,
    CONSTRAINT perecivel_tem_carga
        FOREIGN KEY (numero_carga)
            REFERENCES carga(numero)
);

CREATE TABLE sensivel
(
    numero_carga INT FOREIGN KEY,
    temperatura_maxima INT NOT null,
    data_matricula DATE,
    CONSTRAINT sensivel_tem_carga
        FOREIGN KEY (numero_carga)
            REFERENCES carga(numero)
);