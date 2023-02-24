# Hi, I'm Mihaela! 👋
And here you can find the documentation of the Weather app


## 🚀 About Me
I'm a back-end software developer, passionate about solving problems using technology


## 🛠 Skills
Java, OOP, Spring Boot, Rest APIs, MySQL


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/MihaelaAntalute/Weather-app.git/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mihaela-antalute/)



# Weather app

The purpose of this application is for a user to be able to see the weather.


## Features

As a user, I can:
- Add favorite city
- Delete city
- Get current weather
- Get forecast weather

## Built with
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

## Demo

Insert gif or link to demo


## API Reference

#### Add city

```http
  POST /city/add
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `body` | `json` | **Required**. The properties of city to be added |

Request body example:
```json
    {
      "name": "Bucuresti"
    }
```  


#### Get current weather

```http
  GET /current/
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `body` | `json` | **Required**. The properties of city |


Request body example:
```json
    {
      "cityName": "Cluj"
    }
```  

#### Get forecast weather

```http
  GET /forecast/
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. The properties of city |

Request body example:
```json
    {
      "cityName": "Roman"
    }
```  


## Prerequisites
For building and running the application you need:
- JDK 1.8 or higher
- Maven 3

For deploying on Heroku you need:
- GIT 
- Heroku CLI
Clone the project

```bash
  git clone https://link-to-project
```

Go to the project directory

```bash
  cd my-project
```

## Dependencies
You don't need any additional dependencies.
All dependecies related to database management, server management, security management and so on, will be automatically injected by Maven using the pom.xml file located in the root folder of the project.

## Installation

Clone the project

```bash
  git clone https://link-to-project
```

Go to the project directory

```bash
  cd my-project
```

    
## Run Locally

Use maven to build the app and, to run it, and to start the local embedded Tomcat server

```bash
  mvn spring-boot:run
```



## Running Tests

To run tests, run the following command

```bash
  npm run test
```


## Environment Variables

You can deploy this project using Heroku or other providers as well, by specifying the following environment variables:

`PROFILE`

`MYSQL_URL`

`MYSQL_USER`

`MYSQL_PASS`



## Deployment
To deploy this project run

```bash
  git push heroku master
```



## Roadmap

In the future, application can be extended with following:

- To authenticate the user
- To add a city list on user




## Badges
![Maintained](https://img.shields.io/badge/Maintained%3F-yes-green.svg)
![GIT](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![Heroku](https://img.shields.io/badge/heroku-%23430098.svg?style=for-the-badge&logo=heroku&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![JWT](https://img.shields.io/badge/json%20web%20tokens-323330?style=for-the-badge&logo=json-web-tokens&logoColor=pink)


