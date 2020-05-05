package com.cathouse.app.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Cats {
    private int catId;
    private String catName;
    private String catGender;
    private String catBreed;
    private int catWeight;
    private int catAge;
    private String catDetails;
    private String catColor;
    private byte[] catPhoto;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "cat_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    @Basic
    @Column(name = "cat_name", nullable = false, length = 30)
    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Basic
    @Column(name = "cat_gender", nullable = false, length = 10)
    public String getCatGender() {
        return catGender;
    }

    public void setCatGender(String catGender) {
        this.catGender = catGender;
    }

    @Basic
    @Column(name = "cat_breed", nullable = false, length = 50)
    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    @Basic
    @Column(name = "cat_weight", nullable = false)
    public int getCatWeight() {
        return catWeight;
    }

    public void setCatWeight(int catWeight) {
        this.catWeight = catWeight;
    }

    @Basic
    @Column(name = "cat_age", nullable = false)
    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    @Basic
    @Column(name = "cat_details", nullable = false, length = -1)
    public String getCatDetails() {
        return catDetails;
    }

    public void setCatDetails(String catDetails) {
        this.catDetails = catDetails;
    }

    @Basic
    @Column(name = "cat_color", nullable = false, length = 10)
    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    @Basic
    @Column(name = "cat_photo", nullable = true)
    public byte[] getCatPhoto() {
        return catPhoto;
    }

    public void setCatPhoto(byte[] catPhoto) {
        this.catPhoto = catPhoto;
    }

    @Basic
    @Column(name = "created_date", nullable = true)
    @CreationTimestamp
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "updated_date", nullable = true)
    @UpdateTimestamp
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return catId == cats.catId &&
                catWeight == cats.catWeight &&
                catAge == cats.catAge &&
                Objects.equals(catName, cats.catName) &&
                Objects.equals(catGender, cats.catGender) &&
                Objects.equals(catBreed, cats.catBreed) &&
                Objects.equals(catDetails, cats.catDetails) &&
                Objects.equals(catColor, cats.catColor) &&
                Arrays.equals(catPhoto, cats.catPhoto) &&
                Objects.equals(createdDate, cats.createdDate) &&
                Objects.equals(updatedDate, cats.updatedDate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(catId, catName, catGender, catBreed, catWeight, catAge, catDetails, catColor, createdDate, updatedDate);
        result = 31 * result + Arrays.hashCode(catPhoto);
        return result;
    }
}
