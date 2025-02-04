package hotel;


public class Chambre {
    private int numeroChambre;
    private String typeChambre;
    private boolean chambreLibre;

    public Chambre(int numeroChambre, String typeChambre) {
        this.numeroChambre = numeroChambre;
        this.typeChambre = typeChambre;
        this.chambreLibre = true;
    }
    public void reserver(){
        this.chambreLibre = false;
    }

    public boolean estLibre() {
        return this.chambreLibre;
    }

    public String toString() {
        return this.numeroChambre + " de type " + this.typeChambre;
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public void libre(){
        this.chambreLibre = true;
    }


}
