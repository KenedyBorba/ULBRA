-- DDL

-- CREATE = criar tabelas **
-- ALTER = altera tabelas
-- DROP = remove tabelas

-- CONSTRAINT = nome para o ligamento


/*
aqui nós vamos fazer nosso primeiro create table.

*/

/*

Padrões de Nomenclatura
    - São Importantes

Pascal Case
    - tudo é inicial maiúscula.
    - quando tem nome composto, usa-se o segundo nome inicial maiúscula.
        - Nome
        - NomeDoCliente

camelCase
    - nome
    - nomeDoCliente

no SQL qual padrão?
    - comandos base (reservados) - UPPERCASE
    - comandos de estrutura tudo lower_case


*/

-- cria um esquema (banco de dados)

CREATE DATABASE teste_ddl; -- ou
CREATE SCHEMA teste_ddl;


USE teste_ddl;

/* no relacional temos:
    departamentos (id pk char , nome char, valor_orcamento numeric)
    empregados( 
                matricula PK numeric, cpf char unique, nome char,
                cargo char, salario numeric, id_departamento FK char
              )
*/

CREATE TABLE departamentos 
(
    -- nome tipo restrição
    id INT NOT null,
    nome VARCHAR(25) NOT null,
    valor_orcamento DECIMAL(12,2),
    PRIMARY KEY(id) --aqui ou colocar a primary key diretamente no atributo. 
);

CREATE TABLE empregados
(
    id INT auto_increment NOT NULL,
    matricula VARCHAR(50) NOT null,
    cpf VARCHAR(14) unique,
    nome VARCHAR(50) NOT null,
    cargo VARCHAR(30) NOT null,
    salario DECIMAL(18,2)  default 0,
    sigla CHAR(2),
    data_nascimento DATE, 
    id_departamento INT NOT null,
    
    PRIMARY KEY(id),
-- CONSTRAINT = nome para o ligamento
    CONSTRAINT esta_alocado 
        FOREIGN KEY id_departamento
            REFERENCES departamentos(id)
);


/*
    regra do auto incremento
    mysql usa a palavra auto_increment
    postgres usa o tipo de dado SERIAL
    SQL SERVER IDENTITY(1,1);
    

*/

/*
 ------ tipos -------
    float
        99.955555555 
    decimal(12,2)
        99999999.95

    int 
    bigint

    char(tam)
        - ocupa o tamanho que esta descrito no "()", mesmo que sem necessidade
    varchar(tam)
        - ocupa somente a quantidade que realmente é usada.


    CHAR (10)
    numero char(10);
    numeroVC varchar(10);
    
    numero = 12        
    numeroVC = 12

    default 0
        - é o valor que vai automaticamente quando não se coloca nada. 
------ tipos -------


Type	    Storage (Bytes)	    Minimum Value Signed	Minimum Value Unsigned	Maximum Value Signed	Maximum Value Unsigned
TINYINT	    1	                -128	                0	                    127	                    255
SMALLINT	2	                2768	                0	                    32767	                65535
MEDIUMINT	3	                -8388608	            0	                    8388607	                16777215
INT	        4	                -2147483648	            0	                    2147483647	            4294967295
BIGINT	    8	                -263	                0	                    263-1	                264-1


*/



/*

aluno(id, nome)
departamento (id, nome)
curso(id, nome, id_depto)
  id_depto referencia departamento (id)
professor(id, nome)
disciplina(id, nome, id_prof)
   id_prof referencia professor(id)
matricula(id_disciplina, id_aluno, data_matr)
    id_disciplina referencia disciplina(id) 
   id_aluno referencia aluno(id);
*/

CREATE DATABASE escola_do_fundamento_banco_de_dados;

USE escola_do_fundamento_banco_de_dados;

CREATE TABLE alunos
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(80) NOT null
);

CREATE TABLE departamentos
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(30) NOT null
);

CREATE TABLE cursos
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT null,
    id_departamento int NOT null,
    CONSTRAINT pertence_ao_depto 
        FOREIGN KEY (id_departamento)
            REFERENCES departamentos(id)
);

CREATE TABLE professores
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(80) NOT null
);

CREATE TABLE disciplinas
(    
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(30) NOT null,
    id_professor INT NOT null,
    CONSTRAINT eh_data_por_professor
        FOREIGN KEY (id_professor)
            REFERENCES professores(id)
);

CREATE TABLE matricula
(
    id_professor INT NOT null,
    id_disciplina INT NOT null,
    data_matricula DATE,
    CONSTRAINT matricula_tem_professor
        FOREIGN KEY (id_professor)
            REFERENCES professores(id),
    CONSTRAINT matricula_tem_disciplina
        FOREIGN KEY (id_disciplina)
            REFERENCES disciplinas(id)
);


--album de fotografias

CREATE TABLE albuns 
(
    id int auto_increment primary key,
    nome varchar(50) not nul,
    desativado boolean default false
);

CREATE TABLE fotografias
(
    id INT auto_increment primary key,
    nome varchar(30) not null,
    descricao varchar(500),
    id_album int,
    CONSTRAINT fotografia_tem_algum
    FOREIGN KEY (id_album)
    REFERENCES albuns 
)

