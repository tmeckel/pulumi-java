// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Trigger based on total requests.
 * 
 */
public final class RequestsBasedTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final RequestsBasedTriggerResponse Empty = new RequestsBasedTriggerResponse();

    /**
     * Request Count.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * Time interval.
     * 
     */
    @InputImport(name="timeInterval")
      private final @Nullable String timeInterval;

    public Optional<String> getTimeInterval() {
        return this.timeInterval == null ? Optional.empty() : Optional.ofNullable(this.timeInterval);
    }

    public RequestsBasedTriggerResponse(
        @Nullable Integer count,
        @Nullable String timeInterval) {
        this.count = count;
        this.timeInterval = timeInterval;
    }

    private RequestsBasedTriggerResponse() {
        this.count = null;
        this.timeInterval = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestsBasedTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String timeInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestsBasedTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.timeInterval = defaults.timeInterval;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder timeInterval(@Nullable String timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }
        public RequestsBasedTriggerResponse build() {
            return new RequestsBasedTriggerResponse(count, timeInterval);
        }
    }
}
