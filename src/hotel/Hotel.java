package hotel;

import java.util.ArrayList;

public class Hotel {
    private String nomHotel;
    private String addresseHotel;
    private String villeHotel;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    private ArrayList <Chambre> chambres = new ArrayList<>();

    public Hotel(String nomHotel,String addresseHotel, String villeHotel) {
        this.nomHotel = nomHotel;
        this.addresseHotel = addresseHotel;
        this.villeHotel = villeHotel;

    }
    public void ajouterChambre(Chambre chambre) {
        if(!chambres.contains(chambre)) {
            this.chambres.add(chambre);
            System.out.println("La chambre " + chambre.getNumeroChambre() + " a bien été crée ");
        }
    }

    public void afficherChambresDisponibles() {
        System.out.println("Liste des chambres : ");
        for (Chambre chambre : chambres) {
            if(chambre.estLibre()){
                System.out.println("La chambre "+chambre+" est libre");
            }else{
                System.out.println("la chambre "+ chambre +" est occupé");
            }
        }

    }
    public void reserverChambre(Client client, Chambre chambre, String dateDebut, String dateFin) {
        if(chambre.estLibre()) {
            Reservation reservation = new Reservation(client, chambre, dateDebut, dateFin);
            reservations.add(reservation);
            System.out.println("Votre chambre a bien été reservée");
            chambre.reserver();
        }else{
            System.out.println("La chambre est deja reservé");
        }
    }
    public void afficherReservations() {
        System.out.println("Liste des reservation : ");
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
    public void changerAffectation(Client client, Chambre chambre, Chambre nouvelleChambre) {
        if(nouvelleChambre.estLibre()&& chambre.estLibre()) {
            for (Reservation reservation : reservations) {
                if (reservation.getNumChambre() == chambre.getNumeroChambre() && client.getEmail().equals(reservation.getEmailClient())) {
                    reservation.setChambre(nouvelleChambre);
                    nouvelleChambre.reserver();
                    chambre.libre();
                }
            }
        }
    }
    public void supressionReservation(Client client, Chambre chambre) {
        for(int i=0;i<reservations.size();i++) {
            for (Reservation reservation : reservations) {
                if (reservation.getNumChambre() == chambre.getNumeroChambre()) {
                    reservations.remove(reservation);
                    chambre.libre();
                    System.out.println("Votre rservation est supprimé "+ client);
                }
            }
        }

    }
}
