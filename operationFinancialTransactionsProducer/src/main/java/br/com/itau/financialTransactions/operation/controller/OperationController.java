package br.com.itau.financialTransactions.operation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.financialTransactions.operation.service.OperationService;

@RestController
public class OperationController {

	final private OperationService operationService;

	public OperationController(OperationService operationService) {
		super();
		this.operationService = operationService;
	}

	@PostMapping("/deposit/send")
	public Object opDeposit(@RequestBody String msg) {

		return this.operationService.opDeposit(msg);

	}

}
