// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.NodeGroupMaintenancePolicy;
import com.pulumi.googlenative.compute_alpha.enums.NodeGroupStatus;
import com.pulumi.googlenative.compute_alpha.inputs.NodeGroupAutoscalingPolicyArgs;
import com.pulumi.googlenative.compute_alpha.inputs.NodeGroupMaintenanceWindowArgs;
import com.pulumi.googlenative.compute_alpha.inputs.ShareSettingsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NodeGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeGroupArgs Empty = new NodeGroupArgs();

    /**
     * Specifies how autoscaling should behave.
     * 
     */
    @Import(name="autoscalingPolicy")
    private @Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy;

    /**
     * @return Specifies how autoscaling should behave.
     * 
     */
    public Optional<Output<NodeGroupAutoscalingPolicyArgs>> autoscalingPolicy() {
        return Optional.ofNullable(this.autoscalingPolicy);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="initialNodeCount", required=true)
    private Output<String> initialNodeCount;

    public Output<String> initialNodeCount() {
        return this.initialNodeCount;
    }

    /**
     * An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    @Import(name="locationHint")
    private @Nullable Output<String> locationHint;

    /**
     * @return An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
     * 
     */
    public Optional<Output<String>> locationHint() {
        return Optional.ofNullable(this.locationHint);
    }

    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    @Import(name="maintenancePolicy")
    private @Nullable Output<NodeGroupMaintenancePolicy> maintenancePolicy;

    /**
     * @return Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
     * 
     */
    public Optional<Output<NodeGroupMaintenancePolicy>> maintenancePolicy() {
        return Optional.ofNullable(this.maintenancePolicy);
    }

    @Import(name="maintenanceWindow")
    private @Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow;

    public Optional<Output<NodeGroupMaintenanceWindowArgs>> maintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * URL of the node template to create the node group from.
     * 
     */
    @Import(name="nodeTemplate")
    private @Nullable Output<String> nodeTemplate;

    /**
     * @return URL of the node template to create the node group from.
     * 
     */
    public Optional<Output<String>> nodeTemplate() {
        return Optional.ofNullable(this.nodeTemplate);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Share-settings for the node group
     * 
     */
    @Import(name="shareSettings")
    private @Nullable Output<ShareSettingsArgs> shareSettings;

    /**
     * @return Share-settings for the node group
     * 
     */
    public Optional<Output<ShareSettingsArgs>> shareSettings() {
        return Optional.ofNullable(this.shareSettings);
    }

    @Import(name="status")
    private @Nullable Output<NodeGroupStatus> status;

    public Optional<Output<NodeGroupStatus>> status() {
        return Optional.ofNullable(this.status);
    }

    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private NodeGroupArgs() {}

    private NodeGroupArgs(NodeGroupArgs $) {
        this.autoscalingPolicy = $.autoscalingPolicy;
        this.description = $.description;
        this.initialNodeCount = $.initialNodeCount;
        this.locationHint = $.locationHint;
        this.maintenancePolicy = $.maintenancePolicy;
        this.maintenanceWindow = $.maintenanceWindow;
        this.name = $.name;
        this.nodeTemplate = $.nodeTemplate;
        this.project = $.project;
        this.requestId = $.requestId;
        this.shareSettings = $.shareSettings;
        this.status = $.status;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeGroupArgs $;

        public Builder() {
            $ = new NodeGroupArgs();
        }

        public Builder(NodeGroupArgs defaults) {
            $ = new NodeGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingPolicy Specifies how autoscaling should behave.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingPolicy(@Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy) {
            $.autoscalingPolicy = autoscalingPolicy;
            return this;
        }

        /**
         * @param autoscalingPolicy Specifies how autoscaling should behave.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingPolicy(NodeGroupAutoscalingPolicyArgs autoscalingPolicy) {
            return autoscalingPolicy(Output.of(autoscalingPolicy));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder initialNodeCount(Output<String> initialNodeCount) {
            $.initialNodeCount = initialNodeCount;
            return this;
        }

        public Builder initialNodeCount(String initialNodeCount) {
            return initialNodeCount(Output.of(initialNodeCount));
        }

        /**
         * @param locationHint An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
         * 
         * @return builder
         * 
         */
        public Builder locationHint(@Nullable Output<String> locationHint) {
            $.locationHint = locationHint;
            return this;
        }

        /**
         * @param locationHint An opaque location hint used to place the Node close to other resources. This field is for use by internal tools that use the public API. The location hint here on the NodeGroup overrides any location_hint present in the NodeTemplate.
         * 
         * @return builder
         * 
         */
        public Builder locationHint(String locationHint) {
            return locationHint(Output.of(locationHint));
        }

        /**
         * @param maintenancePolicy Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(@Nullable Output<NodeGroupMaintenancePolicy> maintenancePolicy) {
            $.maintenancePolicy = maintenancePolicy;
            return this;
        }

        /**
         * @param maintenancePolicy Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT. For more information, see Maintenance policies.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(NodeGroupMaintenancePolicy maintenancePolicy) {
            return maintenancePolicy(Output.of(maintenancePolicy));
        }

        public Builder maintenanceWindow(@Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(NodeGroupMaintenanceWindowArgs maintenanceWindow) {
            return maintenanceWindow(Output.of(maintenanceWindow));
        }

        /**
         * @param name The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeTemplate URL of the node template to create the node group from.
         * 
         * @return builder
         * 
         */
        public Builder nodeTemplate(@Nullable Output<String> nodeTemplate) {
            $.nodeTemplate = nodeTemplate;
            return this;
        }

        /**
         * @param nodeTemplate URL of the node template to create the node group from.
         * 
         * @return builder
         * 
         */
        public Builder nodeTemplate(String nodeTemplate) {
            return nodeTemplate(Output.of(nodeTemplate));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param shareSettings Share-settings for the node group
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(@Nullable Output<ShareSettingsArgs> shareSettings) {
            $.shareSettings = shareSettings;
            return this;
        }

        /**
         * @param shareSettings Share-settings for the node group
         * 
         * @return builder
         * 
         */
        public Builder shareSettings(ShareSettingsArgs shareSettings) {
            return shareSettings(Output.of(shareSettings));
        }

        public Builder status(@Nullable Output<NodeGroupStatus> status) {
            $.status = status;
            return this;
        }

        public Builder status(NodeGroupStatus status) {
            return status(Output.of(status));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public NodeGroupArgs build() {
            $.initialNodeCount = Objects.requireNonNull($.initialNodeCount, "expected parameter 'initialNodeCount' to be non-null");
            return $;
        }
    }

}
