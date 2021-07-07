package familia28;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando um objeto da classe automovel
		
		Automovel auto1 = new Automovel("Felipe Pereira","Lamborghini","FlP07062001",2021);
		//troca de mensagens (chamada ao método imprimirInfo()
		
		auto1.imprimirInfo();
		System.out.println("*****Transferência de Proprietário*****");
		auto1.setNomeProprietario("Thiago Pedroso");
		auto1.imprimirInfo();
		
		Automovel auto2 = new Automovel("Barbara Amaral", "Ferrari 458","Bab2003",2020);
		auto2.imprimirInfo();
		auto2.setPlaca("BA0A567");
		auto2.imprimirInfo();
		
	}

}
