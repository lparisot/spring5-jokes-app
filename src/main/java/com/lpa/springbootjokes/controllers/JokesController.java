package com.lpa.springbootjokes.controllers;

import com.lpa.springbootjokes.repositories.JokeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private JokeRepository jokeRepository;

    public JokesController(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @RequestMapping("/")
    public String getJokes(Model model) {
        model.addAttribute("joke", jokeRepository.findAll());

        return "chucknorris";
    }
}
