// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class HostPortRange {
    /**
     * max is the end of the range, inclusive.
     * 
     */
    private final Integer max;
    /**
     * min is the start of the range, inclusive.
     * 
     */
    private final Integer min;

    @OutputCustomType.Constructor
    private HostPortRange(
        @OutputCustomType.Parameter("max") Integer max,
        @OutputCustomType.Parameter("min") Integer min) {
        this.max = max;
        this.min = min;
    }

    /**
     * max is the end of the range, inclusive.
     * 
    */
    public Integer getMax() {
        return this.max;
    }
    /**
     * min is the start of the range, inclusive.
     * 
    */
    public Integer getMin() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostPortRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer max;
        private Integer min;

        public Builder() {
    	      // Empty
        }

        public Builder(HostPortRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }

        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        public HostPortRange build() {
            return new HostPortRange(max, min);
        }
    }
}
