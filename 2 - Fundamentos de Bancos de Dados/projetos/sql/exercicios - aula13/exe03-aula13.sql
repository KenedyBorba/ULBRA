/*

tipo_servico(codigo primary key numeric, descricao char, valor_m2 numeric, duracao_m2 time) 
empregado(matricula primary key numeric, nome char, tipo_servico_codigo foreign key numeric) 
    tipo_serviço_codigo references tipo_servico(codigo); 
habilitacao(tipo_servico_codigo foreign key numeric, empregado_matricula foreign key numeric);
    tipo_serviço_codigo references tipo_servico(codigo);
    empregado matricula references empregado(matricula); 
cliente(codigo primary key numeric, nome char, endereco char); 
pessoa_fisica(codigo_cliente numeric foreign key, cpf char unique key, nome char)
    codigo_cliente references cliente(codigo); 
pessoa_juridica(codigo_cliente numeric foreign key, cgc char unique key, razao_social char)
    codigo_cliente references cliente(codigo); 
pedido_do_servico(numero numeric primary key, codigo_cliente numeric foreign key, data_de_abertura 
date, data_de_realizacao date, local char) 
    codigo_cliente references cliente(codigo): 
item_de_pedido(codigo numeric primary key, numero_pedido_do_servico numeric foreign key, 
codigo_tipo_servico numeric foreign key, metragem numeric) 
    codigo_tipo_servico references tipo servico(codigo) 
    numero_pedido_do_servico references pedido do servico(numero); 
alocacao(id numeric primary key, matricula_empregado numeric foreign key, codigo_item_de_pedido numeric foreign key) 
    maticula_empregado references empregado(matricula) 
    codigo_item_de_pedido references item de pedido(codigo);

*/

CREATE DATABASE trabalho;

USE trabalho;

CREATE TABLE tipo_servico
(
    cod INT auto_increment PRIMARY KEY,
    descricao VARCHAR(100) NOT null,
    valor_m2 INT NOT null,
    duracao_m2 TIME
);

CREATE TABLE empregado
(
    matricula INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT null,
    tipo_servico_cod INT FOREIGN KEY,
    CONSTRAINT empregado_tem_tipo_servico
        FOREIGN KEY (tipo_servico_cod)
            REFERENCES tipo_servico(cod)
);

CREATE TABLE habilitacao
(
    tipo_servico_cod INT FOREIGN KEY,
    empregado_matricula INT FOREIGN KEY,
    CONSTRAINT habilitacao_tem_tipo_servico
        FOREIGN KEY (tipo_servico_cod)
            REFERENCES tipo_servico(cod)
    CONSTRAINT habilitacao_tem_matricula
        FOREIGN KEY (empregado_matricula)
            REFERENCES empregado(matricula)
);

CREATE TABLE cliente
(
    codigo INT PRIMARY KEY, 
    nome VARCHAR(50) NOT null, 
    endereco VARCHAR(50)
);

CREATE TABLE pessoa_fisica
(
    codigo_cliente INT FOREIGN KEY, 
    cpf VARCHAR(14) unique, 
    nome VARCHAR(50) NOT null,
    CONSTRAINT pessoa_fisica_tem_cliente
        FOREIGN KEY (codigo_cliente)
            REFERENCES cliente(codigo)
);

CREATE TABLE pessoa_juridica
(
    codigo_cliente INT FOREIGN KEY, 
    cgc VARCHAR(20) unique, 
    razao_social VARCHAR(50) NOT null,
    CONSTRAINT pessoa_juridica_tem_cliente
        FOREIGN KEY (codigo_cliente)
            REFERENCES cliente(codigo)
);

CREATE TABLE item_de_pedido
(
    codigo INT PRIMARY KEY, 
    numero_pedido_do_servico INT FOREIGN KEY, 
    codigo_tipo_servico INT FOREIGN KEY, 
    metragem INT NOT null,
    CONSTRAINT item_de_pedido_tem_pedido_do_servico
        FOREIGN KEY (numero_pedido_do_servico)
            REFERENCES pedido_do_servico(numero)
    CONSTRAINT item_de_pedido_tem_tipo_servico
        FOREIGN KEY (codigo_tipo_servico)
            REFERENCES tipo_servico(codigo)
);

CREATE TABLE alocacao
(
    id INT PRIMARY KEY,
    matricula_empregado INT FOREIGN KEY,
    codigo_item_de_pedido INT FOREIGN KEY,
    CONSTRAINT alocacao_tem_empregado
        FOREIGN KEY (maticula_empregado)
            REFERENCES empregado(matricula)
    CONSTRAINT alocacao_tem_item_de_pedido
        FOREIGN KEY (codigo_item_de_pedido)
            REFERENCES pedido(codigo)
);