// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1.inputs.RRSetRoutingPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A unit of data that is returned by the DNS servers.
 * 
 */
public final class ResourceRecordSetResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceRecordSetResponse Empty = new ResourceRecordSetResponse();

    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * For example, www.example.com.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return For example, www.example.com.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    @Import(name="routingPolicy", required=true)
    private RRSetRoutingPolicyResponse routingPolicy;

    /**
     * @return Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
     * 
     */
    public RRSetRoutingPolicyResponse routingPolicy() {
        return this.routingPolicy;
    }

    /**
     * As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    @Import(name="rrdatas", required=true)
    private List<String> rrdatas;

    /**
     * @return As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
     * 
     */
    public List<String> rrdatas() {
        return this.rrdatas;
    }

    /**
     * As defined in RFC 4034 (section 3.2).
     * 
     */
    @Import(name="signatureRrdatas", required=true)
    private List<String> signatureRrdatas;

    /**
     * @return As defined in RFC 4034 (section 3.2).
     * 
     */
    public List<String> signatureRrdatas() {
        return this.signatureRrdatas;
    }

    /**
     * Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    @Import(name="ttl", required=true)
    private Integer ttl;

    /**
     * @return Number of seconds that this ResourceRecordSet can be cached by resolvers.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }

    /**
     * The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The identifier of a supported record type. See the list of Supported DNS record types.
     * 
     */
    public String type() {
        return this.type;
    }

    private ResourceRecordSetResponse() {}

    private ResourceRecordSetResponse(ResourceRecordSetResponse $) {
        this.kind = $.kind;
        this.name = $.name;
        this.routingPolicy = $.routingPolicy;
        this.rrdatas = $.rrdatas;
        this.signatureRrdatas = $.signatureRrdatas;
        this.ttl = $.ttl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceRecordSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceRecordSetResponse $;

        public Builder() {
            $ = new ResourceRecordSetResponse();
        }

        public Builder(ResourceRecordSetResponse defaults) {
            $ = new ResourceRecordSetResponse(Objects.requireNonNull(defaults));
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name For example, www.example.com.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param routingPolicy Configures dynamic query responses based on geo location of querying user or a weighted round robin based routing policy. A ResourceRecordSet should only have either rrdata (static) or routing_policy (dynamic). An error is returned otherwise.
         * 
         * @return builder
         * 
         */
        public Builder routingPolicy(RRSetRoutingPolicyResponse routingPolicy) {
            $.routingPolicy = routingPolicy;
            return this;
        }

        /**
         * @param rrdatas As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(List<String> rrdatas) {
            $.rrdatas = rrdatas;
            return this;
        }

        /**
         * @param rrdatas As defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1) -- see examples.
         * 
         * @return builder
         * 
         */
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }

        /**
         * @param signatureRrdatas As defined in RFC 4034 (section 3.2).
         * 
         * @return builder
         * 
         */
        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            $.signatureRrdatas = signatureRrdatas;
            return this;
        }

        /**
         * @param signatureRrdatas As defined in RFC 4034 (section 3.2).
         * 
         * @return builder
         * 
         */
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }

        /**
         * @param ttl Number of seconds that this ResourceRecordSet can be cached by resolvers.
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param type The identifier of a supported record type. See the list of Supported DNS record types.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public ResourceRecordSetResponse build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.routingPolicy = Objects.requireNonNull($.routingPolicy, "expected parameter 'routingPolicy' to be non-null");
            $.rrdatas = Objects.requireNonNull($.rrdatas, "expected parameter 'rrdatas' to be non-null");
            $.signatureRrdatas = Objects.requireNonNull($.signatureRrdatas, "expected parameter 'signatureRrdatas' to be non-null");
            $.ttl = Objects.requireNonNull($.ttl, "expected parameter 'ttl' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
