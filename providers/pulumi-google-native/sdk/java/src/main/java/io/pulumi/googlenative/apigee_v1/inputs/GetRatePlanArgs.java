// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetRatePlanArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRatePlanArgs Empty = new GetRatePlanArgs();

    @InputImport(name="apiproductId", required=true)
      private final String apiproductId;

    public String getApiproductId() {
        return this.apiproductId;
    }

    @InputImport(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    @InputImport(name="rateplanId", required=true)
      private final String rateplanId;

    public String getRateplanId() {
        return this.rateplanId;
    }

    public GetRatePlanArgs(
        String apiproductId,
        String organizationId,
        String rateplanId) {
        this.apiproductId = Objects.requireNonNull(apiproductId, "expected parameter 'apiproductId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.rateplanId = Objects.requireNonNull(rateplanId, "expected parameter 'rateplanId' to be non-null");
    }

    private GetRatePlanArgs() {
        this.apiproductId = null;
        this.organizationId = null;
        this.rateplanId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRatePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiproductId;
        private String organizationId;
        private String rateplanId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRatePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproductId = defaults.apiproductId;
    	      this.organizationId = defaults.organizationId;
    	      this.rateplanId = defaults.rateplanId;
        }

        public Builder apiproductId(String apiproductId) {
            this.apiproductId = Objects.requireNonNull(apiproductId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder rateplanId(String rateplanId) {
            this.rateplanId = Objects.requireNonNull(rateplanId);
            return this;
        }
        public GetRatePlanArgs build() {
            return new GetRatePlanArgs(apiproductId, organizationId, rateplanId);
        }
    }
}
