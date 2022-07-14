package com.mysite.sbb.Question.Service;

import com.mysite.sbb.Question.dao.QuestionRepository;
import com.mysite.sbb.Question.vo.Question;
import com.mysite.sbb.Util.DataNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getList() { return questionRepository.findAll();    }

    public Question getQuestion(Integer id){
        Optional<Question> question = this.questionRepository.findById(id);
        if(question.isPresent()){
            return question.get();
        }
        else{
            throw new DataNotFoundException("question not found");
        }
    }
}
