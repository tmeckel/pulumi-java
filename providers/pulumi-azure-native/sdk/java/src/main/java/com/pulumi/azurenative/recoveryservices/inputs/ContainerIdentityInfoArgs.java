// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container identity information
 * 
 */
public final class ContainerIdentityInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerIdentityInfoArgs Empty = new ContainerIdentityInfoArgs();

    /**
     * Protection container identity - AAD Tenant
     * 
     */
    @Import(name="aadTenantId")
    private @Nullable Output<String> aadTenantId;

    /**
     * @return Protection container identity - AAD Tenant
     * 
     */
    public Optional<Output<String>> aadTenantId() {
        return Optional.ofNullable(this.aadTenantId);
    }

    /**
     * Protection container identity - Audience
     * 
     */
    @Import(name="audience")
    private @Nullable Output<String> audience;

    /**
     * @return Protection container identity - Audience
     * 
     */
    public Optional<Output<String>> audience() {
        return Optional.ofNullable(this.audience);
    }

    /**
     * Protection container identity - AAD Service Principal
     * 
     */
    @Import(name="servicePrincipalClientId")
    private @Nullable Output<String> servicePrincipalClientId;

    /**
     * @return Protection container identity - AAD Service Principal
     * 
     */
    public Optional<Output<String>> servicePrincipalClientId() {
        return Optional.ofNullable(this.servicePrincipalClientId);
    }

    /**
     * Unique name of the container
     * 
     */
    @Import(name="uniqueName")
    private @Nullable Output<String> uniqueName;

    /**
     * @return Unique name of the container
     * 
     */
    public Optional<Output<String>> uniqueName() {
        return Optional.ofNullable(this.uniqueName);
    }

    private ContainerIdentityInfoArgs() {}

    private ContainerIdentityInfoArgs(ContainerIdentityInfoArgs $) {
        this.aadTenantId = $.aadTenantId;
        this.audience = $.audience;
        this.servicePrincipalClientId = $.servicePrincipalClientId;
        this.uniqueName = $.uniqueName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerIdentityInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerIdentityInfoArgs $;

        public Builder() {
            $ = new ContainerIdentityInfoArgs();
        }

        public Builder(ContainerIdentityInfoArgs defaults) {
            $ = new ContainerIdentityInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aadTenantId Protection container identity - AAD Tenant
         * 
         * @return builder
         * 
         */
        public Builder aadTenantId(@Nullable Output<String> aadTenantId) {
            $.aadTenantId = aadTenantId;
            return this;
        }

        /**
         * @param aadTenantId Protection container identity - AAD Tenant
         * 
         * @return builder
         * 
         */
        public Builder aadTenantId(String aadTenantId) {
            return aadTenantId(Output.of(aadTenantId));
        }

        /**
         * @param audience Protection container identity - Audience
         * 
         * @return builder
         * 
         */
        public Builder audience(@Nullable Output<String> audience) {
            $.audience = audience;
            return this;
        }

        /**
         * @param audience Protection container identity - Audience
         * 
         * @return builder
         * 
         */
        public Builder audience(String audience) {
            return audience(Output.of(audience));
        }

        /**
         * @param servicePrincipalClientId Protection container identity - AAD Service Principal
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalClientId(@Nullable Output<String> servicePrincipalClientId) {
            $.servicePrincipalClientId = servicePrincipalClientId;
            return this;
        }

        /**
         * @param servicePrincipalClientId Protection container identity - AAD Service Principal
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalClientId(String servicePrincipalClientId) {
            return servicePrincipalClientId(Output.of(servicePrincipalClientId));
        }

        /**
         * @param uniqueName Unique name of the container
         * 
         * @return builder
         * 
         */
        public Builder uniqueName(@Nullable Output<String> uniqueName) {
            $.uniqueName = uniqueName;
            return this;
        }

        /**
         * @param uniqueName Unique name of the container
         * 
         * @return builder
         * 
         */
        public Builder uniqueName(String uniqueName) {
            return uniqueName(Output.of(uniqueName));
        }

        public ContainerIdentityInfoArgs build() {
            return $;
        }
    }

}
