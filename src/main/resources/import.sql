INSERT INTO roles VALUES (null, 'ROLE_ADMIN');
INSERT INTO roles VALUES (null, 'ROLE_LIBRARIAN');
INSERT INTO roles VALUES (null, 'ROLE_MEMBER');
INSERT INTO users VALUES (null, b'1',  b'1',  b'1', 'go.admin@library.com', b'1', 'Brhane', 'Test', 'Admin', '$2a$10$ogq095yZjfs9P2hWAufFdO0lQ3sxvQhGLlScDqnP0LPqzCO3MnR0y', 'go.admin@library.com');
INSERT INTO users_roles VALUES (1, 1);
INSERT INTO users_roles VALUES (1, 2);
INSERT INTO users_roles VALUES (1, 3);
INSERT INTO users VALUES (null,  b'1',  b'1',  b'1', 'go.librarian@library.com', b'1', 'Daniel', 'Test', 'Librarian', '$2a$10$ogq095yZjfs9P2hWAufFdO0lQ3sxvQhGLlScDqnP0LPqzCO3MnR0y', 'go.librarian@library.com');
INSERT INTO users_roles VALUES (2, 2);
INSERT INTO users VALUES (null,  b'1',  b'1',  b'1', 'go.member@library.com', b'1', 'Musie', 'Test', 'Member', '$2a$10$ogq095yZjfs9P2hWAufFdO0lQ3sxvQhGLlScDqnP0LPqzCO3MnR0y', 'go.member@library.com');
INSERT INTO users_roles VALUES (3, 3);

INSERT INTO library_member_types VALUES (null, 21, 'basic', 0.25);
INSERT INTO library_member_types VALUES (null, 21, 'staff', 0.10);
INSERT INTO library_member_types VALUES (null, 42, 'senior', 0.05);
INSERT INTO library_member_types VALUES (null, 50, 'flat', 0.15);

INSERT INTO library_members VALUES (null, 'Samuel', 'Tesfay', '10001', '51312345', null, 1);
INSERT INTO library_members VALUES (null, 'Dawit', 'Asgodom', '10002', '51312346', null, 2);
INSERT INTO library_members VALUES (null, 'John', 'Walker', '10003', '51312347', null, 3);

INSERT INTO books VALUES (null, 'George Orwell', 3, '1111', 'A1', 'Retro Hugo', 'Animal Farm', 3);
INSERT INTO books VALUES (null, 'F. Scott Fitzgerald', 5, '2222', 'A2', 'Harper Collins', 'The Great Gatsby', 5);
INSERT INTO books VALUES (null, 'Sidney Sheldon', 2, '3333', 'A3', 'Macmillan', 'The Other Side Of Midnight', 2);
INSERT INTO books VALUES (null, 'Mark Twain', 3, '4444', 'A4', 'Simon and Schuster', 'The Adventures of Huckleberry Finn', 3);
INSERT INTO books VALUES (null, 'Alemseged Tesfay', 100, '1234', 'A5', 'Hidri Publishers', 'Aynfelale', 100);