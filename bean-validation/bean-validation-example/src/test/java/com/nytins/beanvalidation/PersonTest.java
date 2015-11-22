package com.nytins.beanvalidation;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
	
	private static Validator validator;

	@BeforeClass
	public static void setup() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}
	
	@Test
	public void firstNameMin() {
		Person person = new Person();
		person.setFirstName("a");
		Set<ConstraintViolation<Person>> violations = validator.validate(person);
		assertEquals(1, violations.size());
		assertEquals("First name must be atleast 2 characters long.", violations.iterator().next().getMessage());
	}
}
