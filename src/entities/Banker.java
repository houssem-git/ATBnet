package entities;
// Generated 6 juil. 2020 18:04:29 by Hibernate Tools 5.4.3.Final
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
/**
 * Banker generated by hbm2java
 */
@Entity
@Table(name="banker")
public class Banker  {
	@Id
	@Column(name="matricule")
	private int matricule;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private int userStatus;

	public Banker() {
	}

	public Banker(int matricule, String login, String password, String firstName, String lastName, int userStatus) {
		this.matricule = matricule;
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userStatus = userStatus;
	}

	public int getMatricule() {
		return this.matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

}