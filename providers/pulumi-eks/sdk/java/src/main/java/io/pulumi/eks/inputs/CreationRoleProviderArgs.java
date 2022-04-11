// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.eks.inputs;

import io.pulumi.aws.Provider;
import io.pulumi.aws.iam.Role;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Contains the AWS Role and Provider necessary to override the `[system:master]` entity ARN. This is an optional argument used when creating `Cluster`. Read more: https://docs.aws.amazon.com/eks/latest/userguide/add-user-role.html
 * 
 */
public final class CreationRoleProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreationRoleProviderArgs Empty = new CreationRoleProviderArgs();

    @Import(name="provider", required=true)
      private final Output<Provider> provider;

    public Output<Provider> getProvider() {
        return this.provider;
    }

    @Import(name="role", required=true)
      private final Output<Role> role;

    public Output<Role> getRole() {
        return this.role;
    }

    public CreationRoleProviderArgs(
        Output<Provider> provider,
        Output<Role> role) {
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private CreationRoleProviderArgs() {
        this.provider = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationRoleProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Provider> provider;
        private Output<Role> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationRoleProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
    	      this.role = defaults.role;
        }

        public Builder provider(Output<Provider> provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder provider(Provider provider) {
            this.provider = Output.of(Objects.requireNonNull(provider));
            return this;
        }
        public Builder role(Output<Role> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(Role role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public CreationRoleProviderArgs build() {
            return new CreationRoleProviderArgs(provider, role);
        }
    }
}
