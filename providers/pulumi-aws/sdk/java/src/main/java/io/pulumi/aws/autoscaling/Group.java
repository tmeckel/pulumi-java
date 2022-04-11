// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.GroupArgs;
import io.pulumi.aws.autoscaling.inputs.GroupState;
import io.pulumi.aws.autoscaling.outputs.GroupInitialLifecycleHook;
import io.pulumi.aws.autoscaling.outputs.GroupInstanceRefresh;
import io.pulumi.aws.autoscaling.outputs.GroupLaunchTemplate;
import io.pulumi.aws.autoscaling.outputs.GroupMixedInstancesPolicy;
import io.pulumi.aws.autoscaling.outputs.GroupTag;
import io.pulumi.aws.autoscaling.outputs.GroupWarmPool;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Auto Scaling Group resource.
 * 
 * > **Note:** You must specify either `launch_configuration`, `launch_template`, or `mixed_instances_policy`.
 * 
 * > **NOTE on Auto Scaling Groups and ASG Attachments:** This provider currently provides
 * both a standalone `aws.autoscaling.Attachment` resource
 * (describing an ASG attached to an ELB or ALB), and an `aws.autoscaling.Group`
 * with `load_balancers` and `target_group_arns` defined in-line. These two methods are not
 * mutually-exclusive. If `aws.autoscaling.Attachment` resources are used, either alone or with inline
 * `load_balancers` or `target_group_arns`, the `aws.autoscaling.Group` resource must be configured
 * to ignore changes to the `load_balancers` and `target_group_arns` arguments.
 * 
 * ## Example Usage
 * ## Waiting for Capacity
 * 
 * A newly-created ASG is initially empty and begins to scale to `min_size` (or
 * `desired_capacity`, if specified) by launching instances using the provided
 * Launch Configuration. These instances take time to launch and boot.
 * 
 * On ASG Update, changes to these values also take time to result in the target
 * number of instances providing service.
 * 
 * This provider provides two mechanisms to help consistently manage ASG scale up
 * time across dependent resources.
 * 
 * #### Waiting for ASG Capacity
 * 
 * The first is default behavior. This provider waits after ASG creation for
 * `min_size` (or `desired_capacity`, if specified) healthy instances to show up
 * in the ASG before continuing.
 * 
 * If `min_size` or `desired_capacity` are changed in a subsequent update,
 * this provider will also wait for the correct number of healthy instances before
 * continuing.
 * 
 * This provider considers an instance "healthy" when the ASG reports `HealthStatus:
 * "Healthy"` and `LifecycleState: "InService"`. See the [AWS AutoScaling
 * Docs](https://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html)
 * for more information on an ASG's lifecycle.
 * 
 * This provider will wait for healthy instances for up to
 * `wait_for_capacity_timeout`. If ASG creation is taking more than a few minutes,
 * it's worth investigating for scaling activity errors, which can be caused by
 * problems with the selected Launch Configuration.
 * 
 * Setting `wait_for_capacity_timeout` to `"0"` disables ASG Capacity waiting.
 * 
 * #### Waiting for ELB Capacity
 * 
 * The second mechanism is optional, and affects ASGs with attached ELBs specified
 * via the `load_balancers` attribute or with ALBs specified with `target_group_arns`.
 * 
 * The `min_elb_capacity` parameter causes this provider to wait for at least the
 * requested number of instances to show up `"InService"` in all attached ELBs
 * during ASG creation.  It has no effect on ASG updates.
 * 
 * If `wait_for_elb_capacity` is set, this provider will wait for exactly that number
 * of Instances to be `"InService"` in all attached ELBs on both creation and
 * updates.
 * 
 * These parameters can be used to ensure that service is being provided before
 * the provider moves on. If new instances don't pass the ELB's health checks for any
 * reason, the apply will time out, and the ASG will be marked as
 * tainted (i.e., marked to be destroyed in a follow up run).
 * 
 * As with ASG Capacity, this provider will wait for up to `wait_for_capacity_timeout`
 * for the proper number of instances to be healthy.
 * 
 * #### Troubleshooting Capacity Waiting Timeouts
 * 
 * If ASG creation takes more than a few minutes, this could indicate one of a
 * number of configuration problems. See the [AWS Docs on Load Balancer
 * Troubleshooting](https://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/elb-troubleshooting.html)
 * for more information.
 * 
 * ## Import
 * 
 * Auto Scaling Groups can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:autoscaling/group:Group web web-asg
 * ```
 * 
 */
@ResourceType(type="aws:autoscaling/group:Group")
public class Group extends io.pulumi.resources.CustomResource {
    /**
     * The ARN for this Auto Scaling Group
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN for this Auto Scaling Group
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A list of one or more availability zones for the group. Used for EC2-Classic, attaching a network interface via id from a launch template and default subnets when not specified with `vpc_zone_identifier` argument. Conflicts with `vpc_zone_identifier`.
     * 
     */
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    /**
     * @return A list of one or more availability zones for the group. Used for EC2-Classic, attaching a network interface via id from a launch template and default subnets when not specified with `vpc_zone_identifier` argument. Conflicts with `vpc_zone_identifier`.
     * 
     */
    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * Indicates whether capacity rebalance is enabled. Otherwise, capacity rebalance is disabled.
     * 
     */
    @Export(name="capacityRebalance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> capacityRebalance;

    /**
     * @return Indicates whether capacity rebalance is enabled. Otherwise, capacity rebalance is disabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getCapacityRebalance() {
        return this.capacityRebalance;
    }
    /**
     * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
     * 
     */
    @Export(name="defaultCooldown", type=Integer.class, parameters={})
    private Output<Integer> defaultCooldown;

    /**
     * @return The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
     * 
     */
    public Output<Integer> getDefaultCooldown() {
        return this.defaultCooldown;
    }
    /**
     * The number of Amazon EC2 instances that
     * should be running in the group. (See also Waiting for
     * Capacity below.)
     * 
     */
    @Export(name="desiredCapacity", type=Integer.class, parameters={})
    private Output<Integer> desiredCapacity;

    /**
     * @return The number of Amazon EC2 instances that
     * should be running in the group. (See also Waiting for
     * Capacity below.)
     * 
     */
    public Output<Integer> getDesiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * A list of metrics to collect. The allowed values are defined by the [underlying AWS API](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html).
     * 
     */
    @Export(name="enabledMetrics", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> enabledMetrics;

    /**
     * @return A list of metrics to collect. The allowed values are defined by the [underlying AWS API](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html).
     * 
     */
    public Output</* @Nullable */ List<String>> getEnabledMetrics() {
        return this.enabledMetrics;
    }
    /**
     * Allows deleting the Auto Scaling Group without waiting
     * for all instances in the pool to terminate.  You can force an Auto Scaling Group to delete
     * even if it's in the process of scaling a resource. Normally, this provider
     * drains all the instances before deleting the group.  This bypasses that
     * behavior and potentially leaves resources dangling.
     * 
     */
    @Export(name="forceDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDelete;

    /**
     * @return Allows deleting the Auto Scaling Group without waiting
     * for all instances in the pool to terminate.  You can force an Auto Scaling Group to delete
     * even if it's in the process of scaling a resource. Normally, this provider
     * drains all the instances before deleting the group.  This bypasses that
     * behavior and potentially leaves resources dangling.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDelete() {
        return this.forceDelete;
    }
    @Export(name="forceDeleteWarmPool", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDeleteWarmPool;

    public Output</* @Nullable */ Boolean> getForceDeleteWarmPool() {
        return this.forceDeleteWarmPool;
    }
    /**
     * Time (in seconds) after instance comes into service before checking health.
     * 
     */
    @Export(name="healthCheckGracePeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> healthCheckGracePeriod;

    /**
     * @return Time (in seconds) after instance comes into service before checking health.
     * 
     */
    public Output</* @Nullable */ Integer> getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }
    /**
     * "EC2" or "ELB". Controls how health checking is done.
     * 
     */
    @Export(name="healthCheckType", type=String.class, parameters={})
    private Output<String> healthCheckType;

    /**
     * @return "EC2" or "ELB". Controls how health checking is done.
     * 
     */
    public Output<String> getHealthCheckType() {
        return this.healthCheckType;
    }
    /**
     * One or more
     * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
     * to attach to the Auto Scaling Group **before** instances are launched. The
     * syntax is exactly the same as the separate
     * `aws.autoscaling.LifecycleHook`
     * resource, without the `autoscaling_group_name` attribute. Please note that this will only work when creating
     * a new Auto Scaling Group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
     * 
     */
    @Export(name="initialLifecycleHooks", type=List.class, parameters={GroupInitialLifecycleHook.class})
    private Output</* @Nullable */ List<GroupInitialLifecycleHook>> initialLifecycleHooks;

    /**
     * @return One or more
     * [Lifecycle Hooks](http://docs.aws.amazon.com/autoscaling/latest/userguide/lifecycle-hooks.html)
     * to attach to the Auto Scaling Group **before** instances are launched. The
     * syntax is exactly the same as the separate
     * `aws.autoscaling.LifecycleHook`
     * resource, without the `autoscaling_group_name` attribute. Please note that this will only work when creating
     * a new Auto Scaling Group. For all other use-cases, please use `aws.autoscaling.LifecycleHook` resource.
     * 
     */
    public Output</* @Nullable */ List<GroupInitialLifecycleHook>> getInitialLifecycleHooks() {
        return this.initialLifecycleHooks;
    }
    /**
     * If this block is configured, start an
     * [Instance Refresh](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html)
     * when this Auto Scaling Group is updated. Defined below.
     * 
     */
    @Export(name="instanceRefresh", type=GroupInstanceRefresh.class, parameters={})
    private Output</* @Nullable */ GroupInstanceRefresh> instanceRefresh;

    /**
     * @return If this block is configured, start an
     * [Instance Refresh](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-instance-refresh.html)
     * when this Auto Scaling Group is updated. Defined below.
     * 
     */
    public Output</* @Nullable */ GroupInstanceRefresh> getInstanceRefresh() {
        return this.instanceRefresh;
    }
    /**
     * The name of the launch configuration to use.
     * 
     */
    @Export(name="launchConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> launchConfiguration;

    /**
     * @return The name of the launch configuration to use.
     * 
     */
    public Output</* @Nullable */ String> getLaunchConfiguration() {
        return this.launchConfiguration;
    }
    /**
     * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
     * 
     */
    @Export(name="launchTemplate", type=GroupLaunchTemplate.class, parameters={})
    private Output</* @Nullable */ GroupLaunchTemplate> launchTemplate;

    /**
     * @return Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
     * 
     */
    public Output</* @Nullable */ GroupLaunchTemplate> getLaunchTemplate() {
        return this.launchTemplate;
    }
    /**
     * A list of elastic load balancer names to add to the autoscaling
     * group names. Only valid for classic load balancers. For ALBs, use `target_group_arns` instead.
     * 
     */
    @Export(name="loadBalancers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> loadBalancers;

    /**
     * @return A list of elastic load balancer names to add to the autoscaling
     * group names. Only valid for classic load balancers. For ALBs, use `target_group_arns` instead.
     * 
     */
    public Output</* @Nullable */ List<String>> getLoadBalancers() {
        return this.loadBalancers;
    }
    /**
     * The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 86400 and 31536000 seconds.
     * 
     */
    @Export(name="maxInstanceLifetime", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxInstanceLifetime;

    /**
     * @return The maximum amount of time, in seconds, that an instance can be in service, values must be either equal to 0 or between 86400 and 31536000 seconds.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxInstanceLifetime() {
        return this.maxInstanceLifetime;
    }
    /**
     * The maximum size of the Auto Scaling Group.
     * 
     */
    @Export(name="maxSize", type=Integer.class, parameters={})
    private Output<Integer> maxSize;

    /**
     * @return The maximum size of the Auto Scaling Group.
     * 
     */
    public Output<Integer> getMaxSize() {
        return this.maxSize;
    }
    /**
     * The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
     * 
     */
    @Export(name="metricsGranularity", type=String.class, parameters={})
    private Output</* @Nullable */ String> metricsGranularity;

    /**
     * @return The granularity to associate with the metrics to collect. The only valid value is `1Minute`. Default is `1Minute`.
     * 
     */
    public Output</* @Nullable */ String> getMetricsGranularity() {
        return this.metricsGranularity;
    }
    /**
     * Setting this causes the provider to wait for
     * this number of instances from this Auto Scaling Group to show up healthy in the
     * ELB only on creation. Updates will not wait on ELB instance number changes.
     * (See also Waiting for Capacity below.)
     * 
     */
    @Export(name="minElbCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> minElbCapacity;

    /**
     * @return Setting this causes the provider to wait for
     * this number of instances from this Auto Scaling Group to show up healthy in the
     * ELB only on creation. Updates will not wait on ELB instance number changes.
     * (See also Waiting for Capacity below.)
     * 
     */
    public Output</* @Nullable */ Integer> getMinElbCapacity() {
        return this.minElbCapacity;
    }
    /**
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    @Export(name="minSize", type=Integer.class, parameters={})
    private Output<Integer> minSize;

    /**
     * @return Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    public Output<Integer> getMinSize() {
        return this.minSize;
    }
    /**
     * Configuration block containing settings to define launch targets for Auto Scaling groups. See Mixed Instances Policy below for more details.
     * 
     */
    @Export(name="mixedInstancesPolicy", type=GroupMixedInstancesPolicy.class, parameters={})
    private Output</* @Nullable */ GroupMixedInstancesPolicy> mixedInstancesPolicy;

    /**
     * @return Configuration block containing settings to define launch targets for Auto Scaling groups. See Mixed Instances Policy below for more details.
     * 
     */
    public Output</* @Nullable */ GroupMixedInstancesPolicy> getMixedInstancesPolicy() {
        return this.mixedInstancesPolicy;
    }
    /**
     * The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Auto Scaling Group. By default generated by this provider. Conflicts with `name_prefix`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The name of the placement group into which you'll launch your instances, if any.
     * 
     */
    @Export(name="placementGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> placementGroup;

    /**
     * @return The name of the placement group into which you'll launch your instances, if any.
     * 
     */
    public Output</* @Nullable */ String> getPlacementGroup() {
        return this.placementGroup;
    }
    /**
     * Allows setting instance protection. The
     * Auto Scaling Group will not select instances with this setting for termination
     * during scale in events.
     * 
     */
    @Export(name="protectFromScaleIn", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> protectFromScaleIn;

    /**
     * @return Allows setting instance protection. The
     * Auto Scaling Group will not select instances with this setting for termination
     * during scale in events.
     * 
     */
    public Output</* @Nullable */ Boolean> getProtectFromScaleIn() {
        return this.protectFromScaleIn;
    }
    /**
     * The ARN of the service-linked role that the ASG will use to call other AWS services
     * 
     */
    @Export(name="serviceLinkedRoleArn", type=String.class, parameters={})
    private Output<String> serviceLinkedRoleArn;

    /**
     * @return The ARN of the service-linked role that the ASG will use to call other AWS services
     * 
     */
    public Output<String> getServiceLinkedRoleArn() {
        return this.serviceLinkedRoleArn;
    }
    /**
     * A list of processes to suspend for the Auto Scaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
     * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your Auto Scaling Group from functioning properly.
     * 
     */
    @Export(name="suspendedProcesses", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> suspendedProcesses;

    /**
     * @return A list of processes to suspend for the Auto Scaling Group. The allowed values are `Launch`, `Terminate`, `HealthCheck`, `ReplaceUnhealthy`, `AZRebalance`, `AlarmNotification`, `ScheduledActions`, `AddToLoadBalancer`.
     * Note that if you suspend either the `Launch` or `Terminate` process types, it can prevent your Auto Scaling Group from functioning properly.
     * 
     */
    public Output</* @Nullable */ List<String>> getSuspendedProcesses() {
        return this.suspendedProcesses;
    }
    /**
     * Configuration block(s) containing resource tags. Conflicts with `tags_collection`. Documented below.
     * 
     */
    @Export(name="tags", type=List.class, parameters={GroupTag.class})
    private Output</* @Nullable */ List<GroupTag>> tags;

    /**
     * @return Configuration block(s) containing resource tags. Conflicts with `tags_collection`. Documented below.
     * 
     */
    public Output</* @Nullable */ List<GroupTag>> getTags() {
        return this.tags;
    }
    /**
     * Set of maps containing resource tags. Conflicts with `tag`. Documented below.
     * 
     */
    @Export(name="tagsCollection", type=List.class, parameters={Map.class})
    private Output</* @Nullable */ List<Map<String,String>>> tagsCollection;

    /**
     * @return Set of maps containing resource tags. Conflicts with `tag`. Documented below.
     * 
     */
    public Output</* @Nullable */ List<Map<String,String>>> getTagsCollection() {
        return this.tagsCollection;
    }
    /**
     * A set of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
     * 
     */
    @Export(name="targetGroupArns", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> targetGroupArns;

    /**
     * @return A set of `aws.alb.TargetGroup` ARNs, for use with Application or Network Load Balancing.
     * 
     */
    public Output</* @Nullable */ List<String>> getTargetGroupArns() {
        return this.targetGroupArns;
    }
    /**
     * A list of policies to decide how the instances in the Auto Scaling Group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
     * 
     */
    @Export(name="terminationPolicies", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> terminationPolicies;

    /**
     * @return A list of policies to decide how the instances in the Auto Scaling Group should be terminated. The allowed values are `OldestInstance`, `NewestInstance`, `OldestLaunchConfiguration`, `ClosestToNextInstanceHour`, `OldestLaunchTemplate`, `AllocationStrategy`, `Default`.
     * 
     */
    public Output</* @Nullable */ List<String>> getTerminationPolicies() {
        return this.terminationPolicies;
    }
    /**
     * A list of subnet IDs to launch resources in. Subnets automatically determine which availability zones the group will reside. Conflicts with `availability_zones`.
     * 
     */
    @Export(name="vpcZoneIdentifiers", type=List.class, parameters={String.class})
    private Output<List<String>> vpcZoneIdentifiers;

    /**
     * @return A list of subnet IDs to launch resources in. Subnets automatically determine which availability zones the group will reside. Conflicts with `availability_zones`.
     * 
     */
    public Output<List<String>> getVpcZoneIdentifiers() {
        return this.vpcZoneIdentifiers;
    }
    /**
     * A maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for ASG instances to be healthy before timing out.  (See also Waiting
     * for Capacity below.) Setting this to "0" causes
     * this provider to skip all Capacity Waiting behavior.
     * 
     */
    @Export(name="waitForCapacityTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> waitForCapacityTimeout;

    /**
     * @return A maximum
     * [duration](https://golang.org/pkg/time/#ParseDuration) that this provider should
     * wait for ASG instances to be healthy before timing out.  (See also Waiting
     * for Capacity below.) Setting this to "0" causes
     * this provider to skip all Capacity Waiting behavior.
     * 
     */
    public Output</* @Nullable */ String> getWaitForCapacityTimeout() {
        return this.waitForCapacityTimeout;
    }
    /**
     * Setting this will cause the provider to wait
     * for exactly this number of healthy instances from this Auto Scaling Group in
     * all attached load balancers on both create and update operations. (Takes
     * precedence over `min_elb_capacity` behavior.)
     * (See also Waiting for Capacity below.)
     * 
     */
    @Export(name="waitForElbCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> waitForElbCapacity;

    /**
     * @return Setting this will cause the provider to wait
     * for exactly this number of healthy instances from this Auto Scaling Group in
     * all attached load balancers on both create and update operations. (Takes
     * precedence over `min_elb_capacity` behavior.)
     * (See also Waiting for Capacity below.)
     * 
     */
    public Output</* @Nullable */ Integer> getWaitForElbCapacity() {
        return this.waitForElbCapacity;
    }
    /**
     * If this block is configured, add a [Warm Pool](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     * to the specified Auto Scaling group. Defined below
     * 
     */
    @Export(name="warmPool", type=GroupWarmPool.class, parameters={})
    private Output</* @Nullable */ GroupWarmPool> warmPool;

    /**
     * @return If this block is configured, add a [Warm Pool](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-warm-pools.html)
     * to the specified Auto Scaling group. Defined below
     * 
     */
    public Output</* @Nullable */ GroupWarmPool> getWarmPool() {
        return this.warmPool;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(String name, GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(String name, GroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/group:Group", name, args == null ? GroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Group(String name, Output<String> id, @Nullable GroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/group:Group", name, state, makeResourceOptions(options, id));
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
    public static Group get(String name, Output<String> id, @Nullable GroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}
