package Datos;

import Modelo.PedidosBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PedidosDao {



    public static final String select = "Select * from pedidos order by id_pedidos";
    public static final String insert="insert into pedidos(id_cliente,foto,fehca_ped) values (?,?,?)";
    public static final String delete="delete from pedidos where id_pedidos=?";
    public static final String modificar="Update pedidos set precio=?,fecha_entrega,comentarios=? where id_pedidos=?";

    //Seleccionar
    public List<PedidosBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        PedidosBin pedido;

        List<PedidosBin> pedidos = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int id_pedidos=rs.getInt("id_pedidos");
                int id_cliente=rs.getInt("id_cliente");
                String foto=rs.getString("foto");
                int precio=rs.getInt("precio");
                Date fecha_pedido=rs.getDate("fecha_ped");
                Date fecha_entrega=rs.getDate("fecha_entrega");
                String comentarios= rs.getString("comentarios");


                pedido=new PedidosBin(id_pedidos,id_cliente,foto,precio,fecha_pedido,fecha_entrega,comentarios);
                pedidos.add(pedido);

            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);
            //for()...

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return pedidos;
    }

    //insertar
    public void insertar(PedidosBin pedido) {
        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setInt(1,pedido.getId_cliente());
            st.setString(2,pedido.getImagen());
            st.setDate(3,pedido.getFecha_pedido());

            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void Modificartotal(PedidosBin pedido)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setInt(1,pedido.getPrecio());
            st.setDate(2,pedido.getFecha_entrega());
            st.setString(3,pedido.getComentarios());
            st.setInt(4,pedido.getId_pedido());
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
    public void borrar( PedidosBin pedido)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,pedido.getId_pedido());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
