package com.seid.spring.reactive.reactiveprogramming.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")
public class Department {
    @Id
    private Integer id;
    private String name;
    @Column(name="user_id")
    private Integer userId;
    private String loc;
}
