// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks_v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudtasks_v2beta2.inputs.AppEngineRoutingArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * App Engine HTTP target. The task will be delivered to the App Engine application hostname specified by its AppEngineHttpTarget and AppEngineHttpRequest. The documentation for AppEngineHttpRequest explains how the task&#39;s host URL is constructed. Using AppEngineHttpTarget requires [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control) Google IAM permission for the project and the following scope: `https://www.googleapis.com/auth/cloud-platform`
 * 
 */
public final class AppEngineHttpTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppEngineHttpTargetArgs Empty = new AppEngineHttpTargetArgs();

    /**
     * Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    @Import(name="appEngineRoutingOverride")
    private @Nullable Output<AppEngineRoutingArgs> appEngineRoutingOverride;

    /**
     * @return Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    public Optional<Output<AppEngineRoutingArgs>> appEngineRoutingOverride() {
        return Optional.ofNullable(this.appEngineRoutingOverride);
    }

    private AppEngineHttpTargetArgs() {}

    private AppEngineHttpTargetArgs(AppEngineHttpTargetArgs $) {
        this.appEngineRoutingOverride = $.appEngineRoutingOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppEngineHttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineHttpTargetArgs $;

        public Builder() {
            $ = new AppEngineHttpTargetArgs();
        }

        public Builder(AppEngineHttpTargetArgs defaults) {
            $ = new AppEngineHttpTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineRoutingOverride Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRoutingOverride(@Nullable Output<AppEngineRoutingArgs> appEngineRoutingOverride) {
            $.appEngineRoutingOverride = appEngineRoutingOverride;
            return this;
        }

        /**
         * @param appEngineRoutingOverride Overrides for the task-level app_engine_routing. If set, `app_engine_routing_override` is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRoutingOverride(AppEngineRoutingArgs appEngineRoutingOverride) {
            return appEngineRoutingOverride(Output.of(appEngineRoutingOverride));
        }

        public AppEngineHttpTargetArgs build() {
            return $;
        }
    }

}
