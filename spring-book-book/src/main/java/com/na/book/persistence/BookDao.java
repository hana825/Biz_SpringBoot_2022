package com.na.book.persistence;

import com.na.book.model.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<BookVO, String> {



}
