// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information specifying an Anthos Cluster.
 * 
 */
public final class AnthosClusterResponse extends com.pulumi.resources.InvokeArgs {

    public static final AnthosClusterResponse Empty = new AnthosClusterResponse();

    /**
     * Membership of the GKE Hub registered cluster that the Skaffold configuration should be applied to. Format is `projects/{project}/locations/{location}/memberships/{membership_name}`.
     * 
     */
    @Import(name="membership", required=true)
    private String membership;

    /**
     * @return Membership of the GKE Hub registered cluster that the Skaffold configuration should be applied to. Format is `projects/{project}/locations/{location}/memberships/{membership_name}`.
     * 
     */
    public String membership() {
        return this.membership;
    }

    private AnthosClusterResponse() {}

    private AnthosClusterResponse(AnthosClusterResponse $) {
        this.membership = $.membership;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnthosClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnthosClusterResponse $;

        public Builder() {
            $ = new AnthosClusterResponse();
        }

        public Builder(AnthosClusterResponse defaults) {
            $ = new AnthosClusterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param membership Membership of the GKE Hub registered cluster that the Skaffold configuration should be applied to. Format is `projects/{project}/locations/{location}/memberships/{membership_name}`.
         * 
         * @return builder
         * 
         */
        public Builder membership(String membership) {
            $.membership = membership;
            return this;
        }

        public AnthosClusterResponse build() {
            $.membership = Objects.requireNonNull($.membership, "expected parameter 'membership' to be non-null");
            return $;
        }
    }

}
