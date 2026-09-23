package com.supply_chain_base_operation.model;

import com.supply_chain_base_operation.Enum.AuthenticationProvider;
import com.supply_chain_base_operation.Enum.UserStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.List;
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name="users")
public class User  extends GlobalRecord{
    private String userId;
    private  String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private String email;
    private  String phoneNo;
    private String profileImageUrl;
    private UserStatus status;
    private String  currency;
    private  String address;
    private String country;
    private String city;
    private String postalCode;
    private String locationId;
    private UserStatus wareHouseId;
    private AuthenticationProvider authenticationProvider;
    private  boolean emailVerified;
    private boolean phoneVerified;
    private boolean twoFactorEnabled;
    private Instant lastLoginAt;
    private Instant passwordChangeAt;
    private Integer failedLoginAttempts;
    private boolean accountLocked;
    private String preferredLanguage;
    private String preferredCurrency;
    private String timeZone;
    private boolean active;
    private Instant lastActiveAt;
    @ManyToMany
    private List<Role> roles;
}
