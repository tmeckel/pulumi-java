// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodeGroupResourceAutoscalingGroup {
    /**
     * @return Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private NodeGroupResourceAutoscalingGroup(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * @return Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupResourceAutoscalingGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupResourceAutoscalingGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public NodeGroupResourceAutoscalingGroup build() {
            return new NodeGroupResourceAutoscalingGroup(name);
        }
    }
}
