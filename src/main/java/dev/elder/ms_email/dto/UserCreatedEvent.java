package dev.elder.ms_email.dto;

public record UserCreatedEvent(
        String userId,
        String email
) {
}
