--01
CREATE DATABASE consulta_medica;

USE consulta_medica;

CREATE TABLE cidade
(
    id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    uf char(2) NOT NULL
);

CREATE TABLE medico
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    crm VARCHAR(8) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    id_cidade INT NOT NULL,
    CONSTRAINT pertence_a_cidade
        FOREIGN KEY (id_cidade)
            REFERENCES cidade(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE
);

CREATE TABLE paciente
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    id_cidade INT NOT NULL,
    CONSTRAINT paciente_da_cidade
        FOREIGN KEY (id_cidade)
            REFERENCES cidade(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE
);

CREATE TABLE consulta
(
    id INT auto_increment PRIMARY KEY,
    id_medico INT NOT NULL,
    id_paciente INT NOT NULL,
    data_consulta DATE NOT NULL,
    hora TIME NOT NULL,
    CONSTRAINT consulta_ao_medico
        FOREIGN KEY (id_medico)
            REFERENCES medico(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE,
    CONSTRAINT consulta_ao_paciente
        FOREIGN KEY (id_paciente)
            REFERENCES paciente(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE
);

CREATE TABLE medicamento
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    composicao VARCHAR(200),
    preco DECIMAL (12,2) default 0
);

CREATE TABLE prescricao
(
    id_consulta INT NOT NULL,
    id_medicamento INT NOT NULL,
    posologia VARCHAR(30) NOT NULL,
    CONSTRAINT pertence_ao_medicamento
        FOREIGN KEY (id_medicamento)
            REFERENCES medicamento(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE,
    CONSTRAINT pertence_a_consulta
        FOREIGN KEY (id_consulta)
            REFERENCES consulta(id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE
); 

--02
INSERT INTO cidade (nome,uf)
VALUES ('Torres', 'RS'),
VALUES ('Arroio do Sal', 'RS'), 
VALUES ('Capão da Canoa', 'RS'),

INSERT INTO medicamento (nome,composicao,preco)
VALUES ('Aspirina','Ácido Acetilsalicílico','10') 
VALUES ('Neo Loratadin','Loratadina','8') 
VALUES ('Novalgina','Dipirona Sódica','6')


INSERT INTO medico (nome,endereco,telefone,crm,cpf,id_cidade) 
VALUES ('Vilmar Cardoso','Rua Luis de Freitas','(51)911111111','111111','111.111.111-11',1), 
VALUES ('Regina Trajano','Avenida das Hortências','(51)922222222','222222','222.222.222-22',2), 
VALUES ('Capão da Canoa','Rua dos Barbes','(51)933333333','333333','333.333.333-33',3),

INSERT INTO paciente (nome,endereco,telefone,id_cidade)
VALUES('Felipe Oliveira','Rua Presidente Vargas','(51)944444444',1),
VALUES('Catiussia Castanho','Rua das Flôres','(51)955555555',2),
VALUES ('Vitoria Regina','Rua 20 de Setembro','51966666666',3),

INSERT INTO consulta (Id_medico,id_paciente,data_consulta,hora)

INSERT INTO consulta(id_medico,id_paciente,data_consulta,hora)
VALUES (1,1,'2028-11-15','08:38:08'), 
VALUES (2,2,'2028-11-29','14:00:00'),
VALUES (3,3,'2828-11-22','89:88:88'), 

INSERT INTO prescricao (id_consulta,id_medicamento,posologia)
VALUES (1,1,'1 comprimido de 8 em 8 horas'),
VALUES (2,2,'1 comprimido de 8 en 8 horas'), 
VALUES (3,3,'1 comprimido de 8 en 8 horas')

--03
UPDATE medicamento
    SET preco = preco * 1.20
        WHERE id = 1

--04
DELETE FROM cidade
WHERE id = 3

--05
SELECT nome
FROM cidadeWHERE uf = 'RS'

--06
SELECT nome,preco
FROM medicamento

--12
SELECT AVG(preco) AS Média
FROM medicamento

--13
SELECT SUM(id) AS Consultas Cadastradas
FROM consulta

-- 14
SELECT *
FROM medicamento
where preco = (SELECT MAX(preco) FROM medicamento);

-- 15
SELECT *
FROM medicamento
where preco >= (SELECT avg(preco) FROM medicamento);

