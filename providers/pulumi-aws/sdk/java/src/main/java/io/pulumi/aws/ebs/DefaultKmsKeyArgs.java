// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DefaultKmsKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultKmsKeyArgs Empty = new DefaultKmsKeyArgs();

    /**
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use to encrypt the EBS volume.
     * 
     */
    @Import(name="keyArn", required=true)
      private final Output<String> keyArn;

    public Output<String> getKeyArn() {
        return this.keyArn;
    }

    public DefaultKmsKeyArgs(Output<String> keyArn) {
        this.keyArn = Objects.requireNonNull(keyArn, "expected parameter 'keyArn' to be non-null");
    }

    private DefaultKmsKeyArgs() {
        this.keyArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultKmsKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultKmsKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
        }

        public Builder keyArn(Output<String> keyArn) {
            this.keyArn = Objects.requireNonNull(keyArn);
            return this;
        }
        public Builder keyArn(String keyArn) {
            this.keyArn = Output.of(Objects.requireNonNull(keyArn));
            return this;
        }        public DefaultKmsKeyArgs build() {
            return new DefaultKmsKeyArgs(keyArn);
        }
    }
}
