# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table post (
  id                            bigint auto_increment not null,
  header_image                  varchar(255),
  title                         varchar(255),
  subtitle                      varchar(255),
  text                          varchar(255),
  pub_date                      datetime(6),
  constraint pk_post primary key (id)
);


# --- !Downs

drop table if exists post;

