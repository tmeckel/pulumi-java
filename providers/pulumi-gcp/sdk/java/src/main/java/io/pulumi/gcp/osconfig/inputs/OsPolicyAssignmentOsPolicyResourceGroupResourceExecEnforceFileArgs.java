// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs();

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    @InputImport(name="allowInsecure")
      private final @Nullable Input<Boolean> allowInsecure;

    public Input<Boolean> getAllowInsecure() {
        return this.allowInsecure == null ? Input.empty() : this.allowInsecure;
    }

    /**
     * A Cloud Storage object.
     * 
     */
    @InputImport(name="gcs")
      private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs> gcs;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs> getGcs() {
        return this.gcs == null ? Input.empty() : this.gcs;
    }

    /**
     * A local path within the VM to use.
     * 
     */
    @InputImport(name="localPath")
      private final @Nullable Input<String> localPath;

    public Input<String> getLocalPath() {
        return this.localPath == null ? Input.empty() : this.localPath;
    }

    /**
     * A generic remote file.
     * 
     */
    @InputImport(name="remote")
      private final @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs> remote;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs> getRemote() {
        return this.remote == null ? Input.empty() : this.remote;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs(
        @Nullable Input<Boolean> allowInsecure,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs> gcs,
        @Nullable Input<String> localPath,
        @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs> remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs() {
        this.allowInsecure = Input.empty();
        this.gcs = Input.empty();
        this.localPath = Input.empty();
        this.remote = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowInsecure;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs> gcs;
        private @Nullable Input<String> localPath;
        private @Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs> remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(@Nullable Input<Boolean> allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = Input.ofNullable(allowInsecure);
            return this;
        }

        public Builder gcs(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs> gcs) {
            this.gcs = gcs;
            return this;
        }

        public Builder gcs(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileGcsArgs gcs) {
            this.gcs = Input.ofNullable(gcs);
            return this;
        }

        public Builder localPath(@Nullable Input<String> localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder localPath(@Nullable String localPath) {
            this.localPath = Input.ofNullable(localPath);
            return this;
        }

        public Builder remote(@Nullable Input<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs> remote) {
            this.remote = remote;
            return this;
        }

        public Builder remote(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs remote) {
            this.remote = Input.ofNullable(remote);
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs(allowInsecure, gcs, localPath, remote);
        }
    }
}
