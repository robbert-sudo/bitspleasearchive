INSERT INTO users (username, password, enabled)
VALUES
('admin', '$2a$12$tf5hunkfa/BRRfVvNrOMbehakCA/3Q78lKGXsyAFRuAPS5ujftJ2y', TRUE),
('user', '$2a$12$iMcP.87KPpB1T.QWU3YACuWynwFRZk4ymWuc3IWxvDHstqeDZYF1S', TRUE);

INSERT INTO authorities (username, authority)
VALUES
('admin', 'ROLE_USER'),
('admin', 'ROLE_ADMIN'),
('user', 'ROLE_USER');

INSERT INTO votes (username, votedby, votes)
VALUES
('')