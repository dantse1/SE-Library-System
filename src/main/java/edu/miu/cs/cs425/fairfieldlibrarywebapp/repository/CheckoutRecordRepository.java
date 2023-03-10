package edu.miu.cs.cs425.fairfieldlibrarywebapp.repository;

import java.util.List;

import edu.miu.cs.cs425.fairfieldlibrarywebapp.model.CheckoutRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRecordRepository extends JpaRepository<CheckoutRecord, Integer> {

    @Query("SELECT c FROM CheckoutRecord c WHERE c.book.isbn = ?1 AND lower(c.isCheckedIn) = 'no'")
    List<CheckoutRecord> findCheckoutByIsbn(String isbn);

    @Query("SELECT c FROM CheckoutRecord c WHERE lower(c.isCheckedIn) = 'no'")
    Page<CheckoutRecord> findAllCheckouts(PageRequest pageRequest);

    @Query("SELECT c FROM CheckoutRecord c WHERE lower(c.isCheckedIn) = 'no'")
    List<CheckoutRecord> findAllCheckouts();

    @Query("SELECT c FROM CheckoutRecord c WHERE c.libraryMember.memberNumber = ?1 AND lower(c.isCheckedIn) = 'no'")
    List<CheckoutRecord> findCheckoutByMemberNumber(String memberNumber);

    @Query("SELECT c FROM CheckoutRecord c WHERE lower(c.isCheckedIn) = 'yes'")
    Page<CheckoutRecord> findAllCheckins(PageRequest pageRequest);

    @Query("SELECT c FROM CheckoutRecord c WHERE lower(c.isCheckedIn) = 'no' AND (c.book.isbn LIKE %:isbn% OR c.book.title LIKE %:title% OR c.libraryMember.memberNumber LIKE %:memberNumber% OR c.libraryMember.firstname LIKE %:firstname% OR c.libraryMember.lastname LIKE %:lastname%)")
    Page<CheckoutRecord> searchCheckoutsByIsbnContainingOrBookTitleContaininOrMemberNumberContainingOrMemberNameContaining(
            String isbn, String title, String memberNumber, String firstname, String lastname, PageRequest pageRequest);

    @Query("SELECT c FROM CheckoutRecord c WHERE lower(c.isCheckedIn) = 'yes' AND (c.book.isbn LIKE %:isbn% OR c.book.title LIKE %:title% OR c.libraryMember.memberNumber LIKE %:memberNumber% OR c.libraryMember.firstname LIKE %:firstname% OR c.libraryMember.lastname LIKE %:lastname%)")
    Page<CheckoutRecord> searchCheckinsByIsbnContainingOrBookTitleContainingOrMemberNumberContainingOrMemberNameContaining(
            String isbn, String title, String memberNumber, String firstname, String lastname, PageRequest pageRequest);
}
