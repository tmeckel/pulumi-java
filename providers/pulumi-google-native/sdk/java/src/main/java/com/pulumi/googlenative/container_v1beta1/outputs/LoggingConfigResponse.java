// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.container_v1beta1.outputs.LoggingComponentConfigResponse;
import java.util.Objects;

@CustomType
public final class LoggingConfigResponse {
    /**
     * @return Logging components configuration
     * 
     */
    private final LoggingComponentConfigResponse componentConfig;

    @CustomType.Constructor
    private LoggingConfigResponse(@CustomType.Parameter("componentConfig") LoggingComponentConfigResponse componentConfig) {
        this.componentConfig = componentConfig;
    }

    /**
     * @return Logging components configuration
     * 
     */
    public LoggingComponentConfigResponse componentConfig() {
        return this.componentConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingComponentConfigResponse componentConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentConfig = defaults.componentConfig;
        }

        public Builder componentConfig(LoggingComponentConfigResponse componentConfig) {
            this.componentConfig = Objects.requireNonNull(componentConfig);
            return this;
        }        public LoggingConfigResponse build() {
            return new LoggingConfigResponse(componentConfig);
        }
    }
}
