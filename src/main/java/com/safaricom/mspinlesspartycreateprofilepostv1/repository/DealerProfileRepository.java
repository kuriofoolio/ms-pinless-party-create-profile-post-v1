package com.safaricom.mspinlesspartycreateprofilepostv1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safaricom.mspinlesspartycreateprofilepostv1.model.DealerProfile;

/**
 * 
 */
@Repository
public interface DealerProfileRepository extends JpaRepository<DealerProfile, Long> {

    /**
     * @param userid
     * @return Optional<DealerProfile> if found the account for given user id otherwise throw DealerNotFoundException
     */
    Optional<DealerProfile> findByUserId(Long userid);
   
}



