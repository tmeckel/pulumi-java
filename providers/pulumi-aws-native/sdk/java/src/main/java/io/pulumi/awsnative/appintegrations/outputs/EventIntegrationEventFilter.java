// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appintegrations.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EventIntegrationEventFilter {
    /**
     * The source of the events.
     * 
     */
    private final String source;

    @OutputCustomType.Constructor
    private EventIntegrationEventFilter(@OutputCustomType.Parameter("source") String source) {
        this.source = source;
    }

    /**
     * The source of the events.
     * 
    */
    public String getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventIntegrationEventFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(EventIntegrationEventFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public EventIntegrationEventFilter build() {
            return new EventIntegrationEventFilter(source);
        }
    }
}
