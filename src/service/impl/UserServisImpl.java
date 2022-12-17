package service.impl;

import enums.Gender;
import model.Book;
import model.User;
import service.UserService;

import java.lang.constant.Constable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServisImpl implements UserService {
    List<User> users = new ArrayList<>();
    @Override
    public String createUser(List<User> users) {
        this.users.addAll(users);
        System.out.println();
        return "YES";
    }

    @Override
    public List<User> findAllUsers() {
        return this.users;
    }

    @Override
    public User findUserById(Long id) {
        for (User user:this.users) {
            if (id==user.getId()){
                System.out.println();
                return user;
            }

        }
        return null;
    }

    @Override
    public String removeUserByName(String name) {
        for (User user:this.users) {
            if (user.getName().equalsIgnoreCase(name)){
                this.users.remove(user);
                System.out.println();
            }return "YES";

        }
        return "No";
    }

    @Override
    public void updateUser(Long id) throws IllegalStateException{
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        if (id ==1 ){
            System.out.println("Name");
            String name = scanner.nextLine();
            System.out.println("Id:");
            Long  l = scanner.nextLong();
            for (User user:this.users) {
                if (user.getName().equalsIgnoreCase(name)){
                    user.getId();
                }
            }
        }else if (id==2){
            System.out.println("Old Name");
            String name= scanner.nextLine();
            System.out.println("New Name");
            String newName = scanner.nextLine();
            for (User user: this.users) {
                if (user.getName().equalsIgnoreCase(name)){
                    user.setName(newName);
                }
            }
        }else if (id==3){
            System.out.println("Name");
            String name= scanner.nextLine();
            System.out.println("SurName");
            String surName = scanner.nextLine();
            for (User user: this.users) {
                if (user.getName().equalsIgnoreCase(name)){
                    user.setSurname(surName);
                }
            }
    }else if (id==4){
            System.out.println("Name");
            String name= scanner.nextLine();
            System.out.println("Emaile:");
            String email = scanner.nextLine();
            for (User user: this.users) {
                if (user.getName().equalsIgnoreCase(name)) {
                    user.setEmail(email);
                }
            }
        }else if (id==5){
            System.out.println("Name");
            String name= scanner.nextLine();
            System.out.println("Phone number");
            String number = scanner.nextLine();
            for (User user: this.users) {
                if (user.getName().equalsIgnoreCase(name)){
                    user.setPhoneNumber(number);
                }
            }
        }else if (id==6){
            System.out.println("Name");
            String name= scanner.nextLine();
            System.out.println("Gender");
            String gender = scanner.nextLine();
            for (User user: this.users) {
                if (user.getName().equalsIgnoreCase(name)){
                    user.setGender(Gender.valueOf(gender));
                }
            }
        }else if (id==7){
            System.out.println("Name");
            String name= scanner.nextLine();
            System.out.println("New Money");
            int money = scanner.nextInt();
            BigDecimal bigDecimal = new BigDecimal(money);
            for (User user: this.users) {
                if (user.getName().equalsIgnoreCase(name)){
                    user.setMoney(bigDecimal);
                }
            }
        }else if (id==8){
            System.out.println("Name");
            String name= scanner.nextLine();
            System.out.println("Book Name:");
            String bookName = scanner.nextLine();
            for (User user: this.users) {
                if (user.getName().equalsIgnoreCase(name)){
                    for (Book book:user.getBooks()) {
                        book.setName(bookName);
                    }
                }
            }
        }else {
            System.out.println("Error!");
        }
    }

    @Override
    public void groupUsersByGender() {
        List<User> userFemale = this.users.stream().filter(user -> user.getGender().equals(Gender.FEMALE)).toList();
        System.out.println();
        System.out.println("Female " + userFemale);
        List<User> userMale = this.users.stream().filter(user -> user.getGender().equals(Gender.MALE)).toList();
        System.out.println();
        System.out.println("Male " + userMale);
    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        Scanner scanner=new Scanner(System.in);
        String name2 = scanner.nextLine();
        for (User user:this.users) {
            if (user.getName().equalsIgnoreCase(name2));
            for (Book book:books) {
                if (book.getName().equalsIgnoreCase(name2)){
                    List<Book> books1 =new ArrayList<>();
                    books1.add(book);
                    user.getBooks().addAll(books1);
                    System.out.println();
                    return "True: " + user;
                }

            }
        }
        return null;
    }
}
