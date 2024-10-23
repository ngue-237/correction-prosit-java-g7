public class TechDreamer {
    private int idTechDreamer;
    private String nomTechDreamer;
    private String prenomTechDreamer;

    public TechDreamer() {

    }

    public TechDreamer(int idT , String nomT , String prenomT ) {
        this.idTechDreamer = idT ;
        this.nomTechDreamer = nomT;
        this.prenomTechDreamer = prenomT;
    }

    public int getIdTechDreamer() {
        return idTechDreamer;
    }

    public void setIdTechDreamer(int idTechDreamer) {
        this.idTechDreamer = idTechDreamer;
    }

    public String getNomTechDreamer() {
        return nomTechDreamer;
    }

    public void setNomTechDreamer(String nomTechDreamer) {
        this.nomTechDreamer = nomTechDreamer;
    }

    public String getPrenomTechDreamer() {
        return prenomTechDreamer;
    }

    public void setPrenomTechDreamer(String prenomTechDreamer) {
        this.prenomTechDreamer = prenomTechDreamer;
    }

    @Override
    public boolean equals(Object o) {
        TechDreamer T = (TechDreamer) o ;
        if (this.idTechDreamer == T.idTechDreamer) {
            return true ;
        }

        return false;
    }

    @Override
    public String toString() {
        return "TechDreamer{" +
                "idTechDreamer=" + idTechDreamer +
                ", nomTechDreamer='" + nomTechDreamer + '\'' +
                ", prenomTechDreamer='" + prenomTechDreamer + '\'' +
                '}';
    }

}
