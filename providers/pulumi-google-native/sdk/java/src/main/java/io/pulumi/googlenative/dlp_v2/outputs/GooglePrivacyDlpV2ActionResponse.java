// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2JobNotificationEmailsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PublishFindingsToCloudDataCatalogResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PublishSummaryToCsccResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PublishToPubSubResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PublishToStackdriverResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2SaveFindingsResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2ActionResponse {
    /**
     * Enable email notification for project owners and editors on job's completion/failure.
     * 
     */
    private final GooglePrivacyDlpV2JobNotificationEmailsResponse jobNotificationEmails;
    /**
     * Publish a notification to a pubsub topic.
     * 
     */
    private final GooglePrivacyDlpV2PublishToPubSubResponse pubSub;
    /**
     * Publish findings to Cloud Datahub.
     * 
     */
    private final GooglePrivacyDlpV2PublishFindingsToCloudDataCatalogResponse publishFindingsToCloudDataCatalog;
    /**
     * Publish summary to Cloud Security Command Center (Alpha).
     * 
     */
    private final GooglePrivacyDlpV2PublishSummaryToCsccResponse publishSummaryToCscc;
    /**
     * Enable Stackdriver metric dlp.googleapis.com/finding_count.
     * 
     */
    private final GooglePrivacyDlpV2PublishToStackdriverResponse publishToStackdriver;
    /**
     * Save resulting findings in a provided location.
     * 
     */
    private final GooglePrivacyDlpV2SaveFindingsResponse saveFindings;

    @OutputCustomType.Constructor({"jobNotificationEmails","pubSub","publishFindingsToCloudDataCatalog","publishSummaryToCscc","publishToStackdriver","saveFindings"})
    private GooglePrivacyDlpV2ActionResponse(
        GooglePrivacyDlpV2JobNotificationEmailsResponse jobNotificationEmails,
        GooglePrivacyDlpV2PublishToPubSubResponse pubSub,
        GooglePrivacyDlpV2PublishFindingsToCloudDataCatalogResponse publishFindingsToCloudDataCatalog,
        GooglePrivacyDlpV2PublishSummaryToCsccResponse publishSummaryToCscc,
        GooglePrivacyDlpV2PublishToStackdriverResponse publishToStackdriver,
        GooglePrivacyDlpV2SaveFindingsResponse saveFindings) {
        this.jobNotificationEmails = Objects.requireNonNull(jobNotificationEmails);
        this.pubSub = Objects.requireNonNull(pubSub);
        this.publishFindingsToCloudDataCatalog = Objects.requireNonNull(publishFindingsToCloudDataCatalog);
        this.publishSummaryToCscc = Objects.requireNonNull(publishSummaryToCscc);
        this.publishToStackdriver = Objects.requireNonNull(publishToStackdriver);
        this.saveFindings = Objects.requireNonNull(saveFindings);
    }

    /**
     * Enable email notification for project owners and editors on job's completion/failure.
     * 
     */
    public GooglePrivacyDlpV2JobNotificationEmailsResponse getJobNotificationEmails() {
        return this.jobNotificationEmails;
    }
    /**
     * Publish a notification to a pubsub topic.
     * 
     */
    public GooglePrivacyDlpV2PublishToPubSubResponse getPubSub() {
        return this.pubSub;
    }
    /**
     * Publish findings to Cloud Datahub.
     * 
     */
    public GooglePrivacyDlpV2PublishFindingsToCloudDataCatalogResponse getPublishFindingsToCloudDataCatalog() {
        return this.publishFindingsToCloudDataCatalog;
    }
    /**
     * Publish summary to Cloud Security Command Center (Alpha).
     * 
     */
    public GooglePrivacyDlpV2PublishSummaryToCsccResponse getPublishSummaryToCscc() {
        return this.publishSummaryToCscc;
    }
    /**
     * Enable Stackdriver metric dlp.googleapis.com/finding_count.
     * 
     */
    public GooglePrivacyDlpV2PublishToStackdriverResponse getPublishToStackdriver() {
        return this.publishToStackdriver;
    }
    /**
     * Save resulting findings in a provided location.
     * 
     */
    public GooglePrivacyDlpV2SaveFindingsResponse getSaveFindings() {
        return this.saveFindings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2JobNotificationEmailsResponse jobNotificationEmails;
        private GooglePrivacyDlpV2PublishToPubSubResponse pubSub;
        private GooglePrivacyDlpV2PublishFindingsToCloudDataCatalogResponse publishFindingsToCloudDataCatalog;
        private GooglePrivacyDlpV2PublishSummaryToCsccResponse publishSummaryToCscc;
        private GooglePrivacyDlpV2PublishToStackdriverResponse publishToStackdriver;
        private GooglePrivacyDlpV2SaveFindingsResponse saveFindings;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobNotificationEmails = defaults.jobNotificationEmails;
    	      this.pubSub = defaults.pubSub;
    	      this.publishFindingsToCloudDataCatalog = defaults.publishFindingsToCloudDataCatalog;
    	      this.publishSummaryToCscc = defaults.publishSummaryToCscc;
    	      this.publishToStackdriver = defaults.publishToStackdriver;
    	      this.saveFindings = defaults.saveFindings;
        }

        public Builder setJobNotificationEmails(GooglePrivacyDlpV2JobNotificationEmailsResponse jobNotificationEmails) {
            this.jobNotificationEmails = Objects.requireNonNull(jobNotificationEmails);
            return this;
        }

        public Builder setPubSub(GooglePrivacyDlpV2PublishToPubSubResponse pubSub) {
            this.pubSub = Objects.requireNonNull(pubSub);
            return this;
        }

        public Builder setPublishFindingsToCloudDataCatalog(GooglePrivacyDlpV2PublishFindingsToCloudDataCatalogResponse publishFindingsToCloudDataCatalog) {
            this.publishFindingsToCloudDataCatalog = Objects.requireNonNull(publishFindingsToCloudDataCatalog);
            return this;
        }

        public Builder setPublishSummaryToCscc(GooglePrivacyDlpV2PublishSummaryToCsccResponse publishSummaryToCscc) {
            this.publishSummaryToCscc = Objects.requireNonNull(publishSummaryToCscc);
            return this;
        }

        public Builder setPublishToStackdriver(GooglePrivacyDlpV2PublishToStackdriverResponse publishToStackdriver) {
            this.publishToStackdriver = Objects.requireNonNull(publishToStackdriver);
            return this;
        }

        public Builder setSaveFindings(GooglePrivacyDlpV2SaveFindingsResponse saveFindings) {
            this.saveFindings = Objects.requireNonNull(saveFindings);
            return this;
        }

        public GooglePrivacyDlpV2ActionResponse build() {
            return new GooglePrivacyDlpV2ActionResponse(jobNotificationEmails, pubSub, publishFindingsToCloudDataCatalog, publishSummaryToCscc, publishToStackdriver, saveFindings);
        }
    }
}
