package models;

public class Contacts {

    private String prenom;
    private String nom;
    private int age;
    private String sexe;
    private String telephone;

    public Contacts(String prenom, String nom, int age, String sexe, String telephone) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.telephone = telephone;
    }

    public String getprenom() {
        return prenom;
    }

    public String getnom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }

    public String gettelephone() {
        return telephone;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void settelephone(String telephone) {
        this.telephone = telephone;
    }
}
