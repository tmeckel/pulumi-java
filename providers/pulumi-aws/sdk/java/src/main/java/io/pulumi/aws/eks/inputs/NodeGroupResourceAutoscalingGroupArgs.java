// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupResourceAutoscalingGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupResourceAutoscalingGroupArgs Empty = new NodeGroupResourceAutoscalingGroupArgs();

    /**
     * Name of the EC2 Launch Template. Conflicts with `id`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public NodeGroupResourceAutoscalingGroupArgs(@Nullable Output<String> name) {
        this.name = name;
    }

    private NodeGroupResourceAutoscalingGroupArgs() {
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupResourceAutoscalingGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupResourceAutoscalingGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public NodeGroupResourceAutoscalingGroupArgs build() {
            return new NodeGroupResourceAutoscalingGroupArgs(name);
        }
    }
}
