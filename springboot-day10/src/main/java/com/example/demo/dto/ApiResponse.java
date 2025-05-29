package com.example.demo.dto;

import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
    private T data;
    private String status;
    private String message;
    private LocalDateTime timestamp;
}
