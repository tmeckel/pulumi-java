// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterClientAuthenticationArgs;
import io.pulumi.aws.msk.inputs.ClusterConfigurationInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterEncryptionInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoArgs;
import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     * 
     */
    @InputImport(name="brokerNodeGroupInfo", required=true)
      private final Input<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo;

    public Input<ClusterBrokerNodeGroupInfoArgs> getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo;
    }

    /**
     * Configuration block for specifying a client authentication. See below.
     * 
     */
    @InputImport(name="clientAuthentication")
      private final @Nullable Input<ClusterClientAuthenticationArgs> clientAuthentication;

    public Input<ClusterClientAuthenticationArgs> getClientAuthentication() {
        return this.clientAuthentication == null ? Input.empty() : this.clientAuthentication;
    }

    /**
     * Name of the MSK cluster.
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     * 
     */
    @InputImport(name="configurationInfo")
      private final @Nullable Input<ClusterConfigurationInfoArgs> configurationInfo;

    public Input<ClusterConfigurationInfoArgs> getConfigurationInfo() {
        return this.configurationInfo == null ? Input.empty() : this.configurationInfo;
    }

    /**
     * Configuration block for specifying encryption. See below.
     * 
     */
    @InputImport(name="encryptionInfo")
      private final @Nullable Input<ClusterEncryptionInfoArgs> encryptionInfo;

    public Input<ClusterEncryptionInfoArgs> getEncryptionInfo() {
        return this.encryptionInfo == null ? Input.empty() : this.encryptionInfo;
    }

    /**
     * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     * 
     */
    @InputImport(name="enhancedMonitoring")
      private final @Nullable Input<String> enhancedMonitoring;

    public Input<String> getEnhancedMonitoring() {
        return this.enhancedMonitoring == null ? Input.empty() : this.enhancedMonitoring;
    }

    /**
     * Specify the desired Kafka software version.
     * 
     */
    @InputImport(name="kafkaVersion", required=true)
      private final Input<String> kafkaVersion;

    public Input<String> getKafkaVersion() {
        return this.kafkaVersion;
    }

    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     * 
     */
    @InputImport(name="loggingInfo")
      private final @Nullable Input<ClusterLoggingInfoArgs> loggingInfo;

    public Input<ClusterLoggingInfoArgs> getLoggingInfo() {
        return this.loggingInfo == null ? Input.empty() : this.loggingInfo;
    }

    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     * 
     */
    @InputImport(name="numberOfBrokerNodes", required=true)
      private final Input<Integer> numberOfBrokerNodes;

    public Input<Integer> getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes;
    }

    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     * 
     */
    @InputImport(name="openMonitoring")
      private final @Nullable Input<ClusterOpenMonitoringArgs> openMonitoring;

    public Input<ClusterOpenMonitoringArgs> getOpenMonitoring() {
        return this.openMonitoring == null ? Input.empty() : this.openMonitoring;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ClusterArgs(
        Input<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo,
        @Nullable Input<ClusterClientAuthenticationArgs> clientAuthentication,
        @Nullable Input<String> clusterName,
        @Nullable Input<ClusterConfigurationInfoArgs> configurationInfo,
        @Nullable Input<ClusterEncryptionInfoArgs> encryptionInfo,
        @Nullable Input<String> enhancedMonitoring,
        Input<String> kafkaVersion,
        @Nullable Input<ClusterLoggingInfoArgs> loggingInfo,
        Input<Integer> numberOfBrokerNodes,
        @Nullable Input<ClusterOpenMonitoringArgs> openMonitoring,
        @Nullable Input<Map<String,String>> tags) {
        this.brokerNodeGroupInfo = Objects.requireNonNull(brokerNodeGroupInfo, "expected parameter 'brokerNodeGroupInfo' to be non-null");
        this.clientAuthentication = clientAuthentication;
        this.clusterName = clusterName;
        this.configurationInfo = configurationInfo;
        this.encryptionInfo = encryptionInfo;
        this.enhancedMonitoring = enhancedMonitoring;
        this.kafkaVersion = Objects.requireNonNull(kafkaVersion, "expected parameter 'kafkaVersion' to be non-null");
        this.loggingInfo = loggingInfo;
        this.numberOfBrokerNodes = Objects.requireNonNull(numberOfBrokerNodes, "expected parameter 'numberOfBrokerNodes' to be non-null");
        this.openMonitoring = openMonitoring;
        this.tags = tags;
    }

    private ClusterArgs() {
        this.brokerNodeGroupInfo = Input.empty();
        this.clientAuthentication = Input.empty();
        this.clusterName = Input.empty();
        this.configurationInfo = Input.empty();
        this.encryptionInfo = Input.empty();
        this.enhancedMonitoring = Input.empty();
        this.kafkaVersion = Input.empty();
        this.loggingInfo = Input.empty();
        this.numberOfBrokerNodes = Input.empty();
        this.openMonitoring = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo;
        private @Nullable Input<ClusterClientAuthenticationArgs> clientAuthentication;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<ClusterConfigurationInfoArgs> configurationInfo;
        private @Nullable Input<ClusterEncryptionInfoArgs> encryptionInfo;
        private @Nullable Input<String> enhancedMonitoring;
        private Input<String> kafkaVersion;
        private @Nullable Input<ClusterLoggingInfoArgs> loggingInfo;
        private Input<Integer> numberOfBrokerNodes;
        private @Nullable Input<ClusterOpenMonitoringArgs> openMonitoring;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brokerNodeGroupInfo = defaults.brokerNodeGroupInfo;
    	      this.clientAuthentication = defaults.clientAuthentication;
    	      this.clusterName = defaults.clusterName;
    	      this.configurationInfo = defaults.configurationInfo;
    	      this.encryptionInfo = defaults.encryptionInfo;
    	      this.enhancedMonitoring = defaults.enhancedMonitoring;
    	      this.kafkaVersion = defaults.kafkaVersion;
    	      this.loggingInfo = defaults.loggingInfo;
    	      this.numberOfBrokerNodes = defaults.numberOfBrokerNodes;
    	      this.openMonitoring = defaults.openMonitoring;
    	      this.tags = defaults.tags;
        }

        public Builder brokerNodeGroupInfo(Input<ClusterBrokerNodeGroupInfoArgs> brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = Objects.requireNonNull(brokerNodeGroupInfo);
            return this;
        }

        public Builder brokerNodeGroupInfo(ClusterBrokerNodeGroupInfoArgs brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = Input.of(Objects.requireNonNull(brokerNodeGroupInfo));
            return this;
        }

        public Builder clientAuthentication(@Nullable Input<ClusterClientAuthenticationArgs> clientAuthentication) {
            this.clientAuthentication = clientAuthentication;
            return this;
        }

        public Builder clientAuthentication(@Nullable ClusterClientAuthenticationArgs clientAuthentication) {
            this.clientAuthentication = Input.ofNullable(clientAuthentication);
            return this;
        }

        public Builder clusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder configurationInfo(@Nullable Input<ClusterConfigurationInfoArgs> configurationInfo) {
            this.configurationInfo = configurationInfo;
            return this;
        }

        public Builder configurationInfo(@Nullable ClusterConfigurationInfoArgs configurationInfo) {
            this.configurationInfo = Input.ofNullable(configurationInfo);
            return this;
        }

        public Builder encryptionInfo(@Nullable Input<ClusterEncryptionInfoArgs> encryptionInfo) {
            this.encryptionInfo = encryptionInfo;
            return this;
        }

        public Builder encryptionInfo(@Nullable ClusterEncryptionInfoArgs encryptionInfo) {
            this.encryptionInfo = Input.ofNullable(encryptionInfo);
            return this;
        }

        public Builder enhancedMonitoring(@Nullable Input<String> enhancedMonitoring) {
            this.enhancedMonitoring = enhancedMonitoring;
            return this;
        }

        public Builder enhancedMonitoring(@Nullable String enhancedMonitoring) {
            this.enhancedMonitoring = Input.ofNullable(enhancedMonitoring);
            return this;
        }

        public Builder kafkaVersion(Input<String> kafkaVersion) {
            this.kafkaVersion = Objects.requireNonNull(kafkaVersion);
            return this;
        }

        public Builder kafkaVersion(String kafkaVersion) {
            this.kafkaVersion = Input.of(Objects.requireNonNull(kafkaVersion));
            return this;
        }

        public Builder loggingInfo(@Nullable Input<ClusterLoggingInfoArgs> loggingInfo) {
            this.loggingInfo = loggingInfo;
            return this;
        }

        public Builder loggingInfo(@Nullable ClusterLoggingInfoArgs loggingInfo) {
            this.loggingInfo = Input.ofNullable(loggingInfo);
            return this;
        }

        public Builder numberOfBrokerNodes(Input<Integer> numberOfBrokerNodes) {
            this.numberOfBrokerNodes = Objects.requireNonNull(numberOfBrokerNodes);
            return this;
        }

        public Builder numberOfBrokerNodes(Integer numberOfBrokerNodes) {
            this.numberOfBrokerNodes = Input.of(Objects.requireNonNull(numberOfBrokerNodes));
            return this;
        }

        public Builder openMonitoring(@Nullable Input<ClusterOpenMonitoringArgs> openMonitoring) {
            this.openMonitoring = openMonitoring;
            return this;
        }

        public Builder openMonitoring(@Nullable ClusterOpenMonitoringArgs openMonitoring) {
            this.openMonitoring = Input.ofNullable(openMonitoring);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ClusterArgs build() {
            return new ClusterArgs(brokerNodeGroupInfo, clientAuthentication, clusterName, configurationInfo, encryptionInfo, enhancedMonitoring, kafkaVersion, loggingInfo, numberOfBrokerNodes, openMonitoring, tags);
        }
    }
}
