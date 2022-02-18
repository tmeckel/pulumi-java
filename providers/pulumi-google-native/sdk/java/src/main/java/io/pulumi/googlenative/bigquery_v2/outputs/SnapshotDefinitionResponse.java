// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.TableReferenceResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SnapshotDefinitionResponse {
    /**
     * [Required] Reference describing the ID of the table that was snapshot.
     * 
     */
    private final TableReferenceResponse baseTableReference;
    /**
     * [Required] The time at which the base table was snapshot. This value is reported in the JSON response using RFC3339 format.
     * 
     */
    private final String snapshotTime;

    @OutputCustomType.Constructor({"baseTableReference","snapshotTime"})
    private SnapshotDefinitionResponse(
        TableReferenceResponse baseTableReference,
        String snapshotTime) {
        this.baseTableReference = Objects.requireNonNull(baseTableReference);
        this.snapshotTime = Objects.requireNonNull(snapshotTime);
    }

    /**
     * [Required] Reference describing the ID of the table that was snapshot.
     * 
     */
    public TableReferenceResponse getBaseTableReference() {
        return this.baseTableReference;
    }
    /**
     * [Required] The time at which the base table was snapshot. This value is reported in the JSON response using RFC3339 format.
     * 
     */
    public String getSnapshotTime() {
        return this.snapshotTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableReferenceResponse baseTableReference;
        private String snapshotTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseTableReference = defaults.baseTableReference;
    	      this.snapshotTime = defaults.snapshotTime;
        }

        public Builder setBaseTableReference(TableReferenceResponse baseTableReference) {
            this.baseTableReference = Objects.requireNonNull(baseTableReference);
            return this;
        }

        public Builder setSnapshotTime(String snapshotTime) {
            this.snapshotTime = Objects.requireNonNull(snapshotTime);
            return this;
        }

        public SnapshotDefinitionResponse build() {
            return new SnapshotDefinitionResponse(baseTableReference, snapshotTime);
        }
    }
}
