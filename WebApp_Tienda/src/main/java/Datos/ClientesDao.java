package Datos;

import Modelo.ClientesBin;
import Modelo.ProductosColorTallaBin;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientesDao {


    public static final String select = "Select * from clientes order by id_cliente";
    public static final String insert="insert into clientes(nombre,apellidos,colonia,ciudad,calle,avenida,estado,telefono,usu,pass) values (?,?,?,?,?,?,?,?,?,?)";
    public static final String delete="delete from clientes where id_cliente=?";
    public static final String modificar="Update clientes set nombre=?, apellidos=?, colonia=?,ciudad=?,calle=?,avenida=?,estado=?, telefono=?,usu=?,pass=? where id_cliente=?";
    public static final String validar="select * from clientes where usu=? and pass=?";

    //validar

    public ClientesBin validar(String user, String password){
        PreparedStatement st ;
        ResultSet rs ;
        ClientesBin usuario=null;

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(validar);
            st.setString(1,user);
            st.setString(2,password);
            rs= st.executeQuery();
            while (rs.next())
            {
                int id=rs.getInt("id_cliente");
                String nombre=rs.getString("nombre");
                String apellido=rs.getString("apellidos");
                String u=rs.getString("usu");
                String pass=rs.getString("pass");
                usuario=new ClientesBin(id,nombre,apellido,u,pass);
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

    public List<ClientesBin> Select()
    {
        Statement st ;
        ResultSet rs ;
        ClientesBin cliente;

        List<ClientesBin> clientes= new ArrayList<>();

        try {
            Connection con = Conexion.getConexion();
            assert con != null;
            st = con.createStatement();
            rs = st.executeQuery(select);

            while (rs.next()) {


                int Id_Cliente = rs.getInt("id_cliente");
                String Nombre = rs.getString("nombre");
                String Apellido=rs.getString("apellidos");
                String Colonia =rs.getString("colonia");
                String Ciudad=rs.getString("ciudad");
                String Calle=rs.getString("calle");
                String Avenida=rs.getString("avenida");
                String Estado=rs.getString("estado");
                String Telefono= rs.getString("telefono");
                cliente=new ClientesBin(Id_Cliente,Nombre,Apellido,Colonia,Ciudad,Calle,Avenida,Estado,Telefono);
                clientes.add(cliente);
            }


            Conexion.close(st);
            Conexion.close(rs);
            Conexion.close(con);


        } catch (SQLException e) {
            e.printStackTrace();
        }



        return clientes;
    }

    //insertar
    public int insertar(ClientesBin cliente) {

        Connection con;
        PreparedStatement st;

        try {
            con = Conexion.getConexion();
            assert con != null;
            st = con.prepareStatement(insert);
            st.setString(1,cliente.getNombre());
            st.setString(2,cliente.getApellido());
            st.setString(3,cliente.getColonia());
            st.setString(4,cliente.getCiudad());
            st.setString(5,cliente.getCalle());
            st.setString(6,cliente.getAvenida());
            st.setString(7,cliente.getEstado());
            st.setString(8,cliente.getTelefono());
            st.setString(9,cliente.getUser());
            st.setString(10,cliente.getPassword());

            if (st.executeUpdate()==1) {
                System.out.println("Registro Exitoso");
                return 1;
            }
            Conexion.close(con);
            Conexion.close(st);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //modificar

    public void modificar(ClientesBin cliente)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(modificar);

            st.setString(1,cliente.getNombre());
            st.setString(2,cliente.getApellido());
            st.setString(3,cliente.getColonia());
            st.setString(4,cliente.getCiudad());
            st.setString(5,cliente.getCalle());
            st.setString(6,cliente.getAvenida());
            st.setString(7,cliente.getEstado());
            st.setString(8,cliente.getTelefono());
            st.setString(9,cliente.getUser());
            st.setString(10,cliente.getPassword());
            st.setInt(11,cliente.getId_cliente());

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
    public void borrar(ClientesBin cliente)
    {
        Connection con;
        PreparedStatement st;

        try{
            con=Conexion.getConexion();
            assert con != null;
            st=con.prepareStatement(delete);

            st.setInt(1,cliente.getId_cliente());

            if(st.executeUpdate()==1)
                System.out.println("Registro Eliminado");

            Conexion.close(con);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public ClientesBin listarId(int id)
    {
        ClientesBin cliente=null;
        String sql="Select * from clientes where id_cliente="+id;
        Connection conec;
        PreparedStatement st;
        ResultSet rs;
        try{
            conec=Conexion.getConexion();
            assert conec != null;
            st=conec.prepareStatement(sql);
            rs=st.executeQuery();
            while (rs.next()){
                int Id_Cliente = rs.getInt("id_cliente");
                String Nombre = rs.getString("nombre");
                String Apellido=rs.getString("apellidos");
                String Colonia =rs.getString("colonia");
                String Ciudad=rs.getString("ciudad");
                String Calle=rs.getString("calle");
                String Avenida=rs.getString("avenida");
                String Estado=rs.getString("estado");
                String Telefono= rs.getString("telefono");
                cliente=new ClientesBin(Id_Cliente,Nombre,Apellido,Colonia,Ciudad,Calle,Avenida,Estado,Telefono);
            }

            Conexion.close(conec);
            st.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cliente;
    }





}
