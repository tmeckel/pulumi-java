// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AmiLaunchPermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmiLaunchPermissionArgs Empty = new AmiLaunchPermissionArgs();

    /**
     * An AWS Account ID to add launch permissions.
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="imageId", required=true)
      private final Output<String> imageId;

    public Output<String> getImageId() {
        return this.imageId;
    }

    public AmiLaunchPermissionArgs(
        Output<String> accountId,
        Output<String> imageId) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.imageId = Objects.requireNonNull(imageId, "expected parameter 'imageId' to be non-null");
    }

    private AmiLaunchPermissionArgs() {
        this.accountId = Codegen.empty();
        this.imageId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiLaunchPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private Output<String> imageId;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiLaunchPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.imageId = defaults.imageId;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder imageId(Output<String> imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Output.of(Objects.requireNonNull(imageId));
            return this;
        }        public AmiLaunchPermissionArgs build() {
            return new AmiLaunchPermissionArgs(accountId, imageId);
        }
    }
}
