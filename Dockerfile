
FROM openjdk:17

WORKDIR /app

COPY /app/PrintingRandomNumber.java .


RUN javac PrintingRandomNumber.java

CMD ["java", "PrintingRandomNumber"]