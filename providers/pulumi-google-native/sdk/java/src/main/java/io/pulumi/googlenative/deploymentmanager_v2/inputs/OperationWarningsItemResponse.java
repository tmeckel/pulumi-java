// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.deploymentmanager_v2.inputs.OperationWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class OperationWarningsItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final OperationWarningsItemResponse Empty = new OperationWarningsItemResponse();

    /**
     * A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    @InputImport(name="code", required=true)
    private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * Metadata about this warning in key: value format. For example: "data": [ { "key": "scope", "value": "zones/us-east1-d" }
     * 
     */
    @InputImport(name="data", required=true)
    private final List<OperationWarningsItemDataItemResponse> data;

    public List<OperationWarningsItemDataItemResponse> getData() {
        return this.data;
    }

    /**
     * A human-readable description of the warning code.
     * 
     */
    @InputImport(name="message", required=true)
    private final String message;

    public String getMessage() {
        return this.message;
    }

    public OperationWarningsItemResponse(
        String code,
        List<OperationWarningsItemDataItemResponse> data,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private OperationWarningsItemResponse() {
        this.code = null;
        this.data = List.of();
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationWarningsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private List<OperationWarningsItemDataItemResponse> data;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationWarningsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.data = defaults.data;
    	      this.message = defaults.message;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setData(List<OperationWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public OperationWarningsItemResponse build() {
            return new OperationWarningsItemResponse(code, data, message);
        }
    }
}
