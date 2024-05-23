package com.callor.book.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
// 테이블을 말함
@Entity
@Table(name = "tbl_books") // table 이름 바꿔서 생성하기
public class BookVO {


    @Id // primary key
    @Column(name = "isbn", length = 13) // column 이름 다른거 쓰고 싶을 때, VARCHAR(13)
    private String isbn;

    private String title;
    private String link;
    private String image;
    private String author;
    private String discount;
    private String publisher;
    private String pubdate;
    private String description;

}
