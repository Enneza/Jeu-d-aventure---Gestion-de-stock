import java.util.*;
import java.util.HashMap;


public class Caisse {

    private ArrayList<Double>   		historiqueDeCaisse;
    private HashMap<String,Article>  	ticketDeCaisse;
    private ArrayList<Integer>  	  	cleIds;
    
   
    public Caisse(){
        this.ticketDeCaisse	=new HashMap<String,Article>();
        this.historiqueDeCaisse =new ArrayList<Double>();
    }
    
   
    protected void solder(Double montant) {
        Double somme = 0.0;
    	for(Double x:historiqueDeCaisse) {
        	somme+=x;
        }
    	if(montant == somme) {
    		this.historiqueDeCaisse=new ArrayList<Double>();
    	}
    	else {
    		System.out.println("The amount did'nt match please checkout ");
    	}
    	
    }
    /**
    * 
    */
    protected boolean connexion(int cleId){
    	for(int x : cleIds) {
    		if(x==cleId)
    			return true;
    	}
    	return false;
    }

    public void passageDarticle(String cleId,Article article){
       ticketDeCaisse.put(cleId,article);
    }
   
   
  
    public double calculerLeTotal() {
        double total=0.0;
       
        System.out.println("Total de :"+total);
        return total;
    }
   
    protected double paiment(double montant){
        double encaisser=calculerLeTotal();
        if( montant>encaisser){
            historiqueDeCaisse.add(encaisser);
           
        }
        return (montant-encaisser);
    }
  

}
