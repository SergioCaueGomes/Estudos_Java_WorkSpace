package br.com.dio.spring.springwebmvc2.service;

import br.com.dio.spring.springwebmvc2.exception.UserNotFoundException;
import br.com.dio.spring.springwebmvc2.model.User;
import br.com.dio.spring.springwebmvc2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> findAll() {
        return repository.findAll();
    }
    public User findById(final Long id) {
        final Optional<User> user = Optional.ofNullable(repository.findById(id));
        if(user.isPresent()) {
            return user.get();
        } else {
            throw new UserNotFoundException();
        }
    }
    public User save(User user) {
        return repository.save(user).getBody();
    }
    public User update(final Long id, final User dto) {
        final Optional<User> userEntity = Optional.ofNullable(repository.findById(id));
        final User user;

        if(userEntity.isPresent()) {
            user = userEntity.get();
        } else {
           throw new UserNotFoundException();
        }
        user.setName(dto.getName());
        user.setLastName(dto.getLastName());

        return repository.save(user).getBody();
    }
    public void delete(Long id) {
        final User user = findById(id);
        repository.delete(user, id);
    }
}
