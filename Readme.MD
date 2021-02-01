Time Service
============

This is a Sprint Boot app that returns the server time.

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
