package com.betrybe.alexandria.model.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.betrybe.alexandria.model.entity.Author;

@Repository
public class AuthorRepository extends JpaRepository<Author, Long> {

}
