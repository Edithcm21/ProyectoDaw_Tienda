package Datos;

import Modelo.*;

import java.sql.*;
//import java.sql.Date;
import java.util.*;

public class CategoriaDao {
    public static final String select = "Select * from Categoria order by Categoria";
    public static final String insert="insert into Categoria(Categoria) values (?)";
    public static final String delete="delete from Categoria where Id_Categoria=?";
    public static final String modificar="Update Categoria set Categoria=? where Id_Categoria=?";

    //Seleccionar

    public List<CategoriaBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        CategoriaBin Cat;

        List<CategoriaBin> categoria = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int Id_Categoria = rs.getInt("Id_Categoria");
                String Categoria = rs.getString("Categoria");

                Cat = new CategoriaBin (Id_Categoria, Categoria);
                categoria.add(Cat);

            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);



        } catch (SQLException e) {
            e.printStackTrace();
        }



    return categoria;
    }

    //insertar
    public void insertar(CategoriaBin categoria) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setString(1,categoria.getNombre_categoria());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void modificar(CategoriaBin categoria)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setString(1,categoria.getNombre_categoria());
            st.setInt(2,categoria.getId_categoria());

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
    public void borrar(CategoriaBin categoria)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,categoria.getId_categoria());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public CategoriaBin listarId(int id)
    {
        CategoriaBin cat=new CategoriaBin();
        String sql="Select * from categoria where id_categoria="+id;
        Connection conec;
        PreparedStatement st;
        ResultSet rs;
        try{
            conec=Conexion.getConexion();
            assert conec != null;
            st=conec.prepareStatement(sql);
            rs=st.executeQuery();
            while (rs.next()){
                cat.setNombre_categoria(rs.getString(2));
            }
            Conexion.close(conec);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

     return cat;
    }

}
