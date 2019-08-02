package entities;

public class PersonalAccount {

	private static Double TAX = 5.00;
	private String name;
	private Integer accNumber;
	private Double balance;
	
	public PersonalAccount(String name, Double balance) {
		this.name = name;
		this.balance = balance;
	}

	public PersonalAccount(String name, Integer accNumber, Double balance) {
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}


	public Integer getAccNumber() {
		return accNumber;
	}
	
	public void depositAccount(double deposit) {
		 balance += deposit;
	}
	
	public void withdrawAccount(double withdraw) {
		balance = balance - withdraw - TAX;
	}

	public String toString() {
		return "Account " 
				+ accNumber 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}

}
