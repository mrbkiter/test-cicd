#!/bin/sh
export JAVA_OPTS=${JAVA_OPTS:-"-Xmx1024m -Xms512m"}
#if [ -a /glowroot/glowroot.jar ]; then
#    echo "Enable glowroot java agent ...."
#    exec java $JAVA_OPTS -javaagent:/glowroot/glowroot.jar -Dlog4j2.formatMsgNoLookups=true -Dglowroot.agent.id=$GLOWROOT_AGENT_ID -Djava.security.egd=file:/dev/./urandom -jar /app.jar
#else
#    exec java $JAVA_OPTS -Dlog4j2.formatMsgNoLookups=true -Djava.security.egd=file:/dev/./urandom -jar /app.jar
#fi
exec java $JAVA_OPTS -Dlog4j2.formatMsgNoLookups=true -jar ./app.jar
