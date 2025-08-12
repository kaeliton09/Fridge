package dev.test.Fridge.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity //indicacao de tabela para banco de dados
@Table(name = "food_table")//dando nome para tabela
@Data//usando lombok para criar getters e setters
@AllArgsConstructor//usando lombok para criar construtor com todos os atributos
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate expirationDate;
    private Integer quantity;

}
