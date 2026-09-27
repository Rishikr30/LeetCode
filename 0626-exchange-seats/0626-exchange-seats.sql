# Write your MySQL query statement below
SELECT 
    CASE 
        -- If it's the last row and the ID is odd, keep it the same
        WHEN id % 2 != 0 AND id = (SELECT COUNT(*) FROM Seat) THEN id
        -- If the ID is odd, move it up to the next even number
        WHEN id % 2 != 0 THEN id + 1
        -- If the ID is even, move it down to the previous odd number
        ELSE id - 1
    END AS id,
    student
FROM Seat
ORDER BY id;
