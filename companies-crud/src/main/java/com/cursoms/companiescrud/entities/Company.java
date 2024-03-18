package com.cursoms.companiescrud.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
//@Table(name="")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String founder;
    private String logo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate foundationDate;
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REMOVE})
    //En el JoinColumn va el nombre de la Foreign Key del Many en la bd y la referencia es la variable id en la clase Many
    @JoinColumn(name = "id_company", referencedColumnName = "id")
    private List<WebSite> webSites;

}
