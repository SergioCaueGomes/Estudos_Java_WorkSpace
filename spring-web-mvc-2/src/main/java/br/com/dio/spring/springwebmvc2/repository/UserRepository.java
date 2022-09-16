package br.com.dio.spring.springwebmvc2.repository;

import br.com.dio.spring.springwebmvc2.model.User;
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
}
