package com.damk.wl.base;

import com.damk.wl.dto.RequestDto;
import jakarta.annotation.Nullable;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Service
public class BaseServiceImpl<E extends BaseEntity, DTO extends BaseDto> implements BaseService<E, DTO> {

    BaseRepository repository;
    Class<DTO> dtoClass;
    Class<E> entityClass;

    @Autowired
    public ModelMapper modelMapper;

    public BaseServiceImpl(BaseRepository repository, Class<E> entityClass, Class<DTO> dtoClass){
        this.repository = repository;
        this.dtoClass = dtoClass;
        this.entityClass = entityClass;
    }

    public BaseServiceImpl(){

    }

    @Override
    public DTO findById(Long id) {
        return null;
    }

    @Override
    public List<DTO> findByIds(List<Long> ids) {
        return List.of();
    }

    @Override
    public List<DTO> findAll() {
        return List.of();
    }

    @Override
    public List<DTO> findAll(@Nullable Specification<E> specification) {
        return List.of();
    }

    @Override
    public Page<DTO> findAll(@Nullable Specification<E> specification, Pageable pageable) {
        return null;
    }

    @Override
    public Page<DTO> findAll(RequestDto requestDto) {
        return null;
    }

    @Override
    public List<DTO> findAll(@Nullable Specification<E> specification, Sort sort) {
        return List.of();
    }

    @Override
    public List<DTO> findAllNonePage(RequestDto requestDto) {
        return List.of();
    }

    @Override
    public DTO saveObject(DTO dto) {
        return null;
    }

    @Override
    public void saveListObject(List<DTO> dtos) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void deleteByIds(List<Long> ids) {

    }
}
