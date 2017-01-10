/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Rowan
 */
@Entity
@Table(name="USERS")
public class Users {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
        private String username;
        
        private String password;
        
        private int rank;

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getRank() {
        return rank;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setUsername(String username) {
        this.username = username;
    }
        
    
    
}
