// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1beta2.outputs.RRSetRoutingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ResourceRecordSetResponse {
    private final String kind;
    /**
     * For example, www.example.com.
     * 
     */
    private final String name;
    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    private final RRSetRoutingPolicyResponse routingPolicy;
    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    private final List<String> rrdatas;
    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    private final List<String> signatureRrdatas;
    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    private final Integer ttl;
    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private ResourceRecordSetResponse(
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("routingPolicy") RRSetRoutingPolicyResponse routingPolicy,
        @OutputCustomType.Parameter("rrdatas") List<String> rrdatas,
        @OutputCustomType.Parameter("signatureRrdatas") List<String> signatureRrdatas,
        @OutputCustomType.Parameter("ttl") Integer ttl,
        @OutputCustomType.Parameter("type") String type) {
        this.kind = kind;
        this.name = name;
        this.routingPolicy = routingPolicy;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
        this.ttl = ttl;
        this.type = type;
    }

    public String getKind() {
        return this.kind;
    }
    /**
     * For example, www.example.com.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
    */
    public RRSetRoutingPolicyResponse getRoutingPolicy() {
        return this.routingPolicy;
    }
    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
    */
    public List<String> getRrdatas() {
        return this.rrdatas;
    }
    /**
     * As defined in RFC 4034 (section 3.2).
     * 
    */
    public List<String> getSignatureRrdatas() {
        return this.signatureRrdatas;
    }
    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
    */
    public Integer getTtl() {
        return this.ttl;
    }
    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceRecordSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String name;
        private RRSetRoutingPolicyResponse routingPolicy;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;
        private Integer ttl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceRecordSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.routingPolicy = defaults.routingPolicy;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder routingPolicy(RRSetRoutingPolicyResponse routingPolicy) {
            this.routingPolicy = Objects.requireNonNull(routingPolicy);
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

        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ResourceRecordSetResponse build() {
            return new ResourceRecordSetResponse(kind, name, routingPolicy, rrdatas, signatureRrdatas, ttl, type);
        }
    }
}
