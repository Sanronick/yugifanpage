package edu.ar.model;

public class Usuario extends Personas {

    private String nick;

    public Usuario(String nick) {
        this.nick = nick;
    }

    public Usuario(int id, String nombre, String apellido, String email, String psw, String sexo, byte edad,
            String nick) {
        super(id, nombre, apellido, email, psw, sexo, edad);
        this.nick = nick;
    }

    public Usuario(String nombre, String apellido, String email, String psw, String sexo, byte edad, String nick) {
        super(nombre, apellido, email, psw, sexo, edad);
        this.nick = nick;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Usuario [nick=" + nick + ", toString()=" + super.toString() + "]";
    }

    
    

    


}
