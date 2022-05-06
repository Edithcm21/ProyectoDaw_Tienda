package Datos;

import Modelo.TipoEmpleadoBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoEmpleadoDao {


    public static final String select = "Select * from Tipo_empleado order by tipo";
    public static final String insert="insert into Tipo_empleado(Tipo) values (?)";
    public static final String delete="delete from Tipo_empleado where id_tipo=?";
    public static final String modificar="Update Tipo_empleado set tipo=? where id_tipo=?";

    //Seleccionar

    public List<TipoEmpleadoBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        TipoEmpleadoBin tipo;

        List<TipoEmpleadoBin> tipos= new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int Id_Tipo = rs.getInt("Id_Tipo");
                String Tipo = rs.getString("tipo");

                tipo=new TipoEmpleadoBin(Id_Tipo,Tipo);
                tipos.add(tipo);

            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

            for (TipoEmpleadoBin rep : tipos) {

                System.out.println("Id: " + rep.getId_tipo());
                System.out.println("Nombre: " + rep.getTipo());

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return tipos;
    }

    //insertar
    public void insertar(TipoEmpleadoBin tipo) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setString(1, tipo.getTipo());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void modificar(TipoEmpleadoBin tipo)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setString(1,tipo.getTipo());
            st.setInt(2,tipo.getId_tipo());

            if(st.executeUpdate()==1)
                System.out.println("Registro Actualizado");

            Conexion.close(con);
            Conexion.close(st);



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
        }


    }



    //eliminar
    public void borrar(TipoEmpleadoBin tipo)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,tipo.getId_tipo());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
