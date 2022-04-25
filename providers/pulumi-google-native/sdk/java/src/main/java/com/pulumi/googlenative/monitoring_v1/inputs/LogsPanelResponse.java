// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A widget that displays a stream of log.
 * 
 */
public final class LogsPanelResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogsPanelResponse Empty = new LogsPanelResponse();

    /**
     * A filter that chooses which log entries to return. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries). Only log entries that match the filter are returned. An empty filter matches all log entries.
     * 
     */
    @Import(name="filter", required=true)
    private String filter;

    /**
     * @return A filter that chooses which log entries to return. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries). Only log entries that match the filter are returned. An empty filter matches all log entries.
     * 
     */
    public String filter() {
        return this.filter;
    }

    /**
     * The names of logging resources to collect logs for. Currently only projects are supported. If empty, the widget will default to the host project.
     * 
     */
    @Import(name="resourceNames", required=true)
    private List<String> resourceNames;

    /**
     * @return The names of logging resources to collect logs for. Currently only projects are supported. If empty, the widget will default to the host project.
     * 
     */
    public List<String> resourceNames() {
        return this.resourceNames;
    }

    private LogsPanelResponse() {}

    private LogsPanelResponse(LogsPanelResponse $) {
        this.filter = $.filter;
        this.resourceNames = $.resourceNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogsPanelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogsPanelResponse $;

        public Builder() {
            $ = new LogsPanelResponse();
        }

        public Builder(LogsPanelResponse defaults) {
            $ = new LogsPanelResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param filter A filter that chooses which log entries to return. See Advanced Logs Queries (https://cloud.google.com/logging/docs/view/advanced-queries). Only log entries that match the filter are returned. An empty filter matches all log entries.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param resourceNames The names of logging resources to collect logs for. Currently only projects are supported. If empty, the widget will default to the host project.
         * 
         * @return builder
         * 
         */
        public Builder resourceNames(List<String> resourceNames) {
            $.resourceNames = resourceNames;
            return this;
        }

        /**
         * @param resourceNames The names of logging resources to collect logs for. Currently only projects are supported. If empty, the widget will default to the host project.
         * 
         * @return builder
         * 
         */
        public Builder resourceNames(String... resourceNames) {
            return resourceNames(List.of(resourceNames));
        }

        public LogsPanelResponse build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.resourceNames = Objects.requireNonNull($.resourceNames, "expected parameter 'resourceNames' to be non-null");
            return $;
        }
    }

}
