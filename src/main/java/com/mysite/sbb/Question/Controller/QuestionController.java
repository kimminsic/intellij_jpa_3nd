package com.mysite.sbb.Question.Controller;

import com.mysite.sbb.Question.Service.QuestionService;
import com.mysite.sbb.Question.vo.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("question")

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

}
