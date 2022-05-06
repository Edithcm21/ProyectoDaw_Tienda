package Datos;

import Modelo.VentaFinalBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VentaFinalDao {
    public static final String select = "Select * from venta_final order by id_venta";
    public static final String insert="insert into venta_final(id_venta,id_producto,cantidad,total) values (?,?,?,?)";


    //Seleccionar

    public List<VentaFinalBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        VentaFinalBin venta;

        List<VentaFinalBin> ventas= new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int id_venta= rs.getInt("id_venta");
                int id_producto=rs.getInt("id_producto");
                int cantidad=rs.getInt("cantidad");
                int total=rs.getInt("total");

                venta=new VentaFinalBin(id_venta,id_producto,cantidad,total);
                ventas.add(venta);

            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

            //for

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return ventas;
    }

    //insertar
    public void insertar(VentaFinalBin venta) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setInt(1, venta.getId_venta());
            st.setInt(2,venta.getId_producto());
            st.setInt(3,venta.getCantidad());
            st.setInt(4,venta.getTotal());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
