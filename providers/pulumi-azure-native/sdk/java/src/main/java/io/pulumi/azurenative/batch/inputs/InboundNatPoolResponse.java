// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.NetworkSecurityGroupRuleResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InboundNatPoolResponse extends io.pulumi.resources.InvokeArgs {

    public static final InboundNatPoolResponse Empty = new InboundNatPoolResponse();

    /**
     * This must be unique within a Batch pool. Acceptable values are between 1 and 65535 except for 22, 3389, 29876 and 29877 as these are reserved. If any reserved values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="backendPort", required=true)
      private final Integer backendPort;

    public Integer getBackendPort() {
        return this.backendPort;
    }

    /**
     * Acceptable values range between 1 and 65534 except ports from 50000 to 55000 which are reserved by the Batch service. All ranges within a pool must be distinct and cannot overlap. If any reserved or overlapping values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="frontendPortRangeEnd", required=true)
      private final Integer frontendPortRangeEnd;

    public Integer getFrontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Acceptable values range between 1 and 65534 except ports from 50000 to 55000 which are reserved. All ranges within a pool must be distinct and cannot overlap. If any reserved or overlapping values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="frontendPortRangeStart", required=true)
      private final Integer frontendPortRangeStart;

    public Integer getFrontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * The name must be unique within a Batch pool, can contain letters, numbers, underscores, periods, and hyphens. Names must start with a letter or number, must end with a letter, number, or underscore, and cannot exceed 77 characters.  If any invalid values are provided the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The maximum number of rules that can be specified across all the endpoints on a Batch pool is 25. If no network security group rules are specified, a default rule will be created to allow inbound access to the specified backendPort. If the maximum number of network security group rules is exceeded the request fails with HTTP status code 400.
     * 
     */
    @InputImport(name="networkSecurityGroupRules")
      private final @Nullable List<NetworkSecurityGroupRuleResponse> networkSecurityGroupRules;

    public List<NetworkSecurityGroupRuleResponse> getNetworkSecurityGroupRules() {
        return this.networkSecurityGroupRules == null ? List.of() : this.networkSecurityGroupRules;
    }

    @InputImport(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    public InboundNatPoolResponse(
        Integer backendPort,
        Integer frontendPortRangeEnd,
        Integer frontendPortRangeStart,
        String name,
        @Nullable List<NetworkSecurityGroupRuleResponse> networkSecurityGroupRules,
        String protocol) {
        this.backendPort = Objects.requireNonNull(backendPort, "expected parameter 'backendPort' to be non-null");
        this.frontendPortRangeEnd = Objects.requireNonNull(frontendPortRangeEnd, "expected parameter 'frontendPortRangeEnd' to be non-null");
        this.frontendPortRangeStart = Objects.requireNonNull(frontendPortRangeStart, "expected parameter 'frontendPortRangeStart' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.networkSecurityGroupRules = networkSecurityGroupRules;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private InboundNatPoolResponse() {
        this.backendPort = null;
        this.frontendPortRangeEnd = null;
        this.frontendPortRangeStart = null;
        this.name = null;
        this.networkSecurityGroupRules = List.of();
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundNatPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backendPort;
        private Integer frontendPortRangeEnd;
        private Integer frontendPortRangeStart;
        private String name;
        private @Nullable List<NetworkSecurityGroupRuleResponse> networkSecurityGroupRules;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(InboundNatPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPortRangeEnd = defaults.frontendPortRangeEnd;
    	      this.frontendPortRangeStart = defaults.frontendPortRangeStart;
    	      this.name = defaults.name;
    	      this.networkSecurityGroupRules = defaults.networkSecurityGroupRules;
    	      this.protocol = defaults.protocol;
        }

        public Builder backendPort(Integer backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }

        public Builder frontendPortRangeEnd(Integer frontendPortRangeEnd) {
            this.frontendPortRangeEnd = Objects.requireNonNull(frontendPortRangeEnd);
            return this;
        }

        public Builder frontendPortRangeStart(Integer frontendPortRangeStart) {
            this.frontendPortRangeStart = Objects.requireNonNull(frontendPortRangeStart);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkSecurityGroupRules(@Nullable List<NetworkSecurityGroupRuleResponse> networkSecurityGroupRules) {
            this.networkSecurityGroupRules = networkSecurityGroupRules;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public InboundNatPoolResponse build() {
            return new InboundNatPoolResponse(backendPort, frontendPortRangeEnd, frontendPortRangeStart, name, networkSecurityGroupRules, protocol);
        }
    }
}
