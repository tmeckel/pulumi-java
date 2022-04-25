// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Import(name="applyImmediately")
    private @Nullable Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> applyImmediately() {
        return Optional.ofNullable(this.applyImmediately);
    }

    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     * 
     */
    @Import(name="availabilityZones")
    private @Nullable Output<List<String>> availabilityZones;

    /**
     * @return A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     * 
     */
    public Optional<Output<List<String>>> availabilityZones() {
        return Optional.ofNullable(this.availabilityZones);
    }

    /**
     * The days to retain backups for. Default `1`
     * 
     */
    @Import(name="backupRetentionPeriod")
    private @Nullable Output<Integer> backupRetentionPeriod;

    /**
     * @return The days to retain backups for. Default `1`
     * 
     */
    public Optional<Output<Integer>> backupRetentionPeriod() {
        return Optional.ofNullable(this.backupRetentionPeriod);
    }

    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Import(name="clusterIdentifier")
    private @Nullable Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Optional<Output<String>> clusterIdentifier() {
        return Optional.ofNullable(this.clusterIdentifier);
    }

    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    @Import(name="clusterIdentifierPrefix")
    private @Nullable Output<String> clusterIdentifierPrefix;

    /**
     * @return Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    public Optional<Output<String>> clusterIdentifierPrefix() {
        return Optional.ofNullable(this.clusterIdentifierPrefix);
    }

    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    @Import(name="copyTagsToSnapshot")
    private @Nullable Output<Boolean> copyTagsToSnapshot;

    /**
     * @return If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    public Optional<Output<Boolean>> copyTagsToSnapshot() {
        return Optional.ofNullable(this.copyTagsToSnapshot);
    }

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    /**
     * @return A value that indicates whether the DB cluster has deletion protection enabled.The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
     * 
     */
    @Import(name="enableCloudwatchLogsExports")
    private @Nullable Output<List<String>> enableCloudwatchLogsExports;

    /**
     * @return A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
     * 
     */
    public Optional<Output<List<String>>> enableCloudwatchLogsExports() {
        return Optional.ofNullable(this.enableCloudwatchLogsExports);
    }

    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * The database engine version.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return The database engine version.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    @Import(name="finalSnapshotIdentifier")
    private @Nullable Output<String> finalSnapshotIdentifier;

    /**
     * @return The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    public Optional<Output<String>> finalSnapshotIdentifier() {
        return Optional.ofNullable(this.finalSnapshotIdentifier);
    }

    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    @Import(name="iamDatabaseAuthenticationEnabled")
    private @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled;

    /**
     * @return Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    public Optional<Output<Boolean>> iamDatabaseAuthenticationEnabled() {
        return Optional.ofNullable(this.iamDatabaseAuthenticationEnabled);
    }

    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    @Import(name="iamRoles")
    private @Nullable Output<List<String>> iamRoles;

    /**
     * @return A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    public Optional<Output<List<String>>> iamRoles() {
        return Optional.ofNullable(this.iamRoles);
    }

    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Import(name="neptuneClusterParameterGroupName")
    private @Nullable Output<String> neptuneClusterParameterGroupName;

    /**
     * @return A cluster parameter group to associate with the cluster.
     * 
     */
    public Optional<Output<String>> neptuneClusterParameterGroupName() {
        return Optional.ofNullable(this.neptuneClusterParameterGroupName);
    }

    /**
     * A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    @Import(name="neptuneSubnetGroupName")
    private @Nullable Output<String> neptuneSubnetGroupName;

    /**
     * @return A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    public Optional<Output<String>> neptuneSubnetGroupName() {
        return Optional.ofNullable(this.neptuneSubnetGroupName);
    }

    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    @Import(name="preferredBackupWindow")
    private @Nullable Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    public Optional<Output<String>> preferredBackupWindow() {
        return Optional.ofNullable(this.preferredBackupWindow);
    }

    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    @Import(name="preferredMaintenanceWindow")
    private @Nullable Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    public Optional<Output<String>> preferredMaintenanceWindow() {
        return Optional.ofNullable(this.preferredMaintenanceWindow);
    }

    /**
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    @Import(name="replicationSourceIdentifier")
    private @Nullable Output<String> replicationSourceIdentifier;

    /**
     * @return ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    public Optional<Output<String>> replicationSourceIdentifier() {
        return Optional.ofNullable(this.replicationSourceIdentifier);
    }

    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Import(name="skipFinalSnapshot")
    private @Nullable Output<Boolean> skipFinalSnapshot;

    /**
     * @return Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> skipFinalSnapshot() {
        return Optional.ofNullable(this.skipFinalSnapshot);
    }

    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
     * 
     */
    @Import(name="snapshotIdentifier")
    private @Nullable Output<String> snapshotIdentifier;

    /**
     * @return Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
     * 
     */
    public Optional<Output<String>> snapshotIdentifier() {
        return Optional.ofNullable(this.snapshotIdentifier);
    }

    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    @Import(name="storageEncrypted")
    private @Nullable Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    public Optional<Output<Boolean>> storageEncrypted() {
        return Optional.ofNullable(this.storageEncrypted);
    }

    /**
     * A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * List of VPC security groups to associate with the Cluster
     * 
     */
    @Import(name="vpcSecurityGroupIds")
    private @Nullable Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return List of VPC security groups to associate with the Cluster
     * 
     */
    public Optional<Output<List<String>>> vpcSecurityGroupIds() {
        return Optional.ofNullable(this.vpcSecurityGroupIds);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.applyImmediately = $.applyImmediately;
        this.availabilityZones = $.availabilityZones;
        this.backupRetentionPeriod = $.backupRetentionPeriod;
        this.clusterIdentifier = $.clusterIdentifier;
        this.clusterIdentifierPrefix = $.clusterIdentifierPrefix;
        this.copyTagsToSnapshot = $.copyTagsToSnapshot;
        this.deletionProtection = $.deletionProtection;
        this.enableCloudwatchLogsExports = $.enableCloudwatchLogsExports;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.finalSnapshotIdentifier = $.finalSnapshotIdentifier;
        this.iamDatabaseAuthenticationEnabled = $.iamDatabaseAuthenticationEnabled;
        this.iamRoles = $.iamRoles;
        this.kmsKeyArn = $.kmsKeyArn;
        this.neptuneClusterParameterGroupName = $.neptuneClusterParameterGroupName;
        this.neptuneSubnetGroupName = $.neptuneSubnetGroupName;
        this.port = $.port;
        this.preferredBackupWindow = $.preferredBackupWindow;
        this.preferredMaintenanceWindow = $.preferredMaintenanceWindow;
        this.replicationSourceIdentifier = $.replicationSourceIdentifier;
        this.skipFinalSnapshot = $.skipFinalSnapshot;
        this.snapshotIdentifier = $.snapshotIdentifier;
        this.storageEncrypted = $.storageEncrypted;
        this.tags = $.tags;
        this.vpcSecurityGroupIds = $.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applyImmediately Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            $.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * @param applyImmediately Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(Boolean applyImmediately) {
            return applyImmediately(Output.of(applyImmediately));
        }

        /**
         * @param availabilityZones A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            $.availabilityZones = availabilityZones;
            return this;
        }

        /**
         * @param availabilityZones A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(List<String> availabilityZones) {
            return availabilityZones(Output.of(availabilityZones));
        }

        /**
         * @param availabilityZones A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }

        /**
         * @param backupRetentionPeriod The days to retain backups for. Default `1`
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionPeriod(@Nullable Output<Integer> backupRetentionPeriod) {
            $.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * @param backupRetentionPeriod The days to retain backups for. Default `1`
         * 
         * @return builder
         * 
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            return backupRetentionPeriod(Output.of(backupRetentionPeriod));
        }

        /**
         * @param clusterIdentifier The cluster identifier. If omitted, this provider will assign a random, unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            $.clusterIdentifier = clusterIdentifier;
            return this;
        }

        /**
         * @param clusterIdentifier The cluster identifier. If omitted, this provider will assign a random, unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifier(String clusterIdentifier) {
            return clusterIdentifier(Output.of(clusterIdentifier));
        }

        /**
         * @param clusterIdentifierPrefix Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifierPrefix(@Nullable Output<String> clusterIdentifierPrefix) {
            $.clusterIdentifierPrefix = clusterIdentifierPrefix;
            return this;
        }

        /**
         * @param clusterIdentifierPrefix Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
         * 
         * @return builder
         * 
         */
        public Builder clusterIdentifierPrefix(String clusterIdentifierPrefix) {
            return clusterIdentifierPrefix(Output.of(clusterIdentifierPrefix));
        }

        /**
         * @param copyTagsToSnapshot If set to true, tags are copied to any snapshot of the DB cluster that is created.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToSnapshot(@Nullable Output<Boolean> copyTagsToSnapshot) {
            $.copyTagsToSnapshot = copyTagsToSnapshot;
            return this;
        }

        /**
         * @param copyTagsToSnapshot If set to true, tags are copied to any snapshot of the DB cluster that is created.
         * 
         * @return builder
         * 
         */
        public Builder copyTagsToSnapshot(Boolean copyTagsToSnapshot) {
            return copyTagsToSnapshot(Output.of(copyTagsToSnapshot));
        }

        /**
         * @param deletionProtection A value that indicates whether the DB cluster has deletion protection enabled.The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection A value that indicates whether the DB cluster has deletion protection enabled.The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param enableCloudwatchLogsExports A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
         * 
         * @return builder
         * 
         */
        public Builder enableCloudwatchLogsExports(@Nullable Output<List<String>> enableCloudwatchLogsExports) {
            $.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
            return this;
        }

        /**
         * @param enableCloudwatchLogsExports A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
         * 
         * @return builder
         * 
         */
        public Builder enableCloudwatchLogsExports(List<String> enableCloudwatchLogsExports) {
            return enableCloudwatchLogsExports(Output.of(enableCloudwatchLogsExports));
        }

        /**
         * @param enableCloudwatchLogsExports A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
         * 
         * @return builder
         * 
         */
        public Builder enableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
            return enableCloudwatchLogsExports(List.of(enableCloudwatchLogsExports));
        }

        /**
         * @param engine The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion The database engine version.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion The database engine version.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param finalSnapshotIdentifier The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
         * 
         * @return builder
         * 
         */
        public Builder finalSnapshotIdentifier(@Nullable Output<String> finalSnapshotIdentifier) {
            $.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        /**
         * @param finalSnapshotIdentifier The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
         * 
         * @return builder
         * 
         */
        public Builder finalSnapshotIdentifier(String finalSnapshotIdentifier) {
            return finalSnapshotIdentifier(Output.of(finalSnapshotIdentifier));
        }

        /**
         * @param iamDatabaseAuthenticationEnabled Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
         * 
         * @return builder
         * 
         */
        public Builder iamDatabaseAuthenticationEnabled(@Nullable Output<Boolean> iamDatabaseAuthenticationEnabled) {
            $.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            return this;
        }

        /**
         * @param iamDatabaseAuthenticationEnabled Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
         * 
         * @return builder
         * 
         */
        public Builder iamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
            return iamDatabaseAuthenticationEnabled(Output.of(iamDatabaseAuthenticationEnabled));
        }

        /**
         * @param iamRoles A List of ARNs for the IAM roles to associate to the Neptune Cluster.
         * 
         * @return builder
         * 
         */
        public Builder iamRoles(@Nullable Output<List<String>> iamRoles) {
            $.iamRoles = iamRoles;
            return this;
        }

        /**
         * @param iamRoles A List of ARNs for the IAM roles to associate to the Neptune Cluster.
         * 
         * @return builder
         * 
         */
        public Builder iamRoles(List<String> iamRoles) {
            return iamRoles(Output.of(iamRoles));
        }

        /**
         * @param iamRoles A List of ARNs for the IAM roles to associate to the Neptune Cluster.
         * 
         * @return builder
         * 
         */
        public Builder iamRoles(String... iamRoles) {
            return iamRoles(List.of(iamRoles));
        }

        /**
         * @param kmsKeyArn The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        /**
         * @param neptuneClusterParameterGroupName A cluster parameter group to associate with the cluster.
         * 
         * @return builder
         * 
         */
        public Builder neptuneClusterParameterGroupName(@Nullable Output<String> neptuneClusterParameterGroupName) {
            $.neptuneClusterParameterGroupName = neptuneClusterParameterGroupName;
            return this;
        }

        /**
         * @param neptuneClusterParameterGroupName A cluster parameter group to associate with the cluster.
         * 
         * @return builder
         * 
         */
        public Builder neptuneClusterParameterGroupName(String neptuneClusterParameterGroupName) {
            return neptuneClusterParameterGroupName(Output.of(neptuneClusterParameterGroupName));
        }

        /**
         * @param neptuneSubnetGroupName A Neptune subnet group to associate with this Neptune instance.
         * 
         * @return builder
         * 
         */
        public Builder neptuneSubnetGroupName(@Nullable Output<String> neptuneSubnetGroupName) {
            $.neptuneSubnetGroupName = neptuneSubnetGroupName;
            return this;
        }

        /**
         * @param neptuneSubnetGroupName A Neptune subnet group to associate with this Neptune instance.
         * 
         * @return builder
         * 
         */
        public Builder neptuneSubnetGroupName(String neptuneSubnetGroupName) {
            return neptuneSubnetGroupName(Output.of(neptuneSubnetGroupName));
        }

        /**
         * @param port The port on which the Neptune accepts connections. Default is `8182`.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port on which the Neptune accepts connections. Default is `8182`.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param preferredBackupWindow The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupWindow(@Nullable Output<String> preferredBackupWindow) {
            $.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        /**
         * @param preferredBackupWindow The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
         * 
         * @return builder
         * 
         */
        public Builder preferredBackupWindow(String preferredBackupWindow) {
            return preferredBackupWindow(Output.of(preferredBackupWindow));
        }

        /**
         * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            $.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        /**
         * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
         * 
         * @return builder
         * 
         */
        public Builder preferredMaintenanceWindow(String preferredMaintenanceWindow) {
            return preferredMaintenanceWindow(Output.of(preferredMaintenanceWindow));
        }

        /**
         * @param replicationSourceIdentifier ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
         * 
         * @return builder
         * 
         */
        public Builder replicationSourceIdentifier(@Nullable Output<String> replicationSourceIdentifier) {
            $.replicationSourceIdentifier = replicationSourceIdentifier;
            return this;
        }

        /**
         * @param replicationSourceIdentifier ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
         * 
         * @return builder
         * 
         */
        public Builder replicationSourceIdentifier(String replicationSourceIdentifier) {
            return replicationSourceIdentifier(Output.of(replicationSourceIdentifier));
        }

        /**
         * @param skipFinalSnapshot Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipFinalSnapshot(@Nullable Output<Boolean> skipFinalSnapshot) {
            $.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }

        /**
         * @param skipFinalSnapshot Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder skipFinalSnapshot(Boolean skipFinalSnapshot) {
            return skipFinalSnapshot(Output.of(skipFinalSnapshot));
        }

        /**
         * @param snapshotIdentifier Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotIdentifier(@Nullable Output<String> snapshotIdentifier) {
            $.snapshotIdentifier = snapshotIdentifier;
            return this;
        }

        /**
         * @param snapshotIdentifier Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotIdentifier(String snapshotIdentifier) {
            return snapshotIdentifier(Output.of(snapshotIdentifier));
        }

        /**
         * @param storageEncrypted Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            $.storageEncrypted = storageEncrypted;
            return this;
        }

        /**
         * @param storageEncrypted Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
         * 
         * @return builder
         * 
         */
        public Builder storageEncrypted(Boolean storageEncrypted) {
            return storageEncrypted(Output.of(storageEncrypted));
        }

        /**
         * @param tags A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcSecurityGroupIds List of VPC security groups to associate with the Cluster
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            $.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        /**
         * @param vpcSecurityGroupIds List of VPC security groups to associate with the Cluster
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(Output.of(vpcSecurityGroupIds));
        }

        /**
         * @param vpcSecurityGroupIds List of VPC security groups to associate with the Cluster
         * 
         * @return builder
         * 
         */
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }

        public ClusterArgs build() {
            return $;
        }
    }

}
