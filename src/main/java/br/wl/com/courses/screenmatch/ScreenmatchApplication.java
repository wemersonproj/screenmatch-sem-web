package br.wl.com.courses.screenmatch;

import modal.DadosSerie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.ConverterDados;
import service.ObterDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var obeterDados = new ObterDados();
		var json = obeterDados.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		//System.out.println(json);

//		json = obeterDados.obterDados("https://coffee.alexflipnote.dev/random.json");
//		System.out.println(json);

		ConverterDados conversor = new ConverterDados();

		DadosSerie dados = conversor.obeterDados(json, DadosSerie.class);

		System.out.println(dados);

	}
}
