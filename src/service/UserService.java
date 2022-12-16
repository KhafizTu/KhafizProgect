package service;

import model.Book;
import model.User;

import java.lang.constant.Constable;
import java.util.List;

public interface UserService{

    String createUser(List<User> users);

    List<User> findAllUsers();

    Constable findUserById(Long id);

    String removeUserByName(String name);

    void updateUser(Long id);//kaisil pole ozgorsun dep surap, oshogo jarasha ozgortuu

    void groupUsersByGender();

    String buyBooks(String name, List<Book>books);


}
