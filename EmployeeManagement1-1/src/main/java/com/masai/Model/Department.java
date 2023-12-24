package com.masai.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dId;
	@NotNull
	private String dName;
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Employee>emp;

	public Department(Integer dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;

	}

	public Department() {
		super();
	}

	public Integer getdId() {
		return dId;
	}

	public void setdId(Integer dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}

}
