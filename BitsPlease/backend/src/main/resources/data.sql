INSERT INTO users (username, password, enabled)
VALUES
('admin', '$2y$12$crtG1GeZnVdcvTm270vAkuxfVZMdKALKOa175lWRvfw2aKWeRERW6', TRUE), --password
('user', '$2a$12$iMcP.87KPpB1T.QWU3YACuWynwFRZk4ymWuc3IWxvDHstqeDZYF1S', TRUE);

INSERT INTO authorities (username, authority)
VALUES
('admin', 'ROLE_USER'),
('admin', 'ROLE_ADMIN'),
('user', 'ROLE_USER');
