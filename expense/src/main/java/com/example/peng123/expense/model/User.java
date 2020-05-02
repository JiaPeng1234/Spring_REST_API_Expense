package com.example.peng123.expense.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="user")
public class User {

    @Id
    private Long id;

    private String name;

    private String email;

//    @OneToMany
//    private Set<Category> category;

}
