package com.mysite.sbb.Answer.Service;

import com.mysite.sbb.Answer.dao.AnswerRepository;
import com.mysite.sbb.Answer.vo.Answer;
import com.mysite.sbb.Question.vo.Question;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;
    AnswerService(AnswerRepository answerRepository){
        this.answerRepository = answerRepository;
    }

    public void create(Question question, String content){
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        answerRepository.save(answer);
    }
}
