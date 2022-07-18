package com.mysite.sbb.Question.Controller;

import com.mysite.sbb.Answer.AnswerForm;
import com.mysite.sbb.Question.QuestionForm;
import com.mysite.sbb.Question.Service.QuestionService;
import com.mysite.sbb.Question.vo.Question;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("question")
public class QuestionController {

    private final QuestionService questionService;

    QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    @RequestMapping("list")
    public String showQuestion(Model model , @RequestParam(value="page",defaultValue = "0") int page) {
        Page<Question> paging = this.questionService.getList(page);
        model.addAttribute("paging", paging);
        return "question_list";
    }

    @RequestMapping("detail/{id}")
    public String showQuestions(Model model, @PathVariable("id") Integer id, AnswerForm answerForm){
        Question question = this.questionService.getQuestion(id);
        model.addAttribute("question",question);
        return "question_detail";
    }

    @GetMapping("create")
    public String getQuestionCreate(QuestionForm questionForm){
        return "question_form";
    }

    @PostMapping("create")
    public String setQuestionCreate(@Valid QuestionForm questionForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "question_form";
        }
        this.questionService.create(questionForm.getSubject(),questionForm.getContent());
        return "redirect:/question/list";
    }
}
