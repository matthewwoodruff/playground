# This is a comment
FROM ubuntu:14.04
MAINTAINER Kate Smith <ksmith@example.com>
RUN apt-get update && apt-get install -y ruby ruby-dev
RUN gem install sinatra
VOLUME /myVolume

ENV myFilesDir /tmp/myFiles

ADD myFiles $myFilesDir
ADD myFiles2 /tmp/myFiles
