package com.example.demo.registration.token;

import com.example.demo.appuser.AppUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
public class ConfirmationToken {

    @SequenceGenerator(
            name = "confirmation_token_sequence", sequenceName = "confirmation_token_sequence", allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE, generator = "confirmation_token_sequence"
    )

    private Long id;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime expiresAt;
    private LocalDateTime confirmAt;

    private AppUser appUser;

    public ConfirmationToken(String token, LocalDateTime createdAt, LocalDateTime expiredAt, LocalDateTime confirmAt, AppUser appUser){
        this.token = token;
        this.createdAt = createdAt;
        this.expiresAt = expiredAt;
        this.confirmAt = confirmAt;
    }
}
