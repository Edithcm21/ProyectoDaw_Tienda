package Datos;

import Modelo.EnviosBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EnviosDao {



    public static final String select = "Select * from envios order by fecha_envio";
    public static final String insert="insert into envios(id_venta,id_empleado,fecha_envio,fecha_entrega,recibio) values (?,?,?,?,?)";
    public static final String modificar="Update envios set fecha_entrega=?,recibio=? where id_venta=?";

    //Seleccionar

    public List<EnviosBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        EnviosBin envio;

        List<EnviosBin> envios = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int Id_Venta=rs.getInt("id_venta");
                int Id_empleado=rs.getInt("id_empleado");
                Date Fecha_envio=rs.getDate("fecha_envio");
                Date Fecha_entrega=rs.getDate("fecha_entrega");
                String recibio=rs.getString("recibio");

                envio=new EnviosBin(Id_Venta,Id_empleado,Fecha_envio,Fecha_entrega,recibio);
                envios.add(envio);
            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

           //impresion

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return envios;
    }

    //insertar
    public void insertar(EnviosBin envio) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setInt(1,envio.getId_venta());
            st.setInt(2,envio.getId_empleado());
            st.setDate(3,envio.getFecha_envio());
            st.setDate(4,envio.getFecha_entrega());
            st.setString(5,envio.getRecibio());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void modificar(EnviosBin envio)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setInt(1,envio.getId_venta());
            st.setDate(2,envio.getFecha_entrega());
            st.setString(3,envio.getRecibio());


            if(st.executeUpdate()==1)
                System.out.println("Registro Actualizado");

            Conexion.close(con);
            Conexion.close(st);



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
        }


    }





}
