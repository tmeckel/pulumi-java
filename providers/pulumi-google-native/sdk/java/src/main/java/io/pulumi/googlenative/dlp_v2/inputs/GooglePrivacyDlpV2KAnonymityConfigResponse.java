// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2EntityIdResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.List;
import java.util.Objects;


/**
 * k-anonymity metric, used for analysis of reidentification risk.
 * 
 */
public final class GooglePrivacyDlpV2KAnonymityConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2KAnonymityConfigResponse Empty = new GooglePrivacyDlpV2KAnonymityConfigResponse();

    /**
     * Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
     * 
     */
    @InputImport(name="entityId", required=true)
    private final GooglePrivacyDlpV2EntityIdResponse entityId;

    public GooglePrivacyDlpV2EntityIdResponse getEntityId() {
        return this.entityId;
    }

    /**
     * Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
     * 
     */
    @InputImport(name="quasiIds", required=true)
    private final List<GooglePrivacyDlpV2FieldIdResponse> quasiIds;

    public List<GooglePrivacyDlpV2FieldIdResponse> getQuasiIds() {
        return this.quasiIds;
    }

    public GooglePrivacyDlpV2KAnonymityConfigResponse(
        GooglePrivacyDlpV2EntityIdResponse entityId,
        List<GooglePrivacyDlpV2FieldIdResponse> quasiIds) {
        this.entityId = Objects.requireNonNull(entityId, "expected parameter 'entityId' to be non-null");
        this.quasiIds = Objects.requireNonNull(quasiIds, "expected parameter 'quasiIds' to be non-null");
    }

    private GooglePrivacyDlpV2KAnonymityConfigResponse() {
        this.entityId = null;
        this.quasiIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KAnonymityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2EntityIdResponse entityId;
        private List<GooglePrivacyDlpV2FieldIdResponse> quasiIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KAnonymityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
    	      this.quasiIds = defaults.quasiIds;
        }

        public Builder setEntityId(GooglePrivacyDlpV2EntityIdResponse entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }

        public Builder setQuasiIds(List<GooglePrivacyDlpV2FieldIdResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }

        public GooglePrivacyDlpV2KAnonymityConfigResponse build() {
            return new GooglePrivacyDlpV2KAnonymityConfigResponse(entityId, quasiIds);
        }
    }
}
