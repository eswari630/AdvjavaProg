package com.sathya.servlet;

 import java.IoExecption;
4
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	
	}

}
