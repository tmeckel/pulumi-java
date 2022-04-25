// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class WorkforceSourceIpConfig {
    /**
     * @return A list of up to 10 CIDR values.
     * 
     */
    private final List<String> cidrs;

    @CustomType.Constructor
    private WorkforceSourceIpConfig(@CustomType.Parameter("cidrs") List<String> cidrs) {
        this.cidrs = cidrs;
    }

    /**
     * @return A list of up to 10 CIDR values.
     * 
     */
    public List<String> cidrs() {
        return this.cidrs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforceSourceIpConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> cidrs;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkforceSourceIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrs = defaults.cidrs;
        }

        public Builder cidrs(List<String> cidrs) {
            this.cidrs = Objects.requireNonNull(cidrs);
            return this;
        }
        public Builder cidrs(String... cidrs) {
            return cidrs(List.of(cidrs));
        }        public WorkforceSourceIpConfig build() {
            return new WorkforceSourceIpConfig(cidrs);
        }
    }
}
