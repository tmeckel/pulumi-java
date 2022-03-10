// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TableOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration to control jobs where the content being inspected is outside of Google Cloud Platform.
 * 
 */
public final class GooglePrivacyDlpV2HybridOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2HybridOptionsArgs Empty = new GooglePrivacyDlpV2HybridOptionsArgs();

    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * To organize findings, these labels will be added to each finding. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`. No more than 10 labels can be associated with a given finding. Examples: * `"environment" : "production"` * `"pipeline" : "etl"`
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * These are labels that each inspection request must include within their 'finding_labels' map. Request may contain others, but any missing one of these will be rejected. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. No more than 10 keys can be required.
     * 
     */
    @InputImport(name="requiredFindingLabelKeys")
      private final @Nullable Input<List<String>> requiredFindingLabelKeys;

    public Input<List<String>> getRequiredFindingLabelKeys() {
        return this.requiredFindingLabelKeys == null ? Input.empty() : this.requiredFindingLabelKeys;
    }

    /**
     * If the container is a table, additional information to make findings meaningful such as the columns that are primary keys.
     * 
     */
    @InputImport(name="tableOptions")
      private final @Nullable Input<GooglePrivacyDlpV2TableOptionsArgs> tableOptions;

    public Input<GooglePrivacyDlpV2TableOptionsArgs> getTableOptions() {
        return this.tableOptions == null ? Input.empty() : this.tableOptions;
    }

    public GooglePrivacyDlpV2HybridOptionsArgs(
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<List<String>> requiredFindingLabelKeys,
        @Nullable Input<GooglePrivacyDlpV2TableOptionsArgs> tableOptions) {
        this.description = description;
        this.labels = labels;
        this.requiredFindingLabelKeys = requiredFindingLabelKeys;
        this.tableOptions = tableOptions;
    }

    private GooglePrivacyDlpV2HybridOptionsArgs() {
        this.description = Input.empty();
        this.labels = Input.empty();
        this.requiredFindingLabelKeys = Input.empty();
        this.tableOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2HybridOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<List<String>> requiredFindingLabelKeys;
        private @Nullable Input<GooglePrivacyDlpV2TableOptionsArgs> tableOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2HybridOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.requiredFindingLabelKeys = defaults.requiredFindingLabelKeys;
    	      this.tableOptions = defaults.tableOptions;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder requiredFindingLabelKeys(@Nullable Input<List<String>> requiredFindingLabelKeys) {
            this.requiredFindingLabelKeys = requiredFindingLabelKeys;
            return this;
        }

        public Builder requiredFindingLabelKeys(@Nullable List<String> requiredFindingLabelKeys) {
            this.requiredFindingLabelKeys = Input.ofNullable(requiredFindingLabelKeys);
            return this;
        }

        public Builder tableOptions(@Nullable Input<GooglePrivacyDlpV2TableOptionsArgs> tableOptions) {
            this.tableOptions = tableOptions;
            return this;
        }

        public Builder tableOptions(@Nullable GooglePrivacyDlpV2TableOptionsArgs tableOptions) {
            this.tableOptions = Input.ofNullable(tableOptions);
            return this;
        }
        public GooglePrivacyDlpV2HybridOptionsArgs build() {
            return new GooglePrivacyDlpV2HybridOptionsArgs(description, labels, requiredFindingLabelKeys, tableOptions);
        }
    }
}
