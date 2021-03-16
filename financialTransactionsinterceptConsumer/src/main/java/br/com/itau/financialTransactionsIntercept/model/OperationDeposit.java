package br.com.itau.financialTransactionsIntercept.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "deposit")
public class OperationDeposit {

	@Id
	private String id;
	private Timestamp dateOp;
	private String document;
	private float amount;
	private String currency;
	private String cod_bank;
	private String cod_agencia;
	private String description;
	private String on_behalf_of;
	private String customer;
	private String statement_descriptor;
	private String deposit;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getDateOp() {
		return dateOp;
	}

	public void setDateOp(Timestamp dateOp) {
		this.dateOp = dateOp;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCod_bank() {
		return cod_bank;
	}

	public void setCod_bank(String cod_bank) {
		this.cod_bank = cod_bank;
	}

	public String getCod_agencia() {
		return cod_agencia;
	}

	public void setCod_agencia(String cod_agencia) {
		this.cod_agencia = cod_agencia;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOn_behalf_of() {
		return on_behalf_of;
	}

	public void setOn_behalf_of(String on_behalf_of) {
		this.on_behalf_of = on_behalf_of;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getStatement_descriptor() {
		return statement_descriptor;
	}

	public void setStatement_descriptor(String statement_descriptor) {
		this.statement_descriptor = statement_descriptor;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

}
