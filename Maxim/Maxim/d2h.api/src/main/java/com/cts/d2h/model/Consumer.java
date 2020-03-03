package com.cts.d2h.model;

public class Consumer {
	
	private int consumerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private Address address;
	private Number eWalletBalance;
	private D2hUser userAccount;
	private Subscription subscriptions;
	private Transaction transactions;
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Number geteWalletBalance() {
		return eWalletBalance;
	}
	public void seteWalletBalance(Number eWalletBalance) {
		this.eWalletBalance = eWalletBalance;
	}
	public D2hUser getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(D2hUser userAccount) {
		this.userAccount = userAccount;
	}
	public Subscription getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Subscription subscriptions) {
		this.subscriptions = subscriptions;
	}
	public Transaction getTransactions() {
		return transactions;
	}
	public void setTransactions(Transaction transactions) {
		this.transactions = transactions;
	}
	
	
	
	


}
