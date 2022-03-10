// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2OutputStorageConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * If set, the detailed findings will be persisted to the specified OutputStorageConfig. Only a single instance of this action can be specified. Compatible with: Inspect, Risk
 * 
 */
public final class GooglePrivacyDlpV2SaveFindingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2SaveFindingsArgs Empty = new GooglePrivacyDlpV2SaveFindingsArgs();

    /**
     * Location to store findings outside of DLP.
     * 
     */
    @InputImport(name="outputConfig")
      private final @Nullable Input<GooglePrivacyDlpV2OutputStorageConfigArgs> outputConfig;

    public Input<GooglePrivacyDlpV2OutputStorageConfigArgs> getOutputConfig() {
        return this.outputConfig == null ? Input.empty() : this.outputConfig;
    }

    public GooglePrivacyDlpV2SaveFindingsArgs(@Nullable Input<GooglePrivacyDlpV2OutputStorageConfigArgs> outputConfig) {
        this.outputConfig = outputConfig;
    }

    private GooglePrivacyDlpV2SaveFindingsArgs() {
        this.outputConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2SaveFindingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2OutputStorageConfigArgs> outputConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2SaveFindingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputConfig = defaults.outputConfig;
        }

        public Builder outputConfig(@Nullable Input<GooglePrivacyDlpV2OutputStorageConfigArgs> outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }

        public Builder outputConfig(@Nullable GooglePrivacyDlpV2OutputStorageConfigArgs outputConfig) {
            this.outputConfig = Input.ofNullable(outputConfig);
            return this;
        }
        public GooglePrivacyDlpV2SaveFindingsArgs build() {
            return new GooglePrivacyDlpV2SaveFindingsArgs(outputConfig);
        }
    }
}
