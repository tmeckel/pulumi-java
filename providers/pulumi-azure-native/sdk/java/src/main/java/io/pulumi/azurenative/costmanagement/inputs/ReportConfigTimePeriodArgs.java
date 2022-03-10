// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The start and end date for pulling data for the report.
 * 
 */
public final class ReportConfigTimePeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportConfigTimePeriodArgs Empty = new ReportConfigTimePeriodArgs();

    /**
     * The start date to pull data from.
     * 
     */
    @InputImport(name="from", required=true)
      private final Input<String> from;

    public Input<String> getFrom() {
        return this.from;
    }

    /**
     * The end date to pull data to.
     * 
     */
    @InputImport(name="to", required=true)
      private final Input<String> to;

    public Input<String> getTo() {
        return this.to;
    }

    public ReportConfigTimePeriodArgs(
        Input<String> from,
        Input<String> to) {
        this.from = Objects.requireNonNull(from, "expected parameter 'from' to be non-null");
        this.to = Objects.requireNonNull(to, "expected parameter 'to' to be non-null");
    }

    private ReportConfigTimePeriodArgs() {
        this.from = Input.empty();
        this.to = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigTimePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> from;
        private Input<String> to;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigTimePeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(Input<String> from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }

        public Builder from(String from) {
            this.from = Input.of(Objects.requireNonNull(from));
            return this;
        }

        public Builder to(Input<String> to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }

        public Builder to(String to) {
            this.to = Input.of(Objects.requireNonNull(to));
            return this;
        }
        public ReportConfigTimePeriodArgs build() {
            return new ReportConfigTimePeriodArgs(from, to);
        }
    }
}
