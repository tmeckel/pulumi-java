// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InspectConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The inspectTemplate contains a configuration (set of types of sensitive data to be detected) to be used anywhere you otherwise would normally specify InspectConfig. See https://cloud.google.com/dlp/docs/concepts-templates to learn more.
 * 
 */
public final class GooglePrivacyDlpV2InspectTemplateResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectTemplateResponse Empty = new GooglePrivacyDlpV2InspectTemplateResponse();

    /**
     * The creation timestamp of an inspectTemplate.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    /**
     * @return The creation timestamp of an inspectTemplate.
     * 
     */
    public String createTime() {
        return this.createTime;
    }

    /**
     * Short description (max 256 chars).
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return Short description (max 256 chars).
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * Display name (max 256 chars).
     * 
     */
    @Import(name="displayName", required=true)
    private String displayName;

    /**
     * @return Display name (max 256 chars).
     * 
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * The core content of the template. Configuration of the scanning process.
     * 
     */
    @Import(name="inspectConfig", required=true)
    private GooglePrivacyDlpV2InspectConfigResponse inspectConfig;

    /**
     * @return The core content of the template. Configuration of the scanning process.
     * 
     */
    public GooglePrivacyDlpV2InspectConfigResponse inspectConfig() {
        return this.inspectConfig;
    }

    /**
     * The template name. The template will have one of the following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The template name. The template will have one of the following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The last update timestamp of an inspectTemplate.
     * 
     */
    @Import(name="updateTime", required=true)
    private String updateTime;

    /**
     * @return The last update timestamp of an inspectTemplate.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    private GooglePrivacyDlpV2InspectTemplateResponse() {}

    private GooglePrivacyDlpV2InspectTemplateResponse(GooglePrivacyDlpV2InspectTemplateResponse $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.displayName = $.displayName;
        this.inspectConfig = $.inspectConfig;
        this.name = $.name;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2InspectTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2InspectTemplateResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2InspectTemplateResponse();
        }

        public Builder(GooglePrivacyDlpV2InspectTemplateResponse defaults) {
            $ = new GooglePrivacyDlpV2InspectTemplateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The creation timestamp of an inspectTemplate.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param description Short description (max 256 chars).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param displayName Display name (max 256 chars).
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param inspectConfig The core content of the template. Configuration of the scanning process.
         * 
         * @return builder
         * 
         */
        public Builder inspectConfig(GooglePrivacyDlpV2InspectConfigResponse inspectConfig) {
            $.inspectConfig = inspectConfig;
            return this;
        }

        /**
         * @param name The template name. The template will have one of the following formats: `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param updateTime The last update timestamp of an inspectTemplate.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public GooglePrivacyDlpV2InspectTemplateResponse build() {
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.inspectConfig = Objects.requireNonNull($.inspectConfig, "expected parameter 'inspectConfig' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}
