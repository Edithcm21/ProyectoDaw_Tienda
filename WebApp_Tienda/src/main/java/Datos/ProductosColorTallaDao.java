package Datos;


import Modelo.ProductosColorTallaBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductosColorTallaDao {



    public static final String select = "Select * from productos_tallacolor order by id_producto";
    public static final String insert="insert into productos_tallacolor(id_producto,color,foto,talla,cantidad,precio) values (?,?,?,?,?,?)";
    public static final String delete="delete from productos_tallacolor where id_alternocolor=?";
    public static final String modificar="Update productos_tallacolor set id_producto=?,color=?,talla=?, cantidad=?,precio=?, foto=? where id_alternocolor=?";


    //Seleccionar

    public List<ProductosColorTallaBin>Join1(String joinprincipal)
    {
        Statement st ;
        ResultSet rs ;
        ProductosColorTallaBin producto;


        List<ProductosColorTallaBin> productos = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(joinprincipal);

            while (rs.next()) {
                int id_alterno=rs.getInt(1);
                String nombre=rs.getString(2);
                int id_producto=rs.getInt(3);
                int categoria=rs.getInt(4);
                String descripcion=rs.getString(5);
                String foto=rs.getString(6);
                int precio=rs.getInt(7);


                producto=new ProductosColorTallaBin(id_producto,nombre,descripcion,id_alterno,foto,precio,categoria);
                productos.add(producto);


            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    //Seleccionar

    public List<ProductosColorTallaBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        ProductosColorTallaBin producto;


        List<ProductosColorTallaBin> productos = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int id_producto=rs.getInt("id_producto");
                int id_alterno=rs.getInt("id_alternocolor");
                int color=rs.getInt("color");
                String foto=rs.getString("foto");
                int talla=rs.getInt("talla");
                int cantidad=rs.getInt("cantidad");
                int precio=rs.getInt("precio");

                producto=new ProductosColorTallaBin(id_producto,id_alterno,color,talla,cantidad,foto,precio);
                productos.add(producto);


            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }

    //insertar
    public void insertar(ProductosColorTallaBin producto) {
        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setInt(1,producto.getId_producto());
            st.setInt(2,producto.getColor());
            st.setString(3, producto.getFoto());
            st.setInt(4,producto.getTalla());
            st.setInt(5,producto.getCantidad());
            st.setInt(6,producto.getPrecio());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void Modificartotal(ProductosColorTallaBin producto)
    {
        Connection con;
        PreparedStatement st;
        System.out.println("Entro al actualizar");

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);
            st.setInt(1,producto.getId_producto());
            st.setInt(2,producto.getColor());
            st.setInt(3,producto.getTalla());
            st.setInt(4,producto.getCantidad());
            st.setInt(5,producto.getPrecio());
            st.setString(6,producto.getFoto());
            st.setInt(7,producto.getId_alterno());
            System.out.println("Entro al try");
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
    public void borrar( ProductosColorTallaBin producto)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);
            st.setInt(1,producto.getId_alterno());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public ProductosColorTallaBin listarId(int id)
    {
        ProductosColorTallaBin prod=null;
        String sql="Select * from Productos_tallacolor where id_alternocolor="+id;
        Connection conec;
        PreparedStatement st;
        ResultSet rs;
        try{
            conec=Conexion.getConexion();
            assert conec != null;
            st=conec.prepareStatement(sql);
            rs=st.executeQuery();
            while (rs.next()){
                int id_producto=rs.getInt("id_producto");
                int id_alterno=rs.getInt("id_alternocolor");
                int color=rs.getInt("color");
                String foto=rs.getString("foto");
                int talla=rs.getInt("talla");
                int cantidad=rs.getInt("cantidad");
                int precio=rs.getInt("precio");
                prod=new ProductosColorTallaBin(id_producto,id,color,talla,cantidad,foto,precio);
            }

            Conexion.close(conec);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return prod;
    }


}
