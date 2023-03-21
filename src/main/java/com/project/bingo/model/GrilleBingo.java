package com.project.bingo.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GrilleBingo {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @ElementCollection
    @CollectionTable(name = "grille_elements", joinColumns = @JoinColumn(name = "grille_id"))
    @Column(name = "element")
    private List<String> elements;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public GrilleBingo(List<String> elements, Person person) {
        if (elements == null || elements.size() != 24) {
            throw new IllegalArgumentException("La liste doit contenir exactement 24 éléments.");
        }
        this.elements = elements;
        this.person = person;
    }
}
