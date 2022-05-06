package Datos;


import java.sql.*;

public class Conexion {
    private static final String user="postgres";
    private static final String password="637241522";
    private static final String bd="PROYECTO";
    private static final String server="jdbc:postgresql://localhost:5432/"+bd;
    private static final String driver="org.postgresql.Driver";

    public static Connection getConexion()
    {
        try{
            Class.forName(driver);
            return DriverManager.getConnection(server,user,password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(ResultSet result)
    {
        try{
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void close( Statement state)
    {
        try{
            state.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection con)
    {
        try{
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}