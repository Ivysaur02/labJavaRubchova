CREATE TABLE doctor (
  id SERIAL NOT NULL,
  name VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE owner (
  id SERIAL NOT NULL,
  adres TEXT,
  name VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE pet_history (
  id SERIAL NOT NULL,
  pet_history_message TEXT,
  PRIMARY KEY (id)
);

CREATE TABLE pet (
  id SERIAL NOT NULL,
  name VARCHAR(50) NOT NULL,
  doctor_id INTEGER,
  pet_history_id INTEGER UNIQUE,
  PRIMARY KEY (id),
  FOREIGN KEY (doctor_id) REFERENCES doctor (id),
  FOREIGN KEY (pet_history_id) REFERENCES pet_history (id)
);

CREATE TABLE pets_owners (
  owner_id INTEGER NOT NULL,
  pet_id INTEGER NOT NULL,
  FOREIGN KEY (owner_id) REFERENCES owner (id),
  FOREIGN KEY (pet_id) REFERENCES pet (id)
);