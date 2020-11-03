package com.bridgelabz.userregistration;

public class UserRegistration {

	// Test Case for FirstName return true
	@Test
	public void checkingFirstname() {
		UserValidator validator = new UserValidator();
		boolean isFirstNameValid = validator.checkFirstname("Rekha");
		Assert.assertTrue(isFirstNameValid);
	}

	// Test Case for FirstName return False
	@Test
	public void checkingFirstNameInvalidReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean isFirstNameInvalid = validator.checkFirstname("riya");
		Assert.assertFalse(isFirstNameInvalid);
	}

	// Test Case for LastName return True
	@Test
	public void checkingLastName() {
		UserValidator user = new UserValidator();
		boolean isLastNameValid = user.checkLastName("Jambhulkar");
		Assert.assertTrue(isLastNameValid);
	}

	// Test Case for LastName return False
	@Test
	public void checkingLastNameInvalidMustReturnFalse() {
		UserValidator user = new UserValidator();
		boolean isLastNameInvalid = user.checkLastName("jambhulkar");
		Assert.assertFalse(isLastNameInvalid);
	}
}
