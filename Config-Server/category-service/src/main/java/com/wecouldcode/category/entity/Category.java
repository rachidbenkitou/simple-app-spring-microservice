package com.wecouldcode.category.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;
    @Column(unique = true)
    private String categoryName;

}
