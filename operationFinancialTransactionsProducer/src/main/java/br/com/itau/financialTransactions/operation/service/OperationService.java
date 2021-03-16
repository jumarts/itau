package br.com.itau.financialTransactions.operation.service;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

	@Autowired
	private KafkaTemplate<String, String> template;

	public Object opDeposit(String objectDeposit) {
		SendResult<String, String> objectReturn = null;
		try {
			objectReturn = this.template.send("op_deposit", objectDeposit).get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return objectReturn.getProducerRecord().value();
	}

}
