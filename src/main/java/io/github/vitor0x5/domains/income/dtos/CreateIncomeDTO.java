package io.github.vitor0x5.domains.income.dtos;

import java.sql.Date;
import java.util.UUID;

public class CreateIncomeDTO {
    public UUID userId;
    public String description;
    public Double value;
    public Date incomeDate;
}
