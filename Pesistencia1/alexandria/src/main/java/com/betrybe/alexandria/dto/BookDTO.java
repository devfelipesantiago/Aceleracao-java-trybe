package com.betrybe.alexandria.dto;

import com.betrybe.alexandria.model.entity.Book;

public record BookDTO(Long id, String title, String genre) {

  public Book toBook() {
    return new Book(id, title, genre);
  }

}