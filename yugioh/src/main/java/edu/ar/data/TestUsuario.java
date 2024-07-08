package edu.ar.data;

public class TestUsuario {
    public static void main(String[] args) {
        UsuarioDAO usuarioDAO=new UsuarioDAO();
        System.out.println(usuarioDAO.seleccionar());
    }
}
