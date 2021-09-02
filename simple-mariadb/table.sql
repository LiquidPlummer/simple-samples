CREATE TABLE test_table 
(
	string_id INT NOT NULL,
	string VARCHAR(200),	
	CONSTRAINT table_pk PRIMARY KEY (string_id)
);


INSERT INTO test_table VALUES (1, "This is string #1!");
INSERT INTO test_table VALUES (2, "This is string #2!");

select * from test_table;
