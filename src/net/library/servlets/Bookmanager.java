package net.library.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.library.beans.BookBean;

/**
 * Servlet implementation class Bookmanager
 */
public class Bookmanager extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<BookBean> books;
	private ArrayList<AuthorBean> authors;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Bookmanager() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * Loads the servlet for the first time.
	 * 
	 * @see javax.servlet.GenericServlet#init()
	 */
	@Override
	public void init() throws ServletException {
		books = new ArrayList<BookBean>();
		authors = new ArrayList<AuthorBean>();

		for (int a_id = 0; a_id < 10; a_id++) {
			AuthorBean author = new AuthorBean();
			author.setId(UUID.randomUUID().toString());
			author.setName(String.format("Name_%d", a_id));
			author.setSurename(String.format("Surename_%d", a_id));

			authors.add(author);
			// System.out.println(author.getFullname());
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int action_type = 0;
		try {
			action_type = Integer.parseInt(request.getParameter("action"));
		} catch (NumberFormatException e) {
		}

		switch (action_type) {
		case 1:
			addBook(request, response);
			break;
		case 2:
			bookRen(request, response);
			break;
		case 3:
			bookRm(request, response);
			break;
		case 4:
			listBooks(request, response);
			break;
		case 5:
			bookRenForw(request, response);
			break;
		case 6:
			bookView(request, response);
			break;
		case 0:
			listAuthors(request, response);
			break;
		}
	}

	private void bookView(HttpServletRequest request,
			HttpServletResponse response) {
		String id = request.getParameter("id");
		String title = request.getParameter("title");
//		String author = request.getParameter("author");

		BookBean book = new BookBean();
		book.setId(id);
		book.setTitle(title);
		
		request.getSession().setAttribute("book", book);

		try {
			response.sendRedirect("view.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int action_type = Integer.parseInt(request.getParameter("action"));

		switch (action_type) {
		case 1:
			addBook(request, response);
			break;
		case 2:
			bookRen(request, response);
			break;
		case 3:
			bookRm(request, response);
			break;
		case 4:
			listBooks(request, response);
			break;
		case 5:
			bookRenForw(request, response);
			break;

		default:
			break;
		}
	}

	private void bookRenForw(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		BookBean book = new BookBean();
		String title = request.getParameter("title");
		book.setTitle(title);
		book.setId(request.getParameter("id"));
		// books.add(book);
		request.getSession().setAttribute("book", book);
		response.sendRedirect("rename.jsp");
		// request.getRequestDispatcher("rename.jsp").forward(request,
		// response);
	}

	private void bookRen(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String title = request.getParameter("title");

		for (BookBean mybook : books) {
			if (mybook.getId().equals(id)) {
				mybook.setTitle(title);
				mybook.setId(id);
				break;
			}
		}

		request.getSession().setAttribute("books", books);
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

	private void addBook(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		BookBean book = new BookBean();
		String title = request.getParameter("title");
		String author_param = request.getParameter("author");
		AuthorBean author = null;

		for (AuthorBean ath : authors){
			if(ath.getId().equals(author_param)){
				author = ath;
				break;
			}
		}
		// TODO: re think the validation
		if(author != null){
			book.setAuthor(author);
		}
		book.setTitle(title);
		book.setId(UUID.randomUUID().toString());
		books.add(book);

		request.getSession().setAttribute("books", books);

		response.sendRedirect("list.jsp");
	}

	// @SuppressWarnings("unused")
	// private void renameBook(HttpServletRequest request,
	// HttpServletResponse response) throws ServletException, IOException {
	// @SuppressWarnings("unchecked")
	// ArrayList<BookBean> books = (ArrayList<BookBean>) request.getSession()
	// .getAttribute("books");
	// BookBean reqBook = (BookBean) request.getAttribute("book");
	// String id = reqBook.getId();
	// String title = reqBook.getTitle();
	//
	// for (BookBean mybook : books) {
	// if (mybook.getId().equals(id)) {
	// mybook = reqBook;
	// break;
	// }
	// }
	//
	// request.getSession().setAttribute("books", books);
	//
	// response.sendRedirect("list.jsp");
	// }

	private void bookRm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");

		for (BookBean book : books) {
			if (book.getId().equals(id)) {
				books.remove(books.indexOf(book));
				System.out.printf("Item %s removed.\n", book.getId());
				break;
			}
		}

		request.getSession().setAttribute("books", books);
		response.sendRedirect("list.jsp");
	}

	private void listBooks(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.getSession().setAttribute("books", books);
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}

	/**
	 * @param authors
	 *            the authors to set
	 */
	public void setAuthors(ArrayList<AuthorBean> authors) {
		this.authors = authors;
	}

	/**
	 * Lists all the available authors
	 * 
	 * @param response
	 * @param request
	 */
	public void listAuthors(HttpServletRequest request,
			HttpServletResponse response) {
		request.getSession().setAttribute("authors", authors);
		try {
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
