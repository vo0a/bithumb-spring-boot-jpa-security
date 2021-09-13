package com.romkudev.api.user.controller;

import com.romkudev.api.user.domain.User;
import com.romkudev.api.user.domain.UserDto;
import com.romkudev.api.user.service.UserServiceImpl;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "false")
@Api(tags = "users")
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;
    private final ModelMapper modelMapper;

    @PostMapping("/signup")
    @ApiOperation(value = "${UserController.signup}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "something wrong"),
            @ApiResponse(code = 403, message = "승인거절"),
            @ApiResponse(code = 422, message = "중복된 username")})
    public ResponseEntity<String> signup(@ApiParam("Signup User")
                                         @RequestBody UserDto userDto) {
        System.out.println("################## MMMMMMM ###########");
        return ResponseEntity.ok(userService.signup(modelMapper.map(userDto, User.class)));
    }

    @PostMapping("/signin")
    @ApiOperation(value = "${UserController.signin}")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "something wrong"),
            @ApiResponse(code = 422, message = "유효하지 않은 아이디 / 비밀번호")})
    public ResponseEntity<UserDto> signin(@ApiParam("Signin User")
                                          @RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.signin(modelMapper.map(userDto, User.class)));
    }


    @GetMapping()
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(User user) {

    }

    @PutMapping
    public void update(User user) {

    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable Long id) {
        return false;
    }

    @GetMapping("/count")
    public long count() {
        return 0;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {

    }
}


