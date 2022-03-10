// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AwsClusterControlPlaneConfigEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneConfigEncryptionGetArgs Empty = new AwsClusterControlPlaneConfigEncryptionGetArgs();

    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    @InputImport(name="kmsKeyArn", required=true)
      private final Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public AwsClusterControlPlaneConfigEncryptionGetArgs(Input<String> kmsKeyArn) {
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn, "expected parameter 'kmsKeyArn' to be non-null");
    }

    private AwsClusterControlPlaneConfigEncryptionGetArgs() {
        this.kmsKeyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneConfigEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneConfigEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder kmsKeyArn(Input<String> kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }

        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Input.of(Objects.requireNonNull(kmsKeyArn));
            return this;
        }
        public AwsClusterControlPlaneConfigEncryptionGetArgs build() {
            return new AwsClusterControlPlaneConfigEncryptionGetArgs(kmsKeyArn);
        }
    }
}
