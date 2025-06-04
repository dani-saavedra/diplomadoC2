create table cuenta
(
    cuenta varchar(200),
    saldo  int(200)
);
create table transferencia
(
    uuid                varchar(200) PRIMARY KEY,
    origen              varchar(200),
    destino             varchar(200),
    monto               int,
    fecha_transferencia TIMESTAMP
);
