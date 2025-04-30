package com.javatechie.saga.payment.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserBalance {
    @Id
    private int userId;
    private int price;
}
