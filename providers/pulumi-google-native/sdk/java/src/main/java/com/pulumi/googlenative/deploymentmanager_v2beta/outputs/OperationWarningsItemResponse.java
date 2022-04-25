// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.deploymentmanager_v2beta.outputs.OperationWarningsItemDataItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OperationWarningsItemResponse {
    /**
     * @return A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    private final String code;
    /**
     * @return Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
     */
    private final List<OperationWarningsItemDataItemResponse> data;
    /**
     * @return A human-readable description of the warning code.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private OperationWarningsItemResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("data") List<OperationWarningsItemDataItemResponse> data,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * @return A warning code, if applicable. For example, Compute Engine returns NO_RESULTS_ON_PAGE if there are no results in the response.
     * 
     */
    public String code() {
        return this.code;
    }
    /**
     * @return Metadata about this warning in key: value format. For example: &#34;data&#34;: [ { &#34;key&#34;: &#34;scope&#34;, &#34;value&#34;: &#34;zones/us-east1-d&#34; }
     * 
     */
    public List<OperationWarningsItemDataItemResponse> data() {
        return this.data;
    }
    /**
     * @return A human-readable description of the warning code.
     * 
     */
    public String message() {
        return this.message;
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

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder data(List<OperationWarningsItemDataItemResponse> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(OperationWarningsItemDataItemResponse... data) {
            return data(List.of(data));
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }        public OperationWarningsItemResponse build() {
            return new OperationWarningsItemResponse(code, data, message);
        }
    }
}
