package daoTest;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import project1.layers.dao.EmployeeDAO;
import project1.layers.dao.EmployeeDAOImpl;
import project1.layers.models.Employee;

class EmployeeDAOTest {

	@Test
	void addEmployeeTest() {
		Employee e = new Employee();
		e.setFirstname("James");
		e.setLastname("Bond");
		e.setUsername("j1");
		e.setPassword("p1");
		
		EmployeeDAO ed = new EmployeeDAOImpl();
		ed.addEmployee(e);
		
		assertTrue(true);
	}

}
