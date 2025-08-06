package com.telious;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Buyer_Table")
@AllArgsConstructor
@NoArgsConstructor
public class BuyerEntity {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="Buyer_Id")
    public Long buyerId;
@Column(name="Buyer_name")
    public String name;
@Column(name="Buyer_gender")
    public String gender;
@Column(name="Buyer_phno")
    public Long phno;


    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }
}
