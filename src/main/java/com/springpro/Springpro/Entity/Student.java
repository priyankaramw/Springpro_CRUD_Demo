package com.springpro.Springpro.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Student_db")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "ST_MARK")
    private int mark;

    @Column(name = "NAME")
    private String name;

}
