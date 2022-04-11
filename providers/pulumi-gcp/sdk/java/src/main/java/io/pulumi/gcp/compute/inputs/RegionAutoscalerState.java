// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionAutoscalerAutoscalingPolicyGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionAutoscalerState extends io.pulumi.resources.ResourceArgs {

    public static final RegionAutoscalerState Empty = new RegionAutoscalerState();

    /**
     * The configuration parameters for the autoscaling algorithm. You can
     * define one or more of the policies for an autoscaler: cpuUtilization,
     * customMetricUtilizations, and loadBalancingUtilization.
     * If none of these are specified, the default will be to autoscale based
     * on cpuUtilization to 0.6 or 60%.
     * Structure is documented below.
     * 
     */
    @Import(name="autoscalingPolicy")
      private final @Nullable Output<RegionAutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy;

    public Output<RegionAutoscalerAutoscalingPolicyGetArgs> getAutoscalingPolicy() {
        return this.autoscalingPolicy == null ? Codegen.empty() : this.autoscalingPolicy;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Codegen.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
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
     * URL of the region where the instance group resides.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * Fraction of backend capacity utilization (set in HTTP(s) load
     * balancing configuration) that autoscaler should maintain. Must
     * be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    public RegionAutoscalerState(
        @Nullable Output<RegionAutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> target) {
        this.autoscalingPolicy = autoscalingPolicy;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.name = name;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.target = target;
    }

    private RegionAutoscalerState() {
        this.autoscalingPolicy = Codegen.empty();
        this.creationTimestamp = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionAutoscalerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionAutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionAutoscalerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicy = defaults.autoscalingPolicy;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.target = defaults.target;
        }

        public Builder autoscalingPolicy(@Nullable Output<RegionAutoscalerAutoscalingPolicyGetArgs> autoscalingPolicy) {
            this.autoscalingPolicy = autoscalingPolicy;
            return this;
        }
        public Builder autoscalingPolicy(@Nullable RegionAutoscalerAutoscalingPolicyGetArgs autoscalingPolicy) {
            this.autoscalingPolicy = Codegen.ofNullable(autoscalingPolicy);
            return this;
        }
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Codegen.ofNullable(creationTimestamp);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }        public RegionAutoscalerState build() {
            return new RegionAutoscalerState(autoscalingPolicy, creationTimestamp, description, name, project, region, selfLink, target);
        }
    }
}
