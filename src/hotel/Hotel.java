package hotel;
import hotel.Reservation;
import hotel.Chambre;
import java.util.ArrayList;

public class Hotel {
    private String nomHotel;
    private String addresseHotel;
    private String villeHotel;
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();
    private ArrayList <Chambre> chambres = new ArrayList<Chambre>();
    public Hotel(String nomHotel,String addresseHotel, String villeHotel) {
        this.nomHotel = nomHotel;
        this.addresseHotel = addresseHotel;
        this.villeHotel = villeHotel;

    }
    public void ajouterChambre(Chambre chambre) {
        this.chambres.add(chambre);
        System.out.println("La chambre "+chambre.getNumeroChambre() +" a bien été crée ");
    }
    public void afficherChambresDisponibles() {
        for (Chambre chambre : chambres) {
            if(chambre.estLibre() == true) {
                System.out.println("La chambre : " + chambre.getNumeroChambre() + " est libre");
            }
        }

    }
    public void reserverChambre(Client client, Chambre chambre, String dateDebut, String dateFin) {
        Reservation reservation = new Reservation(client,chambre,dateDebut,dateFin);
        reservations.add(reservation);
        System.out.println("Votre chambre a bien été reservée");
    }
    public void afficherReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
    public void changerAffectation(Client client, Chambre chambre, Chambre chambre2) {
        for(int i=0;i<reservations.size();i++) {
            for (Reservation reservation : reservations) {
                if (reservation.getChambre() == chambre) {
                    reservations.set(i, reservation);
                }
            }
        }
    }
    public void supressionReservation(Client client, Chambre Chambre) {
        
    }
}
