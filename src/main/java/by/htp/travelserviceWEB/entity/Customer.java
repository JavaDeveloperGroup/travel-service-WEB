package by.htp.travelserviceWEB.entity;

import java.io.Serializable;
import java.sql.Date;

public class Customer implements Serializable {

	private Integer userId;
	private String login;
	private String password;
	private String name;
	private String surname;
	private String gender;
	private Date birthday;
	private String passport;
	private String email;
	private String phoneNumber;
	private String driverLicense;
	private String vip;
	private Role role;
	
	public Customer() {
		super();
	}

	public Customer(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public Customer(String login, String password, String name, String surname, String gender, Date birthday,
			String passport, String email, String phoneNumber, String driverLicense, String vip, Role role) {
		super();
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthday = birthday;
		this.passport = passport;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.driverLicense = driverLicense;
		this.vip = vip;
		this.role = role;
	}

	public Customer(Integer userId, String login, String password, String name, String surname, String gender,
			Date birthday, String passport, String email, String phoneNumber, String driverLicense, String vip,
			Role role) {
		super();
		this.userId = userId;
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthday = birthday;
		this.passport = passport;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.driverLicense = driverLicense;
		this.vip = vip;
		this.role = role;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}