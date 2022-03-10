// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1beta1.inputs.FilterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Pub/Sub specific notification config.
 * 
 */
public final class PubSubResponse extends io.pulumi.resources.InvokeArgs {

    public static final PubSubResponse Empty = new PubSubResponse();

    /**
     * Enable notifications for Pub/Sub.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Allows filtering to one or more specific event types. If no filter is specified, or if a filter is specified with no event types, all event types will be sent
     * 
     */
    @InputImport(name="filter", required=true)
      private final FilterResponse filter;

    public FilterResponse getFilter() {
        return this.filter;
    }

    /**
     * The desired Pub/Sub topic to which notifications will be sent by GKE. Format is `projects/{project}/topics/{topic}`.
     * 
     */
    @InputImport(name="topic", required=true)
      private final String topic;

    public String getTopic() {
        return this.topic;
    }

    public PubSubResponse(
        Boolean enabled,
        FilterResponse filter,
        String topic) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
        this.topic = Objects.requireNonNull(topic, "expected parameter 'topic' to be non-null");
    }

    private PubSubResponse() {
        this.enabled = null;
        this.filter = null;
        this.topic = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PubSubResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private FilterResponse filter;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(PubSubResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.filter = defaults.filter;
    	      this.topic = defaults.topic;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder filter(FilterResponse filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public PubSubResponse build() {
            return new PubSubResponse(enabled, filter, topic);
        }
    }
}
