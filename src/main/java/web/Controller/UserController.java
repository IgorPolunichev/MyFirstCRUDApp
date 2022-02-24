package web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.Model.User;
import web.Service.UserServ;

@Controller
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserServ userServ;

    @GetMapping()
    public String showUsers(ModelMap model) {
        model.addAttribute("users", userServ.listUser());
        return "Users";
    }

    @GetMapping(value = "/addUser")
    public String addUser(@ModelAttribute("newUser") User user) {
        return "newUser";
    }

    @PostMapping
    public String createUser(@ModelAttribute("newUser") User user) {
        userServ.addUser(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "/remove/{id}")
    public String deleteUser(@PathVariable(name = "id") int id) {
        userServ.removeUser(id);
        return "redirect:/users ";
    }


    @GetMapping(value = "/edit/{id}")
    public String editUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userServ.getUserById(id));
        return "editUser";
    }
    @PostMapping("/edit/{id}")
    public String update(@ModelAttribute ("user") User user, @PathVariable("id") int id){
        userServ.editUser(user);
        return "redirect:/users ";
    }


}
