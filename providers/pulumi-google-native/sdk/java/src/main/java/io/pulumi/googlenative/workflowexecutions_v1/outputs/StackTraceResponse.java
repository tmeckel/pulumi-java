// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.workflowexecutions_v1.outputs.StackTraceElementResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class StackTraceResponse {
    /**
     * An array of stack elements.
     * 
     */
    private final List<StackTraceElementResponse> elements;

    @OutputCustomType.Constructor({"elements"})
    private StackTraceResponse(List<StackTraceElementResponse> elements) {
        this.elements = Objects.requireNonNull(elements);
    }

    /**
     * An array of stack elements.
     * 
     */
    public List<StackTraceElementResponse> getElements() {
        return this.elements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackTraceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<StackTraceElementResponse> elements;

        public Builder() {
    	      // Empty
        }

        public Builder(StackTraceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elements = defaults.elements;
        }

        public Builder setElements(List<StackTraceElementResponse> elements) {
            this.elements = Objects.requireNonNull(elements);
            return this;
        }

        public StackTraceResponse build() {
            return new StackTraceResponse(elements);
        }
    }
}
