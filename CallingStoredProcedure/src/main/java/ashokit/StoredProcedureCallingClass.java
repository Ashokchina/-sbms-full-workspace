package ashokit;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StoredProcedureCallingClass {

	@Autowired
	private DataSource ds;
	@Autowired
	private SPInterface repo;

	public void callSP() throws Exception {

		Connection con = ds.getConnection();

		CallableStatement ps = con.prepareCall("call demo()");
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			System.out.println(rs.getString(1));

		} else {
			System.out.println("unable to call sp");
		}

	}

	@Transactional
	public String method2() {

		System.out.println(repo.callingSP());
		return "";
	}
}
