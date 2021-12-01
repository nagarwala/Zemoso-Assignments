show databases;
use sakila;
select * from film;
select * from category;
select * from film_list;

select film_id,title
from film
where rating = 'PG-13'
and film_id in (select film_id
from film_category where 
category_id in(select category_id
from category where category.name = 'Comedy'));

SELECT 
    fl.title, COUNT(fl.title), category
FROM
    film_list fl,
    inventory i,
    rental r
WHERE
    fl.category = 'Horror'
        AND fl.FID = i.film_id
        AND i.inventory_id = r.inventory_id
GROUP BY title
ORDER BY COUNT(fl.title) DESC
LIMIT 3;

SELECT 
    *
FROM
    customer_list
WHERE
    country = 'India'
        AND ID IN (SELECT 
            r.customer_id
        FROM
            film_list fl,
            inventory i,
            rental r
        WHERE
            fl.category = 'Sports'
                AND fl.FID = i.film_id
                AND r.inventory_id = i.inventory_id
        GROUP BY r.customer_id);
        

    SELECT 
    *
FROM
    customer_list
WHERE
    country = 'Canada'
        AND ID IN  (  select r.customer_id
        from 
        rental r,
        inventory i,
        film_actor fa,
        actor a
        where
        r.inventory_id = i.inventory_id
        and i.film_id = fa.film_id
        and fa.actor_id = a.actor_id
        and a.first_name = 'NICK'
        and a.last_name = 'WAHLBERG');
        
        
        SELECT 
    a.first_name,
    a.last_name,
    COUNT(DISTINCT fa.film_id) AS no_of_movies
FROM
    film_actor fa,
    actor a
WHERE
    fa.actor_id = a.actor_id
        AND a.first_name = 'SEAN'
        AND a.last_name = 'WILLIAMS'
GROUP BY a.actor_id;
        
        
        
        
       
       
       
