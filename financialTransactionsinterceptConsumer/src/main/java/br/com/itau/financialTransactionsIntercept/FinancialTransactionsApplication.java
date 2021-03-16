package br.com.itau.financialTransactionsIntercept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class FinancialTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialTransactionsApplication.class, args);
	}

}
