// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.ClusterPurpose;
import io.pulumi.azurenative.machinelearningservices.inputs.AksNetworkingConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.SslConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AKS properties
 * 
 */
public final class AKSPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AKSPropertiesArgs Empty = new AKSPropertiesArgs();

    /**
     * Number of agents
     * 
     */
    @Import(name="agentCount")
      private final @Nullable Output<Integer> agentCount;

    public Output<Integer> getAgentCount() {
        return this.agentCount == null ? Codegen.empty() : this.agentCount;
    }

    /**
     * Agent virtual machine size
     * 
     */
    @Import(name="agentVmSize")
      private final @Nullable Output<String> agentVmSize;

    public Output<String> getAgentVmSize() {
        return this.agentVmSize == null ? Codegen.empty() : this.agentVmSize;
    }

    /**
     * AKS networking configuration for vnet
     * 
     */
    @Import(name="aksNetworkingConfiguration")
      private final @Nullable Output<AksNetworkingConfigurationArgs> aksNetworkingConfiguration;

    public Output<AksNetworkingConfigurationArgs> getAksNetworkingConfiguration() {
        return this.aksNetworkingConfiguration == null ? Codegen.empty() : this.aksNetworkingConfiguration;
    }

    /**
     * Cluster full qualified domain name
     * 
     */
    @Import(name="clusterFqdn")
      private final @Nullable Output<String> clusterFqdn;

    public Output<String> getClusterFqdn() {
        return this.clusterFqdn == null ? Codegen.empty() : this.clusterFqdn;
    }

    /**
     * Intended usage of the cluster
     * 
     */
    @Import(name="clusterPurpose")
      private final @Nullable Output<Either<String,ClusterPurpose>> clusterPurpose;

    public Output<Either<String,ClusterPurpose>> getClusterPurpose() {
        return this.clusterPurpose == null ? Codegen.empty() : this.clusterPurpose;
    }

    /**
     * SSL configuration
     * 
     */
    @Import(name="sslConfiguration")
      private final @Nullable Output<SslConfigurationArgs> sslConfiguration;

    public Output<SslConfigurationArgs> getSslConfiguration() {
        return this.sslConfiguration == null ? Codegen.empty() : this.sslConfiguration;
    }

    public AKSPropertiesArgs(
        @Nullable Output<Integer> agentCount,
        @Nullable Output<String> agentVmSize,
        @Nullable Output<AksNetworkingConfigurationArgs> aksNetworkingConfiguration,
        @Nullable Output<String> clusterFqdn,
        @Nullable Output<Either<String,ClusterPurpose>> clusterPurpose,
        @Nullable Output<SslConfigurationArgs> sslConfiguration) {
        this.agentCount = agentCount;
        this.agentVmSize = agentVmSize;
        this.aksNetworkingConfiguration = aksNetworkingConfiguration;
        this.clusterFqdn = clusterFqdn;
        this.clusterPurpose = clusterPurpose == null ? Output.ofLeft("FastProd") : clusterPurpose;
        this.sslConfiguration = sslConfiguration;
    }

    private AKSPropertiesArgs() {
        this.agentCount = Codegen.empty();
        this.agentVmSize = Codegen.empty();
        this.aksNetworkingConfiguration = Codegen.empty();
        this.clusterFqdn = Codegen.empty();
        this.clusterPurpose = Codegen.empty();
        this.sslConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> agentCount;
        private @Nullable Output<String> agentVmSize;
        private @Nullable Output<AksNetworkingConfigurationArgs> aksNetworkingConfiguration;
        private @Nullable Output<String> clusterFqdn;
        private @Nullable Output<Either<String,ClusterPurpose>> clusterPurpose;
        private @Nullable Output<SslConfigurationArgs> sslConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentVmSize = defaults.agentVmSize;
    	      this.aksNetworkingConfiguration = defaults.aksNetworkingConfiguration;
    	      this.clusterFqdn = defaults.clusterFqdn;
    	      this.clusterPurpose = defaults.clusterPurpose;
    	      this.sslConfiguration = defaults.sslConfiguration;
        }

        public Builder agentCount(@Nullable Output<Integer> agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Builder agentCount(@Nullable Integer agentCount) {
            this.agentCount = Codegen.ofNullable(agentCount);
            return this;
        }
        public Builder agentVmSize(@Nullable Output<String> agentVmSize) {
            this.agentVmSize = agentVmSize;
            return this;
        }
        public Builder agentVmSize(@Nullable String agentVmSize) {
            this.agentVmSize = Codegen.ofNullable(agentVmSize);
            return this;
        }
        public Builder aksNetworkingConfiguration(@Nullable Output<AksNetworkingConfigurationArgs> aksNetworkingConfiguration) {
            this.aksNetworkingConfiguration = aksNetworkingConfiguration;
            return this;
        }
        public Builder aksNetworkingConfiguration(@Nullable AksNetworkingConfigurationArgs aksNetworkingConfiguration) {
            this.aksNetworkingConfiguration = Codegen.ofNullable(aksNetworkingConfiguration);
            return this;
        }
        public Builder clusterFqdn(@Nullable Output<String> clusterFqdn) {
            this.clusterFqdn = clusterFqdn;
            return this;
        }
        public Builder clusterFqdn(@Nullable String clusterFqdn) {
            this.clusterFqdn = Codegen.ofNullable(clusterFqdn);
            return this;
        }
        public Builder clusterPurpose(@Nullable Output<Either<String,ClusterPurpose>> clusterPurpose) {
            this.clusterPurpose = clusterPurpose;
            return this;
        }
        public Builder clusterPurpose(@Nullable Either<String,ClusterPurpose> clusterPurpose) {
            this.clusterPurpose = Codegen.ofNullable(clusterPurpose);
            return this;
        }
        public Builder sslConfiguration(@Nullable Output<SslConfigurationArgs> sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            return this;
        }
        public Builder sslConfiguration(@Nullable SslConfigurationArgs sslConfiguration) {
            this.sslConfiguration = Codegen.ofNullable(sslConfiguration);
            return this;
        }        public AKSPropertiesArgs build() {
            return new AKSPropertiesArgs(agentCount, agentVmSize, aksNetworkingConfiguration, clusterFqdn, clusterPurpose, sslConfiguration);
        }
    }
}
