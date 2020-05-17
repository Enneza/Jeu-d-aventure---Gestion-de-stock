public class Article {

    protected String  nom;
    protected int     codeBarre;
    protected int     quantiteEnStock;
    protected int     prixDevente;

 
    public Article(String nom, int codeBarre, int quantiteEnStock, int prixDevente) {
        this.nom = nom;
        this.codeBarre = codeBarre;
        this.quantiteEnStock = quantiteEnStock;
        this.prixDevente = prixDevente;
       
    }

    
    /*---------------------GETTER-----------------*/
    public String   getNom(){
        return this.nom;
    }
    public int      getCodeBarre(){
        return this.codeBarre;
    }
    public int      getQuantiteEnStock(){
        return this.quantiteEnStock;
    }
 
    public int      getPrixDeVente(){
        return this.prixDevente;
    }
    
    /*---------------------SETTER-----------------*/
    
    public void     setNom(String nom){
        this.nom = nom;
    }
    public void     setCodeBarre(int codeBarre){
        this.codeBarre = codeBarre;
    }
    public void     setQuantiteEnStock(int quantiteEnStock){
        this.quantiteEnStock = quantiteEnStock;
    }
 
    public void     setPrixDeVente(int prixDevente){
        this.prixDevente = prixDevente;
    }
  

    public String   informationArticle(){
        return  "Nom: "+                    this.nom+"\n"+
	    "Code Barre: "+             this.codeBarre+"\n"+
	    "Quantite En Stock: "+      this.quantiteEnStock+"\n"+
	    "Prix De Vente: "+          this.prixDevente+"€\n"+
	    
    }
    
}
