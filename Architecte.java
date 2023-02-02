public class Architecte extends Personne{
    private String conseilRegional,telephone,addresse;
    private boolean inscriptionOrdre;


    public Architecte(String nom, String prenom, String conseilRegional, String telephone, boolean inscriptionOrdre) {
        super(nom, prenom);
        this.inscriptionOrdre= inscriptionOrdre;
        this.addresse=addresse;
        if (telephoneValide(telephone)){
            this.telephone=telephone;
        }else {
            this.telephone ="";
        }
        Maj_conseilRegional();

    }
    private boolean telephoneValide(String telephone)

    public void Maj_conseilRegional(){}

}
