package pl.presz.expenseManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.presz.expenseManager.model.User;
import pl.presz.expenseManager.repositorie.UserRepository;

import java.util.List;
import java.util.Optional;

//@RestController
public class UserController {

//    @Autowired
//    private UserRepository repository;
//
//    @RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
//    @GetMapping("/dupa")
//    public List<User> testList(){
//        List<User> list = repository.findAll();
//        return list;
//    }
//
//    @GetMapping("/chujas")
//    public User testOneUser(){
//
//        Optional<User> byId = repository.findById(Long.valueOf(10l));
//        return byId.get();
//    }
}
