SELECT * FROM sakila.actor WHERE first_name = "Cuba";
SELECT title, film_id FROM sakila.film WHERE film_id > 5 AND film_id < 20;
SELECT first_name, last_name, email FROM customer WHERE last_name = "Rodriguez" OR last_name LIKE "Mc%";
SELECT * from sakila.film WHERE title LIKE "a%";
SELECT title from sakila.film WHERE language_id NOT IN(SELECT language_id from sakila.language WHERE name = "English" OR name = "Japanese");
