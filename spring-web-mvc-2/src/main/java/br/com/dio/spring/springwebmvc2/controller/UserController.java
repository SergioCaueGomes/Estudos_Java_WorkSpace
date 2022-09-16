package br.com.dio.spring.springwebmvc2.controller;

import br.com.dio.spring.springwebmvc2.model.User;
import br.com.dio.spring.springwebmvc2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/user")
    public ModelAndView User(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("allUser", repository.getAllUser() );
        return modelAndView;
    }

    @GetMapping("/new-user")
    public ModelAndView newUser() {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-user");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/user")
    public String createUser(@Valid @ModelAttribute User user, BindingResult result, RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            return "new-user";
        }
        repository.add(user);
        redirectAttributes.addFlashAttribute("message", "Registered User!");
        return "redirect:user";
    }
}
