## TESTES ##
- (OK) Teste das funções CRUD no terminal com "curl -X DELETE ou POST..."
- (OK) Criamos 10 entradas para cada entidade do banco de dados abaixo.

## CRIAÇÃO DO BANCO DE DADOS ##
- Atualizamos a criação do banco de dados para ser automática na produção, ao invés de criá-lo diretamente no postgres.
- Fizemos isso alterando "application.properties" do nosso projeto para incluir uma linha (agora comentada): "spring.jpa.hibernate.ddl-auto=create"
- Somente a opção de =update permaneceu.
