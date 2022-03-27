package com.ambrish.multimodule.service.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Data
public class Book {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.AUTO) // sequence
    int bookId;

    @Column (length = 3)
    @NotNull

    @Length(min = 2,max = 50,message = "Invalid book name length")

            //      @Min(value = 2,message = "Book name is too short")
        //    @Max(value = 50, message = "Book Name is too large")
    String bookName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "book_author_map",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_code"))
    @EqualsAndHashCode.Exclude
    @ToString.Exclude

    Set<Author> authors =  new HashSet<>();

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
