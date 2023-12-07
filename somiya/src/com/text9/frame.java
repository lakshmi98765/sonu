package com.text9;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/frame")
public class frame extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;

    
    public frame()
    {
     System.out.println("devi");
    }
	public void init(ServletConfig config) throws ServletException {
	System.out.println("ramu()");
	}
	public void destroy()
	{
	System.out.println("rams()");
	}
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException
	{
	System.out.println("Laksmi devi");	
	}

}
