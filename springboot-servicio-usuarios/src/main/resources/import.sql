INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$WbLcNkINV5zmCf0wXLGxe.gmReV9vCL33ZsAk4XDWcJvgbN0VPaYK', 1, 'Andres', 'Guzman', 'aguzman@bolsadeideas.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$WOu1vDeneLcki0lJZSiUAOOkzDfS8PRLlGVj3Mxu8EySlG43fK2Q.', 1, 'John', 'Doe', 'jdoe@bolsadeideas.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);
