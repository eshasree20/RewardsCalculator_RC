package com.rewards.rewardscalculator.repository;

import com.rewards.rewardscalculator.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    public Customer findByCustomerId(Long customerId);
}
