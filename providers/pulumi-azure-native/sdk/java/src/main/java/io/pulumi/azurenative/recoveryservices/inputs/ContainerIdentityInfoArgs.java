// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container identity information
 * 
 */
public final class ContainerIdentityInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerIdentityInfoArgs Empty = new ContainerIdentityInfoArgs();

    /**
     * Protection container identity - AAD Tenant
     * 
     */
    @InputImport(name="aadTenantId")
      private final @Nullable Input<String> aadTenantId;

    public Input<String> getAadTenantId() {
        return this.aadTenantId == null ? Input.empty() : this.aadTenantId;
    }

    /**
     * Protection container identity - Audience
     * 
     */
    @InputImport(name="audience")
      private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * Protection container identity - AAD Service Principal
     * 
     */
    @InputImport(name="servicePrincipalClientId")
      private final @Nullable Input<String> servicePrincipalClientId;

    public Input<String> getServicePrincipalClientId() {
        return this.servicePrincipalClientId == null ? Input.empty() : this.servicePrincipalClientId;
    }

    /**
     * Unique name of the container
     * 
     */
    @InputImport(name="uniqueName")
      private final @Nullable Input<String> uniqueName;

    public Input<String> getUniqueName() {
        return this.uniqueName == null ? Input.empty() : this.uniqueName;
    }

    public ContainerIdentityInfoArgs(
        @Nullable Input<String> aadTenantId,
        @Nullable Input<String> audience,
        @Nullable Input<String> servicePrincipalClientId,
        @Nullable Input<String> uniqueName) {
        this.aadTenantId = aadTenantId;
        this.audience = audience;
        this.servicePrincipalClientId = servicePrincipalClientId;
        this.uniqueName = uniqueName;
    }

    private ContainerIdentityInfoArgs() {
        this.aadTenantId = Input.empty();
        this.audience = Input.empty();
        this.servicePrincipalClientId = Input.empty();
        this.uniqueName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerIdentityInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aadTenantId;
        private @Nullable Input<String> audience;
        private @Nullable Input<String> servicePrincipalClientId;
        private @Nullable Input<String> uniqueName;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerIdentityInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.audience = defaults.audience;
    	      this.servicePrincipalClientId = defaults.servicePrincipalClientId;
    	      this.uniqueName = defaults.uniqueName;
        }

        public Builder aadTenantId(@Nullable Input<String> aadTenantId) {
            this.aadTenantId = aadTenantId;
            return this;
        }

        public Builder aadTenantId(@Nullable String aadTenantId) {
            this.aadTenantId = Input.ofNullable(aadTenantId);
            return this;
        }

        public Builder audience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder audience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder servicePrincipalClientId(@Nullable Input<String> servicePrincipalClientId) {
            this.servicePrincipalClientId = servicePrincipalClientId;
            return this;
        }

        public Builder servicePrincipalClientId(@Nullable String servicePrincipalClientId) {
            this.servicePrincipalClientId = Input.ofNullable(servicePrincipalClientId);
            return this;
        }

        public Builder uniqueName(@Nullable Input<String> uniqueName) {
            this.uniqueName = uniqueName;
            return this;
        }

        public Builder uniqueName(@Nullable String uniqueName) {
            this.uniqueName = Input.ofNullable(uniqueName);
            return this;
        }
        public ContainerIdentityInfoArgs build() {
            return new ContainerIdentityInfoArgs(aadTenantId, audience, servicePrincipalClientId, uniqueName);
        }
    }
}
