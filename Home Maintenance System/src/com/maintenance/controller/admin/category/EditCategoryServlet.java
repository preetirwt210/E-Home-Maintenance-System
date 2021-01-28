package com.maintenance.controller.admin.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maintenance.admin.BaseServlet;
import com.maintenance.admin.services.CategoryServices;


@WebServlet("/admin/edit_category")
public class EditCategoryServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
   
    public EditCategoryServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CategoryServices services=new CategoryServices(dataSource,request,response);
		try {
			services.editCategory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
