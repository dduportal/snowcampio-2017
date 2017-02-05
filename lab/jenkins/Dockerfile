FROM jenkins:2.32.2-alpine

## Plugins Installation part
COPY plugins.txt /tmp/plugins.txt
RUN /usr/local/bin/install-plugins.sh $(cat /tmp/plugins.txt)

# Our own Jenkins configuration
COPY ./ref /usr/share/jenkins/ref
