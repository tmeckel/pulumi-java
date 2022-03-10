// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A widget that displays a stream of log.
 * 
 */
public final class LogsPanelResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogsPanelResponse Empty = new LogsPanelResponse();

    /**
     * A filter that chooses which log entries to return. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries). Only log entries that match the filter are returned. An empty filter matches all log entries.
     * 
     */
    @InputImport(name="filter", required=true)
      private final String filter;

    public String getFilter() {
        return this.filter;
    }

    /**
     * The names of logging resources to collect logs for. Currently only projects are supported. If empty, the widget will default to the host project.
     * 
     */
    @InputImport(name="resourceNames", required=true)
      private final List<String> resourceNames;

    public List<String> getResourceNames() {
        return this.resourceNames;
    }

    public LogsPanelResponse(
        String filter,
        List<String> resourceNames) {
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.resourceNames = Objects.requireNonNull(resourceNames, "expected parameter 'resourceNames' to be non-null");
    }

    private LogsPanelResponse() {
        this.filter = null;
        this.resourceNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogsPanelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String filter;
        private List<String> resourceNames;

        public Builder() {
    	      // Empty
        }

        public Builder(LogsPanelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.resourceNames = defaults.resourceNames;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder resourceNames(List<String> resourceNames) {
            this.resourceNames = Objects.requireNonNull(resourceNames);
            return this;
        }
        public LogsPanelResponse build() {
            return new LogsPanelResponse(filter, resourceNames);
        }
    }
}
