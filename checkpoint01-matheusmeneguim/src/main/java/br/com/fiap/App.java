package br.com.fiap;

import java.time.LocalDate;


import br.com.fiap.entity.Livro;
import br.com.fiap.service.impl.LivroServiceImpl;

public class App {
	public static void main(String[] args) {
		
		LivroServiceImpl livroService = LivroServiceImpl.getInstance();
	
		Livro livro1 = new Livro("Meu Sobrenome", "Meneguim", 4, LocalDate.of(2003, 9, 21));
		
		Livro livro2 = new Livro("1984", "George Orwell", 6, LocalDate.of(1980, 1, 1));
		
		Livro livro3 = (new Livro("Como montar cubos em 3 segundos com o Lora", "Matheus", 7, LocalDate.of(2003, 9, 21)));
		
		livroService.cadastrar(livro1);
		livroService.cadastrar(livro2);
		livroService.cadastrar(livro3);
		
		livroService.remover(2L);
		livroService.atualizar((new Livro("1984", "George Orwell", 6, LocalDate.of(2019, 1, 1))));
		
		livroService.listar().forEach(System.out::println);
		
	}
	
}
