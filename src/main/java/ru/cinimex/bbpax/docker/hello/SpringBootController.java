package ru.cinimex.bbpax.docker.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class SpringBootController {

    @RequestMapping(path = "/hello", method= RequestMethod.GET)
    public @ResponseBody
    String home() {
        return "Hello World from *.openshift.vm.cmx.ru. \n" +
                "made with Jenkins";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootController.class, args);
//        ApplicationRunner runner;
//        SpringApplication app = new SpringApplication(SpringBootController.class);
//        ApplicationArguments arguments;
    }
}
