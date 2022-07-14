package com.mysite.sbb.Answer.Controller;

import com.mysite.sbb.Answer.dao.AnswerRepository;
import com.mysite.sbb.Answer.vo.Answer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("answer")
@AllArgsConstructor
public class AnswerController {
    private AnswerRepository answerRepository;

    @RequestMapping("list")
    @ResponseBody
    public List<Answer> showAnswers(){
        return answerRepository.findAll();
    }
}
