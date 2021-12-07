package com.example.astroapp.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "object", schema = "public")
public class SpaceObject {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "object_generator")
    @SequenceGenerator(name = "object_generator", sequenceName = "object_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String catalog;
    @Column(name = "catalog_id")
    private String catalogID;
    @Column(name = "catalog_dec")
    private Float catalogDec;
    @Column(name = "catalog_rec")
    private Float catalogRec;
    @Column(name = "catalog_mag")
    private Float catalogMag;
    @OneToMany(mappedBy = "object")
    private List<Flux> fluxes;

    public SpaceObject() {
    }

    public SpaceObject(String name, String catalog, String catalogID,
                       Float catalogDec, Float catalogRec, float catalogMag) {
        this.name = name;
        this.catalog = catalog;
        this.catalogID = catalogID;
        this.catalogRec = catalogRec;
        this.catalogDec = catalogDec;
        this.catalogMag = catalogMag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatalogID() {
        return catalogID;
    }

    public void setCatalogID(String catalogID) {
        this.catalogID = catalogID;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Float getCatalogRec() {
        return catalogRec;
    }

    public void setCatalogRec(Float catalogRec) {
        this.catalogRec = catalogRec;
    }

    public Float getCatalogDec() {
        return catalogDec;
    }

    public void setCatalogDec(Float catalogDec) {
        this.catalogDec = catalogDec;
    }

    public float getCatalogMag() {
        return catalogMag;
    }

    public void setCatalogMag(float catalogMag) {
        this.catalogMag = catalogMag;
    }
}
