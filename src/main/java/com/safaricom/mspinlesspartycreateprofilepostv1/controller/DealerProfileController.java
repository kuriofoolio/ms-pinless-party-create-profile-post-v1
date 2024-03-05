package com.safaricom.mspinlesspartycreateprofilepostv1.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safaricom.mspinlesspartycreateprofilepostv1.dto.DealerProfileRequestDTO;
import com.safaricom.mspinlesspartycreateprofilepostv1.dto.DealerProfileResponseDTO;

import com.safaricom.mspinlesspartycreateprofilepostv1.model.DealerProfile;
import com.safaricom.mspinlesspartycreateprofilepostv1.service.DealerProfileService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

// change this
@Tag(name = "Dealer Profile Controller", description = "Dealer Profile Controller for ms-pinless-party-create-profile-post-v1")
@RestController
@RequestMapping("/auth/partnerPartyAPI/v1")
public class DealerProfileController {

        DealerProfile dealerProfile;
        private DealerProfileService dealerProfileService;

        // controller autowires from the service
        @Autowired
        public void setService(DealerProfileService dealerProfileService) {
                this.dealerProfileService = dealerProfileService;
        }

        /**
         * 
         * @param dealerProfileRequestDTO
         * @return ResponseEntity<DealerProfileResponseDTO>
         * @apiNote This method is used to add a new dealer profile to the database
         * @version 1.0.0
         * @since 1.0.0
         * @throws URISyntaxException
         */
        
        @Operation(summary = "Create a dealer profile", description = "Create a dealer profile object by specifying a couple of fields", tags = {
                        "Create a dealer profile" })
        @ApiResponses({
                        @ApiResponse(responseCode = "200", content = {
                                        @Content(schema = @Schema(implementation = DealerProfileResponseDTO.class), mediaType = "application/json") }),
                        @ApiResponse(responseCode = "404", content = {
                                        @Content(schema = @Schema(implementation = DealerProfileResponseDTO.class), mediaType = "application/json")
                        }),
                        @ApiResponse(responseCode = "500", content = {
                                        @Content(schema = @Schema(implementation = DealerProfileResponseDTO.class), mediaType = "application/json")
                        }) })
        @PostMapping("/partnerParty")
        public ResponseEntity<DealerProfileResponseDTO> createDealerProfile(
                        @RequestBody DealerProfileRequestDTO dealerProfileRequestDTO)
                        throws URISyntaxException {
                return dealerProfileService.createDealerProfile(dealerProfileRequestDTO);
        }

       

}
