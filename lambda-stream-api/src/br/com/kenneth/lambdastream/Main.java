package br.com.kenneth.lambdastream;

import java.util.Map;
import java.util.Optional;

public class Main {	
		
		private static final Map<String, Integer> PESSOA = Map.of("pedro", 15, "maria", 20, "paulo", 25, "jorge", 10);
		
		public static void main(String[] args) {
			
			Optional<Integer> opt = get("marcelo");
			
			//int idade = opt.orElse(0);			
			//int idade = opt.orElseThrow(); // Lan�a uma exception.
			//int idade = opt.orElseThrow(() -> new IllegalArgumentException("Nome n�o exite!"));// Lan�a tbm uma excess�o, mas nessa excess�o eu posso criar o tipo.
			//int idade = opt.orElseThrow(IllegalArgumentException::new);// cria um objeto pra lan�ar a excess�o. O resultado ser� o mesmo.
			
			//opt.ifPresent(i -> System.out.println(" A idade " + i + " foi encontrada."));// Executa uma a��o apenas se a idade for encontrada.
			
			opt.ifPresentOrElse(
					i -> System.out.println(" A idade " + i + " foi encontrada"),
					() -> System.out.println("N�o encontrado!") 
				); // Nesse casso passa-se dois par�metros (pega o valor do option)
			
			//System.out.println(idade);			
			
			//System.out.println(get("maria"));
		}
		
		
		/*private static Integer get(String nome) {
			return PESSOA.get(nome);
		}*/
		
		private static Optional<Integer> get(String nome){
			return Optional.ofNullable(PESSOA.get(nome));// � usado quando se deseja colocar dentro do OPTIONAL  um valor null ou n�o.
			// .of - indica que o valor que est� dentro n�o pode ser null.
			// .empty - Gera um optional vazio.
		}
}

