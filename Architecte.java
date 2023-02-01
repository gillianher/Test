public class Architecte extends Personne{
    private String conseilRegional,telephone,addresse;
    private boolean inscriptionOrdre;


    public Architecte(String nom, String prenom, String conseilRegional, String telephone, String addresse,boolean inscriptionOrdre) {
        super(nom, prenom);
        this.inscriptionOrdre= inscriptionOrdre;
        this.addresse=addresse;
        if (telephoneValidate(telephone)){
            this.telephone=telephone;
        }else {
            this.telephone="";
        }
    }
    private boolean  telephoneValidate(String telephone){
        return true;
    }
    public void Maj_conseilRegional(){}
}
