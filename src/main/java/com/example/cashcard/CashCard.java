package com.example.cashcard;

import org.springframework.data.annotation.Id;

/**
 * @author YISivlay
 */
record CashCard(@Id Long id, Double amount, String owner) {
    public CashCard(Double amount, String owner) {
        this(null, amount, owner);
    }
}
