package com.omer.samplespring.service;

import com.omer.samplespring.repository.UserRepository;
import com.omer.samplespring.request.UserRequest;
import com.omer.samplespring.response.OrderResponse;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public OrderResponse getUserOrder(UserRequest userRequest) {

        return new OrderResponse();
    }
}
