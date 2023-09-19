public class ExP1Teste{

	public static void main(String args[]){
	
		Pessoa p1 = new Pessoa("Nathan", "Silva", 1.67, 60.00, 'm', 28, 8, 2000);
		System.out.println(p1);

		Pessoa p2 = new Pessoa("Claudia", "de Oliveira", 1.67, 60.00, 'm', 28, 8, 2000);
		System.out.println(p2);

		Pessoa p3 = new Pessoa("Leandro", "Costa", 1.67, 60.00, 'm', 28, 8, 2000);
		System.out.println(p3);

		Pessoa p4 = new Pessoa("Yuri", "de Oliveira Costa", 1.67, 60.00, 'm', 28, 8, 2000);
		System.out.println(p4);

		p4.setMae(p2);
		p4.setPai(p3);	

		System.out.println("\nTeste Mae: " + p4.getMae().getNome() + " " + p4.getMae().getSobrenome());
		System.out.println("\nTeste Pai: " + p4.getPai().getNome() + " " + p4.getPai().getSobrenome());

		System.out.println("\nInstancias criadas: " + Pessoa.getContador());

	}

}	
