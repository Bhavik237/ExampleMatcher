
createPostgres :
	docker run  --name postgres11 -p 5430:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=pass -d postgres:14-alpine

createDatabase :
	docker exec -it postgres11 createdb --username=postgres --owner=postgres course