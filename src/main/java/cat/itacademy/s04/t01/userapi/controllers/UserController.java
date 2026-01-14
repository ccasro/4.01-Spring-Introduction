package cat.itacademy.s04.t01.userapi.controllers;

import cat.itacademy.s04.t01.userapi.dto.CreateUserRequest;
import cat.itacademy.s04.t01.userapi.exceptions.UserNotFoundException;
import cat.itacademy.s04.t01.userapi.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    private static List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getUsers() {
        return List.copyOf(users);
    }

    @PostMapping
    public User createUser(@RequestBody CreateUserRequest request){
        User newUser = User.create(request.name(), request.email());
        users.add(newUser);
        return newUser;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable UUID id) {
        return users.stream().filter(u -> u.id().equals(id)).findFirst()
                .orElseThrow(() -> new UserNotFoundException(id.toString()));
    }


}
