package com.example.demo.controller;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.PostDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @PostMapping
    public ResponseEntity<?> createPost(@Valid @RequestBody PostDTO postDTO) {
        return new ResponseEntity<>(
            new ApiResponse<>(postDTO, "success", "Post created successfully", LocalDateTime.now()),
            HttpStatus.CREATED
        );
    }
}
