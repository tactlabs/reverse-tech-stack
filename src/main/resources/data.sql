DELETE FROM EMPLOYER;
ALTER TABLE EMPLOYER AUTO_INCREMENT = 1;
INSERT INTO EMPLOYER (ID, NAME, LINKEDIN, WEBSITE) VALUES ('1', 'MURALI', 'aravapallimurali@gmail.com', 'bobthebuilder.com');
INSERT INTO EMPLOYER (ID, NAME, LINKEDIN, WEBSITE) VALUES ('2', 'DIVYA', 'divya.maddipudi1@gmail.com', 'divyamaddipudi.com');
INSERT INTO EMPLOYER (ID, NAME, LINKEDIN, WEBSITE) VALUES ('3', 'VINAY', 'srivinay.appari@gmail.com', 'vinaytheiceman.com');

DELETE FROM EMPLOYEE;
ALTER TABLE EMPLOYEE AUTO_INCREMENT = 1;
INSERT INTO EMPLOYEE (ID, EMPLOYER_ID, LINKEDIN, SKILLS) VALUES ('1', '1', 'aravapallimurali.am@gmail.com', 'SoftwareDeveloper, Java');
