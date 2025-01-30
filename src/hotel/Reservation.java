package hotel;

public class Reservation {
private Client client;
private Chambre chambre;
private String debut;
private String fin;
    public Reservation(Client client, Chambre chambre, String dateDebut, String dateFin) {
        this.client = client;
        this.chambre = chambre;
        this.debut = dateDebut;
        this.fin = dateFin;
    }

    public Chambre getChambre() {
            return chambre;
    }

    public String getClient() {
        return client.getNomComplet();
    }
    public int getNumChambre() {
        return chambre.getNumeroChambre();
    }
    public Reservation changementChambre(Chambre chambre2) {
        this.chambre = chambre2;
    }
}
