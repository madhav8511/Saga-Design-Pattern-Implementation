package com.javatechie.saga.payment.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserTransaction {
    @Id
    private Integer orderId;
    private int userId;
    private int amount;
}
