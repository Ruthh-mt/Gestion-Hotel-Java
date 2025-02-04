package hotel;

public class Client {
private String nomComplet;
private String email;

    public String getEmail() {
        return email;
    }

    public Client (String nomComplet, String email) {
     this.nomComplet = nomComplet;
     this.email = email;
 }
 public String toString () {
        return nomComplet;
 }

}
