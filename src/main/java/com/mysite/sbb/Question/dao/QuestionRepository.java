package com.mysite.sbb.Question.dao;

import com.mysite.sbb.Question.vo.Question;
import org.springframework.data.jpa.repository.JpaRepository;

<<<<<<< HEAD
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Optional<Question> findById (Integer id);
=======
public interface QuestionRepository extends JpaRepository<Question, Long> {
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
}
