// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apprunner.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpcConnectorArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcConnectorArgs Empty = new GetVpcConnectorArgs();

    /**
     * The Amazon Resource Name (ARN) of this VPC connector.
     * 
     */
    @Import(name="vpcConnectorArn", required=true)
    private String vpcConnectorArn;

    /**
     * @return The Amazon Resource Name (ARN) of this VPC connector.
     * 
     */
    public String vpcConnectorArn() {
        return this.vpcConnectorArn;
    }

    private GetVpcConnectorArgs() {}

    private GetVpcConnectorArgs(GetVpcConnectorArgs $) {
        this.vpcConnectorArn = $.vpcConnectorArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcConnectorArgs $;

        public Builder() {
            $ = new GetVpcConnectorArgs();
        }

        public Builder(GetVpcConnectorArgs defaults) {
            $ = new GetVpcConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param vpcConnectorArn The Amazon Resource Name (ARN) of this VPC connector.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectorArn(String vpcConnectorArn) {
            $.vpcConnectorArn = vpcConnectorArn;
            return this;
        }

        public GetVpcConnectorArgs build() {
            $.vpcConnectorArn = Objects.requireNonNull($.vpcConnectorArn, "expected parameter 'vpcConnectorArn' to be non-null");
            return $;
        }
    }

}
