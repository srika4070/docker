package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class IndexController{
static String randomWebAppID= new String(new Random().toString());
@GetMapping("/")
@ResponseBody
public String index() {
return "[WEBAPPID "+ randomWebAppID + "] Hello World from Spring";
}
}
