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

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

// change this
// @Tag(name = "User Account Controller", description = "User Account Controller for User Account Service")
@RestController
@RequestMapping("/api/v1")
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

        @Operation(summary = "Create a dealer profile", description = "Create a dealer profile object by specifying id and username", tags = {
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
        @PostMapping("/dealers/create")
        public ResponseEntity<DealerProfileResponseDTO> createDealerProfile(
                        @RequestBody DealerProfileRequestDTO dealerProfileRequestDTO)
                        throws URISyntaxException {
                return dealerProfileService.createDealerProfile(dealerProfileRequestDTO);
        }

        // /**
        // *
        // * @param userid
        // * @return
        // */

        // @Operation(summary = "Get user account details by ID", description = "Get a
        // user account object by specifying its id. The response is User Account object
        // with id, username, createdat, active, and balance.", tags = {
        // "Get a user account" })
        // @ApiResponses({
        // @ApiResponse(responseCode = "200", content = {
        // @Content(schema = @Schema(implementation = UserAccount.class), mediaType =
        // "application/json") }),
        // @ApiResponse(responseCode = "404", content = {
        // @Content(schema = @Schema(implementation = UserAccountResponseDTO.class),
        // mediaType = "application/json") }),
        // })
        // @GetMapping("/users/{userid}")
        // public ResponseEntity<UserAccount> getUserAccountDetailsById(@PathVariable
        // Long userid) {
        // return userAccountService.getUserAccountDetailsById(userid);

        // }

        // /**
        // * @apiNote Get all user accounts
        // * @param userAccountRequest
        // * @since 1.0
        // * @version 1.0
        // * @return
        // */

        // @Operation(summary = "Get all user accounts details", description = "Get all
        // user account objects. The response is a list of User Account objects with id,
        // username, createdat, active, and balance.", tags = {
        // "Get user accounts" })
        // @ApiResponses({
        // @ApiResponse(responseCode = "200", content = {
        // @Content(schema = @Schema(implementation = UserAccountResponseDTO.class),
        // mediaType = "application/json") }),

        // })
        // @GetMapping("/users")
        // public List<UserAccount> getAllUserAccountDetails() {
        // return userAccountService.getAllUserAccountDetails();
        // }

}
