// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A routing block which contains the routing information for one WRR item.
 * 
 */
public final class RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse Empty = new RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse();

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    @InputImport(name="rrdatas", required=true)
      private final List<String> rrdatas;

    public List<String> getRrdatas() {
        return this.rrdatas;
    }

    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
     */
    @InputImport(name="signatureRrdatas", required=true)
      private final List<String> signatureRrdatas;

    public List<String> getSignatureRrdatas() {
        return this.signatureRrdatas;
    }

    /**
     * The weight corresponding to this subset of rrdata. When multiple WeightedRoundRobinPolicyItems are configured, the probability of returning an rrset is proportional to its weight relative to the sum of weights configured for all items. This weight should be non-negative.
     * 
     */
    @InputImport(name="weight", required=true)
      private final Double weight;

    public Double getWeight() {
        return this.weight;
    }

    public RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse(
        String kind,
        List<String> rrdatas,
        List<String> signatureRrdatas,
        Double weight) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.rrdatas = Objects.requireNonNull(rrdatas, "expected parameter 'rrdatas' to be non-null");
        this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas, "expected parameter 'signatureRrdatas' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse() {
        this.kind = null;
        this.rrdatas = List.of();
        this.signatureRrdatas = List.of();
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;
        private Double weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.weight = defaults.weight;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder rrdatas(List<String> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }

        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
            return this;
        }

        public Builder weight(Double weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse build() {
            return new RRSetRoutingPolicyWrrPolicyWrrPolicyItemResponse(kind, rrdatas, signatureRrdatas, weight);
        }
    }
}
