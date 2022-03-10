// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.InstanceSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * InstanceTemplateSpec describes the data an instance should have when created from a template.
 * 
 */
public final class InstanceTemplateSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateSpecArgs Empty = new InstanceTemplateSpecArgs();

    /**
     * Optional. Specification of the desired behavior of the instance. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status +optional
     * 
     */
    @InputImport(name="spec")
      private final @Nullable Input<InstanceSpecArgs> spec;

    public Input<InstanceSpecArgs> getSpec() {
        return this.spec == null ? Input.empty() : this.spec;
    }

    public InstanceTemplateSpecArgs(@Nullable Input<InstanceSpecArgs> spec) {
        this.spec = spec;
    }

    private InstanceTemplateSpecArgs() {
        this.spec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InstanceSpecArgs> spec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spec = defaults.spec;
        }

        public Builder spec(@Nullable Input<InstanceSpecArgs> spec) {
            this.spec = spec;
            return this;
        }

        public Builder spec(@Nullable InstanceSpecArgs spec) {
            this.spec = Input.ofNullable(spec);
            return this;
        }
        public InstanceTemplateSpecArgs build() {
            return new InstanceTemplateSpecArgs(spec);
        }
    }
}
