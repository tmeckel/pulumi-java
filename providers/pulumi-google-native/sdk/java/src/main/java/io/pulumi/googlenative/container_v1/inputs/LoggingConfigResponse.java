// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.LoggingComponentConfigResponse;
import java.util.Objects;


/**
 * LoggingConfig is cluster logging configuration.
 * 
 */
public final class LoggingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigResponse Empty = new LoggingConfigResponse();

    /**
     * Logging components configuration
     * 
     */
    @InputImport(name="componentConfig", required=true)
    private final LoggingComponentConfigResponse componentConfig;

    public LoggingComponentConfigResponse getComponentConfig() {
        return this.componentConfig;
    }

    public LoggingConfigResponse(LoggingComponentConfigResponse componentConfig) {
        this.componentConfig = Objects.requireNonNull(componentConfig, "expected parameter 'componentConfig' to be non-null");
    }

    private LoggingConfigResponse() {
        this.componentConfig = null;
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

        public Builder setComponentConfig(LoggingComponentConfigResponse componentConfig) {
            this.componentConfig = Objects.requireNonNull(componentConfig);
            return this;
        }

        public LoggingConfigResponse build() {
            return new LoggingConfigResponse(componentConfig);
        }
    }
}
