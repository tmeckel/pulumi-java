// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.composer_v1beta1.inputs.CidrBlockArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration options for the master authorized networks feature. Enabled master authorized networks will disallow all external traffic to access Kubernetes master through HTTPS except traffic from the given CIDR blocks, Google Compute Engine Public IPs and Google Prod IPs.
 * 
 */
public final class MasterAuthorizedNetworksConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MasterAuthorizedNetworksConfigArgs Empty = new MasterAuthorizedNetworksConfigArgs();

    /**
     * cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    @Import(name="cidrBlocks")
    private @Nullable Output<List<CidrBlockArgs>> cidrBlocks;

    /**
     * @return cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
     * 
     */
    public Optional<Output<List<CidrBlockArgs>>> cidrBlocks() {
        return Optional.ofNullable(this.cidrBlocks);
    }

    /**
     * Whether or not master authorized networks is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether or not master authorized networks is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private MasterAuthorizedNetworksConfigArgs() {}

    private MasterAuthorizedNetworksConfigArgs(MasterAuthorizedNetworksConfigArgs $) {
        this.cidrBlocks = $.cidrBlocks;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MasterAuthorizedNetworksConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MasterAuthorizedNetworksConfigArgs $;

        public Builder() {
            $ = new MasterAuthorizedNetworksConfigArgs();
        }

        public Builder(MasterAuthorizedNetworksConfigArgs defaults) {
            $ = new MasterAuthorizedNetworksConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlocks cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(@Nullable Output<List<CidrBlockArgs>> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * @param cidrBlocks cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(List<CidrBlockArgs> cidrBlocks) {
            return cidrBlocks(Output.of(cidrBlocks));
        }

        /**
         * @param cidrBlocks cidr_blocks define up to 50 external networks that could access Kubernetes master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(CidrBlockArgs... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        /**
         * @param enabled Whether or not master authorized networks is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not master authorized networks is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public MasterAuthorizedNetworksConfigArgs build() {
            return $;
        }
    }

}
