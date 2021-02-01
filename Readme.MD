Time Service
============

This is a Sprint Boot app that returns the server time.

This listens on port 8080 for incoming HTTP traffic.

API
---

GET /time

This returns the server date, time, and timezone

Response Schema

| Field     | Description                         |
|-----------|-------------------------------------|
| date      | Server date                         |
| time      | Server time                         |
| timezone  | Server timezone                     |
| iso8601   | ISO-8601 string of server date time |

Building
--------

1. Build the JAR:
   `./mvnw package`  on Linux, or
    `mvnw.cmd` on Windows
2. Build the container
   `docker build -t avaloq docker/Dockerfile .`
