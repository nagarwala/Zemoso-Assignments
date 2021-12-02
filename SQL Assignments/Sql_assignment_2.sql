use sakila;

-- Problem 1

SELECT 
    COUNT(DISTINCT title) AS no_of_movies
FROM
    film
        JOIN
    film_category ON film.film_id = film_category.film_id
        JOIN
    category ON film_category.category_id = category.category_id
WHERE
    special_features LIKE '%Deleted Scenes%'
        AND category.name = 'Documentary';
        

-- Problem 2

SELECT 
    COUNT(*) AS no_of_sci_fi_movies
FROM
    category c,
    film_category fc,
    inventory i,
    rental r,
    staff s
WHERE
    c.name = 'Sci-fi'
        AND c.category_id = fc.category_id
        AND fc.film_id = i.film_id
        AND i.inventory_id = r.inventory_id
        AND r.staff_id = s.staff_id
        AND s.first_name = 'Jon'
        AND s.last_name = 'Stephens';
        

-- Problem 3

SELECT 
    SUM(p.amount) AS total_sales
FROM
    payment p,
    rental r,
    inventory i,
    film_category fl,
    category c
WHERE
    c.name = 'Animation'
        AND c.category_id = fl.category_id
        AND fl.film_id = i.film_id
        AND i.inventory_id = r.inventory_id
        AND r.rental_id = p.rental_id;
        
        select * from film_list;
        
        
-- Problem 4

 
  SELECT 
    fl.category, COUNT( fl.category) as no_of_movies_rented
FROM
    film_list fl
WHERE
    fl.FID IN (SELECT 
            i.film_id
        FROM
            customer_list cl,
            rental r,
            inventory i
        WHERE
            cl.name = 'PATRICIA JOHNSON'
                AND cl.ID = r.customer_id
                AND r.inventory_id = i.inventory_id
        GROUP BY i.film_id)
GROUP BY fl.category
ORDER BY COUNT(ALL fl.category) DESC , fl.category ASC
LIMIT 3;



-- Problem 5

SELECT 
    COUNT(f.title) as no_of_movies_rented
FROM
    film f,
    inventory i,
    rental r,
    customer c
WHERE
    f.rating = 'R' AND f.film_id = i.film_id
        AND i.inventory_id = r.inventory_id
        AND r.customer_id = c.customer_id
        AND c.first_name = 'SUSAN'
        AND c.last_name = 'WILSON';






