// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * A service with basic scaling will create an instance when the application receives a request. The instance will be turned down when the app becomes idle. Basic scaling is ideal for work that is intermittent or driven by user activity.
 * 
 */
public final class BasicScalingResponse extends io.pulumi.resources.InvokeArgs {

    public static final BasicScalingResponse Empty = new BasicScalingResponse();

    /**
     * Duration of time after the last request that an instance must wait before the instance is shut down.
     * 
     */
    @InputImport(name="idleTimeout", required=true)
    private final String idleTimeout;

    public String getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * Maximum number of instances to create for this version.
     * 
     */
    @InputImport(name="maxInstances", required=true)
    private final Integer maxInstances;

    public Integer getMaxInstances() {
        return this.maxInstances;
    }

    public BasicScalingResponse(
        String idleTimeout,
        Integer maxInstances) {
        this.idleTimeout = Objects.requireNonNull(idleTimeout, "expected parameter 'idleTimeout' to be non-null");
        this.maxInstances = Objects.requireNonNull(maxInstances, "expected parameter 'maxInstances' to be non-null");
    }

    private BasicScalingResponse() {
        this.idleTimeout = null;
        this.maxInstances = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String idleTimeout;
        private Integer maxInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.maxInstances = defaults.maxInstances;
        }

        public Builder setIdleTimeout(String idleTimeout) {
            this.idleTimeout = Objects.requireNonNull(idleTimeout);
            return this;
        }

        public Builder setMaxInstances(Integer maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }

        public BasicScalingResponse build() {
            return new BasicScalingResponse(idleTimeout, maxInstances);
        }
    }
}
