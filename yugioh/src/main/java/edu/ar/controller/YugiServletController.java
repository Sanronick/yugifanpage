package edu.ar.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.ar.data.UsuarioDAO;
import edu.ar.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/usuarios")
public class YugiServletController extends HttpServlet {

    static Logger logger=LoggerFactory.getLogger(YugiServletController.class);
    List<Usuario>listaUsuarios=new ArrayList<>();
    ObjectMapper mapper=new ObjectMapper();


    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{

        String route=req.getParameter("action");
        logger.info("route : "+route);
        switch (route) {
            case "getAll":
                res.setContentType("application/json; charset=UTF-8");
                listaUsuarios=UsuarioDAO.seleccionar();
                logger.info("Dentro de getAll : " + listaUsuarios.size());
                //transformo en json y lo envio
                mapper.writeValue(res.getWriter(), listaUsuarios);
                logger.info(mapper.toString());
                break;
        
            default:
                break;
        }


    }



    

}
