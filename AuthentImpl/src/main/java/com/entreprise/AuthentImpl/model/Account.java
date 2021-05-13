package com.entreprise.AuthentImpl.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@NotBlank
	@Size(max=50)
	@Pattern( regexp="[a-zA-Z]+[\\s]*[a-zA-Z]*")
	private String firstname;
	
	@NotBlank
	@Size(max=50)
	@Pattern( regexp="[a-zA-Z]+[\\s]*[a-zA-Z]*")
	private String lastname;
	
	@NotBlank
	@Size(max=120)
	private String email;
	
	@NotBlank
	@Size(max=120)
	private String password;
	
	@NotBlank
	@Size(max=120)
	private String Adresse;
	
	@NotBlank
	@Size(max=15)
	private String Tel;
}
