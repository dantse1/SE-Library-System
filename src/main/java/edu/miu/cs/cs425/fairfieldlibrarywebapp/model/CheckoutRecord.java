
package edu.miu.cs.cs425.fairfieldlibrarywebapp.model;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Table(name="checkout_records")
public class CheckoutRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer checkoutRecordId;

    @Column(nullable = false)
    private LocalDate checkoutDate;
    @Column(nullable = false)
    private LocalDate dueDate;
    private String isCheckedIn;
    private LocalDate checkinDate;
    private Double overdueFee;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToOne
    @JoinColumn(name = "library_member_id")
    private LibraryMember libraryMember;

    public CheckoutRecord(Book book, LibraryMember libraryMember) {
        LocalDate today = LocalDate.now();
        this.checkoutDate = today;

        LocalDate due = today.plusDays(libraryMember.getLibraryMemberType().getMaxLengthBorrowBook());
        this.dueDate = due;
        this.book = book;
        this.libraryMember = libraryMember;
        this.isCheckedIn = "No";
    }
}
