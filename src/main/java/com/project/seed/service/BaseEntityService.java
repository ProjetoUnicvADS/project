package com.project.seed.service;

import com.project.seed.model.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface BaseEntityService {
    BaseEntity save(BaseEntity baseEntity);

    Page<BaseEntity> list(Pageable pageable);

    Optional<BaseEntity> getById(Integer codEntity);

    BaseEntity update(Integer codEntity, BaseEntity entity);

    void deleteById(Integer codEntity);
}
