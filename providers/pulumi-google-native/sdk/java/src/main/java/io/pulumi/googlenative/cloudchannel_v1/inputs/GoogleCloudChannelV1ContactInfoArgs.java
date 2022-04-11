// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contact information for a customer account.
 * 
 */
public final class GoogleCloudChannelV1ContactInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudChannelV1ContactInfoArgs Empty = new GoogleCloudChannelV1ContactInfoArgs();

    /**
     * The customer account's contact email. Required for entitlements that create admin.google.com accounts, and serves as the customer's username for those accounts. Use this email to invite Team customers.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * The customer account contact's first name. Optional for Team customers.
     * 
     */
    @Import(name="firstName")
      private final @Nullable Output<String> firstName;

    public Output<String> getFirstName() {
        return this.firstName == null ? Codegen.empty() : this.firstName;
    }

    /**
     * The customer account contact's last name. Optional for Team customers.
     * 
     */
    @Import(name="lastName")
      private final @Nullable Output<String> lastName;

    public Output<String> getLastName() {
        return this.lastName == null ? Codegen.empty() : this.lastName;
    }

    /**
     * The customer account's contact phone number.
     * 
     */
    @Import(name="phone")
      private final @Nullable Output<String> phone;

    public Output<String> getPhone() {
        return this.phone == null ? Codegen.empty() : this.phone;
    }

    /**
     * Optional. The customer account contact's job title.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Codegen.empty() : this.title;
    }

    public GoogleCloudChannelV1ContactInfoArgs(
        @Nullable Output<String> email,
        @Nullable Output<String> firstName,
        @Nullable Output<String> lastName,
        @Nullable Output<String> phone,
        @Nullable Output<String> title) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.title = title;
    }

    private GoogleCloudChannelV1ContactInfoArgs() {
        this.email = Codegen.empty();
        this.firstName = Codegen.empty();
        this.lastName = Codegen.empty();
        this.phone = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1ContactInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> email;
        private @Nullable Output<String> firstName;
        private @Nullable Output<String> lastName;
        private @Nullable Output<String> phone;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1ContactInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.lastName = defaults.lastName;
    	      this.phone = defaults.phone;
    	      this.title = defaults.title;
        }

        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder firstName(@Nullable Output<String> firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder firstName(@Nullable String firstName) {
            this.firstName = Codegen.ofNullable(firstName);
            return this;
        }
        public Builder lastName(@Nullable Output<String> lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder lastName(@Nullable String lastName) {
            this.lastName = Codegen.ofNullable(lastName);
            return this;
        }
        public Builder phone(@Nullable Output<String> phone) {
            this.phone = phone;
            return this;
        }
        public Builder phone(@Nullable String phone) {
            this.phone = Codegen.ofNullable(phone);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Codegen.ofNullable(title);
            return this;
        }        public GoogleCloudChannelV1ContactInfoArgs build() {
            return new GoogleCloudChannelV1ContactInfoArgs(email, firstName, lastName, phone, title);
        }
    }
}
