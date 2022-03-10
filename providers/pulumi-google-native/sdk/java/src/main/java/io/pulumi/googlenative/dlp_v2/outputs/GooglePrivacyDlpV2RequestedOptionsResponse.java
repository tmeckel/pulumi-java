// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectJobConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectTemplateResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2RequestedOptionsResponse {
    /**
     * Inspect config.
     * 
     */
    private final GooglePrivacyDlpV2InspectJobConfigResponse jobConfig;
    /**
     * If run with an InspectTemplate, a snapshot of its state at the time of this run.
     * 
     */
    private final GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate;

    @OutputCustomType.Constructor
    private GooglePrivacyDlpV2RequestedOptionsResponse(
        @OutputCustomType.Parameter("jobConfig") GooglePrivacyDlpV2InspectJobConfigResponse jobConfig,
        @OutputCustomType.Parameter("snapshotInspectTemplate") GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate) {
        this.jobConfig = jobConfig;
        this.snapshotInspectTemplate = snapshotInspectTemplate;
    }

    /**
     * Inspect config.
     * 
    */
    public GooglePrivacyDlpV2InspectJobConfigResponse getJobConfig() {
        return this.jobConfig;
    }
    /**
     * If run with an InspectTemplate, a snapshot of its state at the time of this run.
     * 
    */
    public GooglePrivacyDlpV2InspectTemplateResponse getSnapshotInspectTemplate() {
        return this.snapshotInspectTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RequestedOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InspectJobConfigResponse jobConfig;
        private GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RequestedOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobConfig = defaults.jobConfig;
    	      this.snapshotInspectTemplate = defaults.snapshotInspectTemplate;
        }

        public Builder jobConfig(GooglePrivacyDlpV2InspectJobConfigResponse jobConfig) {
            this.jobConfig = Objects.requireNonNull(jobConfig);
            return this;
        }

        public Builder snapshotInspectTemplate(GooglePrivacyDlpV2InspectTemplateResponse snapshotInspectTemplate) {
            this.snapshotInspectTemplate = Objects.requireNonNull(snapshotInspectTemplate);
            return this;
        }
        public GooglePrivacyDlpV2RequestedOptionsResponse build() {
            return new GooglePrivacyDlpV2RequestedOptionsResponse(jobConfig, snapshotInspectTemplate);
        }
    }
}
