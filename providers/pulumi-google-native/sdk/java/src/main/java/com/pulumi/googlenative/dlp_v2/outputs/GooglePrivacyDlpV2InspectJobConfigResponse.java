// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ActionResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectConfigResponse;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2StorageConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2InspectJobConfigResponse {
    /**
     * @return Actions to execute at the completion of the job.
     * 
     */
    private final List<GooglePrivacyDlpV2ActionResponse> actions;
    /**
     * @return How and what to scan for.
     * 
     */
    private final GooglePrivacyDlpV2InspectConfigResponse inspectConfig;
    /**
     * @return If provided, will be used as the default for all values in InspectConfig. `inspect_config` will be merged into the values persisted as part of the template.
     * 
     */
    private final String inspectTemplateName;
    /**
     * @return The data to scan.
     * 
     */
    private final GooglePrivacyDlpV2StorageConfigResponse storageConfig;

    @CustomType.Constructor
    private GooglePrivacyDlpV2InspectJobConfigResponse(
        @CustomType.Parameter("actions") List<GooglePrivacyDlpV2ActionResponse> actions,
        @CustomType.Parameter("inspectConfig") GooglePrivacyDlpV2InspectConfigResponse inspectConfig,
        @CustomType.Parameter("inspectTemplateName") String inspectTemplateName,
        @CustomType.Parameter("storageConfig") GooglePrivacyDlpV2StorageConfigResponse storageConfig) {
        this.actions = actions;
        this.inspectConfig = inspectConfig;
        this.inspectTemplateName = inspectTemplateName;
        this.storageConfig = storageConfig;
    }

    /**
     * @return Actions to execute at the completion of the job.
     * 
     */
    public List<GooglePrivacyDlpV2ActionResponse> actions() {
        return this.actions;
    }
    /**
     * @return How and what to scan for.
     * 
     */
    public GooglePrivacyDlpV2InspectConfigResponse inspectConfig() {
        return this.inspectConfig;
    }
    /**
     * @return If provided, will be used as the default for all values in InspectConfig. `inspect_config` will be merged into the values persisted as part of the template.
     * 
     */
    public String inspectTemplateName() {
        return this.inspectTemplateName;
    }
    /**
     * @return The data to scan.
     * 
     */
    public GooglePrivacyDlpV2StorageConfigResponse storageConfig() {
        return this.storageConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectJobConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2ActionResponse> actions;
        private GooglePrivacyDlpV2InspectConfigResponse inspectConfig;
        private String inspectTemplateName;
        private GooglePrivacyDlpV2StorageConfigResponse storageConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectJobConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.inspectConfig = defaults.inspectConfig;
    	      this.inspectTemplateName = defaults.inspectTemplateName;
    	      this.storageConfig = defaults.storageConfig;
        }

        public Builder actions(List<GooglePrivacyDlpV2ActionResponse> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(GooglePrivacyDlpV2ActionResponse... actions) {
            return actions(List.of(actions));
        }
        public Builder inspectConfig(GooglePrivacyDlpV2InspectConfigResponse inspectConfig) {
            this.inspectConfig = Objects.requireNonNull(inspectConfig);
            return this;
        }
        public Builder inspectTemplateName(String inspectTemplateName) {
            this.inspectTemplateName = Objects.requireNonNull(inspectTemplateName);
            return this;
        }
        public Builder storageConfig(GooglePrivacyDlpV2StorageConfigResponse storageConfig) {
            this.storageConfig = Objects.requireNonNull(storageConfig);
            return this;
        }        public GooglePrivacyDlpV2InspectJobConfigResponse build() {
            return new GooglePrivacyDlpV2InspectJobConfigResponse(actions, inspectConfig, inspectTemplateName, storageConfig);
        }
    }
}
