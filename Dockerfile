FROM java:8
COPY ./src/distributedsystems/DistributedSystems.java /
RUN javac @sources.txt
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["DistributedSystems"]