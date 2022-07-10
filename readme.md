docker run --name mariadb2 -e MYSQL_ROOT_PASSWORD=mypass1234 -p 3307:3306  -d mariadb
docker run --name mariadb2 -e MYSQL_ROOT_PASSWORD=mypass1234 -p 3306:3306  -d mariadb