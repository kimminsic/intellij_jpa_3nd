package com.mysite.sbb.Answer.vo;

import com.mysite.sbb.Question.vo.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
<<<<<<< HEAD

=======
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
}
