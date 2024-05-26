CREATE TABLE hm24.test (
	id int GENERATED ALWAYS AS IDENTITY NOT NULL,
	academic_subject varchar NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL,
	CONSTRAINT test_pk PRIMARY KEY (id)
);

CREATE TABLE hm24.test_questions (
	id int GENERATED ALWAYS AS IDENTITY NOT NULL,
	question varchar(1000) NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL,
	correct_answers_count int NULL,
	test_id int NOT NULL,
	CONSTRAINT test_questions_unique UNIQUE (id),
	CONSTRAINT test_questions_test_fk FOREIGN KEY (id) REFERENCES hm24.test(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE hm24.test_answers (
	id int GENERATED ALWAYS AS IDENTITY NOT NULL,
	answer varchar(1000) NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL,
	"right" bool NULL,
	test_question_id int NOT NULL,
	CONSTRAINT test_answers_pk PRIMARY KEY (id),
	CONSTRAINT test_answers_test_questions_fk FOREIGN KEY (id) REFERENCES hm24.test_questions(id) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER TABLE hm24.test_answers RENAME COLUMN "right" TO is_right;

INSERT INTO hm24.test (academic_subject, created_at, id, updated_at) VALUES('Русский язык', '2024-05-26 17:37:23.219', 1, '2024-05-26 17:37:23.219');
INSERT INTO hm24.test (academic_subject, created_at, id, updated_at) VALUES('Математика', '2024-05-26 17:37:23.219', 2, '2024-05-26 17:37:23.219');
INSERT INTO hm24.test (academic_subject, created_at, id, updated_at) VALUES('Физика', '2024-05-26 17:37:23.219', 3, '2024-05-26 17:37:23.219');
