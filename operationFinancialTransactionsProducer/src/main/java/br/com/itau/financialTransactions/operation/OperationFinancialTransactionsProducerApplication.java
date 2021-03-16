package br.com.itau.financialTransactions.operation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class OperationFinancialTransactionsProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperationFinancialTransactionsProducerApplication.class, args);
	}

}
