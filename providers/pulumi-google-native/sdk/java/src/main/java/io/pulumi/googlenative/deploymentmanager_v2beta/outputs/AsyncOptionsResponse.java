// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_v2beta.outputs.PollingOptionsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AsyncOptionsResponse {
    /**
     * Method regex where this policy will apply.
     * 
     */
    private final String methodMatch;
    /**
     * Deployment manager will poll instances for this API resource setting a RUNNING state, and blocking until polling conditions tell whether the resource is completed or failed.
     * 
     */
    private final PollingOptionsResponse pollingOptions;

    @OutputCustomType.Constructor({"methodMatch","pollingOptions"})
    private AsyncOptionsResponse(
        String methodMatch,
        PollingOptionsResponse pollingOptions) {
        this.methodMatch = Objects.requireNonNull(methodMatch);
        this.pollingOptions = Objects.requireNonNull(pollingOptions);
    }

    /**
     * Method regex where this policy will apply.
     * 
     */
    public String getMethodMatch() {
        return this.methodMatch;
    }
    /**
     * Deployment manager will poll instances for this API resource setting a RUNNING state, and blocking until polling conditions tell whether the resource is completed or failed.
     * 
     */
    public PollingOptionsResponse getPollingOptions() {
        return this.pollingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AsyncOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String methodMatch;
        private PollingOptionsResponse pollingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(AsyncOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methodMatch = defaults.methodMatch;
    	      this.pollingOptions = defaults.pollingOptions;
        }

        public Builder setMethodMatch(String methodMatch) {
            this.methodMatch = Objects.requireNonNull(methodMatch);
            return this;
        }

        public Builder setPollingOptions(PollingOptionsResponse pollingOptions) {
            this.pollingOptions = Objects.requireNonNull(pollingOptions);
            return this;
        }

        public AsyncOptionsResponse build() {
            return new AsyncOptionsResponse(methodMatch, pollingOptions);
        }
    }
}
