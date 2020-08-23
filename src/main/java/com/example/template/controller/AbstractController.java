package com.example.template.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractController {
    @Autowired
    SessionFactory masterSessionFactory;
}
