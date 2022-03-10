// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigquery_v2.inputs.TableReferenceResponse;
import java.lang.String;
import java.util.Objects;


public final class SnapshotDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final SnapshotDefinitionResponse Empty = new SnapshotDefinitionResponse();

    /**
     * [Required] Reference describing the ID of the table that was snapshot.
     * 
     */
    @InputImport(name="baseTableReference", required=true)
      private final TableReferenceResponse baseTableReference;

    public TableReferenceResponse getBaseTableReference() {
        return this.baseTableReference;
    }

    /**
     * [Required] The time at which the base table was snapshot. This value is reported in the JSON response using RFC3339 format.
     * 
     */
    @InputImport(name="snapshotTime", required=true)
      private final String snapshotTime;

    public String getSnapshotTime() {
        return this.snapshotTime;
    }

    public SnapshotDefinitionResponse(
        TableReferenceResponse baseTableReference,
        String snapshotTime) {
        this.baseTableReference = Objects.requireNonNull(baseTableReference, "expected parameter 'baseTableReference' to be non-null");
        this.snapshotTime = Objects.requireNonNull(snapshotTime, "expected parameter 'snapshotTime' to be non-null");
    }

    private SnapshotDefinitionResponse() {
        this.baseTableReference = null;
        this.snapshotTime = null;
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

        public Builder baseTableReference(TableReferenceResponse baseTableReference) {
            this.baseTableReference = Objects.requireNonNull(baseTableReference);
            return this;
        }

        public Builder snapshotTime(String snapshotTime) {
            this.snapshotTime = Objects.requireNonNull(snapshotTime);
            return this;
        }
        public SnapshotDefinitionResponse build() {
            return new SnapshotDefinitionResponse(baseTableReference, snapshotTime);
        }
    }
}
