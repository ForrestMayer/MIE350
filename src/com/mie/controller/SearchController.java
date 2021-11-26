package com.mie.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import com.mie.dao.StudentDao;
import com.mie.model.Student;
import com.mie.dao.MovieDao;
import com.mie.model.Movie;

public class SearchController extends HttpServlet {
	/**
	 * This class only handles the SEARCH feature of the web app.
	 * 
	 * These are variables that lead to the appropriate JSP pages.
	 * 
	 * SEARCH_USER leads to the search results page.
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String SEARCH_USER = "/searchMovie.jsp";
	//private StudentDao dao;
	private MovieDao dao;

	/**
	 * Constructor for this class.
	 */
	public SearchController() {
		super();
		dao = new MovieDao();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/**
		 * This method handles the retrieval of the search keyword entered by
		 * the user.
		 */
		System.out.println("Helo1.1");
		String keyword = request.getParameter("keyword");
		System.out.println("Helo1.2");
		RequestDispatcher view = request.getRequestDispatcher(SEARCH_USER);
		System.out.println("Helo1.3");
		request.setAttribute("keyword", keyword);
		System.out.println("Helo1.4");
		System.out.println(keyword);
		request.setAttribute("movieTitle", dao.getMoviebyTitle(keyword));
		/**
		 * Redirect to the search results page after the list of students
		 * matching the keywords has been retrieved.
		 */
		System.out.println("Helo1.5");
		view.forward(request, response);
	}
}