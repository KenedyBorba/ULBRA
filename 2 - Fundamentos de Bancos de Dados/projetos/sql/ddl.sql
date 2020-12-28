/*
Fornecedor (Fcod, Fnome, Status, Cidade)
PeCa (Pcod, Pnome, Cor, Peso, Cidade)
Projeto (PRcod, Icod, PRnome, Cidade)
	Icod referencia Instituição(Icod)
Fornecimento (Fcod, Pcod, PRcod, Quantidade)
	Fcod referencia Fornecedor(Fcod)
	Pcod referencia Peça (Pcod)
  PRcod referencia Projeto (Prcod)
Instituição (Icod, nome)

Nomes para restrições de chaves primária, estrangeira e  alternativa
Valor default para o atributo Status, de Fornecedor
Todos os atributos de Peça não podem ser nulos
Qual tabela deve ser criada por último? Porque? 

*/

CREATE TABLE fornecedor
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    status INT default 0,
    cidade VARCHAR(50) NOT NULL
);

CREATE TABLE peca
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cor VARCHAR(15) NOT NULL,
    peso FLOAT default 0,
    cidade VARCHAR(25) NOT NULL,
);

CREATE TABLE instituicao
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
);

CREATE TABLE projeto
(
    id INT auto_increment PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    cidade VARCHAR(25) NOT NULL,
    id_instituicao INT,
        CONSTRAINT projeto_tem_instituicao
            FOREIGN KEY (id_instituicao)
                REFERENCES projeto(id) --referenciar na outra tabela
                    ON DELETE SET NULL -- Com o set null, o projeto continuará existindo, e o id_instituição continuará existindo como NULL. 
                    -- ON DELETE RESTRICT = ele só vai apagar o que está na tabela projeto com o restrict
                    ON UPDATE CASCADE -- quando mudar na tabela instituição vai alterar direto no projeto com o cascade
);

CREATE TABLE fornecimento
(
    id INT auto_increment PRIMARY KEY,
    id_fornecedor INT NOT NULL,
    id_projeto INT NOT NULL,
    id_peca INT NOT NULL,
    quantidade DECIMAL(12,3) default 0,
        CONSTRAINT fornecimento_tem_fornecedor
            FOREIGN KEY (id_fornecedor)
                REFERENCES fornecedor(id)
                    ON DELETE RESTRICT -- fornecedor nao pode ser apagado se estiver sendo usado como fk nessa mesma tabela
                    ON UPDATE CASCADE,
        CONSTRAINT projeto_tem_fornecimento
            FOREIGN KEY (id_projeto)
                REFERENCES projeto(id)
                    ON DELETE RESTRICT
                    ON UPDATE CASCADE,
        CONSTRAINT peca_tem_fornecimento
            FOREIGN KEY (id_peca)
                REFERENCES peca(id)
                    ON DELETE SET NULL
                    ON UPDATE CASCADE,

);