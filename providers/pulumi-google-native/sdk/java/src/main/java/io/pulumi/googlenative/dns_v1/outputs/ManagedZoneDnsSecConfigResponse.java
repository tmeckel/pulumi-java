// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dns_v1.outputs.DnsKeySpecResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagedZoneDnsSecConfigResponse {
    /**
     * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF.
     * 
     */
    private final List<DnsKeySpecResponse> defaultKeySpecs;
    private final String kind;
    /**
     * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
     * 
     */
    private final String nonExistence;
    /**
     * Specifies whether DNSSEC is enabled, and what mode it is in.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"defaultKeySpecs","kind","nonExistence","state"})
    private ManagedZoneDnsSecConfigResponse(
        List<DnsKeySpecResponse> defaultKeySpecs,
        String kind,
        String nonExistence,
        String state) {
        this.defaultKeySpecs = Objects.requireNonNull(defaultKeySpecs);
        this.kind = Objects.requireNonNull(kind);
        this.nonExistence = Objects.requireNonNull(nonExistence);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF.
     * 
     */
    public List<DnsKeySpecResponse> getDefaultKeySpecs() {
        return this.defaultKeySpecs;
    }
    public String getKind() {
        return this.kind;
    }
    /**
     * Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF.
     * 
     */
    public String getNonExistence() {
        return this.nonExistence;
    }
    /**
     * Specifies whether DNSSEC is enabled, and what mode it is in.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnsSecConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DnsKeySpecResponse> defaultKeySpecs;
        private String kind;
        private String nonExistence;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneDnsSecConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKeySpecs = defaults.defaultKeySpecs;
    	      this.kind = defaults.kind;
    	      this.nonExistence = defaults.nonExistence;
    	      this.state = defaults.state;
        }

        public Builder setDefaultKeySpecs(List<DnsKeySpecResponse> defaultKeySpecs) {
            this.defaultKeySpecs = Objects.requireNonNull(defaultKeySpecs);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setNonExistence(String nonExistence) {
            this.nonExistence = Objects.requireNonNull(nonExistence);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public ManagedZoneDnsSecConfigResponse build() {
            return new ManagedZoneDnsSecConfigResponse(defaultKeySpecs, kind, nonExistence, state);
        }
    }
}
