package com.ust.exams.Repository;

import com.ust.exams.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    Book findBybid(int bid);
}
