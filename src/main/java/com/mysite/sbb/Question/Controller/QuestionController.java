package com.mysite.sbb.Question.Controller;

<<<<<<< HEAD
import com.mysite.sbb.Question.Service.QuestionService;
import com.mysite.sbb.Question.vo.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

=======
import com.mysite.sbb.Question.dao.QuestionRepository;
import com.mysite.sbb.Question.vo.Question;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
import java.util.List;

@Controller
@RequestMapping("question")
<<<<<<< HEAD

public class QuestionController {

    private final QuestionService questionService;

    QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    @RequestMapping("list")
    public String showQuestions(Model model){
        List<Question> questionList = questionService.getList();
        model.addAttribute("questionList",questionList);
        return "question_list";
    }

    @RequestMapping("detail/{id}")
    public String showQuestion(Model model, @PathVariable("id") Integer id){
        Question question = this.questionService.getQuestion(id);
        model.addAttribute("question",question);
        return "question_detail";
    }

=======
@AllArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepository;

    @RequestMapping("list")
    public String showQuestion(Model model){
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList",questionList);
        return "question_list";
    }
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
}
