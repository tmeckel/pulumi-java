// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iap_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetV1beta1IamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetV1beta1IamPolicyArgs Empty = new GetV1beta1IamPolicyArgs();

    @InputImport(name="v1beta1Id", required=true)
    private final String v1beta1Id;

    public String getV1beta1Id() {
        return this.v1beta1Id;
    }

    public GetV1beta1IamPolicyArgs(String v1beta1Id) {
        this.v1beta1Id = Objects.requireNonNull(v1beta1Id, "expected parameter 'v1beta1Id' to be non-null");
    }

    private GetV1beta1IamPolicyArgs() {
        this.v1beta1Id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetV1beta1IamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String v1beta1Id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetV1beta1IamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.v1beta1Id = defaults.v1beta1Id;
        }

        public Builder setV1beta1Id(String v1beta1Id) {
            this.v1beta1Id = Objects.requireNonNull(v1beta1Id);
            return this;
        }

        public GetV1beta1IamPolicyArgs build() {
            return new GetV1beta1IamPolicyArgs(v1beta1Id);
        }
    }
}
