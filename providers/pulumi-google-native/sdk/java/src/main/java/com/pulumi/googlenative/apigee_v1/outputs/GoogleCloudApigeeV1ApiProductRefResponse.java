// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1ApiProductRefResponse {
    /**
     * @return Name of the API product.
     * 
     */
    private final String apiproduct;
    /**
     * @return Status of the API product. Valid values are `approved` or `revoked`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GoogleCloudApigeeV1ApiProductRefResponse(
        @CustomType.Parameter("apiproduct") String apiproduct,
        @CustomType.Parameter("status") String status) {
        this.apiproduct = apiproduct;
        this.status = status;
    }

    /**
     * @return Name of the API product.
     * 
     */
    public String apiproduct() {
        return this.apiproduct;
    }
    /**
     * @return Status of the API product. Valid values are `approved` or `revoked`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1ApiProductRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiproduct;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1ApiProductRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproduct = defaults.apiproduct;
    	      this.status = defaults.status;
        }

        public Builder apiproduct(String apiproduct) {
            this.apiproduct = Objects.requireNonNull(apiproduct);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GoogleCloudApigeeV1ApiProductRefResponse build() {
            return new GoogleCloudApigeeV1ApiProductRefResponse(apiproduct, status);
        }
    }
}
