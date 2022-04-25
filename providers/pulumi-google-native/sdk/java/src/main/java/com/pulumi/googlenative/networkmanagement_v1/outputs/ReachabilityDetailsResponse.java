// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkmanagement_v1.outputs.StatusResponse;
import com.pulumi.googlenative.networkmanagement_v1.outputs.TraceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReachabilityDetailsResponse {
    /**
     * @return The details of a failure or a cancellation of reachability analysis.
     * 
     */
    private final StatusResponse error;
    /**
     * @return The overall result of the test&#39;s configuration analysis.
     * 
     */
    private final String result;
    /**
     * @return Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
     * 
     */
    private final List<TraceResponse> traces;
    /**
     * @return The time of the configuration analysis.
     * 
     */
    private final String verifyTime;

    @CustomType.Constructor
    private ReachabilityDetailsResponse(
        @CustomType.Parameter("error") StatusResponse error,
        @CustomType.Parameter("result") String result,
        @CustomType.Parameter("traces") List<TraceResponse> traces,
        @CustomType.Parameter("verifyTime") String verifyTime) {
        this.error = error;
        this.result = result;
        this.traces = traces;
        this.verifyTime = verifyTime;
    }

    /**
     * @return The details of a failure or a cancellation of reachability analysis.
     * 
     */
    public StatusResponse error() {
        return this.error;
    }
    /**
     * @return The overall result of the test&#39;s configuration analysis.
     * 
     */
    public String result() {
        return this.result;
    }
    /**
     * @return Result may contain a list of traces if a test has multiple possible paths in the network, such as when destination endpoint is a load balancer with multiple backends.
     * 
     */
    public List<TraceResponse> traces() {
        return this.traces;
    }
    /**
     * @return The time of the configuration analysis.
     * 
     */
    public String verifyTime() {
        return this.verifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReachabilityDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusResponse error;
        private String result;
        private List<TraceResponse> traces;
        private String verifyTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ReachabilityDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.result = defaults.result;
    	      this.traces = defaults.traces;
    	      this.verifyTime = defaults.verifyTime;
        }

        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder result(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public Builder traces(List<TraceResponse> traces) {
            this.traces = Objects.requireNonNull(traces);
            return this;
        }
        public Builder traces(TraceResponse... traces) {
            return traces(List.of(traces));
        }
        public Builder verifyTime(String verifyTime) {
            this.verifyTime = Objects.requireNonNull(verifyTime);
            return this;
        }        public ReachabilityDetailsResponse build() {
            return new ReachabilityDetailsResponse(error, result, traces, verifyTime);
        }
    }
}
