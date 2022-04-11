// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.IntegrationConnectorType;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationIncrementalPullConfigArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationSourceConnectorPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationSourceFlowConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationSourceFlowConfigArgs Empty = new IntegrationSourceFlowConfigArgs();

    @Import(name="connectorProfileName")
      private final @Nullable Output<String> connectorProfileName;

    public Output<String> getConnectorProfileName() {
        return this.connectorProfileName == null ? Codegen.empty() : this.connectorProfileName;
    }

    @Import(name="connectorType", required=true)
      private final Output<IntegrationConnectorType> connectorType;

    public Output<IntegrationConnectorType> getConnectorType() {
        return this.connectorType;
    }

    @Import(name="incrementalPullConfig")
      private final @Nullable Output<IntegrationIncrementalPullConfigArgs> incrementalPullConfig;

    public Output<IntegrationIncrementalPullConfigArgs> getIncrementalPullConfig() {
        return this.incrementalPullConfig == null ? Codegen.empty() : this.incrementalPullConfig;
    }

    @Import(name="sourceConnectorProperties", required=true)
      private final Output<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties;

    public Output<IntegrationSourceConnectorPropertiesArgs> getSourceConnectorProperties() {
        return this.sourceConnectorProperties;
    }

    public IntegrationSourceFlowConfigArgs(
        @Nullable Output<String> connectorProfileName,
        Output<IntegrationConnectorType> connectorType,
        @Nullable Output<IntegrationIncrementalPullConfigArgs> incrementalPullConfig,
        Output<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties) {
        this.connectorProfileName = connectorProfileName;
        this.connectorType = Objects.requireNonNull(connectorType, "expected parameter 'connectorType' to be non-null");
        this.incrementalPullConfig = incrementalPullConfig;
        this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties, "expected parameter 'sourceConnectorProperties' to be non-null");
    }

    private IntegrationSourceFlowConfigArgs() {
        this.connectorProfileName = Codegen.empty();
        this.connectorType = Codegen.empty();
        this.incrementalPullConfig = Codegen.empty();
        this.sourceConnectorProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationSourceFlowConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectorProfileName;
        private Output<IntegrationConnectorType> connectorType;
        private @Nullable Output<IntegrationIncrementalPullConfigArgs> incrementalPullConfig;
        private Output<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationSourceFlowConfigArgs defaults) {
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
        public Builder connectorType(Output<IntegrationConnectorType> connectorType) {
            this.connectorType = Objects.requireNonNull(connectorType);
            return this;
        }
        public Builder connectorType(IntegrationConnectorType connectorType) {
            this.connectorType = Output.of(Objects.requireNonNull(connectorType));
            return this;
        }
        public Builder incrementalPullConfig(@Nullable Output<IntegrationIncrementalPullConfigArgs> incrementalPullConfig) {
            this.incrementalPullConfig = incrementalPullConfig;
            return this;
        }
        public Builder incrementalPullConfig(@Nullable IntegrationIncrementalPullConfigArgs incrementalPullConfig) {
            this.incrementalPullConfig = Codegen.ofNullable(incrementalPullConfig);
            return this;
        }
        public Builder sourceConnectorProperties(Output<IntegrationSourceConnectorPropertiesArgs> sourceConnectorProperties) {
            this.sourceConnectorProperties = Objects.requireNonNull(sourceConnectorProperties);
            return this;
        }
        public Builder sourceConnectorProperties(IntegrationSourceConnectorPropertiesArgs sourceConnectorProperties) {
            this.sourceConnectorProperties = Output.of(Objects.requireNonNull(sourceConnectorProperties));
            return this;
        }        public IntegrationSourceFlowConfigArgs build() {
            return new IntegrationSourceFlowConfigArgs(connectorProfileName, connectorType, incrementalPullConfig, sourceConnectorProperties);
        }
    }
}
