// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DataSourceVpcConnectionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceVpcConnectionPropertiesArgs Empty = new DataSourceVpcConnectionPropertiesArgs();

    /**
     * The Amazon Resource Name (ARN) for the VPC connection.
     * 
     */
    @Import(name="vpcConnectionArn", required=true)
      private final Output<String> vpcConnectionArn;

    public Output<String> getVpcConnectionArn() {
        return this.vpcConnectionArn;
    }

    public DataSourceVpcConnectionPropertiesArgs(Output<String> vpcConnectionArn) {
        this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn, "expected parameter 'vpcConnectionArn' to be non-null");
    }

    private DataSourceVpcConnectionPropertiesArgs() {
        this.vpcConnectionArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceVpcConnectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> vpcConnectionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceVpcConnectionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcConnectionArn = defaults.vpcConnectionArn;
        }

        public Builder vpcConnectionArn(Output<String> vpcConnectionArn) {
            this.vpcConnectionArn = Objects.requireNonNull(vpcConnectionArn);
            return this;
        }
        public Builder vpcConnectionArn(String vpcConnectionArn) {
            this.vpcConnectionArn = Output.of(Objects.requireNonNull(vpcConnectionArn));
            return this;
        }        public DataSourceVpcConnectionPropertiesArgs build() {
            return new DataSourceVpcConnectionPropertiesArgs(vpcConnectionArn);
        }
    }
}
