package Exnivel4;


public class Ex60 extends Ex60Animal {
	
	public Ex60(String nome, String especie, int idade) {
		super(nome, especie);
	} 
	
	public static void main(String[] args) {
		Ex60Animal animal = new Ex60Animal(null, null);
		Ex60Cachorro cachorro = new Ex60Cachorro("Jolie", "Shih Tzu");
		
		cachorro.comer();
		cachorro.beber();
		cachorro.fazerSom();
		
	}
}
