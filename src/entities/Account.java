package entities;
// Generated 6 juil. 2020 18:04:29 by Hibernate Tools 5.4.3.Final

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name="account")
public class Account  {

	@Id
	@Column(name="account")
	private String accountNumber;
	private int basicNumber;
	private int branch;
	private int suffix;
	private int accountStatus;
	private double balance;
	private double availableBalance;
	private Date dateCreation;

	public Account() {
	}

	public Account(String accountNumber, int basicNumber, int branch, int suffix, int accountStatus, double balance,
			double availableBalance, Date dateCreation) {
		this.accountNumber = accountNumber;
		this.basicNumber = basicNumber;
		this.branch = branch;
		this.suffix = suffix;
		this.accountStatus = accountStatus;
		this.balance = balance;
		this.availableBalance = availableBalance;
		this.dateCreation = dateCreation;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBasicNumber() {
		return this.basicNumber;
	}

	public void setBasicNumber(int basicNumber) {
		this.basicNumber = basicNumber;
	}

	public int getBranch() {
		return this.branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	public int getSuffix() {
		return this.suffix;
	}

	public void setSuffix(int suffix) {
		this.suffix = suffix;
	}

	public int getAccountStatus() {
		return this.accountStatus;
	}

	public void setAccountStatus(int accountStatus) {
		this.accountStatus = accountStatus;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAvailableBalance() {
		return this.availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
