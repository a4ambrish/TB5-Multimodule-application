package com.ambrish.multimodule.service.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="author_table")
@Data
public class Author {
    @Id
            @Column(name="author_code")
    @GeneratedValue (strategy = GenerationType.AUTO) // sequence
    int authorId;
    @Column
    String authorName;

    @Column
    String authorAddress;

    @Column
    String authorAddressPincode;
    @Column
    String nationality;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "authors") /// this will be in now-owner table
    @EqualsAndHashCode.Exclude
    @ToString.Exclude

    private Set<Book> books = new HashSet<>();

    public Set<Book> getBooks() {
        return null;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
