// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.NodeGroupAutoscalingPolicyArgs;
import io.pulumi.gcp.compute.inputs.NodeGroupMaintenanceWindowArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupArgs Empty = new NodeGroupArgs();

    /**
     * If you use sole-tenant nodes for your workloads, you can use the node
     * group autoscaler to automatically manage the sizes of your node groups.
     * Structure is documented below.
     * 
     */
    @Import(name="autoscalingPolicy")
      private final @Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy;

    public Output<NodeGroupAutoscalingPolicyArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Codegen.empty() : this.autoscalingPolicy;
    }

    /**
     * An optional textual description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The initial number of nodes in the node group. One of `initial_size` or `size` must be specified.
     * 
     */
    @Import(name="initialSize")
      private final @Nullable Output<Integer> initialSize;

    public Output<Integer> getInitialSize() {
        return this.initialSize == null ? Codegen.empty() : this.initialSize;
    }

    /**
     * Specifies how to handle instances when a node in the group undergoes maintenance. Set to one of: DEFAULT, RESTART_IN_PLACE, or MIGRATE_WITHIN_NODE_GROUP. The default value is DEFAULT.
     * 
     */
    @Import(name="maintenancePolicy")
      private final @Nullable Output<String> maintenancePolicy;

    public Output<String> getMaintenancePolicy() {
        return this.maintenancePolicy == null ? Codegen.empty() : this.maintenancePolicy;
    }

    /**
     * contains properties for the timeframe of maintenance
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceWindow")
      private final @Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow;

    public Output<NodeGroupMaintenanceWindowArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Codegen.empty() : this.maintenanceWindow;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the node template to which this node group belongs.
     * 
     */
    @Import(name="nodeTemplate", required=true)
      private final Output<String> nodeTemplate;

    public Output<String> getNodeTemplate() {
        return this.nodeTemplate;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The total number of nodes in the node group. One of `initial_size` or `size` must be specified.
     * 
     */
    @Import(name="size")
      private final @Nullable Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size == null ? Codegen.empty() : this.size;
    }

    /**
     * Zone where this node group is located
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public NodeGroupArgs(
        @Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy,
        @Nullable Output<String> description,
        @Nullable Output<Integer> initialSize,
        @Nullable Output<String> maintenancePolicy,
        @Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow,
        @Nullable Output<String> name,
        Output<String> nodeTemplate,
        @Nullable Output<String> project,
        @Nullable Output<Integer> size,
        @Nullable Output<String> zone) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.description = description;
        this.initialSize = initialSize;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.nodeTemplate = Objects.requireNonNull(nodeTemplate, "expected parameter 'nodeTemplate' to be non-null");
        this.project = project;
        this.size = size;
        this.zone = zone;
    }

    private NodeGroupArgs() {
        this.autoscalingPolicy = Codegen.empty();
        this.description = Codegen.empty();
        this.initialSize = Codegen.empty();
        this.maintenancePolicy = Codegen.empty();
        this.maintenanceWindow = Codegen.empty();
        this.name = Codegen.empty();
        this.nodeTemplate = Codegen.empty();
        this.project = Codegen.empty();
        this.size = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> initialSize;
        private @Nullable Output<String> maintenancePolicy;
        private @Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow;
        private @Nullable Output<String> name;
        private Output<String> nodeTemplate;
        private @Nullable Output<String> project;
        private @Nullable Output<Integer> size;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.description = defaults.description;
    	      this.initialSize = defaults.initialSize;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeTemplate = defaults.nodeTemplate;
    	      this.project = defaults.project;
    	      this.size = defaults.size;
    	      this.zone = defaults.zone;
        }

        public Builder autoscalingPolicy(@Nullable Output<NodeGroupAutoscalingPolicyArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }
        public Builder autoscalingPolicy(@Nullable NodeGroupAutoscalingPolicyArgs autoscalingPolicy) {
            this.autoscalingPolicy = Codegen.ofNullable(autoscalingPolicy);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder initialSize(@Nullable Output<Integer> initialSize) {
            this.initialSize = initialSize;
            return this;
        }
        public Builder initialSize(@Nullable Integer initialSize) {
            this.initialSize = Codegen.ofNullable(initialSize);
            return this;
        }
        public Builder maintenancePolicy(@Nullable Output<String> maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            return this;
        }
        public Builder maintenancePolicy(@Nullable String maintenancePolicy) {
            this.maintenancePolicy = Codegen.ofNullable(maintenancePolicy);
            return this;
        }
        public Builder maintenanceWindow(@Nullable Output<NodeGroupMaintenanceWindowArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder maintenanceWindow(@Nullable NodeGroupMaintenanceWindowArgs maintenanceWindow) {
            this.maintenanceWindow = Codegen.ofNullable(maintenanceWindow);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder nodeTemplate(Output<String> nodeTemplate) {
            this.nodeTemplate = Objects.requireNonNull(nodeTemplate);
            return this;
        }
        public Builder nodeTemplate(String nodeTemplate) {
            this.nodeTemplate = Output.of(Objects.requireNonNull(nodeTemplate));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder size(@Nullable Output<Integer> size) {
            this.size = size;
            return this;
        }
        public Builder size(@Nullable Integer size) {
            this.size = Codegen.ofNullable(size);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public NodeGroupArgs build() {
            return new NodeGroupArgs(autoscalingPolicy, description, initialSize, maintenancePolicy, maintenanceWindow, name, nodeTemplate, project, size, zone);
        }
    }
}
