package com.tessio.tournament.dto;

public class AthleteDTO {
	
	private Integer id;
	private String name;
	private String cpf;
	private String email;
	private String team;
	private Double weight;
	private String phone;
	private Integer age;
	private String gender;
	
	public AthleteDTO () {}

	public AthleteDTO(Integer id, String name, String cpf, String email, String team, Double weight, String phone,
			Integer age, String gender) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.team = team;
		this.weight = weight;
		this.phone = phone;
		this.age = age;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
