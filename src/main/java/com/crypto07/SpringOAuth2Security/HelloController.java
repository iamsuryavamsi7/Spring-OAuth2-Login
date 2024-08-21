package com.crypto07.SpringOAuth2Security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){

        return "You are visiting the private page";

    }

}
