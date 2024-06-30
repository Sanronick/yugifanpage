package edu.ar.model;

import static edu.ar.data.UsuarioDAO.seleccionar;

import edu.ar.data.UsuarioDAO;

public class TestConexion {

    public static void main(String[] args) {
        UsuarioDAO dao=new UsuarioDAO();

        System.out.println(dao.seleccionar());
    }

}
