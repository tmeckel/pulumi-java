// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Quota contains the essential parameters needed that can be applied on the resources, methods, API source combination associated with this API product. While Quota is optional, setting it prevents requests from exceeding the provisioned parameters.
 * 
 */
public final class GoogleCloudApigeeV1QuotaArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1QuotaArgs Empty = new GoogleCloudApigeeV1QuotaArgs();

    /**
     * Time interval over which the number of request messages is calculated.
     * 
     */
    @InputImport(name="interval", required=true)
    private final Input<String> interval;

    public Input<String> getInterval() {
        return this.interval;
    }

    /**
     * Upper limit allowed for the time interval and time unit specified. Requests exceeding this limit will be rejected.
     * 
     */
    @InputImport(name="limit", required=true)
    private final Input<String> limit;

    public Input<String> getLimit() {
        return this.limit;
    }

    /**
     * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`. If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is null.
     * 
     */
    @InputImport(name="timeUnit")
    private final @Nullable Input<String> timeUnit;

    public Input<String> getTimeUnit() {
        return this.timeUnit == null ? Input.empty() : this.timeUnit;
    }

    public GoogleCloudApigeeV1QuotaArgs(
        Input<String> interval,
        Input<String> limit,
        @Nullable Input<String> timeUnit) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.timeUnit = timeUnit;
    }

    private GoogleCloudApigeeV1QuotaArgs() {
        this.interval = Input.empty();
        this.limit = Input.empty();
        this.timeUnit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1QuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> interval;
        private Input<String> limit;
        private @Nullable Input<String> timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1QuotaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.limit = defaults.limit;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder setInterval(Input<String> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setInterval(String interval) {
            this.interval = Input.of(Objects.requireNonNull(interval));
            return this;
        }

        public Builder setLimit(Input<String> limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }

        public Builder setLimit(String limit) {
            this.limit = Input.of(Objects.requireNonNull(limit));
            return this;
        }

        public Builder setTimeUnit(@Nullable Input<String> timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }

        public Builder setTimeUnit(@Nullable String timeUnit) {
            this.timeUnit = Input.ofNullable(timeUnit);
            return this;
        }

        public GoogleCloudApigeeV1QuotaArgs build() {
            return new GoogleCloudApigeeV1QuotaArgs(interval, limit, timeUnit);
        }
    }
}
