Технологии разработки программного обеспечения

Лабораторная работа №1: создание микросервиса на Spring Boot с базой данных

Шарафутдинова Анастасия Сергеевна МБД2131

Целью лабораторной работы является знакомство с проектированием многослойной архитектуры Web-API (веб-приложений, микро-сервисов)

Инструкции по сборке и запуску приложения:
1. Склонируйте данный репозиторий себе в проект
2. При помощи Docker создайте подключение к БД PostgreSQL:
  `docker run -e POSTGRES_PASSWORD=root -p 5432:5432 postgres`
3. Выполинте скрипты `schema.sql` и `data.sql` (src/main/resources) для создания таблицы БД и наполнения её данными.
4. С помощью сборщика проектов Maven в командной строке соберите образ для Docker. В папке target будет создан jar архив:
  `mvn package`
5. Выполните команду для сборки Docker-образа из командной строки:
  `docker build . -t simpleapi:latest `
6. Команда для запуска Docker-контейнера из Docker-образа с указанием маппинга портов:
  `docker run -p 8080:8080 simpleapi:latest`

При запущенном приложении можно выполнить curl-команды:
1. Получение одного продукта из таблицы по id:
  `curl http://localhost:8080/api/v1/game/{id}`
2. Получение списка всех продуктов в таблице:
  `curl http://localhost:8080/api/v1/games`
3. Добавление продукта в таблицу:
  `curl -X POST http://localhost:8080/api/v1/games -H 'Content-Type:application/json' -d '{"name": "name", "publisher": "publisher", "release": "release", "mode": "mode" }'`
4. Удаление продукта из таблицы по id:
  `curl -X DELETE http://localhost:8080/api/v1/games/{id}`
5. Обращение к ендпоинту, возвращающему hostname:
  `curl http://localhost:8080/api/v1/status`

##

Лабораторная работа №3: CI/CD и деплой приложения в Heroku

Шарафутдинова Анастасия Сергеевна МБД2131

Целью лабораторной работы является знакомство с CI/CD и его реализацией на примере Travis CI и Heroku

Примеры эндпоинтов развернутого приложения на платформе Heroku
https://simpleapi99.herokuapp.com/api/v1/status
https://simpleapi99.herokuapp.com/api/v1/games

[![Build Status](https://app.travis-ci.com/AnastasiaSharafutdinova99/LR1.svg?branch=master)](https://app.travis-ci.com/AnastasiaSharafutdinova99/LR1)
