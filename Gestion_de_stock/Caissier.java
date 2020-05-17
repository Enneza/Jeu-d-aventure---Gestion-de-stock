public class Caissier {

    private String name;
    private String cleId;
  
    public Caissier(String cleId,String name){
        this.cleId=cleId;
        this.name=name;
    }
    
    /*-------Getter-----*/
    public String getCleId() {
		return this.cleId;
    }
    
    public String getName() {
		return this.name;
    }

    /*-------Setter-----*/
    public void setName(String name) {
		this.name=name;
	}

	public void setCleId(String cleId) {
		this.cleId = cleId;
	}

	    
}
