FROM ubuntu:latest

RUN apt-get update \
    && apt-get -y install groovy

COPY bin/ ./

RUN chmod +x main.groovy

CMD "./main.groovy"

# aspnetcore-runtime-3.1 \
# https://github.com/tylerwalts/d2plug-masterless-puppet.git
