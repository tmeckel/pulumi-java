// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class HttpConfigResponse {
    /**
     * If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests to DeviceService will fail for this registry.
     * 
     */
    private final String httpEnabledState;

    @OutputCustomType.Constructor({"httpEnabledState"})
    private HttpConfigResponse(String httpEnabledState) {
        this.httpEnabledState = Objects.requireNonNull(httpEnabledState);
    }

    /**
     * If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests to DeviceService will fail for this registry.
     * 
     */
    public String getHttpEnabledState() {
        return this.httpEnabledState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpEnabledState;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEnabledState = defaults.httpEnabledState;
        }

        public Builder setHttpEnabledState(String httpEnabledState) {
            this.httpEnabledState = Objects.requireNonNull(httpEnabledState);
            return this;
        }

        public HttpConfigResponse build() {
            return new HttpConfigResponse(httpEnabledState);
        }
    }
}
