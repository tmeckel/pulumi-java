// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FlowTrendmicroSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowTrendmicroSourcePropertiesArgs Empty = new FlowTrendmicroSourcePropertiesArgs();

    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public FlowTrendmicroSourcePropertiesArgs(Output<String> object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowTrendmicroSourcePropertiesArgs() {
        this.object = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTrendmicroSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTrendmicroSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public FlowTrendmicroSourcePropertiesArgs build() {
            return new FlowTrendmicroSourcePropertiesArgs(object);
        }
    }
}
