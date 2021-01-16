package com.maintenance.controller.admin.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maintenance.admin.BaseServlet;
import com.maintenance.entity.User;


@WebServlet("/admin/edit_user")
public class EditUserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	
	public EditUserServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		try {
		editUser(request,response);

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	private void editUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String userId=request.getParameter("userId");
		User user=userDao.editUser(userId);
		
		request.setAttribute("theUser",user);
		
		String editPage="updateUserForm.jsp";
		RequestDispatcher dispatcher=request.getRequestDispatcher(editPage);
		dispatcher.forward(request, response);
		
		
		
		
	}

	
}
