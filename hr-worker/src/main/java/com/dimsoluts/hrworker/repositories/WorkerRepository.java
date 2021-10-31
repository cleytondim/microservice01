package com.dimsoluts.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimsoluts.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
