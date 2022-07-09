FROM openjdk:17
COPY ./blog-deploy/build/libs/deploy.jar /blog
WORKDIR /blog
VOLUME /blog
EXPOSE 8080
ENTRYPOINT [ "sh","java -jar ./blog/deploy.jar "]