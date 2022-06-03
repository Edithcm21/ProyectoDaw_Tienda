package Datos;

import Modelo.CategoriaBin;
import Modelo.TallasBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TallasDao {


    public static final String select = "Select * from tallas order by talla";
    public static final String insert="insert into tallas(talla) values (?)";
    public static final String delete="delete from tallas where Id_talla=?";
    public static final String modificar="Update tallas set talla=? where id_talla=?";

    //Seleccionar

    public List<TallasBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        TallasBin talla;

        List<TallasBin> tallas = new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {
                int Id_Talla = rs.getInt("Id_Talla");
                String Talla = rs.getString("Talla");

                talla=new TallasBin(Id_Talla,Talla);
                tallas.add(talla);

            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

            for (TallasBin rep : tallas) {

                System.out.println("Id: " + rep.getId_talla());
                System.out.println("Nombre: " + rep.getNombretalla());

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return tallas;
    }

    //insertar
    public void insertar(TallasBin talla) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setString(1, talla.getNombretalla());


            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void modificar(TallasBin talla)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setString(1, talla.getNombretalla());
            st.setInt(2,talla.getId_talla());

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
    public void borrar(TallasBin talla)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,talla.getId_talla());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public TallasBin listarId(int id)
    {
        TallasBin talla=new TallasBin();
        String sql="Select * from tallas where id_talla="+id;
        Connection conec;
        PreparedStatement st;
        ResultSet rs;
        try{
            conec=Conexion.getConexion();
            assert conec != null;
            st=conec.prepareStatement(sql);
            rs=st.executeQuery();
            while (rs.next()){
                talla.setNombretalla(rs.getString(2));
            }
            Conexion.close(conec);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return talla;
    }

}
