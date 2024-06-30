package edu.ar.model;

public class Duelista extends Personas {

    private String CartaFavorita;

    public Duelista(String nick, String psw, String cartaFavorita) {
        super(nick, psw);
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
