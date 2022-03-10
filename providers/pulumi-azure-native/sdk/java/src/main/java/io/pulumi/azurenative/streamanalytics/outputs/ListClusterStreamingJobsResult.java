// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.ClusterJobResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ListClusterStreamingJobsResult {
    /**
     * The URL to fetch the next set of streaming jobs.
     * 
     */
    private final String nextLink;
    /**
     * A list of streaming jobs.
     * 
     */
    private final List<ClusterJobResponse> value;

    @OutputCustomType.Constructor
    private ListClusterStreamingJobsResult(
        @OutputCustomType.Parameter("nextLink") String nextLink,
        @OutputCustomType.Parameter("value") List<ClusterJobResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * The URL to fetch the next set of streaming jobs.
     * 
    */
    public String getNextLink() {
        return this.nextLink;
    }
    /**
     * A list of streaming jobs.
     * 
    */
    public List<ClusterJobResponse> getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListClusterStreamingJobsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nextLink;
        private List<ClusterJobResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListClusterStreamingJobsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(String nextLink) {
            this.nextLink = Objects.requireNonNull(nextLink);
            return this;
        }

        public Builder value(List<ClusterJobResponse> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListClusterStreamingJobsResult build() {
            return new ListClusterStreamingJobsResult(nextLink, value);
        }
    }
}
