// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineThumbnailConfigPermissionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineThumbnailConfigPermissionArgs Empty = new PipelineThumbnailConfigPermissionArgs();

    /**
     * The permission that you want to give to the AWS user that you specified in `thumbnail_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
     */
    @Import(name="accesses")
      private final @Nullable Output<List<String>> accesses;

    public Output<List<String>> getAccesses() {
        return this.accesses == null ? Codegen.empty() : this.accesses;
    }

    /**
     * The AWS user or group that you want to have access to thumbnail files.
     * 
     */
    @Import(name="grantee")
      private final @Nullable Output<String> grantee;

    public Output<String> getGrantee() {
        return this.grantee == null ? Codegen.empty() : this.grantee;
    }

    /**
     * Specify the type of value that appears in the `thumbnail_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
     */
    @Import(name="granteeType")
      private final @Nullable Output<String> granteeType;

    public Output<String> getGranteeType() {
        return this.granteeType == null ? Codegen.empty() : this.granteeType;
    }

    public PipelineThumbnailConfigPermissionArgs(
        @Nullable Output<List<String>> accesses,
        @Nullable Output<String> grantee,
        @Nullable Output<String> granteeType) {
        this.accesses = accesses;
        this.grantee = grantee;
        this.granteeType = granteeType;
    }

    private PipelineThumbnailConfigPermissionArgs() {
        this.accesses = Codegen.empty();
        this.grantee = Codegen.empty();
        this.granteeType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineThumbnailConfigPermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> accesses;
        private @Nullable Output<String> grantee;
        private @Nullable Output<String> granteeType;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineThumbnailConfigPermissionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.grantee = defaults.grantee;
    	      this.granteeType = defaults.granteeType;
        }

        public Builder accesses(@Nullable Output<List<String>> accesses) {
            this.accesses = accesses;
            return this;
        }
        public Builder accesses(@Nullable List<String> accesses) {
            this.accesses = Codegen.ofNullable(accesses);
            return this;
        }
        public Builder accesses(String... accesses) {
            return accesses(List.of(accesses));
        }
        public Builder grantee(@Nullable Output<String> grantee) {
            this.grantee = grantee;
            return this;
        }
        public Builder grantee(@Nullable String grantee) {
            this.grantee = Codegen.ofNullable(grantee);
            return this;
        }
        public Builder granteeType(@Nullable Output<String> granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public Builder granteeType(@Nullable String granteeType) {
            this.granteeType = Codegen.ofNullable(granteeType);
            return this;
        }        public PipelineThumbnailConfigPermissionArgs build() {
            return new PipelineThumbnailConfigPermissionArgs(accesses, grantee, granteeType);
        }
    }
}
