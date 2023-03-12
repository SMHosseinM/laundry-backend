package com.example.laundry.user.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private Long phoneNumber;
    private int postcode;
    private String address;

}
