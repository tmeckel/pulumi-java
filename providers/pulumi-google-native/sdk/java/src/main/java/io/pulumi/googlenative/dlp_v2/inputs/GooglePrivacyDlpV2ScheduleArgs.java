// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Schedule for inspect job triggers.
 * 
 */
public final class GooglePrivacyDlpV2ScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ScheduleArgs Empty = new GooglePrivacyDlpV2ScheduleArgs();

    /**
     * With this option a job is started a regular periodic basis. For example: every day (86400 seconds). A scheduled start time will be skipped if the previous execution has not ended when its scheduled time occurs. This value must be set to a time duration greater than or equal to 1 day and can be no longer than 60 days.
     * 
     */
    @Import(name="recurrencePeriodDuration")
      private final @Nullable Output<String> recurrencePeriodDuration;

    public Output<String> getRecurrencePeriodDuration() {
        return this.recurrencePeriodDuration == null ? Codegen.empty() : this.recurrencePeriodDuration;
    }

    public GooglePrivacyDlpV2ScheduleArgs(@Nullable Output<String> recurrencePeriodDuration) {
        this.recurrencePeriodDuration = recurrencePeriodDuration;
    }

    private GooglePrivacyDlpV2ScheduleArgs() {
        this.recurrencePeriodDuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> recurrencePeriodDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrencePeriodDuration = defaults.recurrencePeriodDuration;
        }

        public Builder recurrencePeriodDuration(@Nullable Output<String> recurrencePeriodDuration) {
            this.recurrencePeriodDuration = recurrencePeriodDuration;
            return this;
        }
        public Builder recurrencePeriodDuration(@Nullable String recurrencePeriodDuration) {
            this.recurrencePeriodDuration = Codegen.ofNullable(recurrencePeriodDuration);
            return this;
        }        public GooglePrivacyDlpV2ScheduleArgs build() {
            return new GooglePrivacyDlpV2ScheduleArgs(recurrencePeriodDuration);
        }
    }
}
