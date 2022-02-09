// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNatGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNatGatewayArgs Empty = new GetNatGatewayArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="natGatewayName", required=true)
    private final String natGatewayName;

    public String getNatGatewayName() {
        return this.natGatewayName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNatGatewayArgs(
        @Nullable String expand,
        String natGatewayName,
        String resourceGroupName) {
        this.expand = expand;
        this.natGatewayName = Objects.requireNonNull(natGatewayName, "expected parameter 'natGatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNatGatewayArgs() {
        this.expand = null;
        this.natGatewayName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String natGatewayName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.natGatewayName = defaults.natGatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setNatGatewayName(String natGatewayName) {
            this.natGatewayName = Objects.requireNonNull(natGatewayName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNatGatewayArgs build() {
            return new GetNatGatewayArgs(expand, natGatewayName, resourceGroupName);
        }
    }
}
