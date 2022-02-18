// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ManualResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ScheduleResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2TriggerResponse {
    /**
     * For use with hybrid jobs. Jobs must be manually created and finished.
     * 
     */
    private final GooglePrivacyDlpV2ManualResponse manual;
    /**
     * Create a job on a repeating basis based on the elapse of time.
     * 
     */
    private final GooglePrivacyDlpV2ScheduleResponse schedule;

    @OutputCustomType.Constructor({"manual","schedule"})
    private GooglePrivacyDlpV2TriggerResponse(
        GooglePrivacyDlpV2ManualResponse manual,
        GooglePrivacyDlpV2ScheduleResponse schedule) {
        this.manual = Objects.requireNonNull(manual);
        this.schedule = Objects.requireNonNull(schedule);
    }

    /**
     * For use with hybrid jobs. Jobs must be manually created and finished.
     * 
     */
    public GooglePrivacyDlpV2ManualResponse getManual() {
        return this.manual;
    }
    /**
     * Create a job on a repeating basis based on the elapse of time.
     * 
     */
    public GooglePrivacyDlpV2ScheduleResponse getSchedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ManualResponse manual;
        private GooglePrivacyDlpV2ScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manual = defaults.manual;
    	      this.schedule = defaults.schedule;
        }

        public Builder setManual(GooglePrivacyDlpV2ManualResponse manual) {
            this.manual = Objects.requireNonNull(manual);
            return this;
        }

        public Builder setSchedule(GooglePrivacyDlpV2ScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public GooglePrivacyDlpV2TriggerResponse build() {
            return new GooglePrivacyDlpV2TriggerResponse(manual, schedule);
        }
    }
}
