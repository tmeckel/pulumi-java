// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Group connectivity details.
 * 
 */
public final class GroupConnectivityInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupConnectivityInformationArgs Empty = new GroupConnectivityInformationArgs();

    /**
     * List of customer visible FQDNs.
     * 
     */
    @Import(name="customerVisibleFqdns")
      private final @Nullable Output<List<String>> customerVisibleFqdns;

    public Output<List<String>> getCustomerVisibleFqdns() {
        return this.customerVisibleFqdns == null ? Codegen.empty() : this.customerVisibleFqdns;
    }

    /**
     * PrivateLinkService ARM region.
     * 
     */
    @Import(name="privateLinkServiceArmRegion")
      private final @Nullable Output<String> privateLinkServiceArmRegion;

    public Output<String> getPrivateLinkServiceArmRegion() {
        return this.privateLinkServiceArmRegion == null ? Codegen.empty() : this.privateLinkServiceArmRegion;
    }

    /**
     * Redirect map ID.
     * 
     */
    @Import(name="redirectMapId")
      private final @Nullable Output<String> redirectMapId;

    public Output<String> getRedirectMapId() {
        return this.redirectMapId == null ? Codegen.empty() : this.redirectMapId;
    }

    public GroupConnectivityInformationArgs(
        @Nullable Output<List<String>> customerVisibleFqdns,
        @Nullable Output<String> privateLinkServiceArmRegion,
        @Nullable Output<String> redirectMapId) {
        this.customerVisibleFqdns = customerVisibleFqdns;
        this.privateLinkServiceArmRegion = privateLinkServiceArmRegion;
        this.redirectMapId = redirectMapId;
    }

    private GroupConnectivityInformationArgs() {
        this.customerVisibleFqdns = Codegen.empty();
        this.privateLinkServiceArmRegion = Codegen.empty();
        this.redirectMapId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupConnectivityInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> customerVisibleFqdns;
        private @Nullable Output<String> privateLinkServiceArmRegion;
        private @Nullable Output<String> redirectMapId;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupConnectivityInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerVisibleFqdns = defaults.customerVisibleFqdns;
    	      this.privateLinkServiceArmRegion = defaults.privateLinkServiceArmRegion;
    	      this.redirectMapId = defaults.redirectMapId;
        }

        public Builder customerVisibleFqdns(@Nullable Output<List<String>> customerVisibleFqdns) {
            this.customerVisibleFqdns = customerVisibleFqdns;
            return this;
        }
        public Builder customerVisibleFqdns(@Nullable List<String> customerVisibleFqdns) {
            this.customerVisibleFqdns = Codegen.ofNullable(customerVisibleFqdns);
            return this;
        }
        public Builder customerVisibleFqdns(String... customerVisibleFqdns) {
            return customerVisibleFqdns(List.of(customerVisibleFqdns));
        }
        public Builder privateLinkServiceArmRegion(@Nullable Output<String> privateLinkServiceArmRegion) {
            this.privateLinkServiceArmRegion = privateLinkServiceArmRegion;
            return this;
        }
        public Builder privateLinkServiceArmRegion(@Nullable String privateLinkServiceArmRegion) {
            this.privateLinkServiceArmRegion = Codegen.ofNullable(privateLinkServiceArmRegion);
            return this;
        }
        public Builder redirectMapId(@Nullable Output<String> redirectMapId) {
            this.redirectMapId = redirectMapId;
            return this;
        }
        public Builder redirectMapId(@Nullable String redirectMapId) {
            this.redirectMapId = Codegen.ofNullable(redirectMapId);
            return this;
        }        public GroupConnectivityInformationArgs build() {
            return new GroupConnectivityInformationArgs(customerVisibleFqdns, privateLinkServiceArmRegion, redirectMapId);
        }
    }
}
