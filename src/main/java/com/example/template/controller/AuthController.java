package com.example.template.controller;

import com.example.template.model.db.master.Auth;
import com.example.template.repositories.AuthRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    AuthRepository authRepository;
    @GetMapping(value = "/list")
    public List<Auth> listAuth(HttpSession httpSession){
        return Lists.newArrayList(authRepository.findAll());
    }
    /*
    @GetMapping(value = "/list")
    public List<Auth> listAuth(HttpSession httpSession){
        AuthDao dao =  new AuthDao(masterSessionFactory);
        return dao.getAll();
    }
    @PostMapping(value = "/register")
    public void registerAuth(HttpSession httpSession, Auth auth)  {
        AuthDao dao =  new AuthDao(masterSessionFactory);
        dao.insertUpdateTransactional(auth);
    }
    */
}
