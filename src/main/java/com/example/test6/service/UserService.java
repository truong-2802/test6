package com.example.test6.service;

import com.example.test6.entity.User;
import com.example.test6.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        try {
            userRepository.save(user);
            logger.info("User {} saved successfully.", user.getUsername());
        } catch (Exception e) {
            logger.error("Error saving user {}: {}", user.getUsername(), e.getMessage());
            throw e; // hoặc xử lý lỗi theo cách bạn muốn
        }
    }

    public User findByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            logger.warn("User {} not found.", username);
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        logger.info("User {} found successfully.", username);
        return user;
    }

    // Thêm các phương thức khác nếu cần, ví dụ: update, delete
}
