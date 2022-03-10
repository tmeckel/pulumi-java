// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Identity that will be used to access key vault for encryption at rest
 * 
 */
public final class IdentityForCmkResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityForCmkResponse Empty = new IdentityForCmkResponse();

    /**
     * The ArmId of the user assigned identity that will be used to access the customer managed key vault
     * 
     */
    @InputImport(name="userAssignedIdentity", required=true)
      private final String userAssignedIdentity;

    public String getUserAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    public IdentityForCmkResponse(String userAssignedIdentity) {
        this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity, "expected parameter 'userAssignedIdentity' to be non-null");
    }

    private IdentityForCmkResponse() {
        this.userAssignedIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityForCmkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityForCmkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder userAssignedIdentity(String userAssignedIdentity) {
            this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity);
            return this;
        }
        public IdentityForCmkResponse build() {
            return new IdentityForCmkResponse(userAssignedIdentity);
        }
    }
}
