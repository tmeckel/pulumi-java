// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventLogConfigurationResponse {
    private final @Nullable String filter;
    private final String logName;

    @OutputCustomType.Constructor
    private EventLogConfigurationResponse(
        @OutputCustomType.Parameter("filter") @Nullable String filter,
        @OutputCustomType.Parameter("logName") String logName) {
        this.filter = filter;
        this.logName = logName;
    }

    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    public String getLogName() {
        return this.logName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventLogConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String filter;
        private String logName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventLogConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filter = defaults.filter;
    	      this.logName = defaults.logName;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder logName(String logName) {
            this.logName = Objects.requireNonNull(logName);
            return this;
        }
        public EventLogConfigurationResponse build() {
            return new EventLogConfigurationResponse(filter, logName);
        }
    }
}
