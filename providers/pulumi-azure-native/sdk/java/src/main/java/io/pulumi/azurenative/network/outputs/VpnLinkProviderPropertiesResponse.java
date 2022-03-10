// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpnLinkProviderPropertiesResponse {
    /**
     * Name of the link provider.
     * 
     */
    private final @Nullable String linkProviderName;
    /**
     * Link speed.
     * 
     */
    private final @Nullable Integer linkSpeedInMbps;

    @OutputCustomType.Constructor
    private VpnLinkProviderPropertiesResponse(
        @OutputCustomType.Parameter("linkProviderName") @Nullable String linkProviderName,
        @OutputCustomType.Parameter("linkSpeedInMbps") @Nullable Integer linkSpeedInMbps) {
        this.linkProviderName = linkProviderName;
        this.linkSpeedInMbps = linkSpeedInMbps;
    }

    /**
     * Name of the link provider.
     * 
    */
    public Optional<String> getLinkProviderName() {
        return Optional.ofNullable(this.linkProviderName);
    }
    /**
     * Link speed.
     * 
    */
    public Optional<Integer> getLinkSpeedInMbps() {
        return Optional.ofNullable(this.linkSpeedInMbps);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnLinkProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkProviderName;
        private @Nullable Integer linkSpeedInMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnLinkProviderPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkProviderName = defaults.linkProviderName;
    	      this.linkSpeedInMbps = defaults.linkSpeedInMbps;
        }

        public Builder linkProviderName(@Nullable String linkProviderName) {
            this.linkProviderName = linkProviderName;
            return this;
        }

        public Builder linkSpeedInMbps(@Nullable Integer linkSpeedInMbps) {
            this.linkSpeedInMbps = linkSpeedInMbps;
            return this;
        }
        public VpnLinkProviderPropertiesResponse build() {
            return new VpnLinkProviderPropertiesResponse(linkProviderName, linkSpeedInMbps);
        }
    }
}
