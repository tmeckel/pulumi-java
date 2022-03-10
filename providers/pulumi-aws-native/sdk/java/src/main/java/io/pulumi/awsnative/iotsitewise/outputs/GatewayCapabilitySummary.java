// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GatewayCapabilitySummary {
    private final @Nullable String capabilityConfiguration;
    private final String capabilityNamespace;

    @OutputCustomType.Constructor
    private GatewayCapabilitySummary(
        @OutputCustomType.Parameter("capabilityConfiguration") @Nullable String capabilityConfiguration,
        @OutputCustomType.Parameter("capabilityNamespace") String capabilityNamespace) {
        this.capabilityConfiguration = capabilityConfiguration;
        this.capabilityNamespace = capabilityNamespace;
    }

    public Optional<String> getCapabilityConfiguration() {
        return Optional.ofNullable(this.capabilityConfiguration);
    }
    public String getCapabilityNamespace() {
        return this.capabilityNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCapabilitySummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capabilityConfiguration;
        private String capabilityNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCapabilitySummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilityConfiguration = defaults.capabilityConfiguration;
    	      this.capabilityNamespace = defaults.capabilityNamespace;
        }

        public Builder capabilityConfiguration(@Nullable String capabilityConfiguration) {
            this.capabilityConfiguration = capabilityConfiguration;
            return this;
        }

        public Builder capabilityNamespace(String capabilityNamespace) {
            this.capabilityNamespace = Objects.requireNonNull(capabilityNamespace);
            return this;
        }
        public GatewayCapabilitySummary build() {
            return new GatewayCapabilitySummary(capabilityConfiguration, capabilityNamespace);
        }
    }
}
