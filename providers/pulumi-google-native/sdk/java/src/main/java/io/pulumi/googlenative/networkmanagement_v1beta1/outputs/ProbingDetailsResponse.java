// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.EndpointInfoResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.LatencyDistributionResponse;
import io.pulumi.googlenative.networkmanagement_v1beta1.outputs.StatusResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ProbingDetailsResponse {
    /**
     * The reason probing was aborted.
     * 
     */
    private final String abortCause;
    /**
     * The source and destination endpoints derived from the test input and used for active probing.
     * 
     */
    private final EndpointInfoResponse endpointInfo;
    /**
     * Details about an internal failure or the cancellation of active probing.
     * 
     */
    private final StatusResponse error;
    /**
     * Latency as measured by active probing in one direction: from the source to the destination endpoint.
     * 
     */
    private final LatencyDistributionResponse probingLatency;
    /**
     * The overall result of active probing.
     * 
     */
    private final String result;
    /**
     * Number of probes sent.
     * 
     */
    private final Integer sentProbeCount;
    /**
     * Number of probes that reached the destination.
     * 
     */
    private final Integer successfulProbeCount;
    /**
     * The time that reachability was assessed through active probing.
     * 
     */
    private final String verifyTime;

    @OutputCustomType.Constructor({"abortCause","endpointInfo","error","probingLatency","result","sentProbeCount","successfulProbeCount","verifyTime"})
    private ProbingDetailsResponse(
        String abortCause,
        EndpointInfoResponse endpointInfo,
        StatusResponse error,
        LatencyDistributionResponse probingLatency,
        String result,
        Integer sentProbeCount,
        Integer successfulProbeCount,
        String verifyTime) {
        this.abortCause = Objects.requireNonNull(abortCause);
        this.endpointInfo = Objects.requireNonNull(endpointInfo);
        this.error = Objects.requireNonNull(error);
        this.probingLatency = Objects.requireNonNull(probingLatency);
        this.result = Objects.requireNonNull(result);
        this.sentProbeCount = Objects.requireNonNull(sentProbeCount);
        this.successfulProbeCount = Objects.requireNonNull(successfulProbeCount);
        this.verifyTime = Objects.requireNonNull(verifyTime);
    }

    /**
     * The reason probing was aborted.
     * 
     */
    public String getAbortCause() {
        return this.abortCause;
    }
    /**
     * The source and destination endpoints derived from the test input and used for active probing.
     * 
     */
    public EndpointInfoResponse getEndpointInfo() {
        return this.endpointInfo;
    }
    /**
     * Details about an internal failure or the cancellation of active probing.
     * 
     */
    public StatusResponse getError() {
        return this.error;
    }
    /**
     * Latency as measured by active probing in one direction: from the source to the destination endpoint.
     * 
     */
    public LatencyDistributionResponse getProbingLatency() {
        return this.probingLatency;
    }
    /**
     * The overall result of active probing.
     * 
     */
    public String getResult() {
        return this.result;
    }
    /**
     * Number of probes sent.
     * 
     */
    public Integer getSentProbeCount() {
        return this.sentProbeCount;
    }
    /**
     * Number of probes that reached the destination.
     * 
     */
    public Integer getSuccessfulProbeCount() {
        return this.successfulProbeCount;
    }
    /**
     * The time that reachability was assessed through active probing.
     * 
     */
    public String getVerifyTime() {
        return this.verifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProbingDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String abortCause;
        private EndpointInfoResponse endpointInfo;
        private StatusResponse error;
        private LatencyDistributionResponse probingLatency;
        private String result;
        private Integer sentProbeCount;
        private Integer successfulProbeCount;
        private String verifyTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ProbingDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortCause = defaults.abortCause;
    	      this.endpointInfo = defaults.endpointInfo;
    	      this.error = defaults.error;
    	      this.probingLatency = defaults.probingLatency;
    	      this.result = defaults.result;
    	      this.sentProbeCount = defaults.sentProbeCount;
    	      this.successfulProbeCount = defaults.successfulProbeCount;
    	      this.verifyTime = defaults.verifyTime;
        }

        public Builder setAbortCause(String abortCause) {
            this.abortCause = Objects.requireNonNull(abortCause);
            return this;
        }

        public Builder setEndpointInfo(EndpointInfoResponse endpointInfo) {
            this.endpointInfo = Objects.requireNonNull(endpointInfo);
            return this;
        }

        public Builder setError(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setProbingLatency(LatencyDistributionResponse probingLatency) {
            this.probingLatency = Objects.requireNonNull(probingLatency);
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setSentProbeCount(Integer sentProbeCount) {
            this.sentProbeCount = Objects.requireNonNull(sentProbeCount);
            return this;
        }

        public Builder setSuccessfulProbeCount(Integer successfulProbeCount) {
            this.successfulProbeCount = Objects.requireNonNull(successfulProbeCount);
            return this;
        }

        public Builder setVerifyTime(String verifyTime) {
            this.verifyTime = Objects.requireNonNull(verifyTime);
            return this;
        }

        public ProbingDetailsResponse build() {
            return new ProbingDetailsResponse(abortCause, endpointInfo, error, probingLatency, result, sentProbeCount, successfulProbeCount, verifyTime);
        }
    }
}
