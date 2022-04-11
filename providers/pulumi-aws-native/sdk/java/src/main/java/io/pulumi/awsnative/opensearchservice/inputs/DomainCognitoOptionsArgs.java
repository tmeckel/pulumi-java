// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainCognitoOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainCognitoOptionsArgs Empty = new DomainCognitoOptionsArgs();

    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    @Import(name="identityPoolId")
      private final @Nullable Output<String> identityPoolId;

    public Output<String> getIdentityPoolId() {
        return this.identityPoolId == null ? Codegen.empty() : this.identityPoolId;
    }

    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    @Import(name="userPoolId")
      private final @Nullable Output<String> userPoolId;

    public Output<String> getUserPoolId() {
        return this.userPoolId == null ? Codegen.empty() : this.userPoolId;
    }

    public DomainCognitoOptionsArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> identityPoolId,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> userPoolId) {
        this.enabled = enabled;
        this.identityPoolId = identityPoolId;
        this.roleArn = roleArn;
        this.userPoolId = userPoolId;
    }

    private DomainCognitoOptionsArgs() {
        this.enabled = Codegen.empty();
        this.identityPoolId = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.userPoolId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainCognitoOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> identityPoolId;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainCognitoOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.roleArn = defaults.roleArn;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder identityPoolId(@Nullable Output<String> identityPoolId) {
            this.identityPoolId = identityPoolId;
            return this;
        }
        public Builder identityPoolId(@Nullable String identityPoolId) {
            this.identityPoolId = Codegen.ofNullable(identityPoolId);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }
        public Builder userPoolId(@Nullable Output<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public Builder userPoolId(@Nullable String userPoolId) {
            this.userPoolId = Codegen.ofNullable(userPoolId);
            return this;
        }        public DomainCognitoOptionsArgs build() {
            return new DomainCognitoOptionsArgs(enabled, identityPoolId, roleArn, userPoolId);
        }
    }
}
