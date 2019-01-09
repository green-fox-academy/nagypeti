package com.trialexam.demo.repository;

import com.trialexam.demo.model.Alias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AliasRepository extends JpaRepository<Alias, Long> {

  boolean existsAliasByAliasName(String aliasName);
  Alias findAliasByAliasName(String aliasName);
  void deleteById(Long id);

  @Modifying
  @Transactional
  @Query(value = "UPDATE alias a SET a.hit_count = a.hit_count + 1 WHERE a.id = :id", nativeQuery = true)
  void incHitCount(@Param("id") Long id);

}
