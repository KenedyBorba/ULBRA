   /*

departamento(codigo numeric primary key, nome char); 
professor(matricula numeric primary key, codigo_departamento numeric foreign key, nome char, data_contratacao date) 
    codigo_departamento references departamento(codigo); 
aluno(id numeric primary key, cpf chat unique key, nome char, endereço char); 
disciplina(codigo numeric primary key, matricula_professor numeric foreign key, nome char, qtde_credito numeric, 
pre_requisito char) 
    matricula_professor references professor(matricula); 
cursa(id_aluno numeric foreign key, codigo_disciplina numeric foreign key) 
    id_aluno references aluno(id) 
    codigo_disciplina references disciplina(codigo); 
curso(codigo numeric primary key, codigo_departamento numeric foreign key, nome char) 
    codigo_departamento references departamento(codigo); 
matricula(id_aluno numeric foreign key, codigo_curso numeric foreign key, data_matricula date) 
    id_aluno references aluno(id) 
    codigo_curso references curso(codigo);

*/

CREATE DATABASE escola;

USE escola;

CREATE TABLE aluno
(
    id INT auto_increment PRIMARY KEY,
    cpf VARCHAR(14) unique,
    nome VARCHAR(50) NOT null,
    endereco VARCHAR(50) NOT null
);

CREATE TABLE departamento
(
    cod INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT null
);

CREATE TABLE professor
(
    matricula INT auto_increment PRIMARY KEY,
    cod_departamento INT NOT null,
    nome VARCHAR(50) NOT null,
    data_contratacao DATA,
    CONSTRAINT professor_tem_departamento
        FOREIGN KEY (cod_departamento)
            REFERENCES departamento(cod)
);

CREATE TABLE disciplina
(
    cod INT auto_increment PRIMARY KEY,
    matricula_professor INT NOT null,
    nome VARCHAR(50) NOT null,
    qtde_credito INT NOT null,
    pre_requisito VARCHAR(100) NOT null,
    CONSTRAINT disciplina_tem_professor
        FOREIGN KEY (matricula_professor)
            REFERENCES professor(matricula)
);

CREATE TABLE cursa
(
    id_aluno INT NOT null,
    cod_disciplina INT NOT null,
    CONSTRAINT cursa_tem_aluno
        FOREIGN KEY (id_aluno)
            REFERENCES aluno(id)
    CONSTRAINT cursa_tem_disciplina
        FOREIGN KEY (cod_disciplina)
            REFERENCES disciplina(cod)
);

CREATE TABLE curso
(
    cod INT auto_increment PRIMARY KEY,
    cod_departamento INT FOREIGN KEY,
    nome VARCHAR(50) NOT null,
    CONSTRAINT curso_tem_departamento
        FOREIGN KEY (cod_departamento)
            REFERENCES departamento(cod)
);

CREATE TABLE matricula
(
    id_aluno INT FOREIGN KEY,
    cod_curso INT FOREIGN KEY,
    data_matricula DATE,
    CONSTRAINT matricula_tem_aluno
        FOREIGN KEY (id_aluno)
            REFERENCES aluno(id)
    CONSTRAINT matricula_tem_curso
        FOREIGN KEY (cod_curso)
            REFERENCES curso(cod)
);