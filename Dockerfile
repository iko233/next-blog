FROM openjdk:17
COPY ./blog-deploy/build/libs/deploy.jar /blog/deploy.jar
WORKDIR /blog
EXPOSE 8080
ENTRYPOINT java -jar deploy.jar