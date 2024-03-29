package com.te.Hibernate;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mock_employee")
public class Employee implements Serializable {

	@Id
	private Integer id;

	private String name;
	
    private String location;
	
}
