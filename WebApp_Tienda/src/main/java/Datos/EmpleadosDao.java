package Datos;

import Modelo.EmpleadosBin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadosDao {



    public static final String select = "Select * from empleados order by id_empleado";
    public static final String insert="insert into empleados(nombre,apellidos,colonia,ciudad,calle,avenida,estado,telefono,fecha_nac,tipo_empleado,sueldo) values (?,?,?,?,?,?,?,?,?,?,?)";
    public static final String delete="delete from empleados where id_empleado=?";
    public static final String modificar="Update empleados set  colonia=?,ciudad=?,calle=?,avenida=?,estado=?, telefono=?, tipo_empleado=?,sueldo=? where id_empleado=?";
    public static final String validar="Select * from empleados where usu=? and pass=?";

    //validar

    public EmpleadosBin validar(String user, String password)  {
        PreparedStatement st ;
        ResultSet rs ;
        EmpleadosBin usuario=null;

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(validar);
            st.setString(1,user);
            st.setString(2,password);
            rs= st.executeQuery();
            while (rs.next())
            {
                int id=rs.getInt("id_empleado");
                String nombre=rs.getString("nombre");
                String apellido=rs.getString("apellidos");
                String u=rs.getString("usu");
                String pass=rs.getString("pass");
                System.out.println(id+nombre+apellido+pass+u);
                usuario=new EmpleadosBin(id,nombre,apellido,u,password);

            }

            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

    //Seleccionar

    public List<EmpleadosBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        EmpleadosBin empleado;

        List<EmpleadosBin> empleados= new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {


                int Id_Empleado = rs.getInt("id_empleado");
                String Nombre = rs.getString("nombre");
                String Apellido=rs.getString("apellidos");
                String Colonia =rs.getString("colonia");
                String Ciudad=rs.getString("ciudad");
                String Calle=rs.getString("calle");
                String Avenida=rs.getString("avenida");
                String Estado=rs.getString("estado");
                String Telefono= rs.getString("telefono");
                Date fecha_nac = rs.getDate("fecha_nac");
                int Tipo=rs.getInt("tipo_empleado");
                int Sueldo=rs.getInt("sueldo");

                empleado=new EmpleadosBin(Id_Empleado,Nombre,Apellido,Colonia,Ciudad,Calle,Avenida,Estado,Telefono,fecha_nac,Tipo,Sueldo);
                empleados.add(empleado);
            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }



        return empleados;
    }

    //insertar
    public void insertar(EmpleadosBin empleado) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);

            st.setString(1,empleado.getNombre());
            st.setString(2,empleado.getApellido());
            st.setString(3,empleado.getColonia());
            st.setString(4,empleado.getCiudad());
            st.setString(5,empleado.getCalle());
            st.setString(6,empleado.getAvenida());
            st.setString(7,empleado.getEstado());
            st.setString(8,empleado.getTelefono());
            st.setDate(9, empleado.getFecha_nac());
            st.setInt(10,empleado.getTipo_empleado());
            st.setInt(11,empleado.getSueldo());

            if (st.executeUpdate()==1)
                System.out.println("Registro Exitoso");

            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //modificar

    public void modificar(EmpleadosBin empleado)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setString(1,empleado.getColonia());
            st.setString(2,empleado.getCiudad());
            st.setString(3,empleado.getCalle());
            st.setString(4,empleado.getAvenida());
            st.setString(5,empleado.getEstado());
            st.setString(6,empleado.getTelefono());
            st.setInt(7,empleado.getTipo_empleado());
            st.setInt(8,empleado.getSueldo());
            st.setInt(9,empleado.getId_empleado());

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
    public void borrar(EmpleadosBin empleado)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,empleado.getId_empleado());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }





}
