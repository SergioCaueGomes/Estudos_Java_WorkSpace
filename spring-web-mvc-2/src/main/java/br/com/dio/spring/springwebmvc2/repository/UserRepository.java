package br.com.dio.spring.springwebmvc2.repository;

import br.com.dio.spring.springwebmvc2.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> user;

    public UserRepository() {
        user = new ArrayList<>();
        user.add(new User("Sergio", "Games"));
    }
    public List<User> getAllUser() {
        return this.user;
    }
    public void add(final User user) {
        this.user.add(user);
    }

    public List<User> findAll() {
        return this.user;
    }

    public User findById(Long id) {
        return this.user.get(Math.toIntExact(id));
    }

    public ResponseEntity<User> save(User user) {
        return (ResponseEntity<User>) this.user;
    }

    public void delete(User user, Long id) {
        user.delete(findById(id));
    }
}
