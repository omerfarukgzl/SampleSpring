package com.omer.samplespring.controller;

import com.omer.samplespring.model.Order;
import com.omer.samplespring.request.UserRequest;
import com.omer.samplespring.response.OrderResponse;
import com.omer.samplespring.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("v1/user/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("getUserOrder")
    public ResponseEntity<OrderResponse> getUSerOrder(@RequestBody UserRequest userRequest){
        return ResponseEntity.ok(userService.getUserOrder(userRequest));
    }
}
