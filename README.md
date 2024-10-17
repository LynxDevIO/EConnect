## TESTES ##
(OK) Teste das funções CRUD no terminal com "curl -X DELETE ou POST..."
(OK) Criamos 10 entradas para cada entidade do banco de dados abaixo.

# #Script para o postgress (BD: Econnect, usuario: postgres, senha: 123123) ##
-- Tabela Usuario
CREATE TABLE Usuario (
    id_usuario BIGSERIAL PRIMARY KEY,
    data_criacao_conta DATE NOT NULL,
    usuario VARCHAR(255) NOT NULL,
    nome_real_usuario VARCHAR(255),
    password VARCHAR(255) NOT NULL,
    coordenadas VARCHAR(255)
);

-- Tabela Premio
CREATE TABLE Premio (
    id_premio BIGSERIAL PRIMARY KEY,
    tipo_premio INT NOT NULL,
    nome_premio VARCHAR(255) NOT NULL,
    descricao_premio TEXT,
    caminho_imagem VARCHAR(255),
    categoria_premio INT NOT NULL,
    pontuacao_necessaria BIGINT,
    pontuacao_atual BIGINT,
    pontuacao_atingida BOOLEAN
);

-- Tabela Comunidade
CREATE TABLE Comunidade (
    id_comunidade BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    limite_membros INT NOT NULL,
    qualidade_premiacao INT
);

-- Tabela Evento
CREATE TABLE Evento (
    id_evento BIGSERIAL PRIMARY KEY,
    tipo_evento INT NOT NULL,
    nome_evento VARCHAR(255) NOT NULL,
    coordenadas VARCHAR(255),
    data_evento DATE NOT NULL,
    duracao_evento FLOAT NOT NULL,
    editavel BOOLEAN NOT NULL
);

-- Tabela intermediária Usuario_Comunidade (para armazenar a relação entre Usuarios e Comunidades)
CREATE TABLE Usuario_Comunidade (
    id_usuario BIGINT REFERENCES Usuario(id_usuario),
    id_comunidade BIGINT REFERENCES Comunidade(id_comunidade),
    PRIMARY KEY (id_usuario, id_comunidade)
);

-- Tabela intermediária Usuario_Premio (para armazenar a relação entre Usuarios e Premios)
CREATE TABLE Usuario_Premio (
    id_usuario BIGINT REFERENCES Usuario(id_usuario),
    id_premio BIGINT REFERENCES Premio(id_premio),
    PRIMARY KEY (id_usuario, id_premio)
);

-- Tabela intermediária Usuario_Amigos (auto-relacionamento de Usuario)
CREATE TABLE Usuario_Amigos (
    id_usuario BIGINT REFERENCES Usuario(id_usuario),
    id_amigo BIGINT REFERENCES Usuario(id_usuario),
    PRIMARY KEY (id_usuario, id_amigo)
);

-- Tabela intermediária Evento_Premio (para armazenar a relação entre Eventos e Premios)
CREATE TABLE Evento_Premio (
    id_evento BIGINT REFERENCES Evento(id_evento),
    id_premio BIGINT REFERENCES Premio(id_premio),
    PRIMARY KEY (id_evento, id_premio)
);

-- Tabela intermediária Evento_Coordenadores (para armazenar a relação entre Eventos e Coordenadores - Usuarios)
CREATE TABLE Evento_Coordenadores (
    id_evento BIGINT REFERENCES Evento(id_evento),
    id_usuario BIGINT REFERENCES Usuario(id_usuario),
    PRIMARY KEY (id_evento, id_usuario)
);

-- Tabela intermediária Evento_Participantes (para armazenar a relação entre Eventos e Participantes - Usuarios)
CREATE TABLE Evento_Participantes (
    id_evento BIGINT REFERENCES Evento(id_evento),
    id_usuario BIGINT REFERENCES Usuario(id_usuario),
    PRIMARY KEY (id_evento, id_usuario)
);

-- Tabela intermediária Comunidade_Organizadores (para armazenar a relação entre Comunidades e Organizadores - Usuarios)
CREATE TABLE Comunidade_Organizadores (
    id_comunidade BIGINT REFERENCES Comunidade(id_comunidade),
    id_usuario BIGINT REFERENCES Usuario(id_usuario),
    PRIMARY KEY (id_comunidade, id_usuario)
);

-- Tabela intermediária Comunidade_Membros (para armazenar a relação entre Comunidades e Membros - Usuarios)
CREATE TABLE Comunidade_Membros (
    id_comunidade BIGINT REFERENCES Comunidade(id_comunidade),
    id_usuario BIGINT REFERENCES Usuario(id_usuario),
    PRIMARY KEY (id_comunidade, id_usuario)
);
