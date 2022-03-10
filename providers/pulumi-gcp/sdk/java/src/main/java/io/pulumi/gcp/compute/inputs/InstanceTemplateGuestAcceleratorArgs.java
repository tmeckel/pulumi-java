// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceTemplateGuestAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateGuestAcceleratorArgs Empty = new InstanceTemplateGuestAcceleratorArgs();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @InputImport(name="count", required=true)
      private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public InstanceTemplateGuestAcceleratorArgs(
        Input<Integer> count,
        Input<String> type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceTemplateGuestAcceleratorArgs() {
        this.count = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateGuestAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder count(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder count(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public InstanceTemplateGuestAcceleratorArgs build() {
            return new InstanceTemplateGuestAcceleratorArgs(count, type);
        }
    }
}
