// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GoogleProtobufEmptyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A column with a semantic tag attached.
 * 
 */
public final class GooglePrivacyDlpV2QuasiIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2QuasiIdArgs Empty = new GooglePrivacyDlpV2QuasiIdArgs();

    /**
     * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
     * 
     */
    @Import(name="customTag")
      private final @Nullable Output<String> customTag;

    public Output<String> getCustomTag() {
        return this.customTag == null ? Codegen.empty() : this.customTag;
    }

    /**
     * Identifies the column.
     * 
     */
    @Import(name="field", required=true)
      private final Output<GooglePrivacyDlpV2FieldIdArgs> field;

    public Output<GooglePrivacyDlpV2FieldIdArgs> getField() {
        return this.field;
    }

    /**
     * If no semantic tag is indicated, we infer the statistical model from the distribution of values in the input data
     * 
     */
    @Import(name="inferred")
      private final @Nullable Output<GoogleProtobufEmptyArgs> inferred;

    public Output<GoogleProtobufEmptyArgs> getInferred() {
        return this.inferred == null ? Codegen.empty() : this.inferred;
    }

    /**
     * A column can be tagged with a InfoType to use the relevant public dataset as a statistical model of population, if available. We currently support US ZIP codes, region codes, ages and genders. To programmatically obtain the list of supported InfoTypes, use ListInfoTypes with the supported_by=RISK_ANALYSIS filter.
     * 
     */
    @Import(name="infoType")
      private final @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> infoType;

    public Output<GooglePrivacyDlpV2InfoTypeArgs> getInfoType() {
        return this.infoType == null ? Codegen.empty() : this.infoType;
    }

    public GooglePrivacyDlpV2QuasiIdArgs(
        @Nullable Output<String> customTag,
        Output<GooglePrivacyDlpV2FieldIdArgs> field,
        @Nullable Output<GoogleProtobufEmptyArgs> inferred,
        @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> infoType) {
        this.customTag = customTag;
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.inferred = inferred;
        this.infoType = infoType;
    }

    private GooglePrivacyDlpV2QuasiIdArgs() {
        this.customTag = Codegen.empty();
        this.field = Codegen.empty();
        this.inferred = Codegen.empty();
        this.infoType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2QuasiIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customTag;
        private Output<GooglePrivacyDlpV2FieldIdArgs> field;
        private @Nullable Output<GoogleProtobufEmptyArgs> inferred;
        private @Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> infoType;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2QuasiIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTag = defaults.customTag;
    	      this.field = defaults.field;
    	      this.inferred = defaults.inferred;
    	      this.infoType = defaults.infoType;
        }

        public Builder customTag(@Nullable Output<String> customTag) {
            this.customTag = customTag;
            return this;
        }
        public Builder customTag(@Nullable String customTag) {
            this.customTag = Codegen.ofNullable(customTag);
            return this;
        }
        public Builder field(Output<GooglePrivacyDlpV2FieldIdArgs> field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder field(GooglePrivacyDlpV2FieldIdArgs field) {
            this.field = Output.of(Objects.requireNonNull(field));
            return this;
        }
        public Builder inferred(@Nullable Output<GoogleProtobufEmptyArgs> inferred) {
            this.inferred = inferred;
            return this;
        }
        public Builder inferred(@Nullable GoogleProtobufEmptyArgs inferred) {
            this.inferred = Codegen.ofNullable(inferred);
            return this;
        }
        public Builder infoType(@Nullable Output<GooglePrivacyDlpV2InfoTypeArgs> infoType) {
            this.infoType = infoType;
            return this;
        }
        public Builder infoType(@Nullable GooglePrivacyDlpV2InfoTypeArgs infoType) {
            this.infoType = Codegen.ofNullable(infoType);
            return this;
        }        public GooglePrivacyDlpV2QuasiIdArgs build() {
            return new GooglePrivacyDlpV2QuasiIdArgs(customTag, field, inferred, infoType);
        }
    }
}
