# Getting Started

## Get OAuth2 Token
```js
curl --location 'localhost:8080/oauth2/token' \
--header 'Authorization: Basic bWNwLWNsaWVudDpzZWNyZXQ=' \
--header 'Cookie: JSESSIONID=1324796AB39C0B674F68C5D29B5BE7B8' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'grant_type=client_credentials'
```

Copy the bearer token and pass it along in subsequent API calls.

## Call Chat API
```js
curl --location 'localhost:8080/api/chat' \
--header 'Authorization: Bearer XXXX' \
--header 'Content-Type: text/plain' \
--data 'retrieve flight bookings'
```