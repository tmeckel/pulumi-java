// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlowServiceNowSourceProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowServiceNowSourceProperties Empty = new FlowServiceNowSourceProperties();

    @InputImport(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    public FlowServiceNowSourceProperties(String object) {
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowServiceNowSourceProperties() {
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowServiceNowSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowServiceNowSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowServiceNowSourceProperties build() {
            return new FlowServiceNowSourceProperties(object);
        }
    }
}
