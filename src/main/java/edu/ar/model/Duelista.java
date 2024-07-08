package edu.ar.model;

public class Duelista extends Personas {

    private String CartaFavorita;


    

    public Duelista(int id, String nombre, String apellido, String email, String psw, String sexo, byte edad,
            String cartaFavorita) {
        super(id, nombre, apellido, email, psw, sexo, edad);
        CartaFavorita = cartaFavorita;
    }

    public Duelista(String nombre, String apellido, String email, String psw, String sexo, byte edad,
            String cartaFavorita) {
        super(nombre, apellido, email, psw, sexo, edad);
        CartaFavorita = cartaFavorita;
    }

    public String getCartaFavorita() {
        return CartaFavorita;
    }

    public void setCartaFavorita(String cartaFavorita) {
        CartaFavorita = cartaFavorita;
    }

    @Override
    public String toString() {
        return "Duelista [CartaFavorita=" + CartaFavorita + ", toString()=" + super.toString() + "]";
    }

    

}
