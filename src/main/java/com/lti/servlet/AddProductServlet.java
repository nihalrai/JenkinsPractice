package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;

//@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddProductServlet() {
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product p = new Product();		
		
		response.setContentType("text/html");
		
		p.setId(Integer.parseInt(request.getParameter("id")));
		p.setName(request.getParameter("name"));
		p.setPrice(Double.parseDouble(request.getParameter("price")));
		
		ProductDao dao = new ProductDao();
		
		dao.insert(p);
		
		List<Product> products = dao.selectAll();
		
		for(Product i: products) {
			System.out.println("id: " + i.getId() + " Name: " + i.getName() + " Price : " + i.getPrice());
		}
		
		PrintWriter out = response.getWriter();
		
		out.write("Product added successfully. <a href='addProduct.jsp'>Click here</a> to add more products");
	}

}
