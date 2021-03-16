package br.com.itau.financialTransactionsIntercept.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.itau.financialTransactionsIntercept.model.OperationDeposit;


public interface OperationDepositRepository extends MongoRepository<OperationDeposit, String> {

}
