package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCExam1{

	public static void main(String[] args){
		RoleDao rd = new RoleDao();
		Role role = rd.getRole(100);
		System.out.println(role);
	}
}