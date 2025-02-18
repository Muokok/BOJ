# 각 상품코드 별 매출액 (판매가 * 판매량)의 합계
# 매출액 기준 내림차순, 상품코드 오름차순

SELECT P.PRODUCT_CODE, SUM(P.PRICE * OS.SALES_AMOUNT) AS SALES
FROM PRODUCT P
         JOIN OFFLINE_SALE OS
              ON P.PRODUCT_ID = OS.PRODUCT_ID
GROUP BY PRODUCT_CODE
ORDER BY SALES DESC, PRODUCT_CODE ASC;