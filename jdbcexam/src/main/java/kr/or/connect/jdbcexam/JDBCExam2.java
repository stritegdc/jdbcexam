package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roleId = 300;
		String description = "Programmer";
		Role r = new Role(roleId, description);
		RoleDao rd = new RoleDao();
		int count;
		count = rd.addRole(r);
		System.out.println(count);
	}

}
