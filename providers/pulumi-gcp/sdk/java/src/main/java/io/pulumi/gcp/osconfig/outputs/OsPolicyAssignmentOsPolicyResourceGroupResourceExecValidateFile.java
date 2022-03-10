// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs;
import io.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemote;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFile {
    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
     */
    private final @Nullable Boolean allowInsecure;
    /**
     * A Cloud Storage object.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs gcs;
    /**
     * A local path within the VM to use.
     * 
     */
    private final @Nullable String localPath;
    /**
     * A generic remote file.
     * 
     */
    private final @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemote remote;

    @OutputCustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFile(
        @OutputCustomType.Parameter("allowInsecure") @Nullable Boolean allowInsecure,
        @OutputCustomType.Parameter("gcs") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs gcs,
        @OutputCustomType.Parameter("localPath") @Nullable String localPath,
        @OutputCustomType.Parameter("remote") @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemote remote) {
        this.allowInsecure = allowInsecure;
        this.gcs = gcs;
        this.localPath = localPath;
        this.remote = remote;
    }

    /**
     * Defaults to false. When false, files are subject to validations based on the file type: Remote: A checksum must be specified. Cloud Storage: An object generation number must be specified.
     * 
    */
    public Optional<Boolean> getAllowInsecure() {
        return Optional.ofNullable(this.allowInsecure);
    }
    /**
     * A Cloud Storage object.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs> getGcs() {
        return Optional.ofNullable(this.gcs);
    }
    /**
     * A local path within the VM to use.
     * 
    */
    public Optional<String> getLocalPath() {
        return Optional.ofNullable(this.localPath);
    }
    /**
     * A generic remote file.
     * 
    */
    public Optional<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemote> getRemote() {
        return Optional.ofNullable(this.remote);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInsecure;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs gcs;
        private @Nullable String localPath;
        private @Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemote remote;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInsecure = defaults.allowInsecure;
    	      this.gcs = defaults.gcs;
    	      this.localPath = defaults.localPath;
    	      this.remote = defaults.remote;
        }

        public Builder allowInsecure(@Nullable Boolean allowInsecure) {
            this.allowInsecure = allowInsecure;
            return this;
        }

        public Builder gcs(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileGcs gcs) {
            this.gcs = gcs;
            return this;
        }

        public Builder localPath(@Nullable String localPath) {
            this.localPath = localPath;
            return this;
        }

        public Builder remote(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileRemote remote) {
            this.remote = remote;
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFile build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFile(allowInsecure, gcs, localPath, remote);
        }
    }
}
