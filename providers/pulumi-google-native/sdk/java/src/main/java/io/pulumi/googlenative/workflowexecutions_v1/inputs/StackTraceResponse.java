// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.workflowexecutions_v1.inputs.StackTraceElementResponse;
import java.util.List;
import java.util.Objects;


/**
 * A collection of stack elements (frames) where an error occurred.
 * 
 */
public final class StackTraceResponse extends io.pulumi.resources.InvokeArgs {

    public static final StackTraceResponse Empty = new StackTraceResponse();

    /**
     * An array of stack elements.
     * 
     */
    @InputImport(name="elements", required=true)
    private final List<StackTraceElementResponse> elements;

    public List<StackTraceElementResponse> getElements() {
        return this.elements;
    }

    public StackTraceResponse(List<StackTraceElementResponse> elements) {
        this.elements = Objects.requireNonNull(elements, "expected parameter 'elements' to be non-null");
    }

    private StackTraceResponse() {
        this.elements = List.of();
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
