package com.wsrest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the employees database table.
 * 
 */
@Entity
@Table(name="employees")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer age;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String email;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	private String name;

	private String position;

	private Boolean status;

	private String surname;

	//bi-directional many-to-one association to DepartmentsEmployee
	@OneToMany(mappedBy="employee")
	private List<DepartmentsEmployee> departmentsEmployees;

	public Employee() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public List<DepartmentsEmployee> getDepartmentsEmployees() {
		return this.departmentsEmployees;
	}

	public void setDepartmentsEmployees(List<DepartmentsEmployee> departmentsEmployees) {
		this.departmentsEmployees = departmentsEmployees;
	}

	public DepartmentsEmployee addDepartmentsEmployee(DepartmentsEmployee departmentsEmployee) {
		getDepartmentsEmployees().add(departmentsEmployee);
		departmentsEmployee.setEmployee(this);

		return departmentsEmployee;
	}

	public DepartmentsEmployee removeDepartmentsEmployee(DepartmentsEmployee departmentsEmployee) {
		getDepartmentsEmployees().remove(departmentsEmployee);
		departmentsEmployee.setEmployee(null);

		return departmentsEmployee;
	}

}