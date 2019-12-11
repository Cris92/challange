# Program developed for T4G challange

Run docker-compose up to run the docker images

The project is composed by 3 docker images, one for the mysql,one for the spring boot rest application and one for the front end application.
All these images will be runned as containers by a docker-compose command.
The 'code' folder containes the code for the 2 applications, the mysql part is just composed from the dockerfile.


# How to Start

- Clone repository in local
-do
```
docker image build -t [rest/mysql/frontend]_challange . 
```
in the main directory of the various applciations.
Just one name for folder

# TODO
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

# Actually
leave the default ports

The compose will run 3 containers, the mysql container, that contains a script that will create the default table, and some example data
(I didn't added a bind mount,but in other situation i would add it),the spring-boot container that will run the API application, and the one that will run the frontend container.
