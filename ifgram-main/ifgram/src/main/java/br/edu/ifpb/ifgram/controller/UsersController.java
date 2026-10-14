package br.edu.ifpb.ifgram.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("ARTHUR")
public class UsersController {

    @GetMapping
    public String getUser() {
        return "Olá, me chamo ARTHUR!";

    }

    @PostMapping
    public String postUser() {
        return "chamei o endpoint como um POST!";
    }

    @DeleteMapping
    public String deleteUser() {
        return "chamei o endpoint como um delete";
    }

    @PutMapping
    public String putUser() {
        return "chamei o endpoint como um put";
    }

    @PatchMapping
    public String patchUser(){
        return "chamei o endpoint como um patch";
    }
}