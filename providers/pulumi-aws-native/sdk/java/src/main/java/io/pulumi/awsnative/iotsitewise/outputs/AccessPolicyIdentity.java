// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.awsnative.iotsitewise.outputs.AccessPolicyIamRole;
import io.pulumi.awsnative.iotsitewise.outputs.AccessPolicyIamUser;
import io.pulumi.awsnative.iotsitewise.outputs.AccessPolicyUser;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AccessPolicyIdentity {
    private final @Nullable AccessPolicyIamRole iamRole;
    private final @Nullable AccessPolicyIamUser iamUser;
    private final @Nullable AccessPolicyUser user;

    @OutputCustomType.Constructor
    private AccessPolicyIdentity(
        @OutputCustomType.Parameter("iamRole") @Nullable AccessPolicyIamRole iamRole,
        @OutputCustomType.Parameter("iamUser") @Nullable AccessPolicyIamUser iamUser,
        @OutputCustomType.Parameter("user") @Nullable AccessPolicyUser user) {
        this.iamRole = iamRole;
        this.iamUser = iamUser;
        this.user = user;
    }

    public Optional<AccessPolicyIamRole> getIamRole() {
        return Optional.ofNullable(this.iamRole);
    }
    public Optional<AccessPolicyIamUser> getIamUser() {
        return Optional.ofNullable(this.iamUser);
    }
    public Optional<AccessPolicyUser> getUser() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessPolicyIamRole iamRole;
        private @Nullable AccessPolicyIamUser iamUser;
        private @Nullable AccessPolicyUser user;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRole = defaults.iamRole;
    	      this.iamUser = defaults.iamUser;
    	      this.user = defaults.user;
        }

        public Builder iamRole(@Nullable AccessPolicyIamRole iamRole) {
            this.iamRole = iamRole;
            return this;
        }

        public Builder iamUser(@Nullable AccessPolicyIamUser iamUser) {
            this.iamUser = iamUser;
            return this;
        }

        public Builder user(@Nullable AccessPolicyUser user) {
            this.user = user;
            return this;
        }
        public AccessPolicyIdentity build() {
            return new AccessPolicyIdentity(iamRole, iamUser, user);
        }
    }
}
