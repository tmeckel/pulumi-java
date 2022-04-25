// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class IntegrationResponseParameter {
    /**
     * @return A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    private final Map<String,String> mappings;
    /**
     * @return The HTTP status code in the range 200-599.
     * 
     */
    private final String statusCode;

    @CustomType.Constructor
    private IntegrationResponseParameter(
        @CustomType.Parameter("mappings") Map<String,String> mappings,
        @CustomType.Parameter("statusCode") String statusCode) {
        this.mappings = mappings;
        this.statusCode = statusCode;
    }

    /**
     * @return A key-value map. The key of ths map identifies the location of the request parameter to change, and how to change it. The corresponding value specifies the new data for the parameter.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    public Map<String,String> mappings() {
        return this.mappings;
    }
    /**
     * @return The HTTP status code in the range 200-599.
     * 
     */
    public String statusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationResponseParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> mappings;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationResponseParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappings = defaults.mappings;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder mappings(Map<String,String> mappings) {
            this.mappings = Objects.requireNonNull(mappings);
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }        public IntegrationResponseParameter build() {
            return new IntegrationResponseParameter(mappings, statusCode);
        }
    }
}
