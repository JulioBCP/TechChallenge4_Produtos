DROP TABLE IF EXISTS produto;

CREATE TABLE IF NOT EXISTS produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    quantidade_estoque INT,
    preco DOUBLE
);

DELETE FROM produto;

INSERT INTO produto (nome, descricao, quantidade_estoque, preco) VALUES ('Camiseta estampa', 'Camiseta personagem tamanho G', 23, 75.15);
INSERT INTO produto (nome, descricao, quantidade_estoque, preco) VALUES ('Tenis Corrida', 'Tenis Asics tamanho 42', 12, 265.00);
INSERT INTO produto (nome, descricao, quantidade_estoque, preco) VALUES ('Smartwatch', 'Relogio Samsung Galaxy', 3, 3259.99);
INSERT INTO produto (nome, descricao, quantidade_estoque, preco) VALUES ('Laptop', 'Laptop Dell core i7', 5, 2989.99);