package connectionTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import project1.layers.util.JDBCConnection;

class connTester {

	@Test
	void connTest() {
		Connection cn = JDBCConnection.getConnection();
		if (cn != null) {
			assertTrue(true);
		}
	}

}
 