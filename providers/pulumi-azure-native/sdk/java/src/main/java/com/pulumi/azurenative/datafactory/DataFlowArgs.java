// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory;

import com.pulumi.azurenative.datafactory.inputs.FlowletArgs;
import com.pulumi.azurenative.datafactory.inputs.MappingDataFlowArgs;
import com.pulumi.azurenative.datafactory.inputs.WranglingDataFlowArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataFlowArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataFlowArgs Empty = new DataFlowArgs();

    /**
     * The data flow name.
     * 
     */
    @Import(name="dataFlowName")
    private @Nullable Output<String> dataFlowName;

    /**
     * @return The data flow name.
     * 
     */
    public Optional<Output<String>> dataFlowName() {
        return Optional.ofNullable(this.dataFlowName);
    }

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private Output<String> factoryName;

    /**
     * @return The factory name.
     * 
     */
    public Output<String> factoryName() {
        return this.factoryName;
    }

    /**
     * Data flow properties.
     * 
     */
    @Import(name="properties", required=true)
    private Output<Object> properties;

    /**
     * @return Data flow properties.
     * 
     */
    public Output<Object> properties() {
        return this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private DataFlowArgs() {}

    private DataFlowArgs(DataFlowArgs $) {
        this.dataFlowName = $.dataFlowName;
        this.factoryName = $.factoryName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataFlowArgs $;

        public Builder() {
            $ = new DataFlowArgs();
        }

        public Builder(DataFlowArgs defaults) {
            $ = new DataFlowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataFlowName The data flow name.
         * 
         * @return builder
         * 
         */
        public Builder dataFlowName(@Nullable Output<String> dataFlowName) {
            $.dataFlowName = dataFlowName;
            return this;
        }

        /**
         * @param dataFlowName The data flow name.
         * 
         * @return builder
         * 
         */
        public Builder dataFlowName(String dataFlowName) {
            return dataFlowName(Output.of(dataFlowName));
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(Output<String> factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            return factoryName(Output.of(factoryName));
        }

        /**
         * @param properties Data flow properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Data flow properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Object properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public DataFlowArgs build() {
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
