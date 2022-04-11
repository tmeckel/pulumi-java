// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyEgressFromGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyEgressFromGetArgs Empty = new ServicePerimeterSpecEgressPolicyEgressFromGetArgs();

    /**
     * A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    @Import(name="identities")
      private final @Nullable Output<List<String>> identities;

    public Output<List<String>> getIdentities() {
        return this.identities == null ? Codegen.empty() : this.identities;
    }

    /**
     * Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    @Import(name="identityType")
      private final @Nullable Output<String> identityType;

    public Output<String> getIdentityType() {
        return this.identityType == null ? Codegen.empty() : this.identityType;
    }

    public ServicePerimeterSpecEgressPolicyEgressFromGetArgs(
        @Nullable Output<List<String>> identities,
        @Nullable Output<String> identityType) {
        this.identities = identities;
        this.identityType = identityType;
    }

    private ServicePerimeterSpecEgressPolicyEgressFromGetArgs() {
        this.identities = Codegen.empty();
        this.identityType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyEgressFromGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> identities;
        private @Nullable Output<String> identityType;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyEgressFromGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
        }

        public Builder identities(@Nullable Output<List<String>> identities) {
            this.identities = identities;
            return this;
        }
        public Builder identities(@Nullable List<String> identities) {
            this.identities = Codegen.ofNullable(identities);
            return this;
        }
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }
        public Builder identityType(@Nullable Output<String> identityType) {
            this.identityType = identityType;
            return this;
        }
        public Builder identityType(@Nullable String identityType) {
            this.identityType = Codegen.ofNullable(identityType);
            return this;
        }        public ServicePerimeterSpecEgressPolicyEgressFromGetArgs build() {
            return new ServicePerimeterSpecEgressPolicyEgressFromGetArgs(identities, identityType);
        }
    }
}
