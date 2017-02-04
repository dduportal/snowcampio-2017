FROM jenkins:2.32.2-alpine


## Jenkins Runtime Configuration
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false -Xms1024m -Xmx1024m -XX:+UseG1GC"

## Plugins Installation part
COPY plugins.txt /tmp/plugins.txt
RUN /usr/local/bin/install-plugins.sh $(cat /tmp/plugins.txt)
RUN echo 2.0 > /usr/share/jenkins/ref/jenkins.install.UpgradeWizard.state

COPY ./ref /usr/share/jenkins/ref
