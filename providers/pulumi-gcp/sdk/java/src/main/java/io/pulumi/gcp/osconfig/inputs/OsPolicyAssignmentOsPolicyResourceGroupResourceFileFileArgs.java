// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs();

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @Import(name="allowInsecure")
      private final @Nullable Output<Boolean> allowInsecure;

    public Output<Boolean> getAllowInsecure() {
        return this.allowInsecure == null ? Codegen.empty() : this.allowInsecure;
    }

    /**
     * A Cloud Storage object.
     * 
     */
    @Import(name="gcs")
      private final @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs> gcs;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs> getGcs() {
        return this.gcs == null ? Codegen.empty() : this.gcs;
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @Import(name="localPath")
      private final @Nullable Output<String> localPath;

    public Output<String> getLocalPath() {
        return this.localPath == null ? Codegen.empty() : this.localPath;
    }

    /**
     * A generic remote file.
     * 
     */
    @Import(name="remote")
      private final @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs> remote;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs> getRemote() {
        return this.remote == null ? Codegen.empty() : this.remote;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs(
        @Nullable Output<Boolean> allowInsecure,
        @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs> gcs,
        @Nullable Output<String> localPath,
        @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs> remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs() {
        this.allowInsecure = Codegen.empty();
        this.gcs = Codegen.empty();
        this.localPath = Codegen.empty();
        this.remote = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowInsecure;
        private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs> gcs;
        private @Nullable Output<String> localPath;
        private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs> remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(@Nullable Output<Boolean> allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }
        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = Codegen.ofNullable(allowInsecure);
            return this;
        }
        public Builder gcs(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs> gcs) {
            this.gcs = gcs;
            return this;
        }
        public Builder gcs(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGcsArgs gcs) {
            this.gcs = Codegen.ofNullable(gcs);
            return this;
        }
        public Builder localPath(@Nullable Output<String> localPath) {
            this.localPath = localPath;
            return this;
        }
        public Builder localPath(@Nullable String localPath) {
            this.localPath = Codegen.ofNullable(localPath);
            return this;
        }
        public Builder remote(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs> remote) {
            this.remote = remote;
            return this;
        }
        public Builder remote(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileRemoteArgs remote) {
            this.remote = Codegen.ofNullable(remote);
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileArgs(allowInsecure, gcs, localPath, remote);
        }
    }
}
