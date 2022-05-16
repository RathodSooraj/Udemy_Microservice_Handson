package com.microservice.loans.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.loans.entity.Loans;

public interface LoansRepository extends JpaRepository<Loans, Long> {

	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
