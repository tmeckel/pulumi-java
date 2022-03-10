// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkSecurityGroupRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkSecurityGroupRuleResponse Empty = new NetworkSecurityGroupRuleResponse();

    @InputImport(name="access", required=true)
      private final String access;

    public String getAccess() {
        return this.access;
    }

    /**
     * Priorities within a pool must be unique and are evaluated in order of priority. The lower the number the higher the priority. For example, rules could be specified with order numbers of 150, 250, and 350. The rule with the order number of 150 takes precedence over the rule that has an order of 250. Allowed priorities are 150 to 4096. If any reserved or duplicate values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="priority", required=true)
      private final Integer priority;

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * Valid values are a single IP address (i.e. 10.10.10.10), IP subnet (i.e. 192.168.1.0/24), default tag, or * (for all addresses).  If any other values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="sourceAddressPrefix", required=true)
      private final String sourceAddressPrefix;

    public String getSourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Valid values are '*' (for all ports 0 - 65535) or arrays of ports or port ranges (i.e. 100-200). The ports should in the range of 0 to 65535 and the port ranges or ports can't overlap. If any other values are provided the request fails with HTTP status code 400. Default value will be *.
     * 
     */
    @InputImport(name="sourcePortRanges")
      private final @Nullable List<String> sourcePortRanges;

    public List<String> getSourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    public NetworkSecurityGroupRuleResponse(
        String access,
        Integer priority,
        String sourceAddressPrefix,
        @Nullable List<String> sourcePortRanges) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix, "expected parameter 'sourceAddressPrefix' to be non-null");
        this.sourcePortRanges = sourcePortRanges;
    }

    private NetworkSecurityGroupRuleResponse() {
        this.access = null;
        this.priority = null;
        this.sourceAddressPrefix = null;
        this.sourcePortRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkSecurityGroupRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private Integer priority;
        private String sourceAddressPrefix;
        private @Nullable List<String> sourcePortRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkSecurityGroupRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.priority = defaults.priority;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
        }

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder sourceAddressPrefix(String sourceAddressPrefix) {
            this.sourceAddressPrefix = Objects.requireNonNull(sourceAddressPrefix);
            return this;
        }

        public Builder sourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }
        public NetworkSecurityGroupRuleResponse build() {
            return new NetworkSecurityGroupRuleResponse(access, priority, sourceAddressPrefix, sourcePortRanges);
        }
    }
}
