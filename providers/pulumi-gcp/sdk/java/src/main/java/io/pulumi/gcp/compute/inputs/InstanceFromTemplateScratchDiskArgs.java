// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class InstanceFromTemplateScratchDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateScratchDiskArgs Empty = new InstanceFromTemplateScratchDiskArgs();

    @Import(name="interface", required=true)
      private final Output<String> interface_;

    public Output<String> getInterface_() {
        return this.interface_;
    }

    public InstanceFromTemplateScratchDiskArgs(Output<String> interface_) {
        this.interface_ = Objects.requireNonNull(interface_, "expected parameter 'interface_' to be non-null");
    }

    private InstanceFromTemplateScratchDiskArgs() {
        this.interface_ = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateScratchDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> interface_;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateScratchDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interface_ = defaults.interface_;
        }

        public Builder interface_(Output<String> interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Output.of(Objects.requireNonNull(interface_));
            return this;
        }        public InstanceFromTemplateScratchDiskArgs build() {
            return new InstanceFromTemplateScratchDiskArgs(interface_);
        }
    }
}
