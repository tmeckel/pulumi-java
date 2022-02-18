// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Compute Engine forwarding rule.
 * 
 */
public final class ForwardingRuleInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ForwardingRuleInfoResponse Empty = new ForwardingRuleInfoResponse();

    /**
     * Name of a Compute Engine forwarding rule.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Port range defined in the forwarding rule that matches the test.
     * 
     */
    @InputImport(name="matchedPortRange", required=true)
    private final String matchedPortRange;

    public String getMatchedPortRange() {
        return this.matchedPortRange;
    }

    /**
     * Protocol defined in the forwarding rule that matches the test.
     * 
     */
    @InputImport(name="matchedProtocol", required=true)
    private final String matchedProtocol;

    public String getMatchedProtocol() {
        return this.matchedProtocol;
    }

    /**
     * Network URI. Only valid for Internal Load Balancer.
     * 
     */
    @InputImport(name="networkUri", required=true)
    private final String networkUri;

    public String getNetworkUri() {
        return this.networkUri;
    }

    /**
     * Target type of the forwarding rule.
     * 
     */
    @InputImport(name="target", required=true)
    private final String target;

    public String getTarget() {
        return this.target;
    }

    /**
     * URI of a Compute Engine forwarding rule.
     * 
     */
    @InputImport(name="uri", required=true)
    private final String uri;

    public String getUri() {
        return this.uri;
    }

    /**
     * VIP of the forwarding rule.
     * 
     */
    @InputImport(name="vip", required=true)
    private final String vip;

    public String getVip() {
        return this.vip;
    }

    public ForwardingRuleInfoResponse(
        String displayName,
        String matchedPortRange,
        String matchedProtocol,
        String networkUri,
        String target,
        String uri,
        String vip) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.matchedPortRange = Objects.requireNonNull(matchedPortRange, "expected parameter 'matchedPortRange' to be non-null");
        this.matchedProtocol = Objects.requireNonNull(matchedProtocol, "expected parameter 'matchedProtocol' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.vip = Objects.requireNonNull(vip, "expected parameter 'vip' to be non-null");
    }

    private ForwardingRuleInfoResponse() {
        this.displayName = null;
        this.matchedPortRange = null;
        this.matchedProtocol = null;
        this.networkUri = null;
        this.target = null;
        this.uri = null;
        this.vip = null;
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

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setMatchedPortRange(String matchedPortRange) {
            this.matchedPortRange = Objects.requireNonNull(matchedPortRange);
            return this;
        }

        public Builder setMatchedProtocol(String matchedProtocol) {
            this.matchedProtocol = Objects.requireNonNull(matchedProtocol);
            return this;
        }

        public Builder setNetworkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }

        public Builder setTarget(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setVip(String vip) {
            this.vip = Objects.requireNonNull(vip);
            return this;
        }

        public ForwardingRuleInfoResponse build() {
            return new ForwardingRuleInfoResponse(displayName, matchedPortRange, matchedProtocol, networkUri, target, uri, vip);
        }
    }
}
