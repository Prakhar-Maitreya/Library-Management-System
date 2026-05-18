package com.library.management.service;

import com.library.management.entity.Author;
import com.library.management.entity.Book;
import com.library.management.entity.Category;
import com.library.management.entity.User;
import com.library.management.repository.AuthorRepository;
import com.library.management.repository.BookRepository;
import com.library.management.repository.CategoryRepository;
import com.library.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    public Book addBook(Book book) {
        // Assign existing author
        if (book.getAuthor() != null && book.getAuthor().getId() != null) {
            Optional<Author> authorOpt = authorRepository.findById(book.getAuthor().getId());
            authorOpt.ifPresent(book::setAuthor);
        }

        // Assign existing categories
        if (book.getCategories() != null && !book.getCategories().isEmpty()) {
            List<Category> existingCategories = new ArrayList<>();
            for (Category cat : book.getCategories()) {
                if (cat.getId() != null) {
                    categoryRepository.findById(cat.getId()).ifPresent(existingCategories::add);
                }
            }
            book.setCategories(existingCategories);
        }

        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book borrowBook(Long bookId, Long userId) {
        Optional<Book> bookOpt = bookRepository.findById(bookId);
        Optional<User> userOpt = userRepository.findById(userId);

        if (bookOpt.isPresent() && userOpt.isPresent()) {
            Book book = bookOpt.get();
            User user = userOpt.get();
            book.setBorrowedBy(user);
            return bookRepository.save(book);
        }
        throw new RuntimeException("Book or User not found");
    }
}
