package dev.elder.ms_email.dto;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public record PedidoCreatedEvent(
        UUID userId,
        String email,
        UUID pedidoId,
        Set<Itens> itens,
        BigDecimal total
) {
}
