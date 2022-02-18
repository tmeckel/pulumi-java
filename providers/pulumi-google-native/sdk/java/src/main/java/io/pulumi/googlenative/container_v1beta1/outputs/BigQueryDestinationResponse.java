// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BigQueryDestinationResponse {
    /**
     * The ID of a BigQuery Dataset.
     * 
     */
    private final String datasetId;

    @OutputCustomType.Constructor({"datasetId"})
    private BigQueryDestinationResponse(String datasetId) {
        this.datasetId = Objects.requireNonNull(datasetId);
    }

    /**
     * The ID of a BigQuery Dataset.
     * 
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public BigQueryDestinationResponse build() {
            return new BigQueryDestinationResponse(datasetId);
        }
    }
}
