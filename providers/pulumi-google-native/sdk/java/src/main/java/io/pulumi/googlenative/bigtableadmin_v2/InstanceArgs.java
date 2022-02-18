// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.bigtableadmin_v2.enums.InstanceType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The clusters to be created within the instance, mapped by desired cluster ID, e.g., just `mycluster` rather than `projects/myproject/instances/myinstance/clusters/mycluster`. Fields marked `OutputOnly` must be left blank. Currently, at most four clusters can be specified.
     * 
     */
    @InputImport(name="clusters", required=true)
    private final Input<Map<String,String>> clusters;

    public Input<Map<String,String>> getClusters() {
        return this.clusters;
    }

    /**
     * The descriptive name for this instance as it appears in UIs. Can be changed at any time, but should be kept globally unique to avoid confusion.
     * 
     */
    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The ID to be used when referring to the new instance within its project, e.g., just `myinstance` rather than `projects/myproject/instances/myinstance`.
     * 
     */
    @InputImport(name="instanceId", required=true)
    private final Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. They can be used to filter resources and aggregate metrics. * Label keys must be between 1 and 63 characters long and must conform to the regular expression: `\p{Ll}\p{Lo}{0,62}`. * Label values must be between 0 and 63 characters long and must conform to the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64 labels can be associated with a given resource. * Keys and values must both be under 128 bytes.
     * 
     */
    @InputImport(name="labels", required=true)
    private final Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels;
    }

    /**
     * The unique name of the instance. Values are of the form `projects/{project}/instances/a-z+[a-z0-9]`.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The unique name of the project in which to create the new instance. Values are of the form `projects/{project}`.
     * 
     */
    @InputImport(name="parent", required=true)
    private final Input<String> parent;

    public Input<String> getParent() {
        return this.parent;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The type of the instance. Defaults to `PRODUCTION`.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<InstanceType> type;

    public Input<InstanceType> getType() {
        return this.type;
    }

    public InstanceArgs(
        Input<Map<String,String>> clusters,
        Input<String> displayName,
        Input<String> instanceId,
        Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        Input<String> parent,
        @Nullable Input<String> project,
        Input<InstanceType> type) {
        this.clusters = Objects.requireNonNull(clusters, "expected parameter 'clusters' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.name = name;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.project = project;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceArgs() {
        this.clusters = Input.empty();
        this.displayName = Input.empty();
        this.instanceId = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.parent = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Map<String,String>> clusters;
        private Input<String> displayName;
        private Input<String> instanceId;
        private Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private Input<String> parent;
        private @Nullable Input<String> project;
        private Input<InstanceType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusters = defaults.clusters;
    	      this.displayName = defaults.displayName;
    	      this.instanceId = defaults.instanceId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder setClusters(Input<Map<String,String>> clusters) {
            this.clusters = Objects.requireNonNull(clusters);
            return this;
        }

        public Builder setClusters(Map<String,String> clusters) {
            this.clusters = Input.of(Objects.requireNonNull(clusters));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setInstanceId(Input<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Input.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder setLabels(Input<Map<String,String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Input.of(Objects.requireNonNull(labels));
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

        public Builder setParent(Input<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setParent(String parent) {
            this.parent = Input.of(Objects.requireNonNull(parent));
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

        public Builder setType(Input<InstanceType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(InstanceType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public InstanceArgs build() {
            return new InstanceArgs(clusters, displayName, instanceId, labels, name, parent, project, type);
        }
    }
}
