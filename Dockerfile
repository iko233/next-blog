FROM openjdk:17
COPY ./blog-deploy/build/libs/deploy.jar /blog/deploy.jar
WORKDIR /blog
VOLUME /blog
EXPOSE 8080
ENTRYPOINT [ "java -jar /blog/deploy.jar"]