// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.outputs;

import io.pulumi.azurenative.logz.outputs.MonitoredResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListSubAccountMonitoredResourcesResult {
    /**
     * Link to the next set of results, if any.
     * 
     */
    private final @Nullable String nextLink;
    /**
     * Results of a list operation.
     * 
     */
    private final @Nullable List<MonitoredResourceResponse> value;

    @OutputCustomType.Constructor
    private ListSubAccountMonitoredResourcesResult(
        @OutputCustomType.Parameter("nextLink") @Nullable String nextLink,
        @OutputCustomType.Parameter("value") @Nullable List<MonitoredResourceResponse> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    /**
     * Link to the next set of results, if any.
     * 
    */
    public Optional<String> getNextLink() {
        return Optional.ofNullable(this.nextLink);
    }
    /**
     * Results of a list operation.
     * 
    */
    public List<MonitoredResourceResponse> getValue() {
        return this.value == null ? List.of() : this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSubAccountMonitoredResourcesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String nextLink;
        private @Nullable List<MonitoredResourceResponse> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSubAccountMonitoredResourcesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder nextLink(@Nullable String nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder value(@Nullable List<MonitoredResourceResponse> value) {
            this.value = value;
            return this;
        }
        public ListSubAccountMonitoredResourcesResult build() {
            return new ListSubAccountMonitoredResourcesResult(nextLink, value);
        }
    }
}
