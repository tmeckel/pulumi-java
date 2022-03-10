// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RouterNatLogConfigResponse {
    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
     */
    private final Boolean enable;
    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    private final String filter;

    @OutputCustomType.Constructor
    private RouterNatLogConfigResponse(
        @OutputCustomType.Parameter("enable") Boolean enable,
        @OutputCustomType.Parameter("filter") String filter) {
        this.enable = enable;
        this.filter = filter;
    }

    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
    */
    public Boolean getEnable() {
        return this.enable;
    }
    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
    */
    public String getFilter() {
        return this.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatLogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatLogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.filter = defaults.filter;
        }

        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public RouterNatLogConfigResponse build() {
            return new RouterNatLogConfigResponse(enable, filter);
        }
    }
}
