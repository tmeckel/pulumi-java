// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1ContactsPersonResponse {
    /**
     * Designation of the person, for example, Data Steward.
     * 
     */
    private final String designation;
    /**
     * Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
     * 
     */
    private final String email;

    @OutputCustomType.Constructor({"designation","email"})
    private GoogleCloudDatacatalogV1ContactsPersonResponse(
        String designation,
        String email) {
        this.designation = Objects.requireNonNull(designation);
        this.email = Objects.requireNonNull(email);
    }

    /**
     * Designation of the person, for example, Data Steward.
     * 
     */
    public String getDesignation() {
        return this.designation;
    }
    /**
     * Email of the person in the format of `john.doe@xyz`, ``, or `John Doe`.
     * 
     */
    public String getEmail() {
        return this.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1ContactsPersonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String designation;
        private String email;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1ContactsPersonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.designation = defaults.designation;
    	      this.email = defaults.email;
        }

        public Builder setDesignation(String designation) {
            this.designation = Objects.requireNonNull(designation);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public GoogleCloudDatacatalogV1ContactsPersonResponse build() {
            return new GoogleCloudDatacatalogV1ContactsPersonResponse(designation, email);
        }
    }
}
