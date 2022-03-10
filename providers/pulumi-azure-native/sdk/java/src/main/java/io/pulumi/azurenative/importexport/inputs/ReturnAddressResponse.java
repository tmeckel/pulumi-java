// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the return address information for the job.
 * 
 */
public final class ReturnAddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReturnAddressResponse Empty = new ReturnAddressResponse();

    /**
     * The city name to use when returning the drives.
     * 
     */
    @InputImport(name="city", required=true)
      private final String city;

    public String getCity() {
        return this.city;
    }

    /**
     * The country or region to use when returning the drives.
     * 
     */
    @InputImport(name="countryOrRegion", required=true)
      private final String countryOrRegion;

    public String getCountryOrRegion() {
        return this.countryOrRegion;
    }

    /**
     * Email address of the recipient of the returned drives.
     * 
     */
    @InputImport(name="email", required=true)
      private final String email;

    public String getEmail() {
        return this.email;
    }

    /**
     * Phone number of the recipient of the returned drives.
     * 
     */
    @InputImport(name="phone", required=true)
      private final String phone;

    public String getPhone() {
        return this.phone;
    }

    /**
     * The postal code to use when returning the drives.
     * 
     */
    @InputImport(name="postalCode", required=true)
      private final String postalCode;

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * The name of the recipient who will receive the hard drives when they are returned.
     * 
     */
    @InputImport(name="recipientName", required=true)
      private final String recipientName;

    public String getRecipientName() {
        return this.recipientName;
    }

    /**
     * The state or province to use when returning the drives.
     * 
     */
    @InputImport(name="stateOrProvince")
      private final @Nullable String stateOrProvince;

    public Optional<String> getStateOrProvince() {
        return this.stateOrProvince == null ? Optional.empty() : Optional.ofNullable(this.stateOrProvince);
    }

    /**
     * The first line of the street address to use when returning the drives.
     * 
     */
    @InputImport(name="streetAddress1", required=true)
      private final String streetAddress1;

    public String getStreetAddress1() {
        return this.streetAddress1;
    }

    /**
     * The second line of the street address to use when returning the drives.
     * 
     */
    @InputImport(name="streetAddress2")
      private final @Nullable String streetAddress2;

    public Optional<String> getStreetAddress2() {
        return this.streetAddress2 == null ? Optional.empty() : Optional.ofNullable(this.streetAddress2);
    }

    public ReturnAddressResponse(
        String city,
        String countryOrRegion,
        String email,
        String phone,
        String postalCode,
        String recipientName,
        @Nullable String stateOrProvince,
        String streetAddress1,
        @Nullable String streetAddress2) {
        this.city = Objects.requireNonNull(city, "expected parameter 'city' to be non-null");
        this.countryOrRegion = Objects.requireNonNull(countryOrRegion, "expected parameter 'countryOrRegion' to be non-null");
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.phone = Objects.requireNonNull(phone, "expected parameter 'phone' to be non-null");
        this.postalCode = Objects.requireNonNull(postalCode, "expected parameter 'postalCode' to be non-null");
        this.recipientName = Objects.requireNonNull(recipientName, "expected parameter 'recipientName' to be non-null");
        this.stateOrProvince = stateOrProvince;
        this.streetAddress1 = Objects.requireNonNull(streetAddress1, "expected parameter 'streetAddress1' to be non-null");
        this.streetAddress2 = streetAddress2;
    }

    private ReturnAddressResponse() {
        this.city = null;
        this.countryOrRegion = null;
        this.email = null;
        this.phone = null;
        this.postalCode = null;
        this.recipientName = null;
        this.stateOrProvince = null;
        this.streetAddress1 = null;
        this.streetAddress2 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReturnAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String city;
        private String countryOrRegion;
        private String email;
        private String phone;
        private String postalCode;
        private String recipientName;
        private @Nullable String stateOrProvince;
        private String streetAddress1;
        private @Nullable String streetAddress2;

        public Builder() {
    	      // Empty
        }

        public Builder(ReturnAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.city = defaults.city;
    	      this.countryOrRegion = defaults.countryOrRegion;
    	      this.email = defaults.email;
    	      this.phone = defaults.phone;
    	      this.postalCode = defaults.postalCode;
    	      this.recipientName = defaults.recipientName;
    	      this.stateOrProvince = defaults.stateOrProvince;
    	      this.streetAddress1 = defaults.streetAddress1;
    	      this.streetAddress2 = defaults.streetAddress2;
        }

        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }

        public Builder countryOrRegion(String countryOrRegion) {
            this.countryOrRegion = Objects.requireNonNull(countryOrRegion);
            return this;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder phone(String phone) {
            this.phone = Objects.requireNonNull(phone);
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }

        public Builder recipientName(String recipientName) {
            this.recipientName = Objects.requireNonNull(recipientName);
            return this;
        }

        public Builder stateOrProvince(@Nullable String stateOrProvince) {
            this.stateOrProvince = stateOrProvince;
            return this;
        }

        public Builder streetAddress1(String streetAddress1) {
            this.streetAddress1 = Objects.requireNonNull(streetAddress1);
            return this;
        }

        public Builder streetAddress2(@Nullable String streetAddress2) {
            this.streetAddress2 = streetAddress2;
            return this;
        }
        public ReturnAddressResponse build() {
            return new ReturnAddressResponse(city, countryOrRegion, email, phone, postalCode, recipientName, stateOrProvince, streetAddress1, streetAddress2);
        }
    }
}
