// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAvailabilityZonesFilter extends io.pulumi.resources.InvokeArgs {

    public static final GetAvailabilityZonesFilter Empty = new GetAvailabilityZonesFilter();

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeAvailabilityZones API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html).
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    @InputImport(name="values", required=true)
      private final List<String> values;

    public List<String> getValues() {
        return this.values;
    }

    public GetAvailabilityZonesFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetAvailabilityZonesFilter() {
        this.name = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAvailabilityZonesFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAvailabilityZonesFilter defaults) {
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
        public GetAvailabilityZonesFilter build() {
            return new GetAvailabilityZonesFilter(name, values);
        }
    }
}
