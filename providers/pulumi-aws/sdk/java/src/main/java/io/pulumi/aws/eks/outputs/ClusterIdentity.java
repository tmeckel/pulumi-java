// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.aws.eks.outputs.ClusterIdentityOidc;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterIdentity {
    /**
     * Nested block containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
     */
    private final @Nullable List<ClusterIdentityOidc> oidcs;

    @OutputCustomType.Constructor
    private ClusterIdentity(@OutputCustomType.Parameter("oidcs") @Nullable List<ClusterIdentityOidc> oidcs) {
        this.oidcs = oidcs;
    }

    /**
     * Nested block containing [OpenID Connect](https://openid.net/connect/) identity provider information for the cluster. Detailed below.
     * 
    */
    public List<ClusterIdentityOidc> getOidcs() {
        return this.oidcs == null ? List.of() : this.oidcs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClusterIdentityOidc> oidcs;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oidcs = defaults.oidcs;
        }

        public Builder oidcs(@Nullable List<ClusterIdentityOidc> oidcs) {
            this.oidcs = oidcs;
            return this;
        }
        public ClusterIdentity build() {
            return new ClusterIdentity(oidcs);
        }
    }
}
