// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceGroupManagerVersionTargetSizeGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerVersionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerVersionGetArgs Empty = new InstanceGroupManagerVersionGetArgs();

    /**
     * - The full URL to an instance template from which all new instances of this version will be created.
     * 
     */
    @Import(name="instanceTemplate", required=true)
      private final Output<String> instanceTemplate;

    public Output<String> getInstanceTemplate() {
        return this.instanceTemplate;
    }

    /**
     * - Version name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * - The number of instances calculated as a fixed number or a percentage depending on the settings. Structure is documented below.
     * 
     */
    @Import(name="targetSize")
      private final @Nullable Output<InstanceGroupManagerVersionTargetSizeGetArgs> targetSize;

    public Output<InstanceGroupManagerVersionTargetSizeGetArgs> getTargetSize() {
        return this.targetSize == null ? Codegen.empty() : this.targetSize;
    }

    public InstanceGroupManagerVersionGetArgs(
        Output<String> instanceTemplate,
        @Nullable Output<String> name,
        @Nullable Output<InstanceGroupManagerVersionTargetSizeGetArgs> targetSize) {
        this.instanceTemplate = Objects.requireNonNull(instanceTemplate, "expected parameter 'instanceTemplate' to be non-null");
        this.name = name;
        this.targetSize = targetSize;
    }

    private InstanceGroupManagerVersionGetArgs() {
        this.instanceTemplate = Codegen.empty();
        this.name = Codegen.empty();
        this.targetSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerVersionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceTemplate;
        private @Nullable Output<String> name;
        private @Nullable Output<InstanceGroupManagerVersionTargetSizeGetArgs> targetSize;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerVersionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.name = defaults.name;
    	      this.targetSize = defaults.targetSize;
        }

        public Builder instanceTemplate(Output<String> instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
            return this;
        }
        public Builder instanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Output.of(Objects.requireNonNull(instanceTemplate));
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
        public Builder targetSize(@Nullable Output<InstanceGroupManagerVersionTargetSizeGetArgs> targetSize) {
            this.targetSize = targetSize;
            return this;
        }
        public Builder targetSize(@Nullable InstanceGroupManagerVersionTargetSizeGetArgs targetSize) {
            this.targetSize = Codegen.ofNullable(targetSize);
            return this;
        }        public InstanceGroupManagerVersionGetArgs build() {
            return new InstanceGroupManagerVersionGetArgs(instanceTemplate, name, targetSize);
        }
    }
}
