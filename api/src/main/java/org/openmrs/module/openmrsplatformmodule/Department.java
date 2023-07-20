package org.openmrs.module.openmrsplatformmodule;

import org.openmrs.BaseOpenmrsData;

import java.io.Serializable;

public class Department extends BaseOpenmrsData implements Serializable {
	
	public static final long serialVersionUID = 1L;
	
	private Integer departmentId;
	
	private String name;
	
	private String description;
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	
	@Override
	public Integer getId() {
		return getDepartmentId();
	}
	
	@Override
	public void setId(Integer id) {
		setDepartmentId(id);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String departmentName) {
		this.name = departmentName;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String departmentDescription) {
		this.description = departmentDescription;
	}
	
}
