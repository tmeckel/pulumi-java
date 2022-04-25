// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow;

import com.pulumi.awsnative.appflow.enums.ConnectorProfileConnectionMode;
import com.pulumi.awsnative.appflow.enums.ConnectorProfileConnectorType;
import com.pulumi.awsnative.appflow.inputs.ConnectorProfileConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileArgs Empty = new ConnectorProfileArgs();

    /**
     * Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
     * 
     */
    @Import(name="connectionMode", required=true)
    private Output<ConnectorProfileConnectionMode> connectionMode;

    /**
     * @return Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
     * 
     */
    public Output<ConnectorProfileConnectionMode> connectionMode() {
        return this.connectionMode;
    }

    /**
     * Connector specific configurations needed to create connector profile
     * 
     */
    @Import(name="connectorProfileConfig")
    private @Nullable Output<ConnectorProfileConfigArgs> connectorProfileConfig;

    /**
     * @return Connector specific configurations needed to create connector profile
     * 
     */
    public Optional<Output<ConnectorProfileConfigArgs>> connectorProfileConfig() {
        return Optional.ofNullable(this.connectorProfileConfig);
    }

    /**
     * The maximum number of items to retrieve in a single batch.
     * 
     */
    @Import(name="connectorProfileName")
    private @Nullable Output<String> connectorProfileName;

    /**
     * @return The maximum number of items to retrieve in a single batch.
     * 
     */
    public Optional<Output<String>> connectorProfileName() {
        return Optional.ofNullable(this.connectorProfileName);
    }

    /**
     * List of Saas providers that need connector profile to be created
     * 
     */
    @Import(name="connectorType", required=true)
    private Output<ConnectorProfileConnectorType> connectorType;

    /**
     * @return List of Saas providers that need connector profile to be created
     * 
     */
    public Output<ConnectorProfileConnectorType> connectorType() {
        return this.connectorType;
    }

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) key that&#39;s used to encrypt your function&#39;s environment variables. If it&#39;s not provided, AWS Lambda uses a default service key.
     * 
     */
    @Import(name="kMSArn")
    private @Nullable Output<String> kMSArn;

    /**
     * @return The ARN of the AWS Key Management Service (AWS KMS) key that&#39;s used to encrypt your function&#39;s environment variables. If it&#39;s not provided, AWS Lambda uses a default service key.
     * 
     */
    public Optional<Output<String>> kMSArn() {
        return Optional.ofNullable(this.kMSArn);
    }

    private ConnectorProfileArgs() {}

    private ConnectorProfileArgs(ConnectorProfileArgs $) {
        this.connectionMode = $.connectionMode;
        this.connectorProfileConfig = $.connectorProfileConfig;
        this.connectorProfileName = $.connectorProfileName;
        this.connectorType = $.connectorType;
        this.kMSArn = $.kMSArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileArgs $;

        public Builder() {
            $ = new ConnectorProfileArgs();
        }

        public Builder(ConnectorProfileArgs defaults) {
            $ = new ConnectorProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionMode Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
         * 
         * @return builder
         * 
         */
        public Builder connectionMode(Output<ConnectorProfileConnectionMode> connectionMode) {
            $.connectionMode = connectionMode;
            return this;
        }

        /**
         * @param connectionMode Mode in which data transfer should be enabled. Private connection mode is currently enabled for Salesforce, Snowflake, Trendmicro and Singular
         * 
         * @return builder
         * 
         */
        public Builder connectionMode(ConnectorProfileConnectionMode connectionMode) {
            return connectionMode(Output.of(connectionMode));
        }

        /**
         * @param connectorProfileConfig Connector specific configurations needed to create connector profile
         * 
         * @return builder
         * 
         */
        public Builder connectorProfileConfig(@Nullable Output<ConnectorProfileConfigArgs> connectorProfileConfig) {
            $.connectorProfileConfig = connectorProfileConfig;
            return this;
        }

        /**
         * @param connectorProfileConfig Connector specific configurations needed to create connector profile
         * 
         * @return builder
         * 
         */
        public Builder connectorProfileConfig(ConnectorProfileConfigArgs connectorProfileConfig) {
            return connectorProfileConfig(Output.of(connectorProfileConfig));
        }

        /**
         * @param connectorProfileName The maximum number of items to retrieve in a single batch.
         * 
         * @return builder
         * 
         */
        public Builder connectorProfileName(@Nullable Output<String> connectorProfileName) {
            $.connectorProfileName = connectorProfileName;
            return this;
        }

        /**
         * @param connectorProfileName The maximum number of items to retrieve in a single batch.
         * 
         * @return builder
         * 
         */
        public Builder connectorProfileName(String connectorProfileName) {
            return connectorProfileName(Output.of(connectorProfileName));
        }

        /**
         * @param connectorType List of Saas providers that need connector profile to be created
         * 
         * @return builder
         * 
         */
        public Builder connectorType(Output<ConnectorProfileConnectorType> connectorType) {
            $.connectorType = connectorType;
            return this;
        }

        /**
         * @param connectorType List of Saas providers that need connector profile to be created
         * 
         * @return builder
         * 
         */
        public Builder connectorType(ConnectorProfileConnectorType connectorType) {
            return connectorType(Output.of(connectorType));
        }

        /**
         * @param kMSArn The ARN of the AWS Key Management Service (AWS KMS) key that&#39;s used to encrypt your function&#39;s environment variables. If it&#39;s not provided, AWS Lambda uses a default service key.
         * 
         * @return builder
         * 
         */
        public Builder kMSArn(@Nullable Output<String> kMSArn) {
            $.kMSArn = kMSArn;
            return this;
        }

        /**
         * @param kMSArn The ARN of the AWS Key Management Service (AWS KMS) key that&#39;s used to encrypt your function&#39;s environment variables. If it&#39;s not provided, AWS Lambda uses a default service key.
         * 
         * @return builder
         * 
         */
        public Builder kMSArn(String kMSArn) {
            return kMSArn(Output.of(kMSArn));
        }

        public ConnectorProfileArgs build() {
            $.connectionMode = Objects.requireNonNull($.connectionMode, "expected parameter 'connectionMode' to be non-null");
            $.connectorType = Objects.requireNonNull($.connectorType, "expected parameter 'connectorType' to be non-null");
            return $;
        }
    }

}
