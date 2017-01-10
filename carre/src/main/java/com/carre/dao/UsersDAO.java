/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.dao;

import com.carre.model.Users;
import java.util.List;

/**
 *
 * @author Rowan
 */
public interface UsersDAO {
        public void addUsers(Users p);

    public void updateUsers(Users p);

    public List<Users> listUsers();

    public Users getUsersById(int id);
    
    public boolean userValidate(String username, String password);
}
