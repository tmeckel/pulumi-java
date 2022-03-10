// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetRestApiEndpointConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetRestApiEndpointConfiguration Empty = new GetRestApiEndpointConfiguration();

    @InputImport(name="types", required=true)
      private final List<String> types;

    public List<String> getTypes() {
        return this.types;
    }

    @InputImport(name="vpcEndpointIds", required=true)
      private final List<String> vpcEndpointIds;

    public List<String> getVpcEndpointIds() {
        return this.vpcEndpointIds;
    }

    public GetRestApiEndpointConfiguration(
        List<String> types,
        List<String> vpcEndpointIds) {
        this.types = Objects.requireNonNull(types, "expected parameter 'types' to be non-null");
        this.vpcEndpointIds = Objects.requireNonNull(vpcEndpointIds, "expected parameter 'vpcEndpointIds' to be non-null");
    }

    private GetRestApiEndpointConfiguration() {
        this.types = List.of();
        this.vpcEndpointIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRestApiEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> types;
        private List<String> vpcEndpointIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRestApiEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.types = defaults.types;
    	      this.vpcEndpointIds = defaults.vpcEndpointIds;
        }

        public Builder types(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }

        public Builder vpcEndpointIds(List<String> vpcEndpointIds) {
            this.vpcEndpointIds = Objects.requireNonNull(vpcEndpointIds);
            return this;
        }
        public GetRestApiEndpointConfiguration build() {
            return new GetRestApiEndpointConfiguration(types, vpcEndpointIds);
        }
    }
}
