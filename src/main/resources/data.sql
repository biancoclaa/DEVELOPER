INSERT INTO STUDENTS (id, nome, cognome, data_nascita, codice_fiscale, numero_matricola)
VALUES(1, 'Claudio', 'Bianco', '21 MAGGIO 2001', 'BNCCLD01E21A883W', '38040');
INSERT INTO STUDENTS (id, nome, cognome, data_nascita, codice_fiscale, numero_matricola)
VALUES(1, 'Mario', 'Rossi', '01 GENNAIO 2000', 'RSSMRR00A01A883W', '12345');
INSERT INTO STUDENTS (id, nome, cognome, data_nascita, codice_fiscale, numero_matricola)
VALUES(1, 'Luigi', 'Neri', '22 FEBBRAIO 1999', 'NRRLGG02B22A883W', '67890');


CREATE SEQUENCE STUDENTS_SEQUENCE_ID START WITH (select max(id) + 1 from STUDENTS);