// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.EndpointInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.inputs.StepResponse;
import java.util.List;
import java.util.Objects;


/**
 * Trace represents one simulated packet forwarding path. * Each trace contains multiple ordered steps. * Each step is in a particular state with associated configuration. * State is categorized as final or non-final states. * Each final state has a reason associated. * Each trace must end with a final state (the last step). ```|---------------------Trace----------------------| Step1(State) Step2(State) --- StepN(State(final))```
 * 
 */
public final class TraceResponse extends io.pulumi.resources.InvokeArgs {

    public static final TraceResponse Empty = new TraceResponse();

    /**
     * Derived from the source and destination endpoints definition specified by user request, and validated by the data plane model. If there are multiple traces starting from different source locations, then the endpoint_info may be different between traces.
     * 
     */
    @InputImport(name="endpointInfo", required=true)
    private final EndpointInfoResponse endpointInfo;

    public EndpointInfoResponse getEndpointInfo() {
        return this.endpointInfo;
    }

    /**
     * A trace of a test contains multiple steps from the initial state to the final state (delivered, dropped, forwarded, or aborted). The steps are ordered by the processing sequence within the simulated network state machine. It is critical to preserve the order of the steps and avoid reordering or sorting them.
     * 
     */
    @InputImport(name="steps", required=true)
    private final List<StepResponse> steps;

    public List<StepResponse> getSteps() {
        return this.steps;
    }

    public TraceResponse(
        EndpointInfoResponse endpointInfo,
        List<StepResponse> steps) {
        this.endpointInfo = Objects.requireNonNull(endpointInfo, "expected parameter 'endpointInfo' to be non-null");
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
    }

    private TraceResponse() {
        this.endpointInfo = null;
        this.steps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointInfoResponse endpointInfo;
        private List<StepResponse> steps;

        public Builder() {
    	      // Empty
        }

        public Builder(TraceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInfo = defaults.endpointInfo;
    	      this.steps = defaults.steps;
        }

        public Builder setEndpointInfo(EndpointInfoResponse endpointInfo) {
            this.endpointInfo = Objects.requireNonNull(endpointInfo);
            return this;
        }

        public Builder setSteps(List<StepResponse> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }

        public TraceResponse build() {
            return new TraceResponse(endpointInfo, steps);
        }
    }
}
