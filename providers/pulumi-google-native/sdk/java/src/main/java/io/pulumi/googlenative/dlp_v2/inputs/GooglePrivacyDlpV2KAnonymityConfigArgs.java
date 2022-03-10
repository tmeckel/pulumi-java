// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2EntityIdArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * k-anonymity metric, used for analysis of reidentification risk.
 * 
 */
public final class GooglePrivacyDlpV2KAnonymityConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2KAnonymityConfigArgs Empty = new GooglePrivacyDlpV2KAnonymityConfigArgs();

    /**
     * Message indicating that multiple rows might be associated to a single individual. If the same entity_id is associated to multiple quasi-identifier tuples over distinct rows, we consider the entire collection of tuples as the composite quasi-identifier. This collection is a multiset: the order in which the different tuples appear in the dataset is ignored, but their frequency is taken into account. Important note: a maximum of 1000 rows can be associated to a single entity ID. If more rows are associated with the same entity ID, some might be ignored.
     * 
     */
    @InputImport(name="entityId")
      private final @Nullable Input<GooglePrivacyDlpV2EntityIdArgs> entityId;

    public Input<GooglePrivacyDlpV2EntityIdArgs> getEntityId() {
        return this.entityId == null ? Input.empty() : this.entityId;
    }

    /**
     * Set of fields to compute k-anonymity over. When multiple fields are specified, they are considered a single composite key. Structs and repeated data types are not supported; however, nested fields are supported so long as they are not structs themselves or nested within a repeated field.
     * 
     */
    @InputImport(name="quasiIds")
      private final @Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds;

    public Input<List<GooglePrivacyDlpV2FieldIdArgs>> getQuasiIds() {
        return this.quasiIds == null ? Input.empty() : this.quasiIds;
    }

    public GooglePrivacyDlpV2KAnonymityConfigArgs(
        @Nullable Input<GooglePrivacyDlpV2EntityIdArgs> entityId,
        @Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds) {
        this.entityId = entityId;
        this.quasiIds = quasiIds;
    }

    private GooglePrivacyDlpV2KAnonymityConfigArgs() {
        this.entityId = Input.empty();
        this.quasiIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KAnonymityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2EntityIdArgs> entityId;
        private @Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KAnonymityConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
    	      this.quasiIds = defaults.quasiIds;
        }

        public Builder entityId(@Nullable Input<GooglePrivacyDlpV2EntityIdArgs> entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder entityId(@Nullable GooglePrivacyDlpV2EntityIdArgs entityId) {
            this.entityId = Input.ofNullable(entityId);
            return this;
        }

        public Builder quasiIds(@Nullable Input<List<GooglePrivacyDlpV2FieldIdArgs>> quasiIds) {
            this.quasiIds = quasiIds;
            return this;
        }

        public Builder quasiIds(@Nullable List<GooglePrivacyDlpV2FieldIdArgs> quasiIds) {
            this.quasiIds = Input.ofNullable(quasiIds);
            return this;
        }
        public GooglePrivacyDlpV2KAnonymityConfigArgs build() {
            return new GooglePrivacyDlpV2KAnonymityConfigArgs(entityId, quasiIds);
        }
    }
}
