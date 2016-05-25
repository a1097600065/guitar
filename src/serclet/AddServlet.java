package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Guitar;
import dao.GuitarDaoImpl;

/**
 * Servlet implementation class Add
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
		String model=request.getParameter("model");
		String builder=request.getParameter("builder");
		String type=request.getParameter("type");
		String wood=request.getParameter("wood");
		GuitarDaoImpl dao=new GuitarDaoImpl();
		Guitar guitar=new Guitar();
			guitar.setId(id);
			guitar.setModel(model);
			guitar.setBuilder(builder);
			guitar.setType(type);
			guitar.setWood(wood);
			dao.addGuitar(guitar);
	    request.getRequestDispatcher("/search.jsp").forward(request,response);	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
