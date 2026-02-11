public class Principal {
	
	public static void main(String[] args){
		
		// Criando um objeto do tipo Pessoa
		// 1 - Declarar o tipo dele "Pessoa"
		// 2 - O nome desse objeto "pessoa"
		// 3 - Instancio com o tipo delcarado "= new Pessoa()"
		// 4 - P1 representa o objeto pessoa 
		
		Pessoa p1  = new Pessoa();
		p1.idade = 30;
		p1.nome = "jake";
		p1.sexo = "M";
		
		Pessoa p2 = new Pessoa();
		p2.idade = 32;
		p2.nome = "wérens";
		p2.sexo = "F";
		
		System.out.println("Essa pessoa é " + p1.nome);
		System.out.println("Essa pessoa é " + p2.nome);
		
		p1.nome = "xeroquinho";
		System.out.println("Essa pessoa é " + p1.nome);
		
		
		Escola beneditoSampaio = new Escola();
		beneditoSampaio.professor = new Professor();
		beneditoSampaio.professor.materia = "portugues";
		beneditoSampaio.professor.nome = "Carlao";
		
    }
}