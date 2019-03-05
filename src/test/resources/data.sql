DELETE FROM card;
DELETE FROM user;

INSERT INTO user(cin, first_Name, last_Name, middle_Name, mobile_Number, wallet_Id, country_Code)
VALUES ('CINSG0001', 'JOHN', 'DOE', '', 900001, 4000001, 'SG');
INSERT INTO user(cin, first_Name, last_Name, middle_Name, mobile_Number, wallet_Id, country_Code)
VALUES ('CINSG0002', 'TOM', 'HARRY', '', 900002, 4000002, 'SG');

INSERT INTO card(number, name, cvv, type, user_cin) VALUES(1234123412341234,'DBS Womens Card', 111, 'CREDIT', 'CINSG0001');
INSERT INTO card(number, name, cvv, type, user_cin) VALUES(1111222233334444,'DBS Altitude Card', 222, 'CREDIT', 'CINSG0001');
INSERT INTO card(number, name, cvv, type, user_cin) VALUES(1111111122222222,'POSB Everyday Card', 333, 'CREDIT', 'CINSG0002');
