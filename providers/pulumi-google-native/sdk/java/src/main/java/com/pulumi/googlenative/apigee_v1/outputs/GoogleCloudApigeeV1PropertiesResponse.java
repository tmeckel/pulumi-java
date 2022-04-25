// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertyResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudApigeeV1PropertiesResponse {
    /**
     * @return List of all properties in the object
     * 
     */
    private final List<GoogleCloudApigeeV1PropertyResponse> property;

    @CustomType.Constructor
    private GoogleCloudApigeeV1PropertiesResponse(@CustomType.Parameter("property") List<GoogleCloudApigeeV1PropertyResponse> property) {
        this.property = property;
    }

    /**
     * @return List of all properties in the object
     * 
     */
    public List<GoogleCloudApigeeV1PropertyResponse> property() {
        return this.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1PropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudApigeeV1PropertyResponse> property;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1PropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
        }

        public Builder property(List<GoogleCloudApigeeV1PropertyResponse> property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }
        public Builder property(GoogleCloudApigeeV1PropertyResponse... property) {
            return property(List.of(property));
        }        public GoogleCloudApigeeV1PropertiesResponse build() {
            return new GoogleCloudApigeeV1PropertiesResponse(property);
        }
    }
}
