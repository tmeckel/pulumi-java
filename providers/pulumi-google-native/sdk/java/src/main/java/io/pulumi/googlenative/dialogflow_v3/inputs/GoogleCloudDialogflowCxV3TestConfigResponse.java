// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents configurations for a test case.
 * 
 */
public final class GoogleCloudDialogflowCxV3TestConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3TestConfigResponse Empty = new GoogleCloudDialogflowCxV3TestConfigResponse();

    /**
     * Flow name. If not set, default start flow is assumed. Format: `projects//locations//agents//flows/`.
     * 
     */
    @InputImport(name="flow", required=true)
    private final String flow;

    public String getFlow() {
        return this.flow;
    }

    /**
     * Session parameters to be compared when calculating differences.
     * 
     */
    @InputImport(name="trackingParameters", required=true)
    private final List<String> trackingParameters;

    public List<String> getTrackingParameters() {
        return this.trackingParameters;
    }

    public GoogleCloudDialogflowCxV3TestConfigResponse(
        String flow,
        List<String> trackingParameters) {
        this.flow = Objects.requireNonNull(flow, "expected parameter 'flow' to be non-null");
        this.trackingParameters = Objects.requireNonNull(trackingParameters, "expected parameter 'trackingParameters' to be non-null");
    }

    private GoogleCloudDialogflowCxV3TestConfigResponse() {
        this.flow = null;
        this.trackingParameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3TestConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flow;
        private List<String> trackingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3TestConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flow = defaults.flow;
    	      this.trackingParameters = defaults.trackingParameters;
        }

        public Builder setFlow(String flow) {
            this.flow = Objects.requireNonNull(flow);
            return this;
        }

        public Builder setTrackingParameters(List<String> trackingParameters) {
            this.trackingParameters = Objects.requireNonNull(trackingParameters);
            return this;
        }

        public GoogleCloudDialogflowCxV3TestConfigResponse build() {
            return new GoogleCloudDialogflowCxV3TestConfigResponse(flow, trackingParameters);
        }
    }
}
