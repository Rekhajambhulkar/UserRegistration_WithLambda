package com.bridgelabz.userregistration;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AllEmailSamples {
	private String emailTest;
	private boolean expectedResult;

	public ValidEmailTest(String emailTest, boolean expectedResult) {
		this.emailTest = emailTest;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ "abc@abc.com", true }, 
			{ "abc-100@abc.co.in", true },
			{ "abc111@abc.com", true },
			{ "abc.yz@abc.com.com", true }, 
			{ "abc.100@abc.co.au", true },
			{ "abc@gmail.com.com", true }, 
			{ "abc100@gmail.com", true }, 
			});
	}

	@Test
	public void givenEmailValidMustRetrunResult() {
		UserValidator user = new UserValidator();
		Assert.assertEquals(expectedResult, user.checkEmailId(emailTest));
	}
} 
