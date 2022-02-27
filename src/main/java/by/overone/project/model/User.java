package by.overone.project.model;

import lombok.*;
import org.springframework.context.annotation.Scope;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column
    private String name;

    @Column
    private String secondName;

    @Column
    private String age;

}