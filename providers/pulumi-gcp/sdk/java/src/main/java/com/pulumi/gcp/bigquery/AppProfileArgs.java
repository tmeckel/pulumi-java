// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.AppProfileSingleClusterRoutingArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppProfileArgs Empty = new AppProfileArgs();

    /**
     * The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     */
    @Import(name="appProfileId", required=true)
    private Output<String> appProfileId;

    /**
     * @return The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     */
    public Output<String> appProfileId() {
        return this.appProfileId;
    }

    /**
     * Long form description of the use case for this app profile.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Long form description of the use case for this app profile.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * If true, ignore safety checks when deleting/updating the app profile.
     * 
     */
    @Import(name="ignoreWarnings")
    private @Nullable Output<Boolean> ignoreWarnings;

    /**
     * @return If true, ignore safety checks when deleting/updating the app profile.
     * 
     */
    public Optional<Output<Boolean>> ignoreWarnings() {
        return Optional.ofNullable(this.ignoreWarnings);
    }

    /**
     * The name of the instance to create the app profile within.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return The name of the instance to create the app profile within.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
     * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
     * consistency to improve availability.
     * 
     */
    @Import(name="multiClusterRoutingUseAny")
    private @Nullable Output<Boolean> multiClusterRoutingUseAny;

    /**
     * @return If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
     * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
     * consistency to improve availability.
     * 
     */
    public Optional<Output<Boolean>> multiClusterRoutingUseAny() {
        return Optional.ofNullable(this.multiClusterRoutingUseAny);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Use a single-cluster routing policy.
     * Structure is documented below.
     * 
     */
    @Import(name="singleClusterRouting")
    private @Nullable Output<AppProfileSingleClusterRoutingArgs> singleClusterRouting;

    /**
     * @return Use a single-cluster routing policy.
     * Structure is documented below.
     * 
     */
    public Optional<Output<AppProfileSingleClusterRoutingArgs>> singleClusterRouting() {
        return Optional.ofNullable(this.singleClusterRouting);
    }

    private AppProfileArgs() {}

    private AppProfileArgs(AppProfileArgs $) {
        this.appProfileId = $.appProfileId;
        this.description = $.description;
        this.ignoreWarnings = $.ignoreWarnings;
        this.instance = $.instance;
        this.multiClusterRoutingUseAny = $.multiClusterRoutingUseAny;
        this.project = $.project;
        this.singleClusterRouting = $.singleClusterRouting;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppProfileArgs $;

        public Builder() {
            $ = new AppProfileArgs();
        }

        public Builder(AppProfileArgs defaults) {
            $ = new AppProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appProfileId The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
         * 
         * @return builder
         * 
         */
        public Builder appProfileId(Output<String> appProfileId) {
            $.appProfileId = appProfileId;
            return this;
        }

        /**
         * @param appProfileId The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
         * 
         * @return builder
         * 
         */
        public Builder appProfileId(String appProfileId) {
            return appProfileId(Output.of(appProfileId));
        }

        /**
         * @param description Long form description of the use case for this app profile.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Long form description of the use case for this app profile.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ignoreWarnings If true, ignore safety checks when deleting/updating the app profile.
         * 
         * @return builder
         * 
         */
        public Builder ignoreWarnings(@Nullable Output<Boolean> ignoreWarnings) {
            $.ignoreWarnings = ignoreWarnings;
            return this;
        }

        /**
         * @param ignoreWarnings If true, ignore safety checks when deleting/updating the app profile.
         * 
         * @return builder
         * 
         */
        public Builder ignoreWarnings(Boolean ignoreWarnings) {
            return ignoreWarnings(Output.of(ignoreWarnings));
        }

        /**
         * @param instance The name of the instance to create the app profile within.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name of the instance to create the app profile within.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param multiClusterRoutingUseAny If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
         * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
         * consistency to improve availability.
         * 
         * @return builder
         * 
         */
        public Builder multiClusterRoutingUseAny(@Nullable Output<Boolean> multiClusterRoutingUseAny) {
            $.multiClusterRoutingUseAny = multiClusterRoutingUseAny;
            return this;
        }

        /**
         * @param multiClusterRoutingUseAny If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
         * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
         * consistency to improve availability.
         * 
         * @return builder
         * 
         */
        public Builder multiClusterRoutingUseAny(Boolean multiClusterRoutingUseAny) {
            return multiClusterRoutingUseAny(Output.of(multiClusterRoutingUseAny));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param singleClusterRouting Use a single-cluster routing policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder singleClusterRouting(@Nullable Output<AppProfileSingleClusterRoutingArgs> singleClusterRouting) {
            $.singleClusterRouting = singleClusterRouting;
            return this;
        }

        /**
         * @param singleClusterRouting Use a single-cluster routing policy.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder singleClusterRouting(AppProfileSingleClusterRoutingArgs singleClusterRouting) {
            return singleClusterRouting(Output.of(singleClusterRouting));
        }

        public AppProfileArgs build() {
            $.appProfileId = Objects.requireNonNull($.appProfileId, "expected parameter 'appProfileId' to be non-null");
            return $;
        }
    }

}
