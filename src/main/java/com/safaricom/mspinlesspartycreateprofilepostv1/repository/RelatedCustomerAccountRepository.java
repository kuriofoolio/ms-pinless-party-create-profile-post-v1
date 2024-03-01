package com.safaricom.mspinlesspartycreateprofilepostv1.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safaricom.mspinlesspartycreateprofilepostv1.model.RelatedCustomerAccount;

/**
 * 
 */
@SuppressWarnings("rawtypes")
@Repository
public interface RelatedCustomerAccountRepository extends JpaRepository<RelatedCustomerAccount, ArrayList> {

}
