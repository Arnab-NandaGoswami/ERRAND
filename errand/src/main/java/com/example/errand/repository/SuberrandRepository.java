package com.example.errand.repository;

import com.example.errand.model.Suberrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SuberrandRepository extends JpaRepository<Suberrand, Long> {

    Optional<Suberrand> findByName(String subredditName);
}