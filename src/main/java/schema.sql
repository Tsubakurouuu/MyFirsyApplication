CREATE TABLE inquiry
(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(500) NOT NULL,
    contents VARCHAR(500) NOT NULL,
    created DATETIME NOT NULL,
    PRIMARY KEY(ID)
);

CREATE TABLE survey
(
   id INT NOT NULL AUTO_INCREMENT,
   age INT NOT NULL,
   satisfaction INT,
   comment VARCHAR(100),
   created DATETIME NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE survey2
(
   id INT NOT NULL AUTO_INCREMENT,
   age INT NOT NULL,
   satisfaction INT,
   comment VARCHAR(100),
   created DATETIME NOT NULL,
   PRIMARY KEY(id)
);