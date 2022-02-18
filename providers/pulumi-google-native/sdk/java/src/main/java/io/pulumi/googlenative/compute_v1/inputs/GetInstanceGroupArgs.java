// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceGroupArgs Empty = new GetInstanceGroupArgs();

    @InputImport(name="instanceGroup", required=true)
    private final String instanceGroup;

    public String getInstanceGroup() {
        return this.instanceGroup;
    }

    @InputImport(name="project")
    private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="zone", required=true)
    private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetInstanceGroupArgs(
        String instanceGroup,
        @Nullable String project,
        String zone) {
        this.instanceGroup = Objects.requireNonNull(instanceGroup, "expected parameter 'instanceGroup' to be non-null");
        this.project = project;
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetInstanceGroupArgs() {
        this.instanceGroup = null;
        this.project = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceGroup;
        private @Nullable String project;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroup = defaults.instanceGroup;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder setInstanceGroup(String instanceGroup) {
            this.instanceGroup = Objects.requireNonNull(instanceGroup);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetInstanceGroupArgs build() {
            return new GetInstanceGroupArgs(instanceGroup, project, zone);
        }
    }
}
