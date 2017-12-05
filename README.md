# java-HSQL

Conexion de base de datos HSQL con aplicacion java.
Descargar HyperSQL, descomprimir carpeta hsqldb en C:
Tener variables de entorno de jdk y jre 8 o superior
Abrir consola powershell modo administrador
cd "C:\hsqldb\"
java -cp hsqldb.jar org.hsqldb.util.DatabaseManagerSwing
en URL poner jdbc:hsqldb:file:C:\hsqldb\
y crear una tabla USUARIO:
CREATE TABLE USU2 (ID INT, NOMBRE VARCHAR(10), APELLIDO VARCHAR(10), PRIMARY KEY(ID));
