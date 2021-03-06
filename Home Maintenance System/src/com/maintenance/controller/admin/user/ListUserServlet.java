package com.maintenance.controller.admin.user;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.maintenance.controller.BaseServlet;
import com.maintenance.services.UserServices;

@WebServlet("/admin/list_users")
public class ListUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L; 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserServices services=new UserServices(dataSource,request,response);
		
			try {
				services.listUsers();
			} catch (Exception e) {
				e.printStackTrace();
			}
		

	}


	
}
