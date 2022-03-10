// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetLocalGatewayVirtualInterfaceGroupFilter extends io.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayVirtualInterfaceGroupFilter Empty = new GetLocalGatewayVirtualInterfaceGroupFilter();

    /**
     * Name of the filter.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * List of one or more values for the filter.
     * 
     */
    @InputImport(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public GetLocalGatewayVirtualInterfaceGroupFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetLocalGatewayVirtualInterfaceGroupFilter() {
        this.name = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayVirtualInterfaceGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetLocalGatewayVirtualInterfaceGroupFilter build() {
            return new GetLocalGatewayVirtualInterfaceGroupFilter(name, values);
        }
    }
}
