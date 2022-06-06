package Datos;

import Modelo.ProductosBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductosDao {

    public static final String select = "Select * from productos order by id_producto";
    public static final String insert="insert into productos(nombre,categoria,descripcion) values (?,?,?)";
    public static final String delete="delete from productos where id_producto=?";
    public static final String modificar="Update productos set nombre=?,categoria=?, descripcion=? where id_producto=?";

    //Seleccionar
    public List<ProductosBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        ProductosBin producto;

        List<ProductosBin> productos = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int id_producto=rs.getInt("id_producto");
                String nombre=rs.getString("nombre");
                int categoria=rs.getInt("categoria");
                String descripcion=rs.getString("descripcion");

                producto=new ProductosBin(id_producto,nombre,categoria,descripcion);
                productos.add(producto);



            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);
            //for()...

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return productos;
    }

    //insertar
    public void insertar(ProductosBin producto) {
        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setString(1,producto.getNombre());
            st.setInt(2,producto.getCategoria());
            st.setString(3,producto.getDescripcion());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void Modificartotal(ProductosBin producto)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setString(1,producto.getNombre());
            st.setInt(2,producto.getCategoria());
            st.setString(3,producto.getDescripcion());
            st.setInt(4,producto.getId_producto());
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
    public void borrar( ProductosBin producto )
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,producto.getId_producto());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public ProductosBin listarId(int id)
    {
        ProductosBin prod=null;
        String sql="Select * from productos where id_producto="+id;
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
                String nombre=rs.getString("nombre");
                int categoria=rs.getInt("categoria");
                String Descripcion=rs.getString("descripcion");
                prod=new ProductosBin(id_producto,nombre,categoria,Descripcion);
            }

            Conexion.close(conec);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return prod;
    }

}
