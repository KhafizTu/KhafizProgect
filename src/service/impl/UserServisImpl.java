package service.impl;

import model.Book;
import model.User;
import service.UserService;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;

public class UserServisImpl implements UserService {
    List<User> users = new ArrayList<>();
    @Override
    public String createUser(List<User> users) {
        return users.toString();
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }

    @Override
    public Constable findUserById(Long id) {
        return id;
    }

    @Override
    public String removeUserByName(String name) {
        return name;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return name;
    }
}
