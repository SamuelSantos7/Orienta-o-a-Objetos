package familia28;
/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
 	public class ProdutoEletronico {
	private String modelo;
	private int ano;
	
	public ProdutoEletronico( String modelo,  int ano) {
		
		
		this.modelo = modelo;
		
		this.ano = ano;
	}		
	
	
	public void imprimirInfo1() {
		 
		 
		System.out.println(modelo + " Seu Produto   é .... "+ano);	
		
	}
		
		
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
	
		
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
	

}