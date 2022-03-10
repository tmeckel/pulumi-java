// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FileSystemBackupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileSystemBackupPolicyArgs Empty = new FileSystemBackupPolicyArgs();

    @InputImport(name="status", required=true)
      private final Input<String> status;

    public Input<String> getStatus() {
        return this.status;
    }

    public FileSystemBackupPolicyArgs(Input<String> status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private FileSystemBackupPolicyArgs() {
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemBackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemBackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(Input<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(String status) {
            this.status = Input.of(Objects.requireNonNull(status));
            return this;
        }
        public FileSystemBackupPolicyArgs build() {
            return new FileSystemBackupPolicyArgs(status);
        }
    }
}
