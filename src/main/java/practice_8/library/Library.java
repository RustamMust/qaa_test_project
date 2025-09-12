package practice_8.library;

import practice_8.library.exceptions.BookNotFoundException;
import practice_8.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // добавлять книгу
    // Обработка исключения: если мы добавляем существующую книгу
    // то мы получаем непроверяемое исключение InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("Такая книга уже существует в библиотеке.");
        } else {
            books.add(book);
        }

    }

    // искать книгу
    // Обработка исключения: если мы не можем найти книгу
    // то случится проверяемое исключение BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException{
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        throw new BookNotFoundException("Не нашли книгу по имени " + name);
    }

}
