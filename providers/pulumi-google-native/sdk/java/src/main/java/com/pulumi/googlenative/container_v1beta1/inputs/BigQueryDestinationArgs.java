// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters for using BigQuery as the destination of resource usage export.
 * 
 */
public final class BigQueryDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BigQueryDestinationArgs Empty = new BigQueryDestinationArgs();

    /**
     * The ID of a BigQuery Dataset.
     * 
     */
    @Import(name="datasetId")
    private @Nullable Output<String> datasetId;

    /**
     * @return The ID of a BigQuery Dataset.
     * 
     */
    public Optional<Output<String>> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    private BigQueryDestinationArgs() {}

    private BigQueryDestinationArgs(BigQueryDestinationArgs $) {
        this.datasetId = $.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BigQueryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BigQueryDestinationArgs $;

        public Builder() {
            $ = new BigQueryDestinationArgs();
        }

        public Builder(BigQueryDestinationArgs defaults) {
            $ = new BigQueryDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetId The ID of a BigQuery Dataset.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(@Nullable Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The ID of a BigQuery Dataset.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public BigQueryDestinationArgs build() {
            return $;
        }
    }

}
