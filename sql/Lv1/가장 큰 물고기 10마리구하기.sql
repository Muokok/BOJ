select id, length from FISH_INFO
WHERE LENGTH > 10
ORDER BY LENGTH DESC, ID ASC
    LIMIT 10;
