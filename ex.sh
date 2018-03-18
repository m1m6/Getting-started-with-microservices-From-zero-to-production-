docker stop dw && docker rm dw && docker rmi dw
./gradlew clean build
./gradlew copyApp
cd docker/locations-services/
docker build -t dw .
docker create --name=dw -p 9092:9092 dw
docker start dw
docker ps
docker logs -f dw
