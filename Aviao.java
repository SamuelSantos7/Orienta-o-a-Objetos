package familia28;
/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
public class Aviao {

	private String modelo;
	private String pais;
	private int ano;
	
	public Aviao(String modelo,String pais, int ano) {
	
	this.modelo = modelo;
	this.pais = pais;
	this.ano = ano;
	
	}
	
	// TODO Auto-generated method stub

	public void imprimirIf11() {
		System.out.println(modelo + " Seu pa�s de fabrica��o � ... " +pais+ " Fabricado no ano ... " +ano );
	
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}



	
	
		
	
	
}
