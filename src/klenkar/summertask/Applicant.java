package klenkar.summertask;

public class Applicant {

	// define a private fields

	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private int phoneNumber;
	private String email;
	private int personalIdentificationNumber;
	private String applicantCv;
	private String motivationalLetter;

	// default constructor
	public Applicant() {

	}

	// parameterized constructor
	public Applicant(int id, String firstName, String lastName, String address, int phoneNumber, String email,
			int personalIdentificationNumber, String applicantCv, String motivationalLetter) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.personalIdentificationNumber = personalIdentificationNumber;
		this.applicantCv = applicantCv;
		this.motivationalLetter = motivationalLetter;
	}

	// public methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPersonalIdentificationNumber() {
		return personalIdentificationNumber;
	}

	public void setPersonalIdentificationNumber(int personalIdentificationNumber) {
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

	public String getApplicantCv() {
		return applicantCv;
	}

	public void setApplicantCv(String applicantCv) {
		this.applicantCv = applicantCv;
	}

	public String getMotivationalLetter() {
		return motivationalLetter;
	}

	public void setMotivationalLetter(String motivationalLetter) {
		this.motivationalLetter = motivationalLetter;
	}

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}
}
