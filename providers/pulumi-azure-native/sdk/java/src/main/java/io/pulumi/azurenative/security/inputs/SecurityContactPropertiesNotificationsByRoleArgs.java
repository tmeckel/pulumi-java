// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.Roles;
import io.pulumi.azurenative.security.enums.State;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
 * 
 */
public final class SecurityContactPropertiesNotificationsByRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityContactPropertiesNotificationsByRoleArgs Empty = new SecurityContactPropertiesNotificationsByRoleArgs();

    /**
     * Defines which RBAC roles will get email notifications from Azure Security Center. List of allowed RBAC roles:
     * 
     */
    @Import(name="roles")
      private final @Nullable Output<List<Either<String,Roles>>> roles;

    public Output<List<Either<String,Roles>>> getRoles() {
        return this.roles == null ? Codegen.empty() : this.roles;
    }

    /**
     * Defines whether to send email notifications from Azure Security Center to persons with specific RBAC roles on the subscription.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,State>> state;

    public Output<Either<String,State>> getState() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public SecurityContactPropertiesNotificationsByRoleArgs(
        @Nullable Output<List<Either<String,Roles>>> roles,
        @Nullable Output<Either<String,State>> state) {
        this.roles = roles;
        this.state = state;
    }

    private SecurityContactPropertiesNotificationsByRoleArgs() {
        this.roles = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContactPropertiesNotificationsByRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,Roles>>> roles;
        private @Nullable Output<Either<String,State>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContactPropertiesNotificationsByRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.roles = defaults.roles;
    	      this.state = defaults.state;
        }

        public Builder roles(@Nullable Output<List<Either<String,Roles>>> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(@Nullable List<Either<String,Roles>> roles) {
            this.roles = Codegen.ofNullable(roles);
            return this;
        }
        public Builder roles(Either<String,Roles>... roles) {
            return roles(List.of(roles));
        }
        public Builder state(@Nullable Output<Either<String,State>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,State> state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public SecurityContactPropertiesNotificationsByRoleArgs build() {
            return new SecurityContactPropertiesNotificationsByRoleArgs(roles, state);
        }
    }
}
