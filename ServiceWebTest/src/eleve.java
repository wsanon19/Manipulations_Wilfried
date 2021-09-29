public class eleve {
    private String nom;
    private double [] note;

    public eleve() {
    }

    public eleve(String nom, double[] note) {
        this.nom = nom;
        this.note = note;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double[] getNote() {
        return note;
    }

    public String getNom() {
        return nom;
    }

    public void setNote(double[] note) {
        this.note = note;
    }
}
