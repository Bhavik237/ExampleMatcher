CREATE TABLE IF NOT EXISTS public.course
(
    id SERIAL PRIMARY KEY,
    name character varying ,
    description character varying ,
    status bigint
)

INSERT INTO public.course(
	name, description, status)
	VALUES ('Course1', 'test course', 2);

	INSERT INTO public.course(
	name, description, status)
	VALUES ('Course2', 'test course 2', 2);

		INSERT INTO public.course(
	name, description, status)
    VALUES ('Course3', 'test course 3', 3);