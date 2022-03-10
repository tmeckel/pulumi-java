// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FlowDatadogSourceProperties {
    private final String object;

    @OutputCustomType.Constructor
    private FlowDatadogSourceProperties(@OutputCustomType.Parameter("object") String object) {
        this.object = object;
    }

    public String getObject() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDatadogSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDatadogSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowDatadogSourceProperties build() {
            return new FlowDatadogSourceProperties(object);
        }
    }
}
