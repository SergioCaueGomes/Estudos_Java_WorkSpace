package br.com.dio.spring.springwebmvc2.rest;

import br.com.dio.spring.springwebmvc2.model.User;
import br.com.dio.spring.springwebmvc2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserService service;

    @GetMapping("/api/user")
    public List<User> getAllUser() {
        return service.findAll();
    }

    @GetMapping("/api/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        final User user = service.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/api/user")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@Valid @RequestBody User user) {
        return service.save(user);
    }

    @PutMapping("/api/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @Valid @RequestBody User dto) {
        final User user = service.update(id, dto);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/api/user/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete (@PathVariable("id") Long id) {
       service.delete(id);
    }
}
