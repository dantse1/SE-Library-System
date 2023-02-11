package edu.miu.cs.cs425.fairfieldlibrarywebapp.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="bookcopies")
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookCopyId;
    private Integer totalNumber = 0;
    private Integer numberAvailable = 0;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
