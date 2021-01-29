SELECT * FROM sakila.film
INNER JOIN sakila.film_actor
USING (film_id)
WHERE actor_id = 5

