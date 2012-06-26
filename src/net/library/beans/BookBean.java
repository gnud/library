/**
 * 
 */
package net.library.beans;

import java.io.Serializable;

import net.library.servlets.AuthorBean;

/**
 * Made for holding a book.
 * @author damjand
 *
 */
public class BookBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8003319045571264236L;
	private String title = "";
	private String pages = "";
	private AuthorBean author = new AuthorBean();
	private String id = "";

	/**
	 * @param author the author to set
	 */
	public void setAuthor(AuthorBean author) {
		this.author = author;
	}
	/**
	 * @return the author
	 */
	public AuthorBean getAuthor() {
		return author;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param pages the pages to set
	 */
	public void setPages(String pages) {
		this.pages = pages;
	}
	/**
	 * @return the pages
	 */
	public String getPages() {
		return pages;
	}
	/**
	 * @param string the id to set
	 */
	public void setId(String string) {
		this.id = string;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
}
