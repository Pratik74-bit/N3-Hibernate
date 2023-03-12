package org.tnsif.service;

import java.util.List;

import org.tnsif.dao.BookDao;
import org.tnsif.dao.BookDaoImpl;
import org.tnsif.entities.Book;

public class BookServiceImp implements BookService{
	
	private BookDao dao;
	
	public void BookServiceImpl() {
		dao=new BookDaoImpl();
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getPrice(Float low, Float high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookByIds(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
