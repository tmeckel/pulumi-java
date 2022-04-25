// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of properties of a link provider.
 * 
 */
public final class VpnLinkProviderPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final VpnLinkProviderPropertiesResponse Empty = new VpnLinkProviderPropertiesResponse();

    /**
     * Name of the link provider.
     * 
     */
    @Import(name="linkProviderName")
    private @Nullable String linkProviderName;

    /**
     * @return Name of the link provider.
     * 
     */
    public Optional<String> linkProviderName() {
        return Optional.ofNullable(this.linkProviderName);
    }

    /**
     * Link speed.
     * 
     */
    @Import(name="linkSpeedInMbps")
    private @Nullable Integer linkSpeedInMbps;

    /**
     * @return Link speed.
     * 
     */
    public Optional<Integer> linkSpeedInMbps() {
        return Optional.ofNullable(this.linkSpeedInMbps);
    }

    private VpnLinkProviderPropertiesResponse() {}

    private VpnLinkProviderPropertiesResponse(VpnLinkProviderPropertiesResponse $) {
        this.linkProviderName = $.linkProviderName;
        this.linkSpeedInMbps = $.linkSpeedInMbps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnLinkProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnLinkProviderPropertiesResponse $;

        public Builder() {
            $ = new VpnLinkProviderPropertiesResponse();
        }

        public Builder(VpnLinkProviderPropertiesResponse defaults) {
            $ = new VpnLinkProviderPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param linkProviderName Name of the link provider.
         * 
         * @return builder
         * 
         */
        public Builder linkProviderName(@Nullable String linkProviderName) {
            $.linkProviderName = linkProviderName;
            return this;
        }

        /**
         * @param linkSpeedInMbps Link speed.
         * 
         * @return builder
         * 
         */
        public Builder linkSpeedInMbps(@Nullable Integer linkSpeedInMbps) {
            $.linkSpeedInMbps = linkSpeedInMbps;
            return this;
        }

        public VpnLinkProviderPropertiesResponse build() {
            return $;
        }
    }

}
