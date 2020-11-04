package com.sami.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sami.entity.Centre;

@Repository("centerRepository")
public interface CenterRepository extends JpaRepository<Centre, Long> {

}
