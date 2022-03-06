package com.zuplae.banco;

import com.zuplae.banco.model.CadastrarModel; 
import com.zuplae.banco.repository.CadastrarRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication implements CommandLineRunner {
	private CadastrarRepository repository;

	public BancoApplication(CadastrarRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CadastrarModel model = new CadastrarModel();
		model.setveiculo("Onix");
		model.setmarca("** **");
		model.setano(2020);
		model.setdescricao("Branco");

		repository.save(model);
		repository.deleteById(2);

		System.out.println("\n");
		repository.findAll().forEach(
				f -> System.out.printf("%d - %s\n", f.getveiculo(), f.getmarca(), f.getdescricao(), f.getano()));
		System.out.println("\n");
	}
}
