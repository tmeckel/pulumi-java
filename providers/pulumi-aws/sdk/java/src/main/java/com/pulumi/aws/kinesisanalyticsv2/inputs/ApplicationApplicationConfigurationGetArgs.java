// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.inputs;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationRunConfigurationGetArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationVpcConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationGetArgs Empty = new ApplicationApplicationConfigurationGetArgs();

    /**
     * The code location and type parameters for the application.
     * 
     */
    @Import(name="applicationCodeConfiguration", required=true)
    private Output<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> applicationCodeConfiguration;

    /**
     * @return The code location and type parameters for the application.
     * 
     */
    public Output<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> applicationCodeConfiguration() {
        return this.applicationCodeConfiguration;
    }

    /**
     * Describes whether snapshots are enabled for a Flink-based application.
     * 
     */
    @Import(name="applicationSnapshotConfiguration")
    private @Nullable Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs> applicationSnapshotConfiguration;

    /**
     * @return Describes whether snapshots are enabled for a Flink-based application.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs>> applicationSnapshotConfiguration() {
        return Optional.ofNullable(this.applicationSnapshotConfiguration);
    }

    /**
     * Describes execution properties for a Flink-based application.
     * 
     */
    @Import(name="environmentProperties")
    private @Nullable Output<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs> environmentProperties;

    /**
     * @return Describes execution properties for a Flink-based application.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs>> environmentProperties() {
        return Optional.ofNullable(this.environmentProperties);
    }

    /**
     * The configuration of a Flink-based application.
     * 
     */
    @Import(name="flinkApplicationConfiguration")
    private @Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs> flinkApplicationConfiguration;

    /**
     * @return The configuration of a Flink-based application.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs>> flinkApplicationConfiguration() {
        return Optional.ofNullable(this.flinkApplicationConfiguration);
    }

    /**
     * Describes the starting properties for a Flink-based application.
     * 
     */
    @Import(name="runConfiguration")
    private @Nullable Output<ApplicationApplicationConfigurationRunConfigurationGetArgs> runConfiguration;

    /**
     * @return Describes the starting properties for a Flink-based application.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationRunConfigurationGetArgs>> runConfiguration() {
        return Optional.ofNullable(this.runConfiguration);
    }

    /**
     * The configuration of a SQL-based application.
     * 
     */
    @Import(name="sqlApplicationConfiguration")
    private @Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs> sqlApplicationConfiguration;

    /**
     * @return The configuration of a SQL-based application.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs>> sqlApplicationConfiguration() {
        return Optional.ofNullable(this.sqlApplicationConfiguration);
    }

    /**
     * The VPC configuration of a Flink-based application.
     * 
     */
    @Import(name="vpcConfiguration")
    private @Nullable Output<ApplicationApplicationConfigurationVpcConfigurationGetArgs> vpcConfiguration;

    /**
     * @return The VPC configuration of a Flink-based application.
     * 
     */
    public Optional<Output<ApplicationApplicationConfigurationVpcConfigurationGetArgs>> vpcConfiguration() {
        return Optional.ofNullable(this.vpcConfiguration);
    }

    private ApplicationApplicationConfigurationGetArgs() {}

    private ApplicationApplicationConfigurationGetArgs(ApplicationApplicationConfigurationGetArgs $) {
        this.applicationCodeConfiguration = $.applicationCodeConfiguration;
        this.applicationSnapshotConfiguration = $.applicationSnapshotConfiguration;
        this.environmentProperties = $.environmentProperties;
        this.flinkApplicationConfiguration = $.flinkApplicationConfiguration;
        this.runConfiguration = $.runConfiguration;
        this.sqlApplicationConfiguration = $.sqlApplicationConfiguration;
        this.vpcConfiguration = $.vpcConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationApplicationConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationApplicationConfigurationGetArgs $;

        public Builder() {
            $ = new ApplicationApplicationConfigurationGetArgs();
        }

        public Builder(ApplicationApplicationConfigurationGetArgs defaults) {
            $ = new ApplicationApplicationConfigurationGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationCodeConfiguration The code location and type parameters for the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationCodeConfiguration(Output<ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs> applicationCodeConfiguration) {
            $.applicationCodeConfiguration = applicationCodeConfiguration;
            return this;
        }

        /**
         * @param applicationCodeConfiguration The code location and type parameters for the application.
         * 
         * @return builder
         * 
         */
        public Builder applicationCodeConfiguration(ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs applicationCodeConfiguration) {
            return applicationCodeConfiguration(Output.of(applicationCodeConfiguration));
        }

        /**
         * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder applicationSnapshotConfiguration(@Nullable Output<ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs> applicationSnapshotConfiguration) {
            $.applicationSnapshotConfiguration = applicationSnapshotConfiguration;
            return this;
        }

        /**
         * @param applicationSnapshotConfiguration Describes whether snapshots are enabled for a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder applicationSnapshotConfiguration(ApplicationApplicationConfigurationApplicationSnapshotConfigurationGetArgs applicationSnapshotConfiguration) {
            return applicationSnapshotConfiguration(Output.of(applicationSnapshotConfiguration));
        }

        /**
         * @param environmentProperties Describes execution properties for a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder environmentProperties(@Nullable Output<ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs> environmentProperties) {
            $.environmentProperties = environmentProperties;
            return this;
        }

        /**
         * @param environmentProperties Describes execution properties for a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder environmentProperties(ApplicationApplicationConfigurationEnvironmentPropertiesGetArgs environmentProperties) {
            return environmentProperties(Output.of(environmentProperties));
        }

        /**
         * @param flinkApplicationConfiguration The configuration of a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder flinkApplicationConfiguration(@Nullable Output<ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs> flinkApplicationConfiguration) {
            $.flinkApplicationConfiguration = flinkApplicationConfiguration;
            return this;
        }

        /**
         * @param flinkApplicationConfiguration The configuration of a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder flinkApplicationConfiguration(ApplicationApplicationConfigurationFlinkApplicationConfigurationGetArgs flinkApplicationConfiguration) {
            return flinkApplicationConfiguration(Output.of(flinkApplicationConfiguration));
        }

        /**
         * @param runConfiguration Describes the starting properties for a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder runConfiguration(@Nullable Output<ApplicationApplicationConfigurationRunConfigurationGetArgs> runConfiguration) {
            $.runConfiguration = runConfiguration;
            return this;
        }

        /**
         * @param runConfiguration Describes the starting properties for a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder runConfiguration(ApplicationApplicationConfigurationRunConfigurationGetArgs runConfiguration) {
            return runConfiguration(Output.of(runConfiguration));
        }

        /**
         * @param sqlApplicationConfiguration The configuration of a SQL-based application.
         * 
         * @return builder
         * 
         */
        public Builder sqlApplicationConfiguration(@Nullable Output<ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs> sqlApplicationConfiguration) {
            $.sqlApplicationConfiguration = sqlApplicationConfiguration;
            return this;
        }

        /**
         * @param sqlApplicationConfiguration The configuration of a SQL-based application.
         * 
         * @return builder
         * 
         */
        public Builder sqlApplicationConfiguration(ApplicationApplicationConfigurationSqlApplicationConfigurationGetArgs sqlApplicationConfiguration) {
            return sqlApplicationConfiguration(Output.of(sqlApplicationConfiguration));
        }

        /**
         * @param vpcConfiguration The VPC configuration of a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(@Nullable Output<ApplicationApplicationConfigurationVpcConfigurationGetArgs> vpcConfiguration) {
            $.vpcConfiguration = vpcConfiguration;
            return this;
        }

        /**
         * @param vpcConfiguration The VPC configuration of a Flink-based application.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfiguration(ApplicationApplicationConfigurationVpcConfigurationGetArgs vpcConfiguration) {
            return vpcConfiguration(Output.of(vpcConfiguration));
        }

        public ApplicationApplicationConfigurationGetArgs build() {
            $.applicationCodeConfiguration = Objects.requireNonNull($.applicationCodeConfiguration, "expected parameter 'applicationCodeConfiguration' to be non-null");
            return $;
        }
    }

}
