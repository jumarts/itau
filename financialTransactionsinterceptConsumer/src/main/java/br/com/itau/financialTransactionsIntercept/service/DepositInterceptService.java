package br.com.itau.financialTransactionsIntercept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.financialTransactionsIntercept.model.OperationDeposit;
import br.com.itau.financialTransactionsIntercept.repository.OperationDepositRepository;

@Service
public class DepositInterceptService {

	@Autowired
	private OperationDepositRepository operationDepositRepository;

	public DepositInterceptService() {
		// TODO Auto-generated constructor stub
	}

	

	public Object salveOperationDeposit(OperationDeposit operationDeposit) {

		// Salva Entrada
    
		operationDepositRepository.save(operationDeposit);

		// Chamar API de Deposito Ideais

		// Salva o resultado da transação Ideais

		// API ANALITICA

		return operationDeposit;

	}

}
