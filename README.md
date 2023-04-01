# Rate Limiter using Spring Cloud Gateway

## Architecture
![Architecture](./design-ratelimiter.png)

## Code Changes

The following config enables rate limiters and routes the traffic to backend instance which is a helloworld service.
This proxy runs on `8080` port and helloworld on `8081` port.

To test, just run the standalone RunBatch 
