// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The bandwidth for the link.
 * 
 */
public final class LinkBandwidth extends com.pulumi.resources.InvokeArgs {

    public static final LinkBandwidth Empty = new LinkBandwidth();

    /**
     * Download speed in Mbps.
     * 
     */
    @Import(name="downloadSpeed")
    private @Nullable Integer downloadSpeed;

    /**
     * @return Download speed in Mbps.
     * 
     */
    public Optional<Integer> downloadSpeed() {
        return Optional.ofNullable(this.downloadSpeed);
    }

    /**
     * Upload speed in Mbps.
     * 
     */
    @Import(name="uploadSpeed")
    private @Nullable Integer uploadSpeed;

    /**
     * @return Upload speed in Mbps.
     * 
     */
    public Optional<Integer> uploadSpeed() {
        return Optional.ofNullable(this.uploadSpeed);
    }

    private LinkBandwidth() {}

    private LinkBandwidth(LinkBandwidth $) {
        this.downloadSpeed = $.downloadSpeed;
        this.uploadSpeed = $.uploadSpeed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinkBandwidth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkBandwidth $;

        public Builder() {
            $ = new LinkBandwidth();
        }

        public Builder(LinkBandwidth defaults) {
            $ = new LinkBandwidth(Objects.requireNonNull(defaults));
        }

        /**
         * @param downloadSpeed Download speed in Mbps.
         * 
         * @return builder
         * 
         */
        public Builder downloadSpeed(@Nullable Integer downloadSpeed) {
            $.downloadSpeed = downloadSpeed;
            return this;
        }

        /**
         * @param uploadSpeed Upload speed in Mbps.
         * 
         * @return builder
         * 
         */
        public Builder uploadSpeed(@Nullable Integer uploadSpeed) {
            $.uploadSpeed = uploadSpeed;
            return this;
        }

        public LinkBandwidth build() {
            return $;
        }
    }

}
