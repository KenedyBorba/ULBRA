CREATE DATABASE Aluguel Veiculos;


CREATE TABLE clientes
(
    cpf VARCHAR(14) PRIMARY KEY,
    telefone INT,
    endereco VARCHAR(50),
    nome VARCHAR(50)
);

CREATE TABLE veiculo
(
    id INT auto_increment PRIMARY KEY,
    placa VARCHAR(8),
    modelo VARCHAR(50),
    cod_marca INT,
    marca VARCHAR(20),
    ano INT
);

CREATE TABLE alugar
(
    id INT PRIMARY KEY,
    data_aluguel DATE,
    data_devolucao DATE,
    valor DECIMAL (10,2),
    id_veiculo VARCHAR(8) NOT NULL,
        CONSTRAINT id_pertence_veiculo
            FOREIGN KEY (id_veiculo)
                REFERENCES veiculo(id)
);