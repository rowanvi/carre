/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.service;

import com.carre.dao.UsersDAO;
import com.carre.model.Users;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rowan
 */
@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    private UsersDAO usersDAO;

    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @Override
    public void addUsers(Users p) {
        this.usersDAO.addUsers(p);
    }
    
    
    @Override
    public void updateUsers(Users p) {
        this.usersDAO.updateUsers(p);
    }

    @Override
    public List<Users> listUsers() {
        return this.usersDAO.listUsers();
    }
    
    @Override
    public Users getUsersById(int id) {
        return this.usersDAO.getUsersById(id);
    }
    
        @Override
    public boolean userValidate(String username, String password) {
        return this.usersDAO.userValidate(username, password);
    }
}
