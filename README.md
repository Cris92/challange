# Program developed for T4G challange

Run docker-compose up to run the docker images

The project is composed by 2 docker file, one for the mysql and one for the spring boot application


# How to Start

- Clone repository in local
- Check if port 8010 is not occupied, otherwise change the docker-compose.yml at line 13 in:


```
xxxx:8080
```
where xxxx is the port where you want the rest api being exposed

- Check if port 9010 is not occupied, otherwise change the docker-compose.yml at line xx in:


```
xxxx:8080
```
where xxxx is the port where you want the rest api being exposed

run

```
docker-compose up
```

The compose will run 3 containers, the mysql container, that contains a script that will create the default table, and some example data
(I didn't added a bind mount,but in other situation i would add it),the spring-boot container that will run the API application, and the one that will run the frontend container.
