FROM postgres

RUN apt-get update && apt-get install -y postgresql-contrib

ENV POSTGRES_USER=${INST_DB_USER}
ENV POSTGRES_PASSWORD=${INST_DB_PASSWORD}
ENV POSTGRES_DB=${INST_DB_DATABASE}

ADD init_db.sh /docker-entrypoint-initdb.d/
RUN chmod 755 /docker-entrypoint-initdb.d/init_db.sh