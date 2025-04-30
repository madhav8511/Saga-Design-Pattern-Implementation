package com.javatechie.saga.commons.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentRequestDto {

    private Integer orderId;
    private Integer userId;
    private Integer amount;

}
