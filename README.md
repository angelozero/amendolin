# Java e Orientação a Objeto

## Entendo o uso de
- palavras reservadas
- classe
- instância
- objetos
- variáveis
- métodos
- parâmetros
- atributos
- tipos

### Classe Principal

```java
// Palavras reservadas do Java
	// ---> palavras reservadas são aquelas que você não pode usar para criar uma variável/método/classe que tenha o mesmo nome.
	// ---> Ex. de palavras reservadas: public, class, return, void, double, int, String, boolean ...

// public 
	// ---> public é uma palavra reservada no java
	// ---> public aqui é para que a classe Principal seja publica, visível para todo o projeto
 
// class 
	// ----> class (ou classe) é uma palavra reservada no java
	// ---> class representa uma Classe em java

// Principal
	// ---> Principal é o nome da sua classe
	// ---> Sempre começa com a sua primeira letra em maiúsculo

public class Principal { // a classe Principal abre aqui

	// public
		// ---> public é uma palavra reservada no java
		// ---> public aqui é para que o método seja publico, visível para todo o projeto

	// static
		// ---> o método sendo "static" ( estatico ) NÃO é necessário instanciar a classe para utilizar -> ❌ Classe c1 = new Classe();
		// ---> métodos estaticos podem ser chamados diretos atraves do Classe.metodo();
		// ---> Ex. Carro.buzinar(); / Passaro.cantar();
	
	// main
		// ---> main é o nome do método
		// ---> no java o main é método principal que sempre sera executado primeiro para que seu programa funcione

	// String[]
		// ---> String[] é um tipo de parâmetro
		// ---> String[] é do tipo lista de String 
		// ---> String -> tipo para palavras / texto
		// ---> [] -----> representa uma lista
		// ---> String[] -> em um unico tipo posso armazenar mais de uma informação
		// ---> Uma lista de palavras seria String[] == { "a", "b", "c", "d" }

	// args
		// ---> args é o nome do parâmetro
	public static void main(String[] args) {


		// Cachorro 
			// 	---> é a classe que serve como informação para o tipo da variável que esta a sua frente, no caso c1
		// c1
			// ---> é o nome da variável
			// ---> alem de ser uma variavel é tambem a objeto criado devido ao que esta a sua frente " = new Cachorro();"
		// = new Cachorro();
			// ---> estamos criando um objeto quando fazemos new Classe(); 
			// ---> aqui criamos um objeto que é do tipo Cachorro
			// ---> = new Cachorro();
		Cachorro c1 = new Cachorro();
		
		// aqui estamos atribuindo um valor ao atributo nome do objeto Cachorro
		c1.nome = "Jake";
		
		// String tipoDeLatido
			// ---> aqui criamos uma variavel do tipo String chamada tipoDeLatido
			// ---> ela sera responsavel por armazenar a informação que será retornada do método latir() que esta dentro de Cachorro
		String tipoDeLatido = c1.latir();
		
		// System.out.println
			// ---> comando utilizado para imprimir algo no console
			// ---> aqui o valor que sera impresso sera: "O tipo de latido do Jake é au au baixinho"
		System.out.println("O tipo de latido do " + c1.nome + " é " + tipoDeLatido);
		
	} // o método main fecha aqui
	
} // a classe Principal fecha aqui
```
---

### Classe Cachorro

```java
// Palavras reservadas do Java
	// ---> palavras reservadas são aquelas que você não pode usar para criar uma variável/método/classe que tenha o mesmo nome.
	// ---> Ex. de palavras reservadas: public, class, return, void, double, int, String, boolean ...

// public 
	// ---> public é uma palavra reservada no java
	// ---> public aqui é para que a classe Cachorro seja publica, visível para todo o projeto
 
// class 
	// ----> class (ou classe) é uma palavra reservada no java
	// ---> class representa uma Classe em java

// Cachorro
	// ---> Cachorro é o nome da sua classe
	// ---> Sempre começa com a sua primeira letra em maiúsculo

public class Cachorro { // a classe Cachorro abre aqui

	// String
		// ---> Tipo do atributo
		// ---> String é para palavras / textos
	// nomeDoCachorro;
		// ---> nome que criamos para o atributo
	String nomeDoCachorro;

	// public
		// ---> public é uma palavra reservada no java
		// ---> public aqui é para que o método seja publico, visível para todo o projeto

	// String
		// ---> se o método vai ter algum tipo de retorno então precisamos declarar qual sera seu tipo
		// ---> no caso String aqui diz que esse método retorna dados do tipo String (palavras / texto)
	
	// latir
		// ---> latir é o nome do método
	public String latir() { // o método latir esta dentro da classe Cachorro e abre aqui 

		// return
			// ---> return é uma palavra reservada no java
			// ---> palavra utilizada para toda vez que seu método tiver algum tipo de retorno
			// ---> return aqui sempre irá precisar retornar uma valor do tipo String
			// ---> este trecho de código funciona porque latirBaixinho(); é um metodo que também retorna uma String
		return latirBaixinho();

	} // o método latir esta dentro da classe Cachorro e fecha aqui 

	// *** //

	// private
		// ---> private é uma palavra reservada no java
		// ---> private aqui é para que APENAS a classe Cachorro consiga enxergar este método

	// String
		// ---> se o método vai ter algum tipo de retorno então precisamos declarar qual sera seu tipo
		// ---> no caso String aqui diz que esse método retorna dados do tipo String (palavras / texto)
	
	// latirBaixinho
		// ---> latirBaixinho é o nome do método

	private String latirBaixinho() { // o método latirBaixinho esta dentro da classe Cachorro e abre aqui 

		// return
			// ---> return é uma palavra reservada no java
			// ---> palavra utilizada para toda vez que seu método tiver algum tipo de retorno
			// ---> return aqui retorna uma String que esta fixa declarada entre aspas duplas como: "au au baixinho"
		return "au au baixinho";

	} // o método latirBaixinho esta dentro da classe Cachorro e fecha aqui 

} // a classe Cachorro fecha aqui
```

---

### Classe Calculadora
```java
// Palavras reservadas do Java
	// ---> palavras reservadas são aquelas que você não pode usar para criar uma variável/método/classe que tenha o mesmo nome.
	// ---> Ex. de palavras reservadas: public, class, return, void, double, int, String, boolean ...

// public 
	// ---> public é uma palavra reservada no java
	// ---> public aqui é para que a classe Calculadora seja publica, visível para todo o projeto
 
// class 
	// ----> class (ou classe) é uma palavra reservada no java
	// ---> class representa uma Classe em java

// Calculadora
	// ---> Calculadora é o nome da sua classe
	// ---> Sempre começa com a sua primeira letra em maiúsculo

public class Calculadora { // a classe Calculadora abre aqui
	
	// public
		// ---> public é uma palavra reservada no java
		// ---> public aqui é para que o método seja publico, visível para todo o projeto

	// static
		// ---> o método sendo "static" ( estatico ) NÃO é necessário instanciar a classe para utilizar -> ❌ Calculadora c1 = new Calculadora();
		// ---> métodos estaticos podem ser chamados diretos atraves do Classe.metodo();
		// ---> Ex. Calculadora.somar(5 , 10);

	// int
		// ---> se o método vai ter algum tipo de retorno então precisamos declarar qual sera seu tipo
		// ---> no caso int aqui diz que esse método retorna dados do tipo numeros inteiros
	
	// somar
		// ---> somar é o nome do método

	// parâmetros primeiroValor e segundoValor
		// ---> métodos podem receber parâmetros
		// ---> e se o método tem parâmetro, este parâmetro precisa ter um tipo
		// ---> além do tipo todo parâmetro precisar ter um nome
		// ---> métodos podem ter muitos parâmtros e para separar eles você utiliza uma virgula
		// ---> aqui temos 2 parametros: 
			// ---> 1 -	int primeiroValor
			// ---> 2 -	int segundoValor
		// ---> ambos os parâmetros são do tipo int ( numeros )

	public static int somar(int primeiroValor, int segundoValor) { // o método somar esta dentro da classe Calculadora e abre aqui

		// aqui criei uma variavel do tipo int chamada resultado
		// ela sera responsavel por armazenar o valor da soma entre
			// ---> primeiroValor + segundoValor
		int resultado = primeiroValor + segundoValor;
		
		// return
			// ---> return é uma palavra reservada no java
			// ---> palavra utilizada para toda vez que seu método tiver algum tipo de retorno
			// ---> return aqui sempre irá precisar retornar uma valor do tipo int
			// ---> este trecho de código funciona porque resultado é uma variavel do tipo int
		return resultado;

	} // o método somar esta dentro da classe Calculadora e fecha aqui

} // a classe Calculadora fecha aqui
```

--- 

### Classe ExercicioVerena

```java
// Palavras reservadas do Java
	// ---> palavras reservadas são aquelas que você não pode usar para criar uma variável/método/classe que tenha o mesmo nome.
	// ---> Ex. de palavras reservadas: public, class, return, void, double, int, String, boolean ...

// public 
	// ---> public é uma palavra reservada no java
	// ---> public aqui é para que a classe Principal seja publica, visível para todo o projeto
 
// class 
	// ----> class (ou classe) é uma palavra reservada no java
	// ---> class representa uma Classe em java

// ExercicioVerena
	// ---> PrinExercicioVerenacipal é o nome da sua classe
	// ---> Sempre começa com a sua primeira letra em maiúsculo

public class ExercicioVerena { // a classe ExercicioVerena abre aqui
	
	public static void main(String[] args) {
		
		// aqui criei uma variavel do tipo double chamada resultado
		// na sequencia chamo a classe Calculadora sem criar uma instancia dela
			// ---> ❌ Calculadora calc = new Calculadora(); NÃO PRECISA!
		// apos o nome da classe invoco diretamente seu metodo somar passando DOIS parametros numéricos ( precisam ser numeros "int")
			// primeiro parametro é: 5
			// segundo parametro é: 10
		double resultado = Calculadora.somar(5, 10);
		
		// Aqui imprimo no console o resultado que retornou da execução do método .somar();
		// "O resultado do calculo de somar é 15"
	    System.out.println("O resultado do calculo de somar é " + resultado);	
	}

} // a classe ExercicioVerena fecha aqui
```