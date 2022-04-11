// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.gkehub.inputs.MembershipEndpointGkeClusterGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipEndpointGetArgs Empty = new MembershipEndpointGetArgs();

    /**
     * If this Membership is a Kubernetes API server hosted on GKE, this is a self link to its GCP resource.
     * Structure is documented below.
     * 
     */
    @Import(name="gkeCluster")
      private final @Nullable Output<MembershipEndpointGkeClusterGetArgs> gkeCluster;

    public Output<MembershipEndpointGkeClusterGetArgs> getGkeCluster() {
        return this.gkeCluster == null ? Codegen.empty() : this.gkeCluster;
    }

    public MembershipEndpointGetArgs(@Nullable Output<MembershipEndpointGkeClusterGetArgs> gkeCluster) {
        this.gkeCluster = gkeCluster;
    }

    private MembershipEndpointGetArgs() {
        this.gkeCluster = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MembershipEndpointGkeClusterGetArgs> gkeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeCluster = defaults.gkeCluster;
        }

        public Builder gkeCluster(@Nullable Output<MembershipEndpointGkeClusterGetArgs> gkeCluster) {
            this.gkeCluster = gkeCluster;
            return this;
        }
        public Builder gkeCluster(@Nullable MembershipEndpointGkeClusterGetArgs gkeCluster) {
            this.gkeCluster = Codegen.ofNullable(gkeCluster);
            return this;
        }        public MembershipEndpointGetArgs build() {
            return new MembershipEndpointGetArgs(gkeCluster);
        }
    }
}
