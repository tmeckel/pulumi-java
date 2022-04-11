// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.BasicAuthArgs;
import io.pulumi.googlenative.deploymentmanager_v2beta.inputs.ServiceAccountArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The credential used by Deployment Manager and TypeProvider. Only one of the options is permitted.
 * 
 */
public final class CredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final CredentialArgs Empty = new CredentialArgs();

    /**
     * Basic Auth Credential, only used by TypeProvider.
     * 
     */
    @Import(name="basicAuth")
      private final @Nullable Output<BasicAuthArgs> basicAuth;

    public Output<BasicAuthArgs> getBasicAuth() {
        return this.basicAuth == null ? Codegen.empty() : this.basicAuth;
    }

    /**
     * Service Account Credential, only used by Deployment.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<ServiceAccountArgs> serviceAccount;

    public Output<ServiceAccountArgs> getServiceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Specify to use the project default credential, only supported by Deployment.
     * 
     */
    @Import(name="useProjectDefault")
      private final @Nullable Output<Boolean> useProjectDefault;

    public Output<Boolean> getUseProjectDefault() {
        return this.useProjectDefault == null ? Codegen.empty() : this.useProjectDefault;
    }

    public CredentialArgs(
        @Nullable Output<BasicAuthArgs> basicAuth,
        @Nullable Output<ServiceAccountArgs> serviceAccount,
        @Nullable Output<Boolean> useProjectDefault) {
        this.basicAuth = basicAuth;
        this.serviceAccount = serviceAccount;
        this.useProjectDefault = useProjectDefault;
    }

    private CredentialArgs() {
        this.basicAuth = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.useProjectDefault = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BasicAuthArgs> basicAuth;
        private @Nullable Output<ServiceAccountArgs> serviceAccount;
        private @Nullable Output<Boolean> useProjectDefault;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.useProjectDefault = defaults.useProjectDefault;
        }

        public Builder basicAuth(@Nullable Output<BasicAuthArgs> basicAuth) {
            this.basicAuth = basicAuth;
            return this;
        }
        public Builder basicAuth(@Nullable BasicAuthArgs basicAuth) {
            this.basicAuth = Codegen.ofNullable(basicAuth);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<ServiceAccountArgs> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable ServiceAccountArgs serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder useProjectDefault(@Nullable Output<Boolean> useProjectDefault) {
            this.useProjectDefault = useProjectDefault;
            return this;
        }
        public Builder useProjectDefault(@Nullable Boolean useProjectDefault) {
            this.useProjectDefault = Codegen.ofNullable(useProjectDefault);
            return this;
        }        public CredentialArgs build() {
            return new CredentialArgs(basicAuth, serviceAccount, useProjectDefault);
        }
    }
}
