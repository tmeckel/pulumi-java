// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.domains_v1.inputs.PostalAddressArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details required for a contact associated with a `Registration`.
 * 
 */
public final class ContactArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactArgs Empty = new ContactArgs();

    /**
     * Email address of the contact.
     * 
     */
    @InputImport(name="email", required=true)
    private final Input<String> email;

    public Input<String> getEmail() {
        return this.email;
    }

    /**
     * Fax number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    @InputImport(name="faxNumber")
    private final @Nullable Input<String> faxNumber;

    public Input<String> getFaxNumber() {
        return this.faxNumber == null ? Input.empty() : this.faxNumber;
    }

    /**
     * Phone number of the contact in international format. For example, `"+1-800-555-0123"`.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
    private final Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * Postal address of the contact.
     * 
     */
    @InputImport(name="postalAddress", required=true)
    private final Input<PostalAddressArgs> postalAddress;

    public Input<PostalAddressArgs> getPostalAddress() {
        return this.postalAddress;
    }

    public ContactArgs(
        Input<String> email,
        @Nullable Input<String> faxNumber,
        Input<String> phoneNumber,
        Input<PostalAddressArgs> postalAddress) {
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.faxNumber = faxNumber;
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
        this.postalAddress = Objects.requireNonNull(postalAddress, "expected parameter 'postalAddress' to be non-null");
    }

    private ContactArgs() {
        this.email = Input.empty();
        this.faxNumber = Input.empty();
        this.phoneNumber = Input.empty();
        this.postalAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> email;
        private @Nullable Input<String> faxNumber;
        private Input<String> phoneNumber;
        private Input<PostalAddressArgs> postalAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.faxNumber = defaults.faxNumber;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.postalAddress = defaults.postalAddress;
        }

        public Builder setEmail(Input<String> email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Input.of(Objects.requireNonNull(email));
            return this;
        }

        public Builder setFaxNumber(@Nullable Input<String> faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        public Builder setFaxNumber(@Nullable String faxNumber) {
            this.faxNumber = Input.ofNullable(faxNumber);
            return this;
        }

        public Builder setPhoneNumber(Input<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Input.of(Objects.requireNonNull(phoneNumber));
            return this;
        }

        public Builder setPostalAddress(Input<PostalAddressArgs> postalAddress) {
            this.postalAddress = Objects.requireNonNull(postalAddress);
            return this;
        }

        public Builder setPostalAddress(PostalAddressArgs postalAddress) {
            this.postalAddress = Input.of(Objects.requireNonNull(postalAddress));
            return this;
        }

        public ContactArgs build() {
            return new ContactArgs(email, faxNumber, phoneNumber, postalAddress);
        }
    }
}
