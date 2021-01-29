SELECT first_name, last_name, customer_id, rental_id FROM sakila.customer
INNER JOIN sakila.rental
USING(customer_id)