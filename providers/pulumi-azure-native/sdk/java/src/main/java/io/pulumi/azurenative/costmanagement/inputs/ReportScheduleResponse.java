// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportRecurrencePeriodResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReportScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportScheduleResponse Empty = new ReportScheduleResponse();

    @InputImport(name="recurrence", required=true)
    private final String recurrence;

    public String getRecurrence() {
        return this.recurrence;
    }

    @InputImport(name="recurrencePeriod")
    private final @Nullable ReportRecurrencePeriodResponse recurrencePeriod;

    public Optional<ReportRecurrencePeriodResponse> getRecurrencePeriod() {
        return this.recurrencePeriod == null ? Optional.empty() : Optional.ofNullable(this.recurrencePeriod);
    }

    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public ReportScheduleResponse(
        String recurrence,
        @Nullable ReportRecurrencePeriodResponse recurrencePeriod,
        @Nullable String status) {
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.recurrencePeriod = recurrencePeriod;
        this.status = status;
    }

    private ReportScheduleResponse() {
        this.recurrence = null;
        this.recurrencePeriod = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recurrence;
        private @Nullable ReportRecurrencePeriodResponse recurrencePeriod;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrence = defaults.recurrence;
    	      this.recurrencePeriod = defaults.recurrencePeriod;
    	      this.status = defaults.status;
        }

        public Builder setRecurrence(String recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }

        public Builder setRecurrencePeriod(@Nullable ReportRecurrencePeriodResponse recurrencePeriod) {
            this.recurrencePeriod = recurrencePeriod;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public ReportScheduleResponse build() {
            return new ReportScheduleResponse(recurrence, recurrencePeriod, status);
        }
    }
}
