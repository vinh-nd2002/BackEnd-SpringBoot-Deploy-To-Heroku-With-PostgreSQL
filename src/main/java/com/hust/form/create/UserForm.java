package com.hust.form.create;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserForm {

	private String username;

	private String email;

	private String numberPhone;

	private String password;

	private String firstName;

	private String lastName;

	private Date dateOfBirth;

	private String gender;

	private String address;

}
