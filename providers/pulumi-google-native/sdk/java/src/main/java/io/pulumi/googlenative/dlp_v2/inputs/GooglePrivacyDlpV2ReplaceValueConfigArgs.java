// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Replace each input value with a given `Value`.
 * 
 */
public final class GooglePrivacyDlpV2ReplaceValueConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ReplaceValueConfigArgs Empty = new GooglePrivacyDlpV2ReplaceValueConfigArgs();

    /**
     * Value to replace it with.
     * 
     */
    @Import(name="newValue")
      private final @Nullable Output<GooglePrivacyDlpV2ValueArgs> newValue;

    public Output<GooglePrivacyDlpV2ValueArgs> getNewValue() {
        return this.newValue == null ? Codegen.empty() : this.newValue;
    }

    public GooglePrivacyDlpV2ReplaceValueConfigArgs(@Nullable Output<GooglePrivacyDlpV2ValueArgs> newValue) {
        this.newValue = newValue;
    }

    private GooglePrivacyDlpV2ReplaceValueConfigArgs() {
        this.newValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ReplaceValueConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2ValueArgs> newValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ReplaceValueConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newValue = defaults.newValue;
        }

        public Builder newValue(@Nullable Output<GooglePrivacyDlpV2ValueArgs> newValue) {
            this.newValue = newValue;
            return this;
        }
        public Builder newValue(@Nullable GooglePrivacyDlpV2ValueArgs newValue) {
            this.newValue = Codegen.ofNullable(newValue);
            return this;
        }        public GooglePrivacyDlpV2ReplaceValueConfigArgs build() {
            return new GooglePrivacyDlpV2ReplaceValueConfigArgs(newValue);
        }
    }
}
