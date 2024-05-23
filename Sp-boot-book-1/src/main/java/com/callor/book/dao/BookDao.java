package com.callor.book.dao;

import com.callor.book.models.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;

// 저거 상속받으면 알아서 Dao 인지 앎
public interface BookDao extends JpaRepository<BookVO, String> {



}
