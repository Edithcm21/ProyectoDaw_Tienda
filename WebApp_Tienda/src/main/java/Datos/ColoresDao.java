package Datos;

import Modelo.ColoresBin;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ColoresDao {

    public static final String select = "Select * from colores order by id_color";
    public static final String insert="insert into colores(color) values (?)";
    public static final String delete="delete from colores where id_color=?";
    public static final String modificar="Update colores set colores=? where id_color=?";

    //Seleccionar

    public List<ColoresBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        ColoresBin color;

        List<ColoresBin> colores = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int Id_Color = rs.getInt("Id_color");
                String Color = rs.getString("color");

                color = new ColoresBin(Id_Color, Color);
                colores.add(color);

            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

            for (ColoresBin rep : colores) {

                System.out.println("Id: " + rep.getId_color());
                System.out.println("Nombre: " + rep.getNombre_color());

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return colores;
    }

    //insertar
    public void insertar(ColoresBin color) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setString(1, color.getNombre_color());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void modificar(ColoresBin color)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setString(1, color.getNombre_color());
            st.setInt(2,color.getId_color());

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
    public void borrar( ColoresBin color)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,color.getId_color());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public ColoresBin listarId(int id)
    {
        ColoresBin color=new ColoresBin();
        String sql="Select * from colores where id_color="+id;
        Connection conec;
        PreparedStatement st;
        ResultSet rs;
        try{
            conec=Conexion.getConexion();
            assert conec != null;
            st=conec.prepareStatement(sql);
            rs=st.executeQuery();
            while (rs.next()){
                color.setNombre_color(rs.getString(2));
            }
            Conexion.close(conec);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return color;
    }
}
