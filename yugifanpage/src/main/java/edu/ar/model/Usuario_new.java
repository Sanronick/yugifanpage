package edu.ar.model;

public class Usuario_new extends Personas {

    private int duelosGanados=0;

    public void setDuelosGanados(int duelosGanados){
        this.duelosGanados=duelosGanados;
    }

    public Usuario_new(int duelosGanados){
        this.duelosGanados=duelosGanados;
    }

    
    public Usuario_new(int id, String nombre, String apellido, String email, String nick, String psw, String sexo,
            byte edad) {
        super(id, nombre, apellido, email, nick, psw, sexo, edad);
    }

    public Usuario_new(String nombre, String apellido, String email, String nick, String psw, String sexo, byte edad,
            int duelosGanados) {
        super(nombre, apellido, email, nick, psw, sexo, edad);
        this.duelosGanados = duelosGanados;
    }

    public int getDuelosGanados() {
        return duelosGanados;
    }

    @Override
    public String toString() {
        return "Usuario_new [duelosGanados=" + duelosGanados + ", toString()=" + super.toString() + "]";
    }

    


    
    

}
