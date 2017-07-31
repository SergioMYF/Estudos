package br.com.estudos.builder;

public class Pizza {
	
	private String massa;
	private String ingredientes1;
	private String ingredientes2;
	
	public Pizza(String massa, String ingredientes1, String ingredientes2){
		
		this.setMassa(massa);
		this.setIngredientes1(ingredientes1);
		this.setIngredientes2(ingredientes2);
		
	}
	
	@Override
	public String toString() {
		
		return massa;
	
	}
	
	public String getMassa() {
			return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getIngredientes1() {
		return ingredientes1;
	}
	public void setIngredientes1(String ingredientes1) {
		this.ingredientes1 = ingredientes1;
	}
	public String getIngredientes2() {
		return ingredientes2;
	}
	public void setIngredientes2(String ingredientes2) {
		this.ingredientes2 = ingredientes2;
	}	

}
