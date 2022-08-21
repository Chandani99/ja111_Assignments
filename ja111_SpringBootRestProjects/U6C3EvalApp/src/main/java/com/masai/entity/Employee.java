package com.masai.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	
	@NotNull(message = "Employee name should not be null")
	
	private String nName;
	
	@NotNull(message = "Salary should not be null")

	private Integer salary;
	
	@ManyToOne(cascade=CascadeType.ALL)
//	@JsonIgnore
	private Department dep;

	
}
