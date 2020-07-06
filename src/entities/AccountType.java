package entities;
// Generated 6 juil. 2020 18:04:29 by Hibernate Tools 5.4.3.Final
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
/**
 * AccountType generated by hbm2java
 */
@Entity
@Table(name="account_type")
public class AccountType  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="suffix")
	private int suffix;
	private String libelle;
	private String devise;

	public AccountType() {
	}

	public AccountType(int suffix, String libelle, String devise) {
		this.suffix = suffix;
		this.libelle = libelle;
		this.devise = devise;
	}

	public int getSuffix() {
		return this.suffix;
	}

	public void setSuffix(int suffix) {
		this.suffix = suffix;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDevise() {
		return this.devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

}
