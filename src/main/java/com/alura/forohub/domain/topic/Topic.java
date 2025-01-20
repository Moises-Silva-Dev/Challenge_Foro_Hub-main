package com.alura.forohub.domain.topic;

import com.alura.forohub.domain.topic.dto.DataUpdateTopic;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Topic")
@Table(name = "topics")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String message;

    private String timestamp;

    private boolean status;

    private String course;

    private String author;

    private boolean deleted;

    private String last_update;

    public void deleteTopic(String timestamp){
        this.setDeleted(true);
        this.setLast_update(timestamp);
    }

    public void updateTopic(DataUpdateTopic dataUpdateTopic, String timestamp){

        this.setTitle(dataUpdateTopic.title());
        this.setCourse(dataUpdateTopic.course());
        this.setMessage(dataUpdateTopic.message());
        this.setStatus(dataUpdateTopic.status());
        this.setLast_update(timestamp);



    }


//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
//    private User author;
//
//    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Answer> answers;
//
//    public void addAnswer(Answer newAnswer){
//        this.answers.add(newAnswer);
//
//    }


}
