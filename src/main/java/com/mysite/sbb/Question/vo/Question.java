package com.mysite.sbb.Question.vo;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
=======
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
import com.mysite.sbb.Answer.vo.Answer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
<<<<<<< HEAD
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
=======
>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
<<<<<<< HEAD
=======

>>>>>>> 3e6a9c7fc3922554322e263d994aa193ae4d452a
}
