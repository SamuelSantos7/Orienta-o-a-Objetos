package familia28;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {
private String nomeCliente;
private String cpf;
private String cor;
private int ano;


public Cliente (String nomeCliente, String cpf, String cor, int ano) {

this.nomeCliente = nomeCliente;
this.cpf = cpf;
this.cor = cor;
this.ano = ano;

}


	// TODO Auto-generated constructor stub


public void imprimirInfo1() {
	
	System.out.println(nomeCliente + "Seu cpf é ... " +cpf+ " possui um(a) cor " +cor+" e nasceu em ...  "+ano );
	
}




public String getNomeCliente() {
	return nomeCliente;
}


public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}


public String getCpf() {
	return cpf;
}


public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String getCor() {
	return cor;
}


public void setCor(String cor) {
	this.cor = cor;
}


public int getAno() {
	return ano;
}


public void setAno(int ano) {
	this.ano = ano;
}


	
	





}
