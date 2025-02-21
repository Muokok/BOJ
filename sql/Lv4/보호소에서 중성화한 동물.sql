SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME                           --, I.SEX_UPON_INTAKE, O.SEX_UPON_OUTCOME
FROM ANIMAL_OUTS O
JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.SEX_UPON_INTAKE LIKE 'Intact%'
AND (O.SEX_UPON_OUTCOME LIKE 'Spayed%' OR O.SEX_UPON_OUTCOME LIKE 'Neutered%')
ORDER BY O.ANIMAL_ID;


SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME                           --, I.SEX_UPON_INTAKE, O.SEX_UPON_OUTCOME
FROM ANIMAL_OUTS O
JOIN ANIMAL_INS I ON O.ANIMAL_ID = I.ANIMAL_ID
WHERE I.SEX_UPON_INTAKE != O.SEX_UPON_OUTCOME
AND (O.SEX_UPON_OUTCOME LIKE 'Spayed%' OR O.SEX_UPON_OUTCOME LIKE 'Neutered%')
ORDER BY O.ANIMAL_ID;

-- 위 두 코드 다 됨