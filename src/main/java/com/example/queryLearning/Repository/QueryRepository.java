package com.example.queryLearning.Repository;

import com.example.queryLearning.Model.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueryRepository extends JpaRepository<PersonDetails,Long> {

    @Query("SELECT a FROM PersonDetails a")
    List<PersonDetails> findByJust();
}
