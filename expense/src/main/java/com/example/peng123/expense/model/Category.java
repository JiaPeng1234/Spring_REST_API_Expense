package com.example.peng123.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="category")
public class Category {

    @Id
    private Long Id;

    private String name;

//    @ManyToOne(cascade = CascadeType.PERSIST)
//    private User user;
}
