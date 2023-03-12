package org.tnsif.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.tnsif.entities.Book;

public class BookDaoImpl implements BookDao{
	
	private EntityManager em;
	
	public BookDaoImpl() {
		em=JPAUtil.getEntityManager();
	}

	@Override
	public List<Book> getAllBooks() {
		Query query=em.createNamedQuery("getAllBooks");
		@SuppressWarnings("unchecked")
		List<Book>book=query.getResultList();
		return book;
	}

	@Override
	public List<Book> getBooks(String author) {
		String qstr="SELECT book FROM Book book WHERE book.author=:pAuthor";
		TypedQuery<Book>query=em.createQuery(qstr,Book.class);
		query.setParameter("pAuthor", author);
		List<Book>book=query.getResultList();
		return book;
	}

	@Override
	public List<Book> getPriceRange(Float low, Float high) {
		String qstr="SELECT book FROM Book book WHERE book.price between :low and :high";
		TypedQuery<Book>query=em.createQuery(qstr,Book.class);
		query.setParameter("low", low);
		query.setParameter("high",high);
		List<Book>book=query.getResultList();
		return book;
	}

	@Override
	public Book getBookById(Integer id) {
		Book book=em.find(Book.class, id);
		return book;
	}

	@Override
	public Long getBookCount() {
		String qstr="SELECT COUNT(book.id) FROM Book book";
		TypedQuery<Long>query=em.createQuery(qstr,Long.class);
		Long count=query.getSingleResult();
		return count;
	}



}
