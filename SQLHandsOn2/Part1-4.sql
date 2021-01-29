SELECT title, actor.first_name, actor.last_name from sakila.film
JOIN sakila.film_actor USING (film_id)
JOIN sakila.actor USING (actor_id)
WHERE first_name RLIKE '^[aeiouAEIOU]'