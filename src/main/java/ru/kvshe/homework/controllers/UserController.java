package ru.kvshe.homework.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kvshe.homework.model.User;
import ru.kvshe.homework.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public String users(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users/user-list";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id,
                       Model model) {
        model.addAttribute("user", userService.findById(id));

        return "users/show";
    }

    // create user
    @GetMapping("/new")
    public String userCreateForm(User user) {
        return "users/new";
    }

    @PostMapping("/new")
    public String createUser(User user) {
        userService.save(user);
        return "redirect:/users";
    }

    // update user
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable("id") int id,
                               Model model) {
        model.addAttribute("user", userService.findById(id));
        return "users/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user,
                         @PathVariable("id") int id) {
        userService.update(id, user);
        return "redirect:/users/{id}";
    }

    // delete user
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
