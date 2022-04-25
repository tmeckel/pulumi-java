// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessPolicyIamRole {
    /**
     * @return The ARN of the IAM role.
     * 
     */
    private final @Nullable String arn;

    @CustomType.Constructor
    private AccessPolicyIamRole(@CustomType.Parameter("arn") @Nullable String arn) {
        this.arn = arn;
    }

    /**
     * @return The ARN of the IAM role.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIamRole defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyIamRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }        public AccessPolicyIamRole build() {
            return new AccessPolicyIamRole(arn);
        }
    }
}
