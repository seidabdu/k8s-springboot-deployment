package com.seid.spring.reactive.reactiveprogramming.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.seid.spring.reactive.reactiveprogramming.model.Department;

import reactor.core.publisher.Mono;

public interface DepartmentRepository extends ReactiveCrudRepository<Department,Integer> {
    Mono<Department> findByUserId(Integer userId);
}