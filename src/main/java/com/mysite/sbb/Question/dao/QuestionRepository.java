package com.mysite.sbb.Question.dao;

import com.mysite.sbb.Question.vo.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
