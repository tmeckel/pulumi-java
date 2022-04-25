// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.policy_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AllowedCSIDriver {
    /**
     * @return Name is the registered name of the CSI driver
     * 
     */
    private final String name;

    @CustomType.Constructor
    private AllowedCSIDriver(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return Name is the registered name of the CSI driver
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedCSIDriver defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedCSIDriver defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public AllowedCSIDriver build() {
            return new AllowedCSIDriver(name);
        }
    }
}
