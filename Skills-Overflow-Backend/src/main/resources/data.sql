CREATE TABLE user (
  id_user INT AUTO_INCREMENT  PRIMARY KEY,
  user_name VARCHAR (50) NOT NULL,
  email VARCHAR (50) NOT NULL ,
  password VARCHAR  (50) NOT NULL,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
);

CREATE TABLE role (
  id_role INT AUTO_INCREMENT  PRIMARY KEY,
  role VARCHAR(250) NOT NULL,
);

CREATE TABLE user_role (
    id_user INT FOREIGN KEY,
    id_role INT FOREIGN KEY,
  );

INSERT INTO user (user_name, email, password  ,first_name, last_name) VALUES
  ('gicu', 'gicu@yahoo.com', 'gicu10', 'gicu', 'jianu');

INSERT INTO role ( role) VALUES
    ('admin'),
    ('user'),
    ('master');