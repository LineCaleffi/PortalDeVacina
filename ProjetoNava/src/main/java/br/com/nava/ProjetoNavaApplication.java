package br.com.nava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoNavaApplication  implements CommandLineRunner{
//	@Autowired 
//	private SeriesRepository seriesRep;
//	
//	@Autowired
//	private FilmesRepository filmesRep;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoNavaApplication.class, args);
	}
	@Override
	public void run(String...args) throws Exception{
//		SeriesEntity series = new SeriesEntity();
//		series.setNome("SuperGirl");
//		series.setPrincipal("Kara Danvers");
//		seriesRep.save(series);
//		
//		FilmesEntity filmes = new FilmesEntity();
//		filmes.setNome("Harry Potter e a Pedra Filosofal");
//		filmes.setDiretor("J.K. Rowling"); 
//		filmesRep.save(filmes);
	}
}
