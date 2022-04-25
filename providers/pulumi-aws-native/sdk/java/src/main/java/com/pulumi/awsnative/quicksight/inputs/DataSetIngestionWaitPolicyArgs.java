// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Wait policy to use when creating/updating dataset. Default is to wait for SPICE ingestion to finish with timeout of 36 hours.&lt;/p&gt;
 * 
 */
public final class DataSetIngestionWaitPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSetIngestionWaitPolicyArgs Empty = new DataSetIngestionWaitPolicyArgs();

    /**
     * &lt;p&gt;The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.&lt;/p&gt;
     * 
     */
    @Import(name="ingestionWaitTimeInHours")
    private @Nullable Output<Double> ingestionWaitTimeInHours;

    /**
     * @return &lt;p&gt;The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
     *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.&lt;/p&gt;
     * 
     */
    public Optional<Output<Double>> ingestionWaitTimeInHours() {
        return Optional.ofNullable(this.ingestionWaitTimeInHours);
    }

    /**
     * &lt;p&gt;Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.&lt;/p&gt;
     * 
     */
    @Import(name="waitForSpiceIngestion")
    private @Nullable Output<Boolean> waitForSpiceIngestion;

    /**
     * @return &lt;p&gt;Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
     *   Applicable only when DataSetImportMode mode is set to SPICE.&lt;/p&gt;
     * 
     */
    public Optional<Output<Boolean>> waitForSpiceIngestion() {
        return Optional.ofNullable(this.waitForSpiceIngestion);
    }

    private DataSetIngestionWaitPolicyArgs() {}

    private DataSetIngestionWaitPolicyArgs(DataSetIngestionWaitPolicyArgs $) {
        this.ingestionWaitTimeInHours = $.ingestionWaitTimeInHours;
        this.waitForSpiceIngestion = $.waitForSpiceIngestion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSetIngestionWaitPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSetIngestionWaitPolicyArgs $;

        public Builder() {
            $ = new DataSetIngestionWaitPolicyArgs();
        }

        public Builder(DataSetIngestionWaitPolicyArgs defaults) {
            $ = new DataSetIngestionWaitPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ingestionWaitTimeInHours &lt;p&gt;The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
         *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder ingestionWaitTimeInHours(@Nullable Output<Double> ingestionWaitTimeInHours) {
            $.ingestionWaitTimeInHours = ingestionWaitTimeInHours;
            return this;
        }

        /**
         * @param ingestionWaitTimeInHours &lt;p&gt;The maximum time (in hours) to wait for Ingestion to complete. Default timeout is 36 hours.
         *  Applicable only when DataSetImportMode mode is set to SPICE and WaitForSpiceIngestion is set to true.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder ingestionWaitTimeInHours(Double ingestionWaitTimeInHours) {
            return ingestionWaitTimeInHours(Output.of(ingestionWaitTimeInHours));
        }

        /**
         * @param waitForSpiceIngestion &lt;p&gt;Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
         *   Applicable only when DataSetImportMode mode is set to SPICE.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder waitForSpiceIngestion(@Nullable Output<Boolean> waitForSpiceIngestion) {
            $.waitForSpiceIngestion = waitForSpiceIngestion;
            return this;
        }

        /**
         * @param waitForSpiceIngestion &lt;p&gt;Wait for SPICE ingestion to finish to mark dataset creation/update successful. Default (true).
         *   Applicable only when DataSetImportMode mode is set to SPICE.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder waitForSpiceIngestion(Boolean waitForSpiceIngestion) {
            return waitForSpiceIngestion(Output.of(waitForSpiceIngestion));
        }

        public DataSetIngestionWaitPolicyArgs build() {
            return $;
        }
    }

}
