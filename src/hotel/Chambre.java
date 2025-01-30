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
    public void estReserver(){
        this.chambreLibre = false;
    }

    public boolean estLibre() {
        return this.chambreLibre;
    }

    public String afficherChambre(Chambre chambre) {
        return chambre.toString();
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }


}
