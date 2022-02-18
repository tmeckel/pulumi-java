// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a single zypper package repository. These are added to a repo file that is managed at `/etc/zypp/repos.d/google_osconfig.repo`.
 * 
 */
public final class OSPolicyResourceRepositoryResourceZypperRepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceRepositoryResourceZypperRepositoryArgs Empty = new OSPolicyResourceRepositoryResourceZypperRepositoryArgs();

    /**
     * The location of the repository directory.
     * 
     */
    @InputImport(name="baseUrl", required=true)
    private final Input<String> baseUrl;

    public Input<String> getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @InputImport(name="gpgKeys")
    private final @Nullable Input<List<String>> gpgKeys;

    public Input<List<String>> getGpgKeys() {
        return this.gpgKeys == null ? Input.empty() : this.gpgKeys;
    }

    /**
     * A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public OSPolicyResourceRepositoryResourceZypperRepositoryArgs(
        Input<String> baseUrl,
        @Nullable Input<String> displayName,
        @Nullable Input<List<String>> gpgKeys,
        Input<String> id) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private OSPolicyResourceRepositoryResourceZypperRepositoryArgs() {
        this.baseUrl = Input.empty();
        this.displayName = Input.empty();
        this.gpgKeys = Input.empty();
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceZypperRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> baseUrl;
        private @Nullable Input<String> displayName;
        private @Nullable Input<List<String>> gpgKeys;
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceZypperRepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
    	      this.id = defaults.id;
        }

        public Builder setBaseUrl(Input<String> baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder setBaseUrl(String baseUrl) {
            this.baseUrl = Input.of(Objects.requireNonNull(baseUrl));
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setGpgKeys(@Nullable Input<List<String>> gpgKeys) {
            this.gpgKeys = gpgKeys;
            return this;
        }

        public Builder setGpgKeys(@Nullable List<String> gpgKeys) {
            this.gpgKeys = Input.ofNullable(gpgKeys);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public OSPolicyResourceRepositoryResourceZypperRepositoryArgs build() {
            return new OSPolicyResourceRepositoryResourceZypperRepositoryArgs(baseUrl, displayName, gpgKeys, id);
        }
    }
}
