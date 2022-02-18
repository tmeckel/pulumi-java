// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies a file available via some URI.
 * 
 */
public final class OSPolicyResourceFileRemoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileRemoteArgs Empty = new OSPolicyResourceFileRemoteArgs();

    /**
     * SHA256 checksum of the remote file.
     * 
     */
    @InputImport(name="sha256Checksum")
    private final @Nullable Input<String> sha256Checksum;

    public Input<String> getSha256Checksum() {
        return this.sha256Checksum == null ? Input.empty() : this.sha256Checksum;
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format `{protocol}://{location}`.
     * 
     */
    @InputImport(name="uri", required=true)
    private final Input<String> uri;

    public Input<String> getUri() {
        return this.uri;
    }

    public OSPolicyResourceFileRemoteArgs(
        @Nullable Input<String> sha256Checksum,
        Input<String> uri) {
        this.sha256Checksum = sha256Checksum;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private OSPolicyResourceFileRemoteArgs() {
        this.sha256Checksum = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sha256Checksum;
        private Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileRemoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        public Builder setSha256Checksum(@Nullable Input<String> sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder setSha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = Input.ofNullable(sha256Checksum);
            return this;
        }

        public Builder setUri(Input<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Input.of(Objects.requireNonNull(uri));
            return this;
        }

        public OSPolicyResourceFileRemoteArgs build() {
            return new OSPolicyResourceFileRemoteArgs(sha256Checksum, uri);
        }
    }
}
