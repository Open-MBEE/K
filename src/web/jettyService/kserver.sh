#!/bin/bash

. /lib/init/vars.sh
. /lib/lsb/init-functions

case "$1" in
  start)
	log_daemon_msg "Starting K Service" "KServlet" || true
	pushd /home/rahulku/jetty
	sudo -u rahulku java -cp "./*:.:jetty-distribution-9.2.12.v20150709/lib/*" KServlet > /var/log/kserver.log 2>&1 &
	;;
  stop)
	log_daemon_msg "Stopping K Service" "KServlet" || true
	ps -ef | awk '/KServlet/ && !/awk/ {print $2}' | xargs -r kill -9
	;;

  *)
	log_action_msg "Usage: /etc/init.d/kserver.sh {start|stop}" || true
	exit 1
esac

exit 0

