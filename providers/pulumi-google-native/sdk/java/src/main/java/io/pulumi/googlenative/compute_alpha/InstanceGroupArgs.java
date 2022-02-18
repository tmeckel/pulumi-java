// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.NamedPortArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupArgs Empty = new InstanceGroupArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the instance group. The name must be 1-63 characters long, and comply with RFC1035.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     *  Assigns a name to a port number. For example: {name: "http", port: 80} This allows the system to reference ports by the assigned name instead of a port number. Named ports can also contain multiple ports. For example: [{name: "http", port: 80},{name: "http", port: 8080}] Named ports apply to all instances in this instance group.
     * 
     */
    @InputImport(name="namedPorts")
    private final @Nullable Input<List<NamedPortArgs>> namedPorts;

    public Input<List<NamedPortArgs>> getNamedPorts() {
        return this.namedPorts == null ? Input.empty() : this.namedPorts;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
    private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="zone")
    private final @Nullable Input<String> zone;

    public Input<String> getZone() {
        return this.zone == null ? Input.empty() : this.zone;
    }

    public InstanceGroupArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<List<NamedPortArgs>> namedPorts,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<String> zone) {
        this.description = description;
        this.name = name;
        this.namedPorts = namedPorts;
        this.project = project;
        this.requestId = requestId;
        this.zone = zone;
    }

    private InstanceGroupArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.namedPorts = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.zone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<List<NamedPortArgs>> namedPorts;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.zone = defaults.zone;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setNamedPorts(@Nullable Input<List<NamedPortArgs>> namedPorts) {
            this.namedPorts = namedPorts;
            return this;
        }

        public Builder setNamedPorts(@Nullable List<NamedPortArgs> namedPorts) {
            this.namedPorts = Input.ofNullable(namedPorts);
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

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setZone(@Nullable Input<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = Input.ofNullable(zone);
            return this;
        }

        public InstanceGroupArgs build() {
            return new InstanceGroupArgs(description, name, namedPorts, project, requestId, zone);
        }
    }
}
