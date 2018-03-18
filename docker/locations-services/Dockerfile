FROM anapsix/alpine-java

EXPOSE 8080
EXPOSE 8081

# Copy Jar & config.yml

#    from                   to
COPY locations-services.jar .
COPY config.yml .

CMD ["java","-jar","locations-services.jar","server","config.yml"]