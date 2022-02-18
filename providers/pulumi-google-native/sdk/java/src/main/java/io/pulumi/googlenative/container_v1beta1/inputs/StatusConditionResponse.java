// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * StatusCondition describes why a cluster or a node pool has a certain status (e.g., ERROR or DEGRADED).
 * 
 */
public final class StatusConditionResponse extends io.pulumi.resources.InvokeArgs {

    public static final StatusConditionResponse Empty = new StatusConditionResponse();

    /**
     * Canonical code of the condition.
     * 
     */
    @InputImport(name="canonicalCode", required=true)
    private final String canonicalCode;

    public String getCanonicalCode() {
        return this.canonicalCode;
    }

    /**
     * Human-friendly representation of the condition
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public StatusConditionResponse(
        String canonicalCode,
        String message) {
        this.canonicalCode = Objects.requireNonNull(canonicalCode, "expected parameter 'canonicalCode' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private StatusConditionResponse() {
        this.canonicalCode = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalCode;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalCode = defaults.canonicalCode;
    	      this.message = defaults.message;
        }

        public Builder setCanonicalCode(String canonicalCode) {
            this.canonicalCode = Objects.requireNonNull(canonicalCode);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public StatusConditionResponse build() {
            return new StatusConditionResponse(canonicalCode, message);
        }
    }
}
