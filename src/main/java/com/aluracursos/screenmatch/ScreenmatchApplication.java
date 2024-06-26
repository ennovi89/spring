package com.aluracursos.screenmatch;

import com.aluracursos.screenmatch.serice.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoAPI();
//		var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=friends&apikey=aacdb714");
		var jason = consumoApi.obtenerDatos("https://coffee.alexflipnote.dev/random.json");
//		System.out.println("Hola Mundo desde Spring");
		System.out.println(jason);



	}
}
