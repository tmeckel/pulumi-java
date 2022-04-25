// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.outputs;

import com.pulumi.azurenative.authorization.outputs.PrincipalResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyAssignmentPropertiesResponsePolicy {
    /**
     * @return Id of the policy
     * 
     */
    private final @Nullable String id;
    /**
     * @return The name of the entity last modified it
     * 
     */
    private final PrincipalResponse lastModifiedBy;
    /**
     * @return The last modified date time.
     * 
     */
    private final @Nullable String lastModifiedDateTime;

    @CustomType.Constructor
    private PolicyAssignmentPropertiesResponsePolicy(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("lastModifiedBy") PrincipalResponse lastModifiedBy,
        @CustomType.Parameter("lastModifiedDateTime") @Nullable String lastModifiedDateTime) {
        this.id = id;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    /**
     * @return Id of the policy
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The name of the entity last modified it
     * 
     */
    public PrincipalResponse lastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * @return The last modified date time.
     * 
     */
    public Optional<String> lastModifiedDateTime() {
        return Optional.ofNullable(this.lastModifiedDateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentPropertiesResponsePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private PrincipalResponse lastModifiedBy;
        private @Nullable String lastModifiedDateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentPropertiesResponsePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedDateTime = defaults.lastModifiedDateTime;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder lastModifiedBy(PrincipalResponse lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }
        public Builder lastModifiedDateTime(@Nullable String lastModifiedDateTime) {
            this.lastModifiedDateTime = lastModifiedDateTime;
            return this;
        }        public PolicyAssignmentPropertiesResponsePolicy build() {
            return new PolicyAssignmentPropertiesResponsePolicy(id, lastModifiedBy, lastModifiedDateTime);
        }
    }
}
