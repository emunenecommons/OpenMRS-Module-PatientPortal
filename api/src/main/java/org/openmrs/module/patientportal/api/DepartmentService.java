package org.openmrs.module.patientportal.api;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.patientportal.Department;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The service for managing departments.
 */

@Transactional
public interface DepartmentService extends OpenmrsService {
	
	/**
	 * Gets a list of departments.
	 * 
	 * @return the department list.
	 */
	@Transactional(readOnly = true)
	List<Department> getAllDepartments();
	
	/**
	 * Gets a department for a given id.
	 * 
	 * @param departmentId the department id
	 * @return the department with the given id
	 */
	@Transactional(readOnly = true)
	Department getDepartment(Integer departmentId);
	
	/**
	 * Saves a new or existing department.
	 * 
	 * @param department the department to save.
	 * @return the saved department.
	 */
	@Transactional
	Department saveDepartment(Department department);
	
	/**
	 * Deletes a department from the database.
	 * 
	 * @param department the department to delete.
	 */
	@Transactional
	void purgeDepartment(Department department);
	
}
