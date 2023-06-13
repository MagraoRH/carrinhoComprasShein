create schema carrinho;
use carrinho;

CREATE TABLE IF NOT EXISTS `carrinho`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
`cpf` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE INDEX `cpf_UNIQUE` (`cpf` ASC)
)

ENGINE = InnoDB;

select * from cliente;

CREATE TABLE IF NOT EXISTS `carrinho`.`produto` (
  `idProduto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `quantidade` int NOT NULL,
  `preco` float NOT NULL,
  `codigoBarras` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`idProduto`))
  
ENGINE = InnoDB;

select * from produto;