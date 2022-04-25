// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecuritySettingResult {
    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    private final String deidentifyTemplate;
    /**
     * @return The human-readable name of the security settings, unique within the location.
     * 
     */
    private final String displayName;
    /**
     * @return Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse insightsExportSettings;
    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    private final String inspectTemplate;
    /**
     * @return Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    private final String name;
    /**
     * @return List of types of data to remove when retention settings triggers purge.
     * 
     */
    private final List<String> purgeDataTypes;
    /**
     * @return Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    private final String redactionScope;
    /**
     * @return Strategy that defines how we do redaction.
     * 
     */
    private final String redactionStrategy;
    /**
     * @return Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    private final Integer retentionWindowDays;

    @CustomType.Constructor
    private GetSecuritySettingResult(
        @CustomType.Parameter("deidentifyTemplate") String deidentifyTemplate,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("insightsExportSettings") GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse insightsExportSettings,
        @CustomType.Parameter("inspectTemplate") String inspectTemplate,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("purgeDataTypes") List<String> purgeDataTypes,
        @CustomType.Parameter("redactionScope") String redactionScope,
        @CustomType.Parameter("redactionStrategy") String redactionStrategy,
        @CustomType.Parameter("retentionWindowDays") Integer retentionWindowDays) {
        this.deidentifyTemplate = deidentifyTemplate;
        this.displayName = displayName;
        this.insightsExportSettings = insightsExportSettings;
        this.inspectTemplate = inspectTemplate;
        this.name = name;
        this.purgeDataTypes = purgeDataTypes;
        this.redactionScope = redactionScope;
        this.redactionStrategy = redactionStrategy;
        this.retentionWindowDays = retentionWindowDays;
    }

    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) deidentify template name. Use this template to define de-identification configuration for the content. The `DLP De-identify Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, Dialogflow replaces sensitive info with `[redacted]` text. The template name will have one of the following formats: `projects//locations//deidentifyTemplates/` OR `organizations//locations//deidentifyTemplates/` Note: `deidentify_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public String deidentifyTemplate() {
        return this.deidentifyTemplate;
    }
    /**
     * @return The human-readable name of the security settings, unique within the location.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Controls conversation exporting settings to Insights after conversation is completed. If retention_strategy is set to REMOVE_AFTER_CONVERSATION, Insights export is disabled no matter what you configure here.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse insightsExportSettings() {
        return this.insightsExportSettings;
    }
    /**
     * @return [DLP](https://cloud.google.com/dlp/docs) inspect template name. Use this template to define inspect base settings. The `DLP Inspect Templates Reader` role is needed on the Dialogflow service identity service account (has the form `service-PROJECT_NUMBER@gcp-sa-dialogflow.iam.gserviceaccount.com`) for your agent&#39;s project. If empty, we use the default DLP inspect config. The template name will have one of the following formats: `projects//locations//inspectTemplates/` OR `organizations//locations//inspectTemplates/` Note: `inspect_template` must be located in the same region as the `SecuritySettings`.
     * 
     */
    public String inspectTemplate() {
        return this.inspectTemplate;
    }
    /**
     * @return Resource name of the settings. Required for the SecuritySettingsService.UpdateSecuritySettings method. SecuritySettingsService.CreateSecuritySettings populates the name automatically. Format: `projects//locations//securitySettings/`.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of types of data to remove when retention settings triggers purge.
     * 
     */
    public List<String> purgeDataTypes() {
        return this.purgeDataTypes;
    }
    /**
     * @return Defines the data for which Dialogflow applies redaction. Dialogflow does not redact data that it does not have access to – for example, Cloud logging.
     * 
     */
    public String redactionScope() {
        return this.redactionScope;
    }
    /**
     * @return Strategy that defines how we do redaction.
     * 
     */
    public String redactionStrategy() {
        return this.redactionStrategy;
    }
    /**
     * @return Retains data in interaction logging for the specified number of days. This does not apply to Cloud logging, which is owned by the user - not Dialogflow. User must set a value lower than Dialogflow&#39;s default 365d TTL. Setting a value higher than that has no effect. A missing value or setting to 0 also means we use Dialogflow&#39;s default TTL. Note: Interaction logging is a limited access feature. Talk to your Google representative to check availability for you.
     * 
     */
    public Integer retentionWindowDays() {
        return this.retentionWindowDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecuritySettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deidentifyTemplate;
        private String displayName;
        private GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse insightsExportSettings;
        private String inspectTemplate;
        private String name;
        private List<String> purgeDataTypes;
        private String redactionScope;
        private String redactionStrategy;
        private Integer retentionWindowDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecuritySettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deidentifyTemplate = defaults.deidentifyTemplate;
    	      this.displayName = defaults.displayName;
    	      this.insightsExportSettings = defaults.insightsExportSettings;
    	      this.inspectTemplate = defaults.inspectTemplate;
    	      this.name = defaults.name;
    	      this.purgeDataTypes = defaults.purgeDataTypes;
    	      this.redactionScope = defaults.redactionScope;
    	      this.redactionStrategy = defaults.redactionStrategy;
    	      this.retentionWindowDays = defaults.retentionWindowDays;
        }

        public Builder deidentifyTemplate(String deidentifyTemplate) {
            this.deidentifyTemplate = Objects.requireNonNull(deidentifyTemplate);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder insightsExportSettings(GoogleCloudDialogflowCxV3beta1SecuritySettingsInsightsExportSettingsResponse insightsExportSettings) {
            this.insightsExportSettings = Objects.requireNonNull(insightsExportSettings);
            return this;
        }
        public Builder inspectTemplate(String inspectTemplate) {
            this.inspectTemplate = Objects.requireNonNull(inspectTemplate);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder purgeDataTypes(List<String> purgeDataTypes) {
            this.purgeDataTypes = Objects.requireNonNull(purgeDataTypes);
            return this;
        }
        public Builder purgeDataTypes(String... purgeDataTypes) {
            return purgeDataTypes(List.of(purgeDataTypes));
        }
        public Builder redactionScope(String redactionScope) {
            this.redactionScope = Objects.requireNonNull(redactionScope);
            return this;
        }
        public Builder redactionStrategy(String redactionStrategy) {
            this.redactionStrategy = Objects.requireNonNull(redactionStrategy);
            return this;
        }
        public Builder retentionWindowDays(Integer retentionWindowDays) {
            this.retentionWindowDays = Objects.requireNonNull(retentionWindowDays);
            return this;
        }        public GetSecuritySettingResult build() {
            return new GetSecuritySettingResult(deidentifyTemplate, displayName, insightsExportSettings, inspectTemplate, name, purgeDataTypes, redactionScope, redactionStrategy, retentionWindowDays);
        }
    }
}
