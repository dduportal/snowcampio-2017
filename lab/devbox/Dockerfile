# Be careful: not tag-versioned, behavior may change

FROM tsl0922/ttyd:alpine

# Prepare Dev Env
RUN apk add --update --no-cache openjdk8 maven

ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk

VOLUME /workspace
WORKDIR /workspace

# Tune the terminale Windows
COPY index.html /index.html
CMD ["-I","/index.html","bash"]
