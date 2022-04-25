// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemote {
    /**
     * @return SHA256 checksum of the remote file.
     * 
     */
    private final @Nullable String sha256Checksum;
    /**
     * @return Required. URI for this repository.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemote(
        @CustomType.Parameter("sha256Checksum") @Nullable String sha256Checksum,
        @CustomType.Parameter("uri") String uri) {
        this.sha256Checksum = sha256Checksum;
        this.uri = uri;
    }

    /**
     * @return SHA256 checksum of the remote file.
     * 
     */
    public Optional<String> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }
    /**
     * @return Required. URI for this repository.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemote defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sha256Checksum;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemote defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Checksum = defaults.sha256Checksum;
    	      this.uri = defaults.uri;
        }

        public Builder sha256Checksum(@Nullable String sha256Checksum) {
            this.sha256Checksum = sha256Checksum;
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemote build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgRpmSourceRemote(sha256Checksum, uri);
        }
    }
}
