package com.wsrest.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the departments database table.
 * 
 */
@Entity
@Table(name="departments")
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String description;

	@Column(name="modified_by")
	private String modifiedBy;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	private String name;

	private String phone;

	private Boolean status;

	//bi-directional many-to-one association to DepartmentsEmployee
	@OneToMany(mappedBy="department")
	private List<DepartmentsEmployee> departmentsEmployees;

	//bi-directional many-to-one association to Enterprise
	@ManyToOne
	@JoinColumn(name="id_enterprises")
	private Enterprise enterprise;

	public Department() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<DepartmentsEmployee> getDepartmentsEmployees() {
		return this.departmentsEmployees;
	}

	public void setDepartmentsEmployees(List<DepartmentsEmployee> departmentsEmployees) {
		this.departmentsEmployees = departmentsEmployees;
	}

	public DepartmentsEmployee addDepartmentsEmployee(DepartmentsEmployee departmentsEmployee) {
		getDepartmentsEmployees().add(departmentsEmployee);
		departmentsEmployee.setDepartment(this);

		return departmentsEmployee;
	}

	public DepartmentsEmployee removeDepartmentsEmployee(DepartmentsEmployee departmentsEmployee) {
		getDepartmentsEmployees().remove(departmentsEmployee);
		departmentsEmployee.setDepartment(null);

		return departmentsEmployee;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterpris(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

}