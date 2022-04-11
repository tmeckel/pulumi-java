// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowConnectorType;
import io.pulumi.awsnative.appflow.inputs.FlowIncrementalPullConfigArgs;
import io.pulumi.awsnative.appflow.inputs.FlowSourceConnectorPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configurations of Source connector of the flow.
 * 
 */
public final class FlowSourceFlowConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSourceFlowConfigArgs Empty = new FlowSourceFlowConfigArgs();

    /**
     * Name of source connector profile
     * 
     */
    @Import(name="connectorProfileName")
      private final @Nullable Output<String> connectorProfileName;

    public Output<String> getConnectorProfileName() {
        return this.connectorProfileName == null ? Codegen.empty() : this.connectorProfileName;
    }

    /**
     * Type of source connector
     * 
     */
    @Import(name="connectorType", required=true)
      private final Output<FlowConnectorType> connectorType;

    public Output<FlowConnectorType> getConnectorType() {
        return this.connectorType;
    }

    /**
     * Configuration for scheduled incremental data pull
     * 
     */
    @Import(name="incrementalPullConfig")
      private final @Nullable Output<FlowIncrementalPullConfigArgs> incrementalPullConfig;

    public Output<FlowIncrementalPullConfigArgs> getIncrementalPullConfig() {
        return this.incrementalPullConfig == null ? Codegen.empty() : this.incrementalPullConfig;
    }

    /**
     * Source connector details required to query a connector
     * 
     */
    @Import(name="sourceConnectorProperties", required=true)
      private final Output<FlowSourceConnectorPropertiesArgs> sourceConnectorProperties;

    public Output<FlowSourceConnectorPropertiesArgs> getSourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    public FlowSourceFlowConfigArgs(
        @Nullable Output<String> connectorProfileName,
        Output<FlowConnectorType> connectorType,
        @Nullable Output<FlowIncrementalPullConfigArgs> incrementalPullConfig,
        Output<FlowSourceConnectorPropertiesArgs> sourceConnectorProperties) {
        this.connectorProfileName = connectorProfileName;
        this.connectorType = Objects.requireNonNull(connectorType, "expected parameter 'connectorType' to be non-null");
        this.incrementalPullConfig = incrementalPullConfig;
        this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties, "expected parameter 'sourceConnectorProperties' to be non-null");
    }

    private FlowSourceFlowConfigArgs() {
        this.connectorProfileName = Codegen.empty();
        this.connectorType = Codegen.empty();
        this.incrementalPullConfig = Codegen.empty();
        this.sourceConnectorProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectorProfileName;
        private Output<FlowConnectorType> connectorType;
        private @Nullable Output<FlowIncrementalPullConfigArgs> incrementalPullConfig;
        private Output<FlowSourceConnectorPropertiesArgs> sourceConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSourceFlowConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileName = defaults.connectorProfileName;
    	      this.connectorType = defaults.connectorType;
    	      this.incrementalPullConfig = defaults.incrementalPullConfig;
    	      this.sourceConnectorProperties = defaults.sourceConnectorProperties;
        }

        public Builder connectorProfileName(@Nullable Output<String> connectorProfileName) {
            this.connectorProfileName = connectorProfileName;
            return this;
        }
        public Builder connectorProfileName(@Nullable String connectorProfileName) {
            this.connectorProfileName = Codegen.ofNullable(connectorProfileName);
            return this;
        }
        public Builder connectorType(Output<FlowConnectorType> connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }
        public Builder connectorType(FlowConnectorType connectorType) {
            this.connectorType = Output.of(Objects.requireNonNull(connectorType));
            return this;
        }
        public Builder incrementalPullConfig(@Nullable Output<FlowIncrementalPullConfigArgs> incrementalPullConfig) {
            this.incrementalPullConfig = incrementalPullConfig;
            return this;
        }
        public Builder incrementalPullConfig(@Nullable FlowIncrementalPullConfigArgs incrementalPullConfig) {
            this.incrementalPullConfig = Codegen.ofNullable(incrementalPullConfig);
            return this;
        }
        public Builder sourceConnectorProperties(Output<FlowSourceConnectorPropertiesArgs> sourceConnectorProperties) {
            this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties);
            return this;
        }
        public Builder sourceConnectorProperties(FlowSourceConnectorPropertiesArgs sourceConnectorProperties) {
            this.sourceConnectorProperties = Output.of(Objects.requireNonNull(sourceConnectorProperties));
            return this;
        }        public FlowSourceFlowConfigArgs build() {
            return new FlowSourceFlowConfigArgs(connectorProfileName, connectorType, incrementalPullConfig, sourceConnectorProperties);
        }
    }
}
