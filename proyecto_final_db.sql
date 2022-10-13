CREATE DATABASE `proyecto_final` /*!40100 DEFAULT CHARACTER SET latin1 */;

create table chofer
(
    id     int auto_increment
        primary key,
    nombre varchar(256) not null,
    dni    varchar(16)  not null
)
    collate = latin1_spanish_ci;

create table ubicacion
(
    id       int auto_increment
        primary key,
    latitud  decimal(8, 6) not null,
    longitud decimal(9, 6) not null
);

create table camion
(
    id           int auto_increment
        primary key,
    marca_modelo text         not null,
    ubicacion_fk int          null,
    estado       varchar(100) not null,
    constraint camion_FK
        foreign key (ubicacion_fk) references ubicacion (id)
);

create table alerta
(
    id                  int auto_increment
        primary key,
    chofer_fk           int  null,
    camion_fk           int  null,
    ubicacion_alerta_fk int  null,
    tipo_alerta         text null,
    detale              text null,
    constraint alerta_FK
        foreign key (camion_fk) references camion (id),
    constraint alerta_FK_1
        foreign key (chofer_fk) references chofer (id),
    constraint alerta_FK_2
        foreign key (ubicacion_alerta_fk) references ubicacion (id)
);

create table viaje
(
    id        int auto_increment
        primary key,
    camion_fk int  null,
    chofer_fk int  null,
    origen    text null,
    destino   text null,
    detalle   text null,
    constraint viaje_FK
        foreign key (camion_fk) references camion (id),
    constraint viaje_FK_1
        foreign key (chofer_fk) references chofer (id)
);
