**Spring Boot Day 10 Exercise**
Exercise Title: Validation, Global Exception Handling & Recap

Objective:

Today you will integrate data validation using annotations and implement a centralized global
exception handling mechanism using @ControllerAdvice. You will also complete a recap exercise
that ties together key concepts from the entire Spring Boot series.

Tasks to Implement:

1. Add validation annotations to UserDTO and PostDTO:
- @NotBlank, @Size, @Email, etc.
- Trigger validation errors using @Valid in controllers.
2. Implement GlobalExceptionHandler:
- Use @ControllerAdvice and @ExceptionHandler
- Handle MethodArgumentNotValidException and custom ResourceNotFoundException
- Return structured error response
3. Recap Task:
 Create an API POST /api/posts that accepts a PostDTO with validation. If validation fails, return
meaningful error messages.
 If successful, return the saved object wrapped in ApiResponse<T>.

Bonus Challenge:

Return the list of validation errors as a map: {field: message}. Also log the error using Logger.

Submission Checklist:

- Validation is enforced
- GlobalExceptionHandler returns meaningful messages
- Recap API integrates validation and error handling
- Bonus: Field error map returned and logged
