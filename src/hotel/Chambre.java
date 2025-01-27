package hotel;
import hotel.Reservation;

import java.util.ArrayList;

public class Chambre {
    private int numeroChambre;
    private String typeChambre;
    private boolean chambreLibre;
    private Reservation chambre;

    public Chambre(int numeroChambre, String typeChambre) {
        this.numeroChambre = numeroChambre;
        this.typeChambre = typeChambre;
        this.chambreLibre = true;
    }


    public boolean estLibre(ArrayList<Reservation> reservations) {
        ArrayList<String> reservation = new ArrayList<>();
        for (Reservation r : reservations) {
            reservation.add(r.toString());
        }
        for (int i = 0; i < reservation.size(); i++) {
            if (reservation.get(i).equals(numeroChambre)) {
                this.chambreLibre = false;
            }
            else if(!reservation.get(i).equals(numeroChambre)){
                this.chambreLibre = true;
            }
        }
        return this.chambreLibre;
    }

    public String afficherChambre(Chambre chambre) {
        return chambre.toString();
    }
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public Chambre getChambre() {
        return Chambre chambre;
    }

}
