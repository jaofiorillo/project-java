package com.fiorillo.project.api.modules.role.model;

import com.fiorillo.project.api.modules.role.enums.ERole;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ROLE")
public class Role {

    @Id
    @SequenceGenerator(name = "SEQ_ROLE", sequenceName = "SEQ_ROLE", allocationSize = 1)
    @GeneratedValue(generator = "SEQ_ROLE", strategy = GenerationType.AUTO)
    private Integer id;

    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private ERole name;
}
