package org.openmrs.module.openmrsplatformmodule.api.dao;

import java.util.List;

import org.openmrs.module.openmrsplatformmodule.Department;

public interface DepartmentDao {
	
	/**
	 * @see org.openmrs.module.openmrsplatformmodule.api.department.api.DepartmentService#getAllDepartments()
	 */
	List<Department> getAllDepartments();
	
	/**
	 * @see org.openmrs.module.openmrsplatformmodule.api.department.api.DepartmentService#getDepartment(java.lang.Integer)
	 */
	Department getDepartment(Integer departmentId);
	
	/**
	 * @see org.openmrs.module.openmrsplatformmodule.api.department.api.DepartmentService#saveDepartment(org.openmrs.module.department.Department)
	 */
	Department saveDepartment(Department department);
	
	/**
	 * @see org.openmrs.module.openmrsplatformmodule.api.department.api.DepartmentService#purgeDepartment(org.openmrs.module.department.Department)
	 */
	void purgeDepartment(Department department);
}
