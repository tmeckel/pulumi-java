// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudtasks_v2.QueueArgs;
import io.pulumi.googlenative.cloudtasks_v2.outputs.AppEngineRoutingResponse;
import io.pulumi.googlenative.cloudtasks_v2.outputs.RateLimitsResponse;
import io.pulumi.googlenative.cloudtasks_v2.outputs.RetryConfigResponse;
import io.pulumi.googlenative.cloudtasks_v2.outputs.StackdriverLoggingConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a queue. Queues created with this method allow tasks to live for a maximum of 31 days. After a task is 31 days old, the task will be deleted regardless of whether it was dispatched or not. WARNING: Using this method may have unintended side effects if you are using an App Engine `queue.yaml` or `queue.xml` file to manage your queues. Read [Overview of Queue Management and queue.yaml](https://cloud.google.com/tasks/docs/queue-yaml) before using this method.
 * 
 */
@ResourceType(type="google-native:cloudtasks/v2:Queue")
public class Queue extends io.pulumi.resources.CustomResource {
    /**
     * Overrides for task-level app_engine_routing. These settings apply only to App Engine tasks in this queue. Http tasks are not affected. If set, `app_engine_routing_override` is used for all App Engine tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    @Export(name="appEngineRoutingOverride", type=AppEngineRoutingResponse.class, parameters={})
    private Output<AppEngineRoutingResponse> appEngineRoutingOverride;

    /**
     * @return Overrides for task-level app_engine_routing. These settings apply only to App Engine tasks in this queue. Http tasks are not affected. If set, `app_engine_routing_override` is used for all App Engine tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    public Output<AppEngineRoutingResponse> getAppEngineRoutingOverride() {
        return this.appEngineRoutingOverride;
    }
    /**
     * Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Caller-specified and required in CreateQueue, after which it becomes output only. The queue name. The queue name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the queue's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    @Export(name="purgeTime", type=String.class, parameters={})
    private Output<String> purgeTime;

    /**
     * @return The last time this queue was purged. All tasks that were created before this time were purged. A queue can be purged using PurgeQueue, the [App Engine Task Queue SDK, or the Cloud Console](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/deleting-tasks-and-queues#purging_all_tasks_from_a_queue). Purge time will be truncated to the nearest microsecond. Purge time will be unset if the queue has never been purged.
     * 
     */
    public Output<String> getPurgeTime() {
        return this.purgeTime;
    }
    /**
     * Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts. However they control task attempts in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc). The queue's actual dispatch rate is the result of: * Number of tasks in the queue * User-specified throttling: rate_limits, retry_config, and the queue's state. * System throttling due to `429` (Too Many Requests) or `503` (Service Unavailable) responses from the worker, high error rates, or to smooth sudden large traffic spikes.
     * 
     */
    @Export(name="rateLimits", type=RateLimitsResponse.class, parameters={})
    private Output<RateLimitsResponse> rateLimits;

    /**
     * @return Rate limits for task dispatches. rate_limits and retry_config are related because they both control task attempts. However they control task attempts in different ways: * rate_limits controls the total rate of dispatches from a queue (i.e. all traffic dispatched from the queue, regardless of whether the dispatch is from a first attempt or a retry). * retry_config controls what happens to particular a task after its first attempt fails. That is, retry_config controls task retries (the second attempt, third attempt, etc). The queue's actual dispatch rate is the result of: * Number of tasks in the queue * User-specified throttling: rate_limits, retry_config, and the queue's state. * System throttling due to `429` (Too Many Requests) or `503` (Service Unavailable) responses from the worker, high error rates, or to smooth sudden large traffic spikes.
     * 
     */
    public Output<RateLimitsResponse> getRateLimits() {
        return this.rateLimits;
    }
    /**
     * Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    @Export(name="retryConfig", type=RetryConfigResponse.class, parameters={})
    private Output<RetryConfigResponse> retryConfig;

    /**
     * @return Settings that determine the retry behavior. * For tasks created using Cloud Tasks: the queue-level retry settings apply to all tasks in the queue that were created using Cloud Tasks. Retry settings cannot be set on individual tasks. * For tasks created using the App Engine SDK: the queue-level retry settings apply to all tasks in the queue which do not have retry settings explicitly set on the task and were created by the App Engine SDK. See [App Engine documentation](https://cloud.google.com/appengine/docs/standard/python/taskqueue/push/retrying-tasks).
     * 
     */
    public Output<RetryConfigResponse> getRetryConfig() {
        return this.retryConfig;
    }
    /**
     * Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this field is unset, then no logs are written.
     * 
     */
    @Export(name="stackdriverLoggingConfig", type=StackdriverLoggingConfigResponse.class, parameters={})
    private Output<StackdriverLoggingConfigResponse> stackdriverLoggingConfig;

    /**
     * @return Configuration options for writing logs to [Stackdriver Logging](https://cloud.google.com/logging/docs/). If this field is unset, then no logs are written.
     * 
     */
    public Output<StackdriverLoggingConfigResponse> getStackdriverLoggingConfig() {
        return this.stackdriverLoggingConfig;
    }
    /**
     * The state of the queue. `state` can only be changed by calling PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the queue. `state` can only be changed by calling PauseQueue, ResumeQueue, or uploading [queue.yaml/xml](https://cloud.google.com/appengine/docs/python/config/queueref). UpdateQueue cannot be used to change `state`.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, @Nullable QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, @Nullable QueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Queue(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudtasks/v2:Queue", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Queue get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, options);
    }
}
