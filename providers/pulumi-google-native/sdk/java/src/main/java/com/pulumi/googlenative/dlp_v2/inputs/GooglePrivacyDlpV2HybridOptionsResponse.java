// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TableOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Configuration to control jobs where the content being inspected is outside of Google Cloud Platform.
 * 
 */
public final class GooglePrivacyDlpV2HybridOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2HybridOptionsResponse Empty = new GooglePrivacyDlpV2HybridOptionsResponse();

    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
     */
    @Import(name="description", required=true)
    private String description;

    /**
     * @return A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
     */
    public String description() {
        return this.description;
    }

    /**
     * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
     * 
     */
    @Import(name="labels", required=true)
    private Map<String,String> labels;

    /**
     * @return To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }

    /**
     * These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
     */
    @Import(name="requiredFindingLabelKeys", required=true)
    private List<String> requiredFindingLabelKeys;

    /**
     * @return These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
     */
    public List<String> requiredFindingLabelKeys() {
        return this.requiredFindingLabelKeys;
    }

    /**
     * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
     */
    @Import(name="tableOptions", required=true)
    private GooglePrivacyDlpV2TableOptionsResponse tableOptions;

    /**
     * @return If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
     */
    public GooglePrivacyDlpV2TableOptionsResponse tableOptions() {
        return this.tableOptions;
    }

    private GooglePrivacyDlpV2HybridOptionsResponse() {}

    private GooglePrivacyDlpV2HybridOptionsResponse(GooglePrivacyDlpV2HybridOptionsResponse $) {
        this.description = $.description;
        this.labels = $.labels;
        this.requiredFindingLabelKeys = $.requiredFindingLabelKeys;
        this.tableOptions = $.tableOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2HybridOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2HybridOptionsResponse $;

        public Builder() {
            $ = new GooglePrivacyDlpV2HybridOptionsResponse();
        }

        public Builder(GooglePrivacyDlpV2HybridOptionsResponse defaults) {
            $ = new GooglePrivacyDlpV2HybridOptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A short description of where the data is coming from. Will be stored once in the job. 256 max length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            $.description = description;
            return this;
        }

        /**
         * @param labels To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `&#34;environment&#34; : &#34;production&#34;` * `&#34;pipeline&#34; : &#34;etl&#34;`
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param requiredFindingLabelKeys These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
         * 
         * @return builder
         * 
         */
        public Builder requiredFindingLabelKeys(List<String> requiredFindingLabelKeys) {
            $.requiredFindingLabelKeys = requiredFindingLabelKeys;
            return this;
        }

        /**
         * @param requiredFindingLabelKeys These are labels that each inspection request must include within their &#39;finding_labels&#39; map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
         * 
         * @return builder
         * 
         */
        public Builder requiredFindingLabelKeys(String... requiredFindingLabelKeys) {
            return requiredFindingLabelKeys(List.of(requiredFindingLabelKeys));
        }

        /**
         * @param tableOptions If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
         * 
         * @return builder
         * 
         */
        public Builder tableOptions(GooglePrivacyDlpV2TableOptionsResponse tableOptions) {
            $.tableOptions = tableOptions;
            return this;
        }

        public GooglePrivacyDlpV2HybridOptionsResponse build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.requiredFindingLabelKeys = Objects.requireNonNull($.requiredFindingLabelKeys, "expected parameter 'requiredFindingLabelKeys' to be non-null");
            $.tableOptions = Objects.requireNonNull($.tableOptions, "expected parameter 'tableOptions' to be non-null");
            return $;
        }
    }

}
