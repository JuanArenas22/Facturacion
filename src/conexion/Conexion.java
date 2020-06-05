/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    public String driver = "com.mysql.jdbc.Driver";//nombre del driver
    public String db = "facturacion";// nombre del esquema de base de datos
    public String conectString = "jdbc:mysql://localhost:3306/" + db;//ubicacion de donde esta la base de datos
    public String user = "root";//ususario de la base de datos
    public String password = "juan";//pasword de la base de datos
    public Connection conexionDB;// variable que permite la conexion
    public Statement sentenciaSQL;//permite la ejecucion de sentencias SQL
    public ResultSet resultadoDB;//almacena resultado

    public void conectar() {
        try {
            Class.forName(driver);
            conexionDB = DriverManager.getConnection(conectString, user, password);
            System.out.println("SE CONECTA");
            sentenciaSQL = conexionDB.createStatement();
            System.out.println("SE CREA STATEMENT");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConexionDB() {
        conectar();
        return conexionDB;
    }

    public void setConexionDB(Connection conexionDB) {
        this.conexionDB = conexionDB;
    }
    
    

    public void desconectar() {
        try {
            conexionDB.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean ejecutar(String sentencia) {
        try {
            conectar();
            sentenciaSQL.executeUpdate(sentencia);
            desconectar();
        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public void ejecutarRetorno(String sentencia) {
        try {
            conectar();
            resultadoDB = sentenciaSQL.executeQuery(sentencia);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
