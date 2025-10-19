package com.damk.wl.dto;

import com.damk.wl.base.Condition;
import com.damk.wl.base.SortField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestDto {
    Integer page = 0; // Default Page 0
    Integer size = 10; // Default Size 10
    private List<Condition> conditionList;
    private List<SortField> sortField;
}
