package br.com.alura.screenmatch;

import br.com.alura.screenmatch.Model.DadosSerie;
import br.com.alura.screenmatch.Service.ConsumoApi;
import br.com.alura.screenmatch.Service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.function.Consumer;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner Leitura = new Scanner(System.in);
		System.out.println("Digite um Filme: ");
		var consumoapi = new ConsumoApi();
		var Busca = Leitura.nextLine();
		var json = consumoapi.obterDados("https://www.omdbapi.com/?t=" +  Busca + "&apikey=3ceea175");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}

}
