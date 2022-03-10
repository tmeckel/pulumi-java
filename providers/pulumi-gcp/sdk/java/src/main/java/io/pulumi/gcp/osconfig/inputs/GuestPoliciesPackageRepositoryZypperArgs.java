// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesPackageRepositoryZypperArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesPackageRepositoryZypperArgs Empty = new GuestPoliciesPackageRepositoryZypperArgs();

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
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public GuestPoliciesPackageRepositoryZypperArgs(
        Input<String> baseUrl,
        @Nullable Input<String> displayName,
        @Nullable Input<List<String>> gpgKeys,
        Input<String> id) {
        this.baseUrl = Objects.requireNonNull(baseUrl, "expected parameter 'baseUrl' to be non-null");
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GuestPoliciesPackageRepositoryZypperArgs() {
        this.baseUrl = Input.empty();
        this.displayName = Input.empty();
        this.gpgKeys = Input.empty();
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepositoryZypperArgs defaults) {
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

        public Builder(GuestPoliciesPackageRepositoryZypperArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
    	      this.id = defaults.id;
        }

        public Builder baseUrl(Input<String> baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Input.of(Objects.requireNonNull(baseUrl));
            return this;
        }

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder gpgKeys(@Nullable Input<List<String>> gpgKeys) {
            this.gpgKeys = gpgKeys;
            return this;
        }

        public Builder gpgKeys(@Nullable List<String> gpgKeys) {
            this.gpgKeys = Input.ofNullable(gpgKeys);
            return this;
        }

        public Builder id(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder id(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }
        public GuestPoliciesPackageRepositoryZypperArgs build() {
            return new GuestPoliciesPackageRepositoryZypperArgs(baseUrl, displayName, gpgKeys, id);
        }
    }
}
