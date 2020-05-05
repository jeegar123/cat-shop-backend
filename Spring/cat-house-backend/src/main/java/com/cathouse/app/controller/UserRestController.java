package com.cathouse.app.controller;

import com.cathouse.app.model.User;
import com.cathouse.app.repo.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200",maxAge = 1000)
public class UserRestController {

    private final UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @GetMapping
//    public User checkUser(@RequestBody User user) {
//        User checkUser = userRepository.findByUserName(user.getUserName());
//        if (checkUser.getPassword().equals(user.getPassword())) {
//            return checkUser;
//        } else {
//            return null;
//        }
//    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/email={email}")
    public User getOneUser(@PathVariable String email) {
        /*
         *  get user by Email
         */
        return userRepository.findByUserName(email);
    }   

    @GetMapping(value = "/id={id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserById(@PathVariable int id) {
        if (userRepository.findById(id).isPresent())
            return userRepository.findById(id).get();
        return null;
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteUserById(@PathVariable int id) {
        /*
         *   delete by id
         * */
        try {
            userRepository.deleteById(id);
        } catch (Exception exception) {
            return HttpStatus.NOT_FOUND;
        }
        return HttpStatus.OK;
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        /*
        update user
    */
        return userRepository.save(user);
    }
}
