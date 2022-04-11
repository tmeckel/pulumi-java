// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.ClusterInstanceArgs;
import io.pulumi.aws.rds.inputs.ClusterInstanceState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an RDS Cluster Instance Resource. A Cluster Instance Resource defines
 * attributes that are specific to a single instance in a [RDS Cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html),
 * specifically running Amazon Aurora.
 * 
 * Unlike other RDS resources that support replication, with Amazon Aurora you do
 * not designate a primary and subsequent replicas. Instead, you simply add RDS
 * Instances and Aurora manages the replication. You can use the [count](https://www.terraform.io/docs/configuration/meta-arguments/count.html)
 * meta-parameter to make multiple instances and join them all to the same RDS
 * Cluster, or you may specify different Cluster Instance resources with various
 * `instance_class` sizes.
 * 
 * For more information on Amazon Aurora, see [Aurora on Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html) in the Amazon RDS User Guide.
 * 
 * > **NOTE:** Deletion Protection from the RDS service can only be enabled at the cluster level, not for individual cluster instances. You can still add the [`protect` CustomResourceOption](https://www.pulumi.com/docs/intro/concepts/programming-model/#protect) to this resource configuration if you desire protection from accidental deletion.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * RDS Cluster Instances can be imported using the `identifier`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/clusterInstance:ClusterInstance prod_instance_1 aurora-cluster-instance-1
 * ```
 * 
 */
@ResourceType(type="aws:rds/clusterInstance:ClusterInstance")
public class ClusterInstance extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @Export(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately;
    }
    /**
     * Amazon Resource Name (ARN) of cluster instance
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster instance
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    @Export(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    /**
     * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The identifier of the CA certificate for the DB instance.
     * 
     */
    @Export(name="caCertIdentifier", type=String.class, parameters={})
    private Output<String> caCertIdentifier;

    /**
     * @return The identifier of the CA certificate for the DB instance.
     * 
     */
    public Output<String> getCaCertIdentifier() {
        return this.caCertIdentifier;
    }
    /**
     * The identifier of the `aws.rds.Cluster` in which to launch this instance.
     * 
     */
    @Export(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The identifier of the `aws.rds.Cluster` in which to launch this instance.
     * 
     */
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
     * 
     */
    @Export(name="copyTagsToSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyTagsToSnapshot;

    /**
     * @return Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }
    /**
     * The name of the DB parameter group to associate with this instance.
     * 
     */
    @Export(name="dbParameterGroupName", type=String.class, parameters={})
    private Output<String> dbParameterGroupName;

    /**
     * @return The name of the DB parameter group to associate with this instance.
     * 
     */
    public Output<String> getDbParameterGroupName() {
        return this.dbParameterGroupName;
    }
    /**
     * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached `aws.rds.Cluster`.
     * 
     */
    @Export(name="dbSubnetGroupName", type=String.class, parameters={})
    private Output<String> dbSubnetGroupName;

    /**
     * @return A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached `aws.rds.Cluster`.
     * 
     */
    public Output<String> getDbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }
    /**
     * The region-unique, immutable identifier for the DB instance.
     * 
     */
    @Export(name="dbiResourceId", type=String.class, parameters={})
    private Output<String> dbiResourceId;

    /**
     * @return The region-unique, immutable identifier for the DB instance.
     * 
     */
    public Output<String> getDbiResourceId() {
        return this.dbiResourceId;
    }
    /**
     * The DNS address for this instance. May not be writable
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS address for this instance. May not be writable
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
     * For information on the difference between the available Aurora MySQL engines
     * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
     * in the Amazon RDS User Guide.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
     * For information on the difference between the available Aurora MySQL engines
     * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
     * in the Amazon RDS User Guide.
     * 
     */
    public Output</* @Nullable */ String> getEngine() {
        return this.engine;
    }
    /**
     * The database engine version.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return The database engine version.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The database engine version
     * 
     */
    @Export(name="engineVersionActual", type=String.class, parameters={})
    private Output<String> engineVersionActual;

    /**
     * @return The database engine version
     * 
     */
    public Output<String> getEngineVersionActual() {
        return this.engineVersionActual;
    }
    /**
     * The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> getIdentifier() {
        return this.identifier;
    }
    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Export(name="identifierPrefix", type=String.class, parameters={})
    private Output<String> identifierPrefix;

    /**
     * @return Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    public Output<String> getIdentifierPrefix() {
        return this.identifierPrefix;
    }
    /**
     * The instance class to use. For details on CPU
     * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
     * 
     */
    @Export(name="instanceClass", type=String.class, parameters={})
    private Output<String> instanceClass;

    /**
     * @return The instance class to use. For details on CPU
     * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
     * 
     */
    public Output<String> getInstanceClass() {
        return this.instanceClass;
    }
    /**
     * The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    public Output<String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
     * 
     */
    @Export(name="monitoringInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> monitoringInterval;

    /**
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
     * 
     */
    public Output</* @Nullable */ Integer> getMonitoringInterval() {
        return this.monitoringInterval;
    }
    /**
     * The ARN for the IAM role that permits RDS to send
     * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
     * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
     * 
     */
    @Export(name="monitoringRoleArn", type=String.class, parameters={})
    private Output<String> monitoringRoleArn;

    /**
     * @return The ARN for the IAM role that permits RDS to send
     * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
     * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
     * 
     */
    public Output<String> getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }
    /**
     * Specifies whether Performance Insights is enabled or not.
     * 
     */
    @Export(name="performanceInsightsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> performanceInsightsEnabled;

    /**
     * @return Specifies whether Performance Insights is enabled or not.
     * 
     */
    public Output<Boolean> getPerformanceInsightsEnabled() {
        return this.performanceInsightsEnabled;
    }
    /**
     * ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
     * 
     */
    @Export(name="performanceInsightsKmsKeyId", type=String.class, parameters={})
    private Output<String> performanceInsightsKmsKeyId;

    /**
     * @return ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
     * 
     */
    public Output<String> getPerformanceInsightsKmsKeyId() {
        return this.performanceInsightsKmsKeyId;
    }
    /**
     * Amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to '7'.
     * 
     */
    @Export(name="performanceInsightsRetentionPeriod", type=Integer.class, parameters={})
    private Output<Integer> performanceInsightsRetentionPeriod;

    /**
     * @return Amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to '7'.
     * 
     */
    public Output<Integer> getPerformanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }
    /**
     * The database port
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The database port
     * 
     */
    public Output<Integer> getPort() {
        return this.port;
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled.
     * Eg: "04:00-09:00"
     * 
     */
    @Export(name="preferredBackupWindow", type=String.class, parameters={})
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled.
     * Eg: "04:00-09:00"
     * 
     */
    public Output<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    @Export(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
     * 
     */
    @Export(name="promotionTier", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> promotionTier;

    /**
     * @return Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
     * 
     */
    public Output</* @Nullable */ Integer> getPromotionTier() {
        return this.promotionTier;
    }
    /**
     * Bool to control if instance is publicly accessible.
     * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
     * details on controlling this property.
     * 
     */
    @Export(name="publiclyAccessible", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return Bool to control if instance is publicly accessible.
     * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
     * details on controlling this property.
     * 
     */
    public Output</* @Nullable */ Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * Specifies whether the DB cluster is encrypted.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted.
     * 
     */
    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    @Export(name="writer", type=Boolean.class, parameters={})
    private Output<Boolean> writer;

    /**
     * @return Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    public Output<Boolean> getWriter() {
        return this.writer;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterInstance(String name) {
        this(name, ClusterInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterInstance(String name, ClusterInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterInstance(String name, ClusterInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterInstance:ClusterInstance", name, args == null ? ClusterInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterInstance(String name, Output<String> id, @Nullable ClusterInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterInstance:ClusterInstance", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ClusterInstance get(String name, Output<String> id, @Nullable ClusterInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterInstance(name, id, state, options);
    }
}
