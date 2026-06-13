package dev.elder.ms_email.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record Itens(
        UUID produtoId,
        String nome,
        BigDecimal preco,
        Integer quantidade
) {
}
