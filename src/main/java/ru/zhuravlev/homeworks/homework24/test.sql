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
	CONSTRAINT test_questions_test_fk FOREIGN KEY (test_id) REFERENCES hm24.test(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE hm24.test_answers (
	id int GENERATED ALWAYS AS IDENTITY NOT NULL,
	answer varchar(1000) NOT NULL,
	created_at timestamp NOT NULL,
	updated_at timestamp NOT NULL,
	"right" bool NULL,
	test_question_id int NOT NULL,
	CONSTRAINT test_answers_pk PRIMARY KEY (id),
	CONSTRAINT test_answers_test_questions_fk FOREIGN KEY (test_question_id) REFERENCES hm24.test_questions(id) ON DELETE CASCADE ON UPDATE CASCADE
);

ALTER TABLE hm24.test_answers RENAME COLUMN "right" TO is_right;

INSERT INTO hm24.test (academic_subject, created_at, id, updated_at) VALUES('Русский язык', '2024-05-26 17:37:23.219', 1, '2024-05-26 17:37:23.219');
INSERT INTO hm24.test (academic_subject, created_at, id, updated_at) VALUES('Математика', '2024-05-26 17:37:23.219', 2, '2024-05-26 17:37:23.219');
INSERT INTO hm24.test (academic_subject, created_at, id, updated_at) VALUES('Физика', '2024-05-26 17:37:23.219', 3, '2024-05-26 17:37:23.219');

INSERT INTO hm24.test_questions (id, question, created_at, updated_at, correct_answers_count, test_id)
VALUES(1, 'В одном из приведённых ниже слов допущена ошибка в постановке ударения: НЕВЕРНО выделена буква, обозначающая ударный гласный звук.', '2024-05-26 23:35:55.104', '2024-05-26 23:35:55.104', 1, 1);
INSERT INTO hm24.test_questions (id, question, created_at, updated_at, correct_answers_count, test_id)
VALUES(2, 'В одном из выделенных ниже слов допущена ошибка в образовании формы слова.', '2024-05-26 23:35:55.104', '2024-05-26 23:35:55.104', 1, 1);
INSERT INTO hm24.test_questions (id, question, created_at, updated_at, correct_answers_count, test_id)
VALUES(3, 'Укажите варианты ответов, в которых во всех словах одного ряда пропущена безударная непроверяемая гласная корня.', '2024-05-26 23:35:55.104', '2024-05-26 23:35:55.104', 2, 1);

INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(1, 'озлОбить', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 1);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(2, 'начатА', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 1);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(3, 'послалА', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', true, 1);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(4, 'сирОты', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 1);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(5, 'откУпорил', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 1);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(6, 'ИДЯ по бульвару', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 2);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(7, 'ПРИВЕДШИЙ к успеху', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 2);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(8, 'несколько ДЖИНСОВ', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 2);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(9, 'бежит намного БЫСТРЕЕ', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 2);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(10, 'на ДВУХСОТ третьем километре', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', true, 2);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(11, 'к..рдинальный, л..минировать, об..няние', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', true, 3);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(12, 'п..риодический, г..ризонт, ветер..нар', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', true, 3);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(13, 'п..рила, сер..ал, пок..рать', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 3);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(14, 'ф..рмализм, сокр..щение, возр..жать', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 3);
INSERT INTO hm24.test_answers (id, answer, created_at, updated_at, "right", test_question_id) VALUES(15, 'эм..лированный, укр..щать, ижд..венец', '2024-05-26 23:39:17.305', '2024-05-26 23:39:17.305', false, 3);