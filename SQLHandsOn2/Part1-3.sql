SELECT *, COALESCE(language.name, 'NONE')  from sakila.film
LEFT JOIN  sakila.language
USING (language_id)