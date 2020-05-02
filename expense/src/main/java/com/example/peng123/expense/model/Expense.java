package com.example.peng123.expense.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="expense")
public class Expense {

    @Id
    private Long Id;

    private Instant expensedate;

    private String descript;

//    ID(PK), Date, Description, UserId, CategoryId
//    1000, 6/16/2019, "Visiting NY", 1, 10

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

}
