// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A non-fatal problem encountered during the execution of the build.
 * 
 */
public final class WarningResponse extends io.pulumi.resources.InvokeArgs {

    public static final WarningResponse Empty = new WarningResponse();

    /**
     * The priority for this warning.
     * 
     */
    @InputImport(name="priority", required=true)
      private final String priority;

    public String getPriority() {
        return this.priority;
    }

    /**
     * Explanation of the warning generated.
     * 
     */
    @InputImport(name="text", required=true)
      private final String text;

    public String getText() {
        return this.text;
    }

    public WarningResponse(
        String priority,
        String text) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private WarningResponse() {
        this.priority = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WarningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String priority;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(WarningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.text = defaults.text;
        }

        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public WarningResponse build() {
            return new WarningResponse(priority, text);
        }
    }
}
