# 종류가 세단 or suv 인 자동차 중
# 2022.11.1 ~ 2022.11.30 까지 대여 가능하며
# 30일간의 대여 금액이 50만원 이상 200만원 미만인
# 자동차 ID, 종류, 대여 금액(FEE)을 출력
# 대여 금액 기준으로 내림차순, 자동차 종류 기준 오름차순, ID 기준 내림차순

SELECT C.CAR_ID, C.CAR_TYPE, ROUND(C.DAILY_FEE * 30 * (100-P.DISCOUNT_RATE)/100 ) AS FEE
FROM CAR_RENTAL_COMPANY_CAR C
         JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P
              ON C.CAR_TYPE = P.CAR_TYPE
WHERE
    C.CAR_ID NOT IN (
        SELECT CAR_ID
        FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE END_DATE > '2022-11-01'
          AND START_DATE < '2022-12-01'
    )
  AND C.CAR_TYPE IN ('세단', 'SUV')
  AND P.DURATION_TYPE = '30일 이상'
HAVING
    FEE BETWEEN 500000 AND 1999999
ORDER BY
    FEE DESC,
    CAR_TYPE ASC,
    CAR_ID DESC




