// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class NetworkLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkLabelGetArgs Empty = new NetworkLabelGetArgs();

    @Import(name="label", required=true)
      private final Output<String> label;

    public Output<String> getLabel() {
        return this.label;
    }

    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public NetworkLabelGetArgs(
        Output<String> label,
        Output<String> value) {
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private NetworkLabelGetArgs() {
        this.label = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> label;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.value = defaults.value;
        }

        public Builder label(Output<String> label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder label(String label) {
            this.label = Output.of(Objects.requireNonNull(label));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public NetworkLabelGetArgs build() {
            return new NetworkLabelGetArgs(label, value);
        }
    }
}
