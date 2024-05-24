INSERT INTO TYPE (id, type_property) VALUES
(1, 'Casa'),
(2, 'Apartamento'),
(3, 'Oficina'),
(4, 'Comercial');


INSERT INTO FRACTIONS (status, price_fraction, total_fractions, sold_fractions) VALUES
(true, 500.0, 134, 11),
(true, 200.0, 144, 54),
(true, 800, 135, 84),
(true, 900, 137, 73),
(true, 250, 122, 29),
(true, 100, 127, 92),
(true, 600, 101, 35),
(true, 450, 130, 34),
(true, 899, 103, 88),
(true, 999, 141, 52),
(true, 100, 142, 23);


INSERT INTO PROPERTY (id, index, guid, price_list, img, profitability, city, phone, address, fractions_id, type_id) VALUES
('663a7265d66f1b62cf2247c9', 0, '1c47db49-3684-45bf-bb72-0fca8db57ae7', '[$3918.74, $3281.65, $240.72, $3700.30, $3213.69]', 'http://placehold.it/440x310', 11, 'Medellin', '+1 (890) 518-2242', '312 Greenpoint Avenue, Templeton, Louisiana, 7753', 1, 2),
('663a7265c266433716f86205', 1, '49739b4c-ca80-4895-911d-7caeee2fbc6c', '[$808.05, $2551.72, $1010.63, $2649.90, $2157.08, $625.09, $3765.95, $2451.78, $3562.61]', 'http://placehold.it/440x310', 17, 'Medellin', '+1 (979) 463-4000', '592 Otsego Street, Richmond, Delaware, 6149', 2, 3),
('663a7265bbe009a72a8ddc94', 2, 'cccef3b6-e8cc-49ba-a3fa-ba49815a35a0', '[$1252.24, $2947.58, $1967.83, $2362.78, $580.30]', 'http://placehold.it/440x310', 10, 'Medellin', '+1 (942) 527-3272', '521 Richardson Street, Conway, Connecticut, 6768', 3, 3),
('663a726583ded1cc0cf81d0f', 3, '2eee4bc3-8dcc-42ff-b44f-64479d967d48', '[$2918.44, $466.86, $1350.74, $1308.06, $3003.28, $2541.33]', 'http://placehold.it/440x310', 15, 'Bogotá', '+1 (813) 585-3794', '871 Stockholm Street, Leeper, New Jersey, 3967', 4, 1),
('663a7265fddf6061ff000b95', 4, '07ab5963-bb4e-48c9-b80e-f855ab8652a6', '[$3252.95, $1271.38, $821.75, $1548.28, $3395.24, $3814.29, $3797.63, $1512.60, $2354.66, $2044.59]', 'http://placehold.it/440x310', 13, 'Cali', '+1 (877) 556-3819', '940 Harbor Lane, Odessa, Indiana, 442', 5, 2),
('663a726540e04db575938b4e', 5, '8005a107-aaa2-47f3-8923-730fe4e7db70', '[$3899.34, $2512.75, $2551.49, $2388.08, $3378.44]', 'http://placehold.it/440x310', 17, 'Bogotá', '+1 (860) 569-3058', '815 Russell Street, Darlington, Ohio, 386', 6, 3),
('663a72656a94b01f9e4f44a9', 6, 'b404f671-53d8-4ac8-b766-7725f9381f5b', '[$404.81, $1879.88, $2773.85, $3086.10, $1529.76]', 'http://placehold.it/440x310', 14, 'Bogotá', '+1 (998) 480-3872', '370 Monroe Street, Sehili, Kentucky, 7115', 7, 3),
('663a726501babd0324694876', 7, 'ade1f18a-5914-45d8-a3c1-efe8fb0ff52d', '[$1205.42, $1396.02, $3557.54, $2094.43, $1637.62, $384.07, $1668.90, $1928.42, $499.96]', 'http://placehold.it/440x310', 14, 'Medellin', '+1 (801) 568-3965', '976 Kane Street, Alfarata, Washington, 9527', 8, 1),
('663a7265574395020239fe3e', 8, '12013873-e854-455c-9bb6-4d5a0e823cb3', '[$1287.77, $1171.93, $793.70, $2333.58, $3161.87, $2304.70, $3261.29, $673.35, $665.94, $2880.38]', 'http://placehold.it/440x310', 17, 'Bogotá', '+1 (846) 403-3469', '202 Wyckoff Street, Gadsden, Palau, 7994', 9, 2),
('663a72655649cb0e139ea3de', 9, '29bb98e7-e97d-42ac-af10-717376ea86e7', '[$3114.44, $1690.59, $314.38, $2705.80, $1591.47, $677.35]', 'http://placehold.it/440x310', 15, 'Bogotá', '+1 (801) 431-2041', '368 Menahan Street, Marne, Oklahoma, 7506', 10, 1),
('663a726529c061977f09fc98', 10, '84ce5006-47bb-4278-ba1a-34566f789dba', '[$291.33, $2213.60, $3186.49, $3641.37, $546.77, $2566.43, $2519.17]', 'http://placehold.it/440x310', 20, 'Bogotá', '+1 (991) 475-3114', '252 Locust Street, Whitmer, Michigan, 4403', 11, 1);

