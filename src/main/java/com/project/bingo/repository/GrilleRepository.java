package com.project.bingo.repository;

import com.project.bingo.model.GrilleBingo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrilleRepository extends JpaRepository<GrilleBingo, Long> {

}
