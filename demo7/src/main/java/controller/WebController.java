package controller;

import model.Hello;
import model.User;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    @MessageMapping("/hello")
    @SendTo("/topic/hi")
    public Hello greeting(User user) throws Exception {
        return new Hello("Hi, " + user.getName() + "!");
    }
}
