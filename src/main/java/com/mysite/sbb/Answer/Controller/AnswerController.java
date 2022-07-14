package com.mysite.sbb.Answer.Controller;

import com.mysite.sbb.Answer.dao.AnswerRepository;
import com.mysite.sbb.Answer.vo.Answer;
<<<<<<< HEAD
import lombok.AllArgsConstructor;
=======
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("answer")
<<<<<<< HEAD
@AllArgsConstructor
public class AnswerController {
    private AnswerRepository answerRepository;

    @RequestMapping("list")
    @ResponseBody
    public List<Answer> showAnswers(){
        return answerRepository.findAll();
    }
}
=======
public class AnswerController {

    private AnswerRepository answerRepository;

    public AnswerController(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    @RequestMapping("list")
    @ResponseBody
    public List<Answer> showAnswer() {
        return answerRepository.findAll();
    }
}
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
