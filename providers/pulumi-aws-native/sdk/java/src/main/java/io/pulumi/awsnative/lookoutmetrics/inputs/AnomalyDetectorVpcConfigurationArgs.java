// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AnomalyDetectorVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorVpcConfigurationArgs Empty = new AnomalyDetectorVpcConfigurationArgs();

    @InputImport(name="securityGroupIdList", required=true)
      private final Input<List<String>> securityGroupIdList;

    public Input<List<String>> getSecurityGroupIdList() {
        return this.securityGroupIdList;
    }

    @InputImport(name="subnetIdList", required=true)
      private final Input<List<String>> subnetIdList;

    public Input<List<String>> getSubnetIdList() {
        return this.subnetIdList;
    }

    public AnomalyDetectorVpcConfigurationArgs(
        Input<List<String>> securityGroupIdList,
        Input<List<String>> subnetIdList) {
        this.securityGroupIdList = Objects.requireNonNull(securityGroupIdList, "expected parameter 'securityGroupIdList' to be non-null");
        this.subnetIdList = Objects.requireNonNull(subnetIdList, "expected parameter 'subnetIdList' to be non-null");
    }

    private AnomalyDetectorVpcConfigurationArgs() {
        this.securityGroupIdList = Input.empty();
        this.subnetIdList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> securityGroupIdList;
        private Input<List<String>> subnetIdList;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIdList = defaults.securityGroupIdList;
    	      this.subnetIdList = defaults.subnetIdList;
        }

        public Builder securityGroupIdList(Input<List<String>> securityGroupIdList) {
            this.securityGroupIdList = Objects.requireNonNull(securityGroupIdList);
            return this;
        }

        public Builder securityGroupIdList(List<String> securityGroupIdList) {
            this.securityGroupIdList = Input.of(Objects.requireNonNull(securityGroupIdList));
            return this;
        }

        public Builder subnetIdList(Input<List<String>> subnetIdList) {
            this.subnetIdList = Objects.requireNonNull(subnetIdList);
            return this;
        }

        public Builder subnetIdList(List<String> subnetIdList) {
            this.subnetIdList = Input.of(Objects.requireNonNull(subnetIdList));
            return this;
        }
        public AnomalyDetectorVpcConfigurationArgs build() {
            return new AnomalyDetectorVpcConfigurationArgs(securityGroupIdList, subnetIdList);
        }
    }
}
