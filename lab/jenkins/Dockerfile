FROM jenkins:2.32.2-alpine

## Plugins Installation part
COPY plugins.txt /tmp/plugins.txt
RUN /usr/local/bin/install-plugins.sh $(cat /tmp/plugins.txt)

# Disable wizard using FS instead of JAVA_OPTS
RUN echo 2.0 > /usr/share/jenkins/ref/jenkins.install.UpgradeWizard.state

ENV JAVA_OPTS "-Djenkins.install.runSetupWizard=false -Xms1024m -Xmx1024m -XX:+UseG1GC"
# Our own Jenkins configuration
COPY ./ref /usr/share/jenkins/ref
RUN curl -L -o /usr/share/jenkins/ref/insecure_vagrant_key \
    https://raw.githubusercontent.com/mitchellh/vagrant/master/keys/vagrant
