package com.safaricom.mspinlesspartycreateprofilepostv1.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.safaricom.mspinlesspartycreateprofilepostv1.dto.DealerProfileRequestDTO;
import com.safaricom.mspinlesspartycreateprofilepostv1.dto.DealerProfileResponseDTO;
import com.safaricom.mspinlesspartycreateprofilepostv1.exceptions.UserNotFoundException;
import com.safaricom.mspinlesspartycreateprofilepostv1.model.DealerProfile;
import com.safaricom.mspinlesspartycreateprofilepostv1.repository.DealerProfileRepository;

@Service
public class DealerProfileService {

    private DealerProfileRepository dealerProfileRepository;

    // service autowires from the repository
    @Autowired
    public void setRepository(DealerProfileRepository dealerProfileRepository) {
        this.dealerProfileRepository = dealerProfileRepository;
    }

    /**
     * 
     * @param dealerProfileRequestDTO
     * @version 1.0.0
     * @since 1.0.0
     * @return ResponseEntity<DealerProfileResponseDTO>
     * @apiNote This method is used to add a new dealer profile to the database
     * @exception URISyntaxException
     * @throws URISyntaxException
     */
    public ResponseEntity<DealerProfileResponseDTO> createDealerProfile(DealerProfileRequestDTO dealerProfileRequestDTO)
            throws URISyntaxException {

        DealerProfile dealerProfile = DealerProfile.builder()
                .userName(dealerProfileRequestDTO.getUserName())
                .email(dealerProfileRequestDTO.getEmail())
                .msisdn(dealerProfileRequestDTO.getMsisdn())
                .status(dealerProfileRequestDTO.getStatus())
                .userType(dealerProfileRequestDTO.getUserType())
                .categoryCode(dealerProfileRequestDTO.getCategoryCode())
                .createdOn(LocalDateTime.now())
                .createdBy(dealerProfileRequestDTO.getCreatedBy())
                .country(dealerProfileRequestDTO.getCountry())
                .userNamePrefix(dealerProfileRequestDTO.getUserNamePrefix())
                .shortName(dealerProfileRequestDTO.getShortName())
                .firstname(dealerProfileRequestDTO.getFirstname())
                .lastname(dealerProfileRequestDTO.getLastname())
                .build();

        DealerProfile newDealerProfile = dealerProfileRepository.save(dealerProfile);

        DealerProfileResponseDTO dealerProfileResponseDTO = DealerProfileResponseDTO.builder()
                .responseCode(1000)
                .responseDescription("success")
                .responseSummary("Dealer profile created successfully")
                .build();

        return ResponseEntity.created(new URI("/auth/partnerPartyAPI/v1/partnerParty" + newDealerProfile.getUserId()))
                .body(dealerProfileResponseDTO);

    }

    /**
     * 
     * @param userid
     * @version 1.0.0
     * @since 1.0.0
     * @return ResponseEntity<UserAccount>
     * @apiNote This method is used to retrieve a user account from the database
     * @exception UserNotFoundException
     * @throws UserNotFoundException
     */
    public ResponseEntity<DealerProfile> getDealerProfileDetailsById(Long userid) throws UserNotFoundException {

        DealerProfile foundDealerProfile = dealerProfileRepository.findByUserId(userid)
                .orElseThrow(() -> new UserNotFoundException(userid));

        return ResponseEntity.status(HttpStatus.FOUND.value()).body(foundDealerProfile);
    }

    /**
     * 
     * @return List<DealerProfile>
     * @version 1.0.0
     * @since 1.0.0
     * @apiNote This method is used to retrieve all dealer profiles from the
     *          database
     */
    public List<DealerProfile> getAllDealerProfileDetails() {
        return dealerProfileRepository.findAll();
    }

}
