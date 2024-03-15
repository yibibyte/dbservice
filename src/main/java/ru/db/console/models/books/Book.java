package ru.db.console.models.books;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        // Это число не является важным само по себе, и его можно заменить на любое другое целочисленное значение без ущерба для функциональности.
        // Предотвращение нулевого хеш-кода и различие в вычисленных хеш-кодах повышает вероятность получения уникального хеш-кода для каждого объекта
        int result = 17;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        // Эта строка проверяет, является ли ссылка this равной ссылке o.
        // Если это так, то объект сравнивается сам с собой,
        // и метод возвращает true, потому что объект всегда равен самому себе.
        if (this == o) return true;

        //Эта строка проверяет, является ли объект o нулевым или относится к другому классу,
        // чем текущий объект. Если это так, метод возвращает false,
        // потому что объекты разных классов не могут быть равны.
        if (o == null || getClass() != o.getClass()) return false;

        // Создаем временную переменную book и приводим объект o к типу Book,
        // потому что метод equals() ожидает объект типа Book для сравнения.
        Book book = (Book) o;

        // Это выражение сравнивает каждое поле объекта текущего
        // экземпляра (this) с соответствующим полем объекта book,
        // переданного в качестве аргумента метода equals().
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
