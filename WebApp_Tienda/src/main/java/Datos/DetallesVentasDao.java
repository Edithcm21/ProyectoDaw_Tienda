package Datos;

import Modelo.DetalleVentaBin;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetallesVentasDao {

    public static final String select = "Select * from detalle_ventas order by id_venta";
    public static final String insert="insert into detalle_venta(id_cliente,id_empleado,fecha,hora,colonia,ciudad,calle,avenida,estado,total,estatus_pago) values (?,?,?,?,?,?,?,?,?,?,?)";
    public static final String delete="delete from detalle_venta where id_venta=?";
    public static final String modificarPago="Update detalle_venta set estatus_pago=? where id_venta=?";
    public static final String modificarTotal="update detalle_venta set total=? where id_venta=? ";

    //Seleccionar

    public List<DetalleVentaBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        DetalleVentaBin venta;

        List<DetalleVentaBin> ventas = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int Id_Venta=rs.getInt("id_venta");
                int Id_Cliente=rs.getInt("id_cliente");
                int Id_Empleado=rs.getInt("id_empleado");
                Date Fecha=rs.getDate("fecha");
                Time Hora=rs.getTime("hora");
                String Colonia =rs.getString("colonia");
                String Ciudad=rs.getString("ciudad");
                String Calle=rs.getString("calle");
                String Avenida=rs.getString("avenida");
                String Estado=rs.getString("estado");
                int Total=rs.getInt("total");
                boolean Estatus=rs.getBoolean("estatus_pago");


                venta=new DetalleVentaBin(Id_Venta,Id_Cliente,Id_Empleado,Fecha,Hora,Colonia,Ciudad, Calle,Avenida,Estado,Total,Estatus);
                ventas.add(venta);

            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);
            //for()...

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return ventas;
    }

    //insertar
    public void insertar(DetalleVentaBin detalle) {
        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setInt(1,detalle.getId_cliente());
            st.setInt(2,detalle.getId_empleado());
            st.setDate(3,detalle.getFecha());
            st.setTime(4,detalle.getHora());
            st.setString(5,detalle.getColonia());
            st.setString(6,detalle.getCiudad());
            st.setString(7,detalle.getCalle());
            st.setString(8,detalle.getAvenida());
            st.setString(9,detalle.getEstado());
            st.setInt(10,detalle.getTotal());
            st.setBoolean(11,detalle.getEstatus_pago());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void Modificartotal(DetalleVentaBin detalle)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificarTotal);

            st.setInt(1, detalle.getTotal());
            st.setInt(2,detalle.getId_venta());

            if(st.executeUpdate()==1)
                System.out.println("Registro Actualizado");

            Conexion.close(con);
            Conexion.close(st);



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
        }


    }

    //modificar

    public void Modificarestatus(DetalleVentaBin detalle)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificarPago);

            st.setBoolean(1, detalle.getEstatus_pago());
            st.setInt(2,detalle.getId_venta());

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
    public void borrar( DetalleVentaBin detalle)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,detalle.getId_venta());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
