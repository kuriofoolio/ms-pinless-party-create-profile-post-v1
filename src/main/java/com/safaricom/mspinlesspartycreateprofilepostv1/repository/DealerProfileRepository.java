package com.safaricom.mspinlesspartycreateprofilepostv1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safaricom.mspinlesspartycreateprofilepostv1.model.DealerProfile;

/**
 * 
 */
@Repository
public interface DealerProfileRepository extends JpaRepository<DealerProfile, Long> {


}



