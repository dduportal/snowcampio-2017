# Be careful: not tag-versioned, behavior may change

FROM tsl0922/ttyd:alpine

# Prepare Dev Env
RUN apk add --update --no-cache openjdk8 maven git
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
VOLUME /workspace
WORKDIR /workspace

# Tune the TTYD terminal Windows to avoid loosing last line
RUN curl -L -o /index.html \
        https://raw.githubusercontent.com/tsl0922/ttyd/master/src/index.html \
    && sed -i 's/height:100%;/height:98%;/g' /index.html

CMD ["-I","/index.html","bash"]
