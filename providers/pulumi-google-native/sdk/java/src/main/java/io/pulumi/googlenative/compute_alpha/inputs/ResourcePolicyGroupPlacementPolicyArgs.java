// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyCollocation;
import io.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyLocality;
import io.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyScope;
import io.pulumi.googlenative.compute_alpha.enums.ResourcePolicyGroupPlacementPolicyStyle;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A GroupPlacementPolicy specifies resource placement configuration. It specifies the failure bucket separation as well as network locality
 * 
 */
public final class ResourcePolicyGroupPlacementPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyGroupPlacementPolicyArgs Empty = new ResourcePolicyGroupPlacementPolicyArgs();

    /**
     * The number of availability domains instances will be spread across. If two instances are in different availability domain, they will not be put in the same low latency network
     * 
     */
    @InputImport(name="availabilityDomainCount")
    private final @Nullable Input<Integer> availabilityDomainCount;

    public Input<Integer> getAvailabilityDomainCount() {
        return this.availabilityDomainCount == null ? Input.empty() : this.availabilityDomainCount;
    }

    /**
     * Specifies network collocation
     * 
     */
    @InputImport(name="collocation")
    private final @Nullable Input<ResourcePolicyGroupPlacementPolicyCollocation> collocation;

    public Input<ResourcePolicyGroupPlacementPolicyCollocation> getCollocation() {
        return this.collocation == null ? Input.empty() : this.collocation;
    }

    /**
     * Specifies network locality
     * 
     */
    @InputImport(name="locality")
    private final @Nullable Input<ResourcePolicyGroupPlacementPolicyLocality> locality;

    public Input<ResourcePolicyGroupPlacementPolicyLocality> getLocality() {
        return this.locality == null ? Input.empty() : this.locality;
    }

    /**
     * Scope specifies the availability domain to which the VMs should be spread.
     * 
     */
    @InputImport(name="scope")
    private final @Nullable Input<ResourcePolicyGroupPlacementPolicyScope> scope;

    public Input<ResourcePolicyGroupPlacementPolicyScope> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * Specifies instances to hosts placement relationship
     * 
     */
    @InputImport(name="style")
    private final @Nullable Input<ResourcePolicyGroupPlacementPolicyStyle> style;

    public Input<ResourcePolicyGroupPlacementPolicyStyle> getStyle() {
        return this.style == null ? Input.empty() : this.style;
    }

    /**
     * Number of vms in this placement group
     * 
     */
    @InputImport(name="vmCount")
    private final @Nullable Input<Integer> vmCount;

    public Input<Integer> getVmCount() {
        return this.vmCount == null ? Input.empty() : this.vmCount;
    }

    public ResourcePolicyGroupPlacementPolicyArgs(
        @Nullable Input<Integer> availabilityDomainCount,
        @Nullable Input<ResourcePolicyGroupPlacementPolicyCollocation> collocation,
        @Nullable Input<ResourcePolicyGroupPlacementPolicyLocality> locality,
        @Nullable Input<ResourcePolicyGroupPlacementPolicyScope> scope,
        @Nullable Input<ResourcePolicyGroupPlacementPolicyStyle> style,
        @Nullable Input<Integer> vmCount) {
        this.availabilityDomainCount = availabilityDomainCount;
        this.collocation = collocation;
        this.locality = locality;
        this.scope = scope;
        this.style = style;
        this.vmCount = vmCount;
    }

    private ResourcePolicyGroupPlacementPolicyArgs() {
        this.availabilityDomainCount = Input.empty();
        this.collocation = Input.empty();
        this.locality = Input.empty();
        this.scope = Input.empty();
        this.style = Input.empty();
        this.vmCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availabilityDomainCount;
        private @Nullable Input<ResourcePolicyGroupPlacementPolicyCollocation> collocation;
        private @Nullable Input<ResourcePolicyGroupPlacementPolicyLocality> locality;
        private @Nullable Input<ResourcePolicyGroupPlacementPolicyScope> scope;
        private @Nullable Input<ResourcePolicyGroupPlacementPolicyStyle> style;
        private @Nullable Input<Integer> vmCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyGroupPlacementPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityDomainCount = defaults.availabilityDomainCount;
    	      this.collocation = defaults.collocation;
    	      this.locality = defaults.locality;
    	      this.scope = defaults.scope;
    	      this.style = defaults.style;
    	      this.vmCount = defaults.vmCount;
        }

        public Builder setAvailabilityDomainCount(@Nullable Input<Integer> availabilityDomainCount) {
            this.availabilityDomainCount = availabilityDomainCount;
            return this;
        }

        public Builder setAvailabilityDomainCount(@Nullable Integer availabilityDomainCount) {
            this.availabilityDomainCount = Input.ofNullable(availabilityDomainCount);
            return this;
        }

        public Builder setCollocation(@Nullable Input<ResourcePolicyGroupPlacementPolicyCollocation> collocation) {
            this.collocation = collocation;
            return this;
        }

        public Builder setCollocation(@Nullable ResourcePolicyGroupPlacementPolicyCollocation collocation) {
            this.collocation = Input.ofNullable(collocation);
            return this;
        }

        public Builder setLocality(@Nullable Input<ResourcePolicyGroupPlacementPolicyLocality> locality) {
            this.locality = locality;
            return this;
        }

        public Builder setLocality(@Nullable ResourcePolicyGroupPlacementPolicyLocality locality) {
            this.locality = Input.ofNullable(locality);
            return this;
        }

        public Builder setScope(@Nullable Input<ResourcePolicyGroupPlacementPolicyScope> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable ResourcePolicyGroupPlacementPolicyScope scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setStyle(@Nullable Input<ResourcePolicyGroupPlacementPolicyStyle> style) {
            this.style = style;
            return this;
        }

        public Builder setStyle(@Nullable ResourcePolicyGroupPlacementPolicyStyle style) {
            this.style = Input.ofNullable(style);
            return this;
        }

        public Builder setVmCount(@Nullable Input<Integer> vmCount) {
            this.vmCount = vmCount;
            return this;
        }

        public Builder setVmCount(@Nullable Integer vmCount) {
            this.vmCount = Input.ofNullable(vmCount);
            return this;
        }

        public ResourcePolicyGroupPlacementPolicyArgs build() {
            return new ResourcePolicyGroupPlacementPolicyArgs(availabilityDomainCount, collocation, locality, scope, style, vmCount);
        }
    }
}
