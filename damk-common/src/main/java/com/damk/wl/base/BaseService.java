package com.damk.wl.base;

import com.damk.wl.dto.RequestDto;
import jakarta.annotation.Nullable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface BaseService<E extends BaseEntity, DTO extends BaseDto> {
    DTO findById(Long id);
    List<DTO> findByIds(List<Long> ids);
    List<DTO> findAll();
    List<DTO> findAll(@Nullable Specification<E> specification);
    Page<DTO> findAll(@Nullable Specification<E> specification, Pageable pageable);
    Page<DTO> findAll(RequestDto requestDto);
    List<DTO> findAll(@Nullable Specification<E> specification, Sort sort);
    List<DTO> findAllNonePage(RequestDto requestDto);
    DTO saveObject(DTO dto);
    void saveListObject(List<DTO> dtoList);
    void deleteById(Long id);
    void deleteByIds(List<Long> ids);

}
