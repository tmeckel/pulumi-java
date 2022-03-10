// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1.outputs.RRSetRoutingPolicyGeoPolicyResponse;
import io.pulumi.googlenative.dns_v1.outputs.RRSetRoutingPolicyWrrPolicyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RRSetRoutingPolicyResponse {
    private final RRSetRoutingPolicyGeoPolicyResponse geo;
    private final String kind;
    private final RRSetRoutingPolicyWrrPolicyResponse wrr;

    @OutputCustomType.Constructor
    private RRSetRoutingPolicyResponse(
        @OutputCustomType.Parameter("geo") RRSetRoutingPolicyGeoPolicyResponse geo,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("wrr") RRSetRoutingPolicyWrrPolicyResponse wrr) {
        this.geo = geo;
        this.kind = kind;
        this.wrr = wrr;
    }

    public RRSetRoutingPolicyGeoPolicyResponse getGeo() {
        return this.geo;
    }
    public String getKind() {
        return this.kind;
    }
    public RRSetRoutingPolicyWrrPolicyResponse getWrr() {
        return this.wrr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyGeoPolicyResponse geo;
        private String kind;
        private RRSetRoutingPolicyWrrPolicyResponse wrr;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geo = defaults.geo;
    	      this.kind = defaults.kind;
    	      this.wrr = defaults.wrr;
        }

        public Builder geo(RRSetRoutingPolicyGeoPolicyResponse geo) {
            this.geo = Objects.requireNonNull(geo);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder wrr(RRSetRoutingPolicyWrrPolicyResponse wrr) {
            this.wrr = Objects.requireNonNull(wrr);
            return this;
        }
        public RRSetRoutingPolicyResponse build() {
            return new RRSetRoutingPolicyResponse(geo, kind, wrr);
        }
    }
}
