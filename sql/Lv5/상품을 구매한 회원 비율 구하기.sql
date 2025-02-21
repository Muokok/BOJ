SELECT YEAR(SALES_DATE) AS YEAR, MONTH(SALES_DATE) AS MONTH, COUNT(DISTINCT OS.USER_ID) AS PURCHASED_USERS,
    ROUND(COUNT(DISTINCT OS.USER_ID) /
    (SELECT COUNT(*) AS PEOPLE_NUM
    FROM USER_INFO
    WHERE JOINED LIKE '2021%'),1) AS PUCHASED_RATIO
FROM USER_INFO UI
    JOIN ONLINE_SALE OS ON UI.USER_ID = OS.USER_ID
WHERE UI.JOINED LIKE '2021%'
GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE)
ORDER BY YEAR, MONTH;





