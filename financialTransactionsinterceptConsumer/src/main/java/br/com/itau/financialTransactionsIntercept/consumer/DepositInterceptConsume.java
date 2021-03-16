package br.com.itau.financialTransactionsIntercept.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import br.com.itau.financialTransactionsIntercept.model.OperationDeposit;
import br.com.itau.financialTransactionsIntercept.service.DepositInterceptService;
import br.com.itau.financialTransactionsIntercept.utils.Utils;

@Component
public class DepositInterceptConsume {

	@Autowired
	private DepositInterceptService depositInterceptService;

	public DepositInterceptConsume() {
		// TODO Auto-generated constructor stub
	}

	@KafkaListener(topics = "op_deposit", groupId = "op_deposit_id")
	Object consume(String operationDeposit) {

		Gson gson = new Gson();

		final OperationDeposit depositInfo = gson.fromJson(operationDeposit.toString(), OperationDeposit.class);

		depositInfo.setDateOp(Utils.getNowDate());
		return depositInterceptService.salveOperationDeposit(depositInfo);

	}

}
