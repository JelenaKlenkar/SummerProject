package klenkar.summertask;

import java.util.List;

public class Start {

	public Start() {
	}

	private Applicant setValues(Applicant a) {
		a.setFirstName(Helper.enterString("Enter first name: "));
		a.setLastName(Helper.enterString("Enter last name: "));
		a.setAddress(Helper.enterString("Enter address: "));
		a.setPhoneNumber(Helper.enterInteger("Enter phone number: "));
		a.setEmail(Helper.enterString("Enter email address: "));
		a.setPersonalIdentificationNumber(Helper.enterInteger("Enter personal identification number: "));
		a.setApplicantCv(Helper.enterString("Enter applicant cv: "));
		a.setMotivationalLetter(Helper.enterString("Enter motivational letter: "));

		return a;

	}

	private JobApplication setValues(JobApplication j) {
		j.setDateOfReceive(Helper.enterDate("Enter date of recceive: "));
		j.setTimeOfReceive(Helper.enterTime("Enter time of receive: "));
		j.setNumberOfApplication(Helper.enterInteger("Enter number of application: "));

		return j;
	}

	private Interview setValues(Interview i) {
		i.setTypeofInterview(Helper.enterString("Enter type of interview: "));
		i.setDateOfInterview(Helper.enterDate("Enter date of interview: "));
		i.setNumberOfInterview(Helper.enterInteger("Enter number of interview: "));
		return i;
	}

	private Testing setValues(Testing t) {
		t.setTypeOfTesting(Helper.enterString("Enter type of testing: "));
		t.setDateOfTesting(Helper.enterDate("Enter date of testing: "));
		t.setNumberOfTesting(Helper.enterInteger("Enter number of testing: "));
		t.setResultOfTesting(Helper.enterInteger("Enter result of testing: "));

		return t;
	}

	private JobOffer setValues(JobOffer jo) {
		jo.setSalary(Helper.enterDouble("Enter salary: "));
		jo.setStartingDate(Helper.enterDate("Enter starting date: "));
		jo.setAccept(Helper.enterBoolean("Enter job accept: "));
		return jo;
	}

	private JobPosition setValues(JobPosition jp) {
		jp.setNameOfJobPosition(Helper.enterString("Enter job position: "));
		jp.setJobDescription(Helper.enterString("Enter job description: "));
		return jp;
	}

	public static void main(String[] args) {
		new Start();
	}
}
