// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamespaceVirtualNetworkRuleResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Resource ID of Virtual Network Subnet
     * 
     */
    private final @Nullable String virtualNetworkSubnetId;

    @OutputCustomType.Constructor
    private GetNamespaceVirtualNetworkRuleResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("virtualNetworkSubnetId") @Nullable String virtualNetworkSubnetId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Resource ID of Virtual Network Subnet
     * 
    */
    public Optional<String> getVirtualNetworkSubnetId() {
        return Optional.ofNullable(this.virtualNetworkSubnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceVirtualNetworkRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String type;
        private @Nullable String virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceVirtualNetworkRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder virtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }
        public GetNamespaceVirtualNetworkRuleResult build() {
            return new GetNamespaceVirtualNetworkRuleResult(id, name, type, virtualNetworkSubnetId);
        }
    }
}
