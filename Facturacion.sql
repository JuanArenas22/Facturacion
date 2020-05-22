create database facturacion;

use facturacion;


create table Proveedor(
codigo_proveedor int auto_increment primary key,
nombre_proveedor varchar(45),
telefono varchar(45),
correo varchar(50) unique);

create table CategoriaPro(
codigo_Cate int auto_increment primary key,
nombre varchar(45));

create table Producto( 
codigo_producto int auto_increment primary key,
nombre_producto varchar(45),
precio double,
unidad varchar(40),
proveedor_id int,
categoria_id int,
constraint referencia1 foreign key(proveedor_id) references Proveedor(codigo_proveedor),
constraint referencia2 foreign key(categoria_id) references CategoriaPro(codigo_Cate));

-- desde aqui segunda parte
create table Cliente(
cedula_cliente int,
nombre_cliente varchar(45),
nombre_usuario varchar(45) unique,
direccion varchar(45),
telefono varchar(11),
correo varchar(45) unique,
contrasena varchar(45),
primary key (cedula_cliente));

create table Vendedor(
cedula_vendedor int,
nombre_vendedor varchar(45),
nombre_usuario varchar(45),
contrasena varchar(45),
primary key(cedula_vendedor));


create table bodega(
id_bodega int auto_increment,
producto_codigo int,
cantidad int,
fecha_ingreso date,
descripcion varchar(100),
primary key(id_bodega),
constraint relacion3 foreign key(producto_codigo) references Producto(codigo_producto));













 