// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.NodeTemplateCpuOvercommitType;
import io.pulumi.googlenative.compute_alpha.inputs.AcceleratorConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.LocalDiskArgs;
import io.pulumi.googlenative.compute_alpha.inputs.NodeTemplateNodeTypeFlexibilityArgs;
import io.pulumi.googlenative.compute_alpha.inputs.ServerBindingArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTemplateArgs Empty = new NodeTemplateArgs();

    @InputImport(name="accelerators")
    private final @Nullable Input<List<AcceleratorConfigArgs>> accelerators;

    public Input<List<AcceleratorConfigArgs>> getAccelerators() {
        return this.accelerators == null ? Input.empty() : this.accelerators;
    }

    /**
     * CPU overcommit.
     * 
     */
    @InputImport(name="cpuOvercommitType")
    private final @Nullable Input<NodeTemplateCpuOvercommitType> cpuOvercommitType;

    public Input<NodeTemplateCpuOvercommitType> getCpuOvercommitType() {
        return this.cpuOvercommitType == null ? Input.empty() : this.cpuOvercommitType;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="disks")
    private final @Nullable Input<List<LocalDiskArgs>> disks;

    public Input<List<LocalDiskArgs>> getDisks() {
        return this.disks == null ? Input.empty() : this.disks;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Labels to use for node affinity, which will be used in instance scheduling.
     * 
     */
    @InputImport(name="nodeAffinityLabels")
    private final @Nullable Input<Map<String,String>> nodeAffinityLabels;

    public Input<Map<String,String>> getNodeAffinityLabels() {
        return this.nodeAffinityLabels == null ? Input.empty() : this.nodeAffinityLabels;
    }

    /**
     * The node type to use for nodes group that are created from this template.
     * 
     */
    @InputImport(name="nodeType")
    private final @Nullable Input<String> nodeType;

    public Input<String> getNodeType() {
        return this.nodeType == null ? Input.empty() : this.nodeType;
    }

    /**
     * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
     */
    @InputImport(name="nodeTypeFlexibility")
    private final @Nullable Input<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility;

    public Input<NodeTemplateNodeTypeFlexibilityArgs> getNodeTypeFlexibility() {
        return this.nodeTypeFlexibility == null ? Input.empty() : this.nodeTypeFlexibility;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
    private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
     */
    @InputImport(name="serverBinding")
    private final @Nullable Input<ServerBindingArgs> serverBinding;

    public Input<ServerBindingArgs> getServerBinding() {
        return this.serverBinding == null ? Input.empty() : this.serverBinding;
    }

    public NodeTemplateArgs(
        @Nullable Input<List<AcceleratorConfigArgs>> accelerators,
        @Nullable Input<NodeTemplateCpuOvercommitType> cpuOvercommitType,
        @Nullable Input<String> description,
        @Nullable Input<List<LocalDiskArgs>> disks,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> nodeAffinityLabels,
        @Nullable Input<String> nodeType,
        @Nullable Input<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<ServerBindingArgs> serverBinding) {
        this.accelerators = accelerators;
        this.cpuOvercommitType = cpuOvercommitType;
        this.description = description;
        this.disks = disks;
        this.name = name;
        this.nodeAffinityLabels = nodeAffinityLabels;
        this.nodeType = nodeType;
        this.nodeTypeFlexibility = nodeTypeFlexibility;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.serverBinding = serverBinding;
    }

    private NodeTemplateArgs() {
        this.accelerators = Input.empty();
        this.cpuOvercommitType = Input.empty();
        this.description = Input.empty();
        this.disks = Input.empty();
        this.name = Input.empty();
        this.nodeAffinityLabels = Input.empty();
        this.nodeType = Input.empty();
        this.nodeTypeFlexibility = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.serverBinding = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AcceleratorConfigArgs>> accelerators;
        private @Nullable Input<NodeTemplateCpuOvercommitType> cpuOvercommitType;
        private @Nullable Input<String> description;
        private @Nullable Input<List<LocalDiskArgs>> disks;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> nodeAffinityLabels;
        private @Nullable Input<String> nodeType;
        private @Nullable Input<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<ServerBindingArgs> serverBinding;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.cpuOvercommitType = defaults.cpuOvercommitType;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.name = defaults.name;
    	      this.nodeAffinityLabels = defaults.nodeAffinityLabels;
    	      this.nodeType = defaults.nodeType;
    	      this.nodeTypeFlexibility = defaults.nodeTypeFlexibility;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.serverBinding = defaults.serverBinding;
        }

        public Builder setAccelerators(@Nullable Input<List<AcceleratorConfigArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        public Builder setAccelerators(@Nullable List<AcceleratorConfigArgs> accelerators) {
            this.accelerators = Input.ofNullable(accelerators);
            return this;
        }

        public Builder setCpuOvercommitType(@Nullable Input<NodeTemplateCpuOvercommitType> cpuOvercommitType) {
            this.cpuOvercommitType = cpuOvercommitType;
            return this;
        }

        public Builder setCpuOvercommitType(@Nullable NodeTemplateCpuOvercommitType cpuOvercommitType) {
            this.cpuOvercommitType = Input.ofNullable(cpuOvercommitType);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisks(@Nullable Input<List<LocalDiskArgs>> disks) {
            this.disks = disks;
            return this;
        }

        public Builder setDisks(@Nullable List<LocalDiskArgs> disks) {
            this.disks = Input.ofNullable(disks);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNodeAffinityLabels(@Nullable Input<Map<String,String>> nodeAffinityLabels) {
            this.nodeAffinityLabels = nodeAffinityLabels;
            return this;
        }

        public Builder setNodeAffinityLabels(@Nullable Map<String,String> nodeAffinityLabels) {
            this.nodeAffinityLabels = Input.ofNullable(nodeAffinityLabels);
            return this;
        }

        public Builder setNodeType(@Nullable Input<String> nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder setNodeType(@Nullable String nodeType) {
            this.nodeType = Input.ofNullable(nodeType);
            return this;
        }

        public Builder setNodeTypeFlexibility(@Nullable Input<NodeTemplateNodeTypeFlexibilityArgs> nodeTypeFlexibility) {
            this.nodeTypeFlexibility = nodeTypeFlexibility;
            return this;
        }

        public Builder setNodeTypeFlexibility(@Nullable NodeTemplateNodeTypeFlexibilityArgs nodeTypeFlexibility) {
            this.nodeTypeFlexibility = Input.ofNullable(nodeTypeFlexibility);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setServerBinding(@Nullable Input<ServerBindingArgs> serverBinding) {
            this.serverBinding = serverBinding;
            return this;
        }

        public Builder setServerBinding(@Nullable ServerBindingArgs serverBinding) {
            this.serverBinding = Input.ofNullable(serverBinding);
            return this;
        }

        public NodeTemplateArgs build() {
            return new NodeTemplateArgs(accelerators, cpuOvercommitType, description, disks, name, nodeAffinityLabels, nodeType, nodeTypeFlexibility, project, region, requestId, serverBinding);
        }
    }
}
