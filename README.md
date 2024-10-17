*TESTES*
(OK) Teste das funções CRUD no terminal com "curl -X DELETE ou POST..."
(OK) Criamos 10 entradas para cada entidade do banco de dados abaixo.

*Script para o postgress (BD: Econnect, usuario: postgres, senha: 123123)*
INSERT INTO Usuario (data_criacao_conta, usuario, nome_real_usuario, password, coordenadas) VALUES
('2023-01-01', 'user1', 'Nome Real 1', 'password1', '40.7128,-74.0060'),
('2023-02-01', 'user2', 'Nome Real 2', 'password2', '34.0522,-118.2437'),
('2023-03-01', 'user3', 'Nome Real 3', 'password3', '51.5074,-0.1278'),
('2023-04-01', 'user4', 'Nome Real 4', 'password4', '48.8566,2.3522'),
('2023-05-01', 'user5', 'Nome Real 5', 'password5', '35.6895,139.6917'),
('2023-06-01', 'user6', 'Nome Real 6', 'password6', '55.7558,37.6173'),
('2023-07-01', 'user7', 'Nome Real 7', 'password7', '52.5200,13.4050'),
('2023-08-01', 'user8', 'Nome Real 8', 'password8', '40.4168,-3.7038'),
('2023-09-01', 'user9', 'Nome Real 9', 'password9', '41.9028,12.4964'),
('2023-10-01', 'user10', 'Nome Real 10', 'password10', '37.7749,-122.4194');

INSERT INTO Premio (tipo_premio, nome_premio, descricao_premio, caminho_imagem, categoria_premio, pontuacao_necessaria, pontuacao_atual, pontuacao_atingida) VALUES
(1, 'Premio 1', 'Descrição do Premio 1', '/imagens/premio1.png', 1, 100, 50, FALSE),
(2, 'Premio 2', 'Descrição do Premio 2', '/imagens/premio2.png', 2, 200, 150, FALSE),
(1, 'Premio 3', 'Descrição do Premio 3', '/imagens/premio3.png', 1, 300, 300, TRUE),
(3, 'Premio 4', 'Descrição do Premio 4', '/imagens/premio4.png', 3, 400, 200, FALSE),
(2, 'Premio 5', 'Descrição do Premio 5', '/imagens/premio5.png', 2, 500, 250, FALSE),
(1, 'Premio 6', 'Descrição do Premio 6', '/imagens/premio6.png', 1, 600, 600, TRUE),
(3, 'Premio 7', 'Descrição do Premio 7', '/imagens/premio7.png', 3, 700, 350, FALSE),
(2, 'Premio 8', 'Descrição do Premio 8', '/imagens/premio8.png', 2, 800, 800, TRUE),
(1, 'Premio 9', 'Descrição do Premio 9', '/imagens/premio9.png', 1, 900, 450, FALSE),
(3, 'Premio 10', 'Descrição do Premio 10', '/imagens/premio10.png', 3, 1000, 500, FALSE);

INSERT INTO Comunidade (nome, limite_membros, qualidade_premiacao) VALUES
('Comunidade 1', 100, 5),
('Comunidade 2', 200, 4),
('Comunidade 3', 300, 3),
('Comunidade 4', 400, 2),
('Comunidade 5', 500, 1),
('Comunidade 6', 600, 5),
('Comunidade 7', 700, 4),
('Comunidade 8', 800, 3),
('Comunidade 9', 900, 2),
('Comunidade 10', 1000, 1);

INSERT INTO Evento (tipo_evento, nome_evento, coordenadas, data_evento, duracao_evento, editavel) VALUES
(1, 'Evento 1', '40.7128,-74.0060', '2024-01-01', 2.5, TRUE),
(2, 'Evento 2', '34.0522,-118.2437', '2024-02-01', 3.0, FALSE),
(1, 'Evento 3', '51.5074,-0.1278', '2024-03-01', 1.5, TRUE),
(3, 'Evento 4', '48.8566,2.3522', '2024-04-01', 2.0, TRUE),
(2, 'Evento 5', '35.6895,139.6917', '2024-05-01', 4.0, FALSE),
(1, 'Evento 6', '55.7558,37.6173', '2024-06-01', 2.5, TRUE),
(3, 'Evento 7', '52.5200,13.4050', '2024-07-01', 3.0, TRUE),
(2, 'Evento 8', '40.4168,-3.7038', '2024-08-01', 1.5, FALSE),
(1, 'Evento 9', '41.9028,12.4964', '2024-09-01', 2.0, TRUE),
(3, 'Evento 10', '37.7749,-122.4194', '2024-10-01', 4.0, FALSE);
