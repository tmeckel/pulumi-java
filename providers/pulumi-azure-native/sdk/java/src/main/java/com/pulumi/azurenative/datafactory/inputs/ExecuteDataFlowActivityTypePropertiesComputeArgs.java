// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Compute properties for data flow activity.
 * 
 */
public final class ExecuteDataFlowActivityTypePropertiesComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecuteDataFlowActivityTypePropertiesComputeArgs Empty = new ExecuteDataFlowActivityTypePropertiesComputeArgs();

    /**
     * Compute type of the cluster which will execute data flow job. Possible values include: &#39;General&#39;, &#39;MemoryOptimized&#39;, &#39;ComputeOptimized&#39;. Type: string (or Expression with resultType string)
     * 
     */
    @Import(name="computeType")
    private @Nullable Output<Object> computeType;

    /**
     * @return Compute type of the cluster which will execute data flow job. Possible values include: &#39;General&#39;, &#39;MemoryOptimized&#39;, &#39;ComputeOptimized&#39;. Type: string (or Expression with resultType string)
     * 
     */
    public Optional<Output<Object>> computeType() {
        return Optional.ofNullable(this.computeType);
    }

    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer)
     * 
     */
    @Import(name="coreCount")
    private @Nullable Output<Object> coreCount;

    /**
     * @return Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer)
     * 
     */
    public Optional<Output<Object>> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    private ExecuteDataFlowActivityTypePropertiesComputeArgs() {}

    private ExecuteDataFlowActivityTypePropertiesComputeArgs(ExecuteDataFlowActivityTypePropertiesComputeArgs $) {
        this.computeType = $.computeType;
        this.coreCount = $.coreCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecuteDataFlowActivityTypePropertiesComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecuteDataFlowActivityTypePropertiesComputeArgs $;

        public Builder() {
            $ = new ExecuteDataFlowActivityTypePropertiesComputeArgs();
        }

        public Builder(ExecuteDataFlowActivityTypePropertiesComputeArgs defaults) {
            $ = new ExecuteDataFlowActivityTypePropertiesComputeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job. Possible values include: &#39;General&#39;, &#39;MemoryOptimized&#39;, &#39;ComputeOptimized&#39;. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder computeType(@Nullable Output<Object> computeType) {
            $.computeType = computeType;
            return this;
        }

        /**
         * @param computeType Compute type of the cluster which will execute data flow job. Possible values include: &#39;General&#39;, &#39;MemoryOptimized&#39;, &#39;ComputeOptimized&#39;. Type: string (or Expression with resultType string)
         * 
         * @return builder
         * 
         */
        public Builder computeType(Object computeType) {
            return computeType(Output.of(computeType));
        }

        /**
         * @param coreCount Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer)
         * 
         * @return builder
         * 
         */
        public Builder coreCount(@Nullable Output<Object> coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        /**
         * @param coreCount Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer)
         * 
         * @return builder
         * 
         */
        public Builder coreCount(Object coreCount) {
            return coreCount(Output.of(coreCount));
        }

        public ExecuteDataFlowActivityTypePropertiesComputeArgs build() {
            return $;
        }
    }

}
