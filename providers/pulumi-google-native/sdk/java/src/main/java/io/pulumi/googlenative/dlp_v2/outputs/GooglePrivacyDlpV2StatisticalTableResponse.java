// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2BigQueryTableResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2QuasiIdentifierFieldResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2StatisticalTableResponse {
    /**
     * Quasi-identifier columns.
     * 
     */
    private final List<GooglePrivacyDlpV2QuasiIdentifierFieldResponse> quasiIds;
    /**
     * The relative frequency column must contain a floating-point number between 0 and 1 (inclusive). Null values are assumed to be zero.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse relativeFrequency;
    /**
     * Auxiliary table location.
     * 
     */
    private final GooglePrivacyDlpV2BigQueryTableResponse table;

    @OutputCustomType.Constructor({"quasiIds","relativeFrequency","table"})
    private GooglePrivacyDlpV2StatisticalTableResponse(
        List<GooglePrivacyDlpV2QuasiIdentifierFieldResponse> quasiIds,
        GooglePrivacyDlpV2FieldIdResponse relativeFrequency,
        GooglePrivacyDlpV2BigQueryTableResponse table) {
        this.quasiIds = Objects.requireNonNull(quasiIds);
        this.relativeFrequency = Objects.requireNonNull(relativeFrequency);
        this.table = Objects.requireNonNull(table);
    }

    /**
     * Quasi-identifier columns.
     * 
     */
    public List<GooglePrivacyDlpV2QuasiIdentifierFieldResponse> getQuasiIds() {
        return this.quasiIds;
    }
    /**
     * The relative frequency column must contain a floating-point number between 0 and 1 (inclusive). Null values are assumed to be zero.
     * 
     */
    public GooglePrivacyDlpV2FieldIdResponse getRelativeFrequency() {
        return this.relativeFrequency;
    }
    /**
     * Auxiliary table location.
     * 
     */
    public GooglePrivacyDlpV2BigQueryTableResponse getTable() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StatisticalTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2QuasiIdentifierFieldResponse> quasiIds;
        private GooglePrivacyDlpV2FieldIdResponse relativeFrequency;
        private GooglePrivacyDlpV2BigQueryTableResponse table;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StatisticalTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quasiIds = defaults.quasiIds;
    	      this.relativeFrequency = defaults.relativeFrequency;
    	      this.table = defaults.table;
        }

        public Builder setQuasiIds(List<GooglePrivacyDlpV2QuasiIdentifierFieldResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }

        public Builder setRelativeFrequency(GooglePrivacyDlpV2FieldIdResponse relativeFrequency) {
            this.relativeFrequency = Objects.requireNonNull(relativeFrequency);
            return this;
        }

        public Builder setTable(GooglePrivacyDlpV2BigQueryTableResponse table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public GooglePrivacyDlpV2StatisticalTableResponse build() {
            return new GooglePrivacyDlpV2StatisticalTableResponse(quasiIds, relativeFrequency, table);
        }
    }
}
