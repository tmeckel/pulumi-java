// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="baseUrl", required=true)
      private final Output<String> baseUrl;

    public Output<String> getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * The display name of the repository.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * URIs of GPG keys.
     * 
     */
    @Import(name="gpgKeys")
      private final @Nullable Output<List<String>> gpgKeys;

    public Output<List<String>> getGpgKeys() {
        return this.gpgKeys == null ? Codegen.empty() : this.gpgKeys;
    }

    /**
     * A one word, unique name for this repository. This is the `repo id` in the zypper config file and also the `display_name` if `display_name` is omitted. This id is also used as the unique identifier when checking for GuestPolicy conflicts.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    public OSPolicyResourceRepositoryResourceZypperRepositoryArgs(
        Output<String> baseUrl,
        @Nullable Output<String> displayName,
        @Nullable Output<List<String>> gpgKeys,
        Output<String> id) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private OSPolicyResourceRepositoryResourceZypperRepositoryArgs() {
        this.baseUrl = Codegen.empty();
        this.displayName = Codegen.empty();
        this.gpgKeys = Codegen.empty();
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceZypperRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> baseUrl;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<String>> gpgKeys;
        private Output<String> id;

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

        public Builder baseUrl(Output<String> baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Output.of(Objects.requireNonNull(baseUrl));
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder gpgKeys(@Nullable Output<List<String>> gpgKeys) {
            this.gpgKeys = gpgKeys;
            return this;
        }
        public Builder gpgKeys(@Nullable List<String> gpgKeys) {
            this.gpgKeys = Codegen.ofNullable(gpgKeys);
            return this;
        }
        public Builder gpgKeys(String... gpgKeys) {
            return gpgKeys(List.of(gpgKeys));
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }        public OSPolicyResourceRepositoryResourceZypperRepositoryArgs build() {
            return new OSPolicyResourceRepositoryResourceZypperRepositoryArgs(baseUrl, displayName, gpgKeys, id);
        }
    }
}
