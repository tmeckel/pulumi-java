// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterMasterAuthorizedNetworksConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMasterAuthorizedNetworksConfigGetArgs Empty = new ClusterMasterAuthorizedNetworksConfigGetArgs();

    /**
     * External networks that can access the
     * Kubernetes cluster master through HTTPS.
     * 
     */
    @Import(name="cidrBlocks")
    private @Nullable Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks;

    /**
     * @return External networks that can access the
     * Kubernetes cluster master through HTTPS.
     * 
     */
    public Optional<Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>>> cidrBlocks() {
        return Optional.ofNullable(this.cidrBlocks);
    }

    private ClusterMasterAuthorizedNetworksConfigGetArgs() {}

    private ClusterMasterAuthorizedNetworksConfigGetArgs(ClusterMasterAuthorizedNetworksConfigGetArgs $) {
        this.cidrBlocks = $.cidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMasterAuthorizedNetworksConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMasterAuthorizedNetworksConfigGetArgs $;

        public Builder() {
            $ = new ClusterMasterAuthorizedNetworksConfigGetArgs();
        }

        public Builder(ClusterMasterAuthorizedNetworksConfigGetArgs defaults) {
            $ = new ClusterMasterAuthorizedNetworksConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlocks External networks that can access the
         * Kubernetes cluster master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(@Nullable Output<List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs>> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * @param cidrBlocks External networks that can access the
         * Kubernetes cluster master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(List<ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs> cidrBlocks) {
            return cidrBlocks(Output.of(cidrBlocks));
        }

        /**
         * @param cidrBlocks External networks that can access the
         * Kubernetes cluster master through HTTPS.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(ClusterMasterAuthorizedNetworksConfigCidrBlockGetArgs... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        public ClusterMasterAuthorizedNetworksConfigGetArgs build() {
            return $;
        }
    }

}
