// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Create network mappings input properties/behavior specific to Azure to Azure Network mapping.
 * 
 */
public final class AzureToAzureCreateNetworkMappingInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureToAzureCreateNetworkMappingInputArgs Empty = new AzureToAzureCreateNetworkMappingInputArgs();

    /**
     * The instance type.
     * Expected value is &#39;AzureToAzure&#39;.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The instance type.
     * Expected value is &#39;AzureToAzure&#39;.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The primary azure vnet Id.
     * 
     */
    @Import(name="primaryNetworkId")
    private @Nullable Output<String> primaryNetworkId;

    /**
     * @return The primary azure vnet Id.
     * 
     */
    public Optional<Output<String>> primaryNetworkId() {
        return Optional.ofNullable(this.primaryNetworkId);
    }

    private AzureToAzureCreateNetworkMappingInputArgs() {}

    private AzureToAzureCreateNetworkMappingInputArgs(AzureToAzureCreateNetworkMappingInputArgs $) {
        this.instanceType = $.instanceType;
        this.primaryNetworkId = $.primaryNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureToAzureCreateNetworkMappingInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureToAzureCreateNetworkMappingInputArgs $;

        public Builder() {
            $ = new AzureToAzureCreateNetworkMappingInputArgs();
        }

        public Builder(AzureToAzureCreateNetworkMappingInputArgs defaults) {
            $ = new AzureToAzureCreateNetworkMappingInputArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType The instance type.
         * Expected value is &#39;AzureToAzure&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The instance type.
         * Expected value is &#39;AzureToAzure&#39;.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param primaryNetworkId The primary azure vnet Id.
         * 
         * @return builder
         * 
         */
        public Builder primaryNetworkId(@Nullable Output<String> primaryNetworkId) {
            $.primaryNetworkId = primaryNetworkId;
            return this;
        }

        /**
         * @param primaryNetworkId The primary azure vnet Id.
         * 
         * @return builder
         * 
         */
        public Builder primaryNetworkId(String primaryNetworkId) {
            return primaryNetworkId(Output.of(primaryNetworkId));
        }

        public AzureToAzureCreateNetworkMappingInputArgs build() {
            $.instanceType = Codegen.stringProp("instanceType").output().arg($.instanceType).getNullable();
            return $;
        }
    }

}
