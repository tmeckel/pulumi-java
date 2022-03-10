// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the application rule protocol.
 * 
 */
public final class AzureFirewallApplicationRuleProtocolResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureFirewallApplicationRuleProtocolResponse Empty = new AzureFirewallApplicationRuleProtocolResponse();

    /**
     * Port number for the protocol, cannot be greater than 64000. This field is optional.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * Protocol type.
     * 
     */
    @InputImport(name="protocolType")
      private final @Nullable String protocolType;

    public Optional<String> getProtocolType() {
        return this.protocolType == null ? Optional.empty() : Optional.ofNullable(this.protocolType);
    }

    public AzureFirewallApplicationRuleProtocolResponse(
        @Nullable Integer port,
        @Nullable String protocolType) {
        this.port = port;
        this.protocolType = protocolType;
    }

    private AzureFirewallApplicationRuleProtocolResponse() {
        this.port = null;
        this.protocolType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallApplicationRuleProtocolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private @Nullable String protocolType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallApplicationRuleProtocolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocolType = defaults.protocolType;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder protocolType(@Nullable String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public AzureFirewallApplicationRuleProtocolResponse build() {
            return new AzureFirewallApplicationRuleProtocolResponse(port, protocolType);
        }
    }
}
