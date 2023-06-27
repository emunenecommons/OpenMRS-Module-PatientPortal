package org.openmrs.module.patientportal.api.dao;

import org.openmrs.module.patientportal.Department;
import org.openmrs.module.patientportal.api.db.DepartmentDAO;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * The default implementation of {@link DepartmentDAO}.
 */
public class HibernateDepartmentDAO implements DepartmentDAO {
	
	protected final Log log = LogFactory.getLog(this.getClass());
	
	private SessionFactory sessionFactory;
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	/**
	 * @see org.openmrs.module.patientportal.api.db.DepartmentDAO#getAllDepartments()
	 */
	@Override
	public List<Department> getAllDepartments() {
		return sessionFactory.getCurrentSession().createCriteria(Department.class).list();
	}
	
	/**
	 * @see org.openmrs.module.patientportal.api.DepartmentService#getDepartment(java.lang.Integer)
	 */
	@Override
	public Department getDepartment(Integer departmentId) {
		return (Department) sessionFactory.getCurrentSession().get(Department.class, departmentId);
	}
	
	/**
	 * @see org.openmrs.module.patientportal.api.db.DepartmentDAO#saveDepartment(org.openmrs.module.patientportal.Department)
	 */
	@Override
	public Department saveDepartment(Department department) {
		sessionFactory.getCurrentSession().save(department);
		return department;
	}
	
	/**
	 * @see org.openmrs.module.patientportal.api.db.DepartmentDAO#purgeDepartment(org.openmrs.module.patientportal.Department)
	 */
	@Override
	public void purgeDepartment(Department department) {
		sessionFactory.getCurrentSession().delete(department);
	}
}
