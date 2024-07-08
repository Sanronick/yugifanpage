package edu.ar.data;

import static edu.ar.data.Conexion.close;
import static edu.ar.data.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ar.model.Usuario;

public class UsuarioDAO {

    private static final String SQL_SELECT="SELECT * FROM usuarios";
    private static final String SQL_SELECT_BY_ID="SELECT * FROM usuarios WHERE id=?";
    private static final String SQL_INSERT="INSERT INTO usuarios(nombre,apellido,email,nick,psw,sexo,edad) VALUES(?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE usuarios SET nombre=?,apellido=?,email=?,nick=?,psw=?,sexo=?,edad=? WHERE id=?";
    private static final String SQL_DELETE="DELETE FROM usuarios WHERE id=?";


    public static List<Usuario>seleccionar(){
        
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        Usuario usuario=null;
        List<Usuario>usuarios=new ArrayList<>();

        try {
            conn=getConexion();
            ps=conn.prepareStatement(SQL_SELECT);
            rs=ps.executeQuery();

            while (rs.next()) {
                int id=rs.getInt("id");
                String nombre=rs.getString("nombre");
                String apellido=rs.getString("apellido");
                String email=rs.getString("email");
                String nick=rs.getString("nick");
                String psw=rs.getString("psw");
                String sexo=rs.getString("sexo");
                byte edad=rs.getByte("edad");

                usuario=new Usuario(id, nombre, apellido, email, psw, sexo, edad, nick);

                usuarios.add(usuario);
                
            }
        } catch (SQLException e) {
           e.printStackTrace(System.out);
        }finally{
            try {
                close(rs);
                close(ps);
                close(conn);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return usuarios;

    }


    public static int insertar(Usuario usu){

        Connection conn=null;
        PreparedStatement ps=null;
        int usuario_nuevo=0;

        try {
            conn=getConexion();
            ps=conn.prepareStatement(SQL_INSERT);
            ps.setString(1, usu.getNombre());
            ps.setString(2, usu.getApellido());
            ps.setString(3, usu.getEmail());
            ps.setString(4, usu.getNick());
            ps.setString(5, usu.getPsw());
            ps.setString(6, usu.getSexo());
            ps.setByte(7, usu.getEdad());

            usuario_nuevo=ps.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }finally{
            try {
                close(ps);
                close(conn);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return usuario_nuevo;

    }


}
