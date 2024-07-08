package edu.ar.model;

public class Personas {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String psw;
    private String sexo;
    private byte edad;

    public Personas(){};


    public Personas(int id, String nombre, String apellido, String email, String psw, String sexo,
            byte edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.psw = psw;
        this.sexo = sexo;
        this.edad = edad;
    }


    public Personas(String nombre, String apellido, String email,  String psw, String sexo, byte edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.psw = psw;
        this.sexo = sexo;
        this.edad = edad;
    }



    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPsw() {
        return psw;
    }


    public void setPsw(String psw) {
        this.psw = psw;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public byte getEdad() {
        return edad;
    }


    public void setEdad(byte edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Personas [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", psw="
                + psw + ", sexo=" + sexo + ", edad=" + edad + "]";
    }


    


    

    

    

    
}
