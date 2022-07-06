package br.com.kenneth.lambdastream;

import java.util.Map;
import java.util.Optional;

public class Main {	
		
		private static final Map<String, Integer> PESSOA = Map.of("pedro", 15, "maria", 20, "paulo", 25, "jorge", 10);
		
		public static void main(String[] args) {
			
			Optional<Integer> opt = get("marcelo");
			
			//int idade = opt.orElse(0);			
			//int idade = opt.orElseThrow(); // Lança uma exception.
			//int idade = opt.orElseThrow(() -> new IllegalArgumentException("Nome não exite!"));// Lança tbm uma excessão, mas nessa excessão eu posso criar o tipo.
			//int idade = opt.orElseThrow(IllegalArgumentException::new);// cria um objeto pra lançar a excessão. O resultado será o mesmo.
			
			//opt.ifPresent(i -> System.out.println(" A idade " + i + " foi encontrada."));// Executa uma ação apenas se a idade for encontrada.
			
			opt.ifPresentOrElse(
					i -> System.out.println(" A idade " + i + " foi encontrada"),
					() -> System.out.println("Não encontrado!") 
				); // Nesse casso passa-se dois parâmetros (pega o valor do option)
			
			//System.out.println(idade);			
			
			//System.out.println(get("maria"));
		}
		
		
		/*private static Integer get(String nome) {
			return PESSOA.get(nome);
		}*/
		
		private static Optional<Integer> get(String nome){
			return Optional.ofNullable(PESSOA.get(nome));// É usado quando se deseja colocar dentro do OPTIONAL  um valor null ou não.
			// .of - indica que o valor que está dentro não pode ser null.
			// .empty - Gera um optional vazio.
		}
}

