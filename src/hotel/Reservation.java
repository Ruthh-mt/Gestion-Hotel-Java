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

    @Override
    public String toString() {
        return " -Reservation du client " + client + " concernant la chambre " + chambre +
                "de " + debut + " à" + fin;
    }


    public int getNumChambre() {
        return chambre.getNumeroChambre();
    }
    public void changementChambre(Chambre chambre2) {
        this.chambre = chambre2;
    }
    public String getDebut() {
        return debut;
    }
    public String getEmailClient(){
        return this.client.getEmail();
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setChambre(Chambre chambre) {
        this.chambre = chambre;
    }

    public Client getClient() {
        return client;
    }
}
