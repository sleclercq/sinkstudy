FROM openjdk:10 as BUILD

ADD . /project
WORKDIR /project
RUN ./gradlew --no-daemon build

#FROM openjdk:10-jre

#COPY --from=BUILD /project/build/libs/sinkstudy-fat.jar /bin/runner/run.jar
#WORKDIR /bin/runner
EXPOSE 8080

#CMD ["java", "-jar", "run.jar"]
CMD ["java", "-jar", "/project/build/libs/sinkstudy-fat.jar"]

