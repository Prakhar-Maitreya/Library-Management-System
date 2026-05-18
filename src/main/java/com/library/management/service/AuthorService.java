package com.library.management.service;

import com.library.management.entity.Author;
import com.library.management.entity.Book;
import com.library.management.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public List<Book> getAuthorBooks(Long authorId) {
        Optional<Author> author = authorRepository.findById(authorId);
        return author.map(Author::getBooks).orElse(null);
    }
}
