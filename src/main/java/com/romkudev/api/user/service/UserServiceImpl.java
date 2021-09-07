package com.romkudev.api.user.service;

import com.romkudev.api.user.domain.User;
import com.romkudev.api.user.repository.UserRepository;
import com.romkudev.api.util.Proxy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl extends Proxy implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
//        int result = intMax.apply(5, 7); // Proxy를 상속받음
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean existsById(Long id) {
        return userRepository.existsById(id);
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
