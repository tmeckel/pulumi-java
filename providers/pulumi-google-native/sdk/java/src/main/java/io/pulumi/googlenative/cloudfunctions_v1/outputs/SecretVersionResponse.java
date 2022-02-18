// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SecretVersionResponse {
    /**
     * Relative path of the file under the mount path where the secret value for this version will be fetched and made available. For example, setting the mount_path as '/etc/secrets' and path as `/secret_foo` would mount the secret value file at `/etc/secrets/secret_foo`.
     * 
     */
    private final String path;
    /**
     * Version of the secret (version number or the string 'latest'). It is preferrable to use `latest` version with secret volumes as secret value changes are reflected immediately.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"path","version"})
    private SecretVersionResponse(
        String path,
        String version) {
        this.path = Objects.requireNonNull(path);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Relative path of the file under the mount path where the secret value for this version will be fetched and made available. For example, setting the mount_path as '/etc/secrets' and path as `/secret_foo` would mount the secret value file at `/etc/secrets/secret_foo`.
     * 
     */
    public String getPath() {
        return this.path;
    }
    /**
     * Version of the secret (version number or the string 'latest'). It is preferrable to use `latest` version with secret volumes as secret value changes are reflected immediately.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public SecretVersionResponse build() {
            return new SecretVersionResponse(path, version);
        }
    }
}
