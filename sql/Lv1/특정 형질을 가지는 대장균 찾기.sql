SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
WHERE GENOTYPE & 2 = 0
  AND (GENOTYPE & 1 = 1 OR GENOTYPE & 4 = 4)

    # 3번 형질 확인:
    #   1101 (13)
    # & 0100 (4)  <- 3번 형질 위치
    #   ----
    #   0100 (4)  <- 결과가 4이면 3번 형질 보유
