// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs Empty = new RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs();

    /**
     * Retry unit. Valid values: `ms`, `s`.
     * 
     */
    @Import(name="unit", required=true)
      private final Output<String> unit;

    public Output<String> getUnit() {
        return this.unit;
    }

    /**
     * Retry value.
     * 
     */
    @Import(name="value", required=true)
      private final Output<Integer> value;

    public Output<Integer> getValue() {
        return this.value;
    }

    public RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs(
        Output<String> unit,
        Output<Integer> value) {
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs() {
        this.unit = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> unit;
        private Output<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(Output<String> unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }
        public Builder unit(String unit) {
            this.unit = Output.of(Objects.requireNonNull(unit));
            return this;
        }
        public Builder value(Output<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(Integer value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs build() {
            return new RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs(unit, value);
        }
    }
}
