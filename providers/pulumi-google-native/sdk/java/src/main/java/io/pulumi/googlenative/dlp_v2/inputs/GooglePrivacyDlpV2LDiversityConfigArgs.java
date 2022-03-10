// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * l-diversity metric, used for analysis of reidentification risk.
 * 
 */
public final class GooglePrivacyDlpV2LDiversityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2LDiversityConfigArgs Empty = new GooglePrivacyDlpV2LDiversityConfigArgs();

    /**
     * Set of quasi-identifiers indicating how equivalence classes are defined for the l-diversity computation. When multiple fields are specified, they are considered a single composite key.
     * 
     */
    @InputImport(name="quasiIds")
      private final @Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds;

    public Input<List<GooglePrivacyDlpV2FieldIdArgs>> getQuasiIds() {
        return this.quasiIds == null ? Input.empty() : this.quasiIds;
    }

    /**
     * Sensitive field for computing the l-value.
     * 
     */
    @InputImport(name="sensitiveAttribute")
      private final @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> sensitiveAttribute;

    public Input<GooglePrivacyDlpV2FieldIdArgs> getSensitiveAttribute() {
        return this.sensitiveAttribute == null ? Input.empty() : this.sensitiveAttribute;
    }

    public GooglePrivacyDlpV2LDiversityConfigArgs(
        @Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds,
        @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> sensitiveAttribute) {
        this.quasiIds = quasiIds;
        this.sensitiveAttribute = sensitiveAttribute;
    }

    private GooglePrivacyDlpV2LDiversityConfigArgs() {
        this.quasiIds = Input.empty();
        this.sensitiveAttribute = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LDiversityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds;
        private @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> sensitiveAttribute;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LDiversityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quasiIds = defaults.quasiIds;
    	      this.sensitiveAttribute = defaults.sensitiveAttribute;
        }

        public Builder quasiIds(@Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds) {
            this.quasiIds = quasiIds;
            return this;
        }

        public Builder quasiIds(@Nullable List<GooglePrivacyDlpV2FieldIdArgs> quasiIds) {
            this.quasiIds = Input.ofNullable(quasiIds);
            return this;
        }

        public Builder sensitiveAttribute(@Nullable Input<GooglePrivacyDlpV2FieldIdArgs> sensitiveAttribute) {
            this.sensitiveAttribute = sensitiveAttribute;
            return this;
        }

        public Builder sensitiveAttribute(@Nullable GooglePrivacyDlpV2FieldIdArgs sensitiveAttribute) {
            this.sensitiveAttribute = Input.ofNullable(sensitiveAttribute);
            return this;
        }
        public GooglePrivacyDlpV2LDiversityConfigArgs build() {
            return new GooglePrivacyDlpV2LDiversityConfigArgs(quasiIds, sensitiveAttribute);
        }
    }
}
