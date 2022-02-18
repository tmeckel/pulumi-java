// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Max findings configuration per infoType, per content item or long running DlpJob.
 * 
 */
public final class GooglePrivacyDlpV2InfoTypeLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2InfoTypeLimitArgs Empty = new GooglePrivacyDlpV2InfoTypeLimitArgs();

    /**
     * Type of information the findings limit applies to. Only one limit per info_type should be provided. If InfoTypeLimit does not have an info_type, the DLP API applies the limit against all info_types that are found but not specified in another InfoTypeLimit.
     * 
     */
    @InputImport(name="infoType")
    private final @Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> infoType;

    public Input<GooglePrivacyDlpV2InfoTypeArgs> getInfoType() {
        return this.infoType == null ? Input.empty() : this.infoType;
    }

    /**
     * Max findings limit for the given infoType.
     * 
     */
    @InputImport(name="maxFindings")
    private final @Nullable Input<Integer> maxFindings;

    public Input<Integer> getMaxFindings() {
        return this.maxFindings == null ? Input.empty() : this.maxFindings;
    }

    public GooglePrivacyDlpV2InfoTypeLimitArgs(
        @Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> infoType,
        @Nullable Input<Integer> maxFindings) {
        this.infoType = infoType;
        this.maxFindings = maxFindings;
    }

    private GooglePrivacyDlpV2InfoTypeLimitArgs() {
        this.infoType = Input.empty();
        this.maxFindings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> infoType;
        private @Nullable Input<Integer> maxFindings;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoType = defaults.infoType;
    	      this.maxFindings = defaults.maxFindings;
        }

        public Builder setInfoType(@Nullable Input<GooglePrivacyDlpV2InfoTypeArgs> infoType) {
            this.infoType = infoType;
            return this;
        }

        public Builder setInfoType(@Nullable GooglePrivacyDlpV2InfoTypeArgs infoType) {
            this.infoType = Input.ofNullable(infoType);
            return this;
        }

        public Builder setMaxFindings(@Nullable Input<Integer> maxFindings) {
            this.maxFindings = maxFindings;
            return this;
        }

        public Builder setMaxFindings(@Nullable Integer maxFindings) {
            this.maxFindings = Input.ofNullable(maxFindings);
            return this;
        }

        public GooglePrivacyDlpV2InfoTypeLimitArgs build() {
            return new GooglePrivacyDlpV2InfoTypeLimitArgs(infoType, maxFindings);
        }
    }
}
