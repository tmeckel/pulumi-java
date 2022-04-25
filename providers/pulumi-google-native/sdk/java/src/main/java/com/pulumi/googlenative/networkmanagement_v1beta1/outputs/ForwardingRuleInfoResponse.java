// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ForwardingRuleInfoResponse {
    /**
     * @return Name of a Compute Engine forwarding rule.
     * 
     */
    private final String displayName;
    /**
     * @return Port range defined in the forwarding rule that matches the test.
     * 
     */
    private final String matchedPortRange;
    /**
     * @return Protocol defined in the forwarding rule that matches the test.
     * 
     */
    private final String matchedProtocol;
    /**
     * @return Network URI. Only valid for Internal Load Balancer.
     * 
     */
    private final String networkUri;
    /**
     * @return Target type of the forwarding rule.
     * 
     */
    private final String target;
    /**
     * @return URI of a Compute Engine forwarding rule.
     * 
     */
    private final String uri;
    /**
     * @return VIP of the forwarding rule.
     * 
     */
    private final String vip;

    @CustomType.Constructor
    private ForwardingRuleInfoResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("matchedPortRange") String matchedPortRange,
        @CustomType.Parameter("matchedProtocol") String matchedProtocol,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("uri") String uri,
        @CustomType.Parameter("vip") String vip) {
        this.displayName = displayName;
        this.matchedPortRange = matchedPortRange;
        this.matchedProtocol = matchedProtocol;
        this.networkUri = networkUri;
        this.target = target;
        this.uri = uri;
        this.vip = vip;
    }

    /**
     * @return Name of a Compute Engine forwarding rule.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Port range defined in the forwarding rule that matches the test.
     * 
     */
    public String matchedPortRange() {
        return this.matchedPortRange;
    }
    /**
     * @return Protocol defined in the forwarding rule that matches the test.
     * 
     */
    public String matchedProtocol() {
        return this.matchedProtocol;
    }
    /**
     * @return Network URI. Only valid for Internal Load Balancer.
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * @return Target type of the forwarding rule.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return URI of a Compute Engine forwarding rule.
     * 
     */
    public String uri() {
        return this.uri;
    }
    /**
     * @return VIP of the forwarding rule.
     * 
     */
    public String vip() {
        return this.vip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForwardingRuleInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String matchedPortRange;
        private String matchedProtocol;
        private String networkUri;
        private String target;
        private String uri;
        private String vip;

        public Builder() {
    	      // Empty
        }

        public Builder(ForwardingRuleInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.matchedPortRange = defaults.matchedPortRange;
    	      this.matchedProtocol = defaults.matchedProtocol;
    	      this.networkUri = defaults.networkUri;
    	      this.target = defaults.target;
    	      this.uri = defaults.uri;
    	      this.vip = defaults.vip;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder matchedPortRange(String matchedPortRange) {
            this.matchedPortRange = Objects.requireNonNull(matchedPortRange);
            return this;
        }
        public Builder matchedProtocol(String matchedProtocol) {
            this.matchedProtocol = Objects.requireNonNull(matchedProtocol);
            return this;
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder vip(String vip) {
            this.vip = Objects.requireNonNull(vip);
            return this;
        }        public ForwardingRuleInfoResponse build() {
            return new ForwardingRuleInfoResponse(displayName, matchedPortRange, matchedProtocol, networkUri, target, uri, vip);
        }
    }
}
