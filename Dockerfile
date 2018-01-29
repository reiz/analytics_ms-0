FROM        java:8
MAINTAINER  Robert Reiz <reiz@versioneye.com>

ENV M2_HOME /opt/mvn
ENV M2 /opt/mvn/bin
ENV PATH $PATH:/opt/mvn/bin
ENV MAVEN_OPTS -Djava.net.preferIPv4Stack=true

ADD . /app

RUN mkdir -p /opt; \
    wget -O /opt/apache-maven-3.5.2-bin.tar.gz http://ftp-stud.hs-esslingen.de/pub/Mirrors/ftp.apache.org/dist/maven/maven-3/3.5.2/binaries/apache-maven-3.5.2-bin.tar.gz; \
    cd /opt/; tar -xzf apache-maven-3.5.2-bin.tar.gz; \
    ln -f -s /opt/apache-maven-3.5.2 /opt/mvn; \
    mkdir -p /app; \
    cd /app; /opt/mvn/bin/mvn clean package -Dmaven.test.skip=true -Dgpg.skip; \
    apt-get update && apt-get install -y supervisor; \
    mkdir -p /var/log/supervisor; \
    cp /app/supervisord.conf /etc/supervisor/conf.d/supervisord.conf;

WORKDIR /app

EXPOSE 8080

CMD ["/usr/bin/supervisord"]
