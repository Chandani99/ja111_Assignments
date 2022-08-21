package com.masai.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private Integer depId;
	
	@NotNull(message = "Department name should not be null")
	
	private String depName;

	@NotNull(message = "Location name should not be null")
	
    private String location;
    
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnore
    private List<Employee> emps;
	
   
	
}
