// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AllowedIpRangeResponse {
    /**
     * Optional. User-provided description. It must contain at most 300 characters.
     * 
     */
    private final String description;
    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to. Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32` or `2001:0db8:0000:0042:0000:8a2e:0370:7334`. IP range prefixes should be properly truncated. For example, `1.2.3.4/24` should be truncated to `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` should be truncated to `2001:db8::/32`.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"description","value"})
    private AllowedIpRangeResponse(
        String description,
        String value) {
        this.description = Objects.requireNonNull(description);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Optional. User-provided description. It must contain at most 300 characters.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * IP address or range, defined using CIDR notation, of requests that this rule applies to. Examples: `192.168.1.1` or `192.168.0.0/16` or `2001:db8::/32` or `2001:0db8:0000:0042:0000:8a2e:0370:7334`. IP range prefixes should be properly truncated. For example, `1.2.3.4/24` should be truncated to `1.2.3.0/24`. Similarly, for IPv6, `2001:db8::1/32` should be truncated to `2001:db8::/32`.
     * 
     */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedIpRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedIpRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.value = defaults.value;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public AllowedIpRangeResponse build() {
            return new AllowedIpRangeResponse(description, value);
        }
    }
}
