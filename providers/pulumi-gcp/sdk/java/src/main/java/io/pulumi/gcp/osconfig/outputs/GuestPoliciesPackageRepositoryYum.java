// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesPackageRepositoryYum {
    /**
     * The location of the repository directory.
     * 
     */
    private final String baseUrl;
    /**
     * The display name of the repository.
     * 
     */
    private final @Nullable String displayName;
    /**
     * URIs of GPG keys.
     * 
     */
    private final @Nullable List<String> gpgKeys;
    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor
    private GuestPoliciesPackageRepositoryYum(
        @OutputCustomType.Parameter("baseUrl") String baseUrl,
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("gpgKeys") @Nullable List<String> gpgKeys,
        @OutputCustomType.Parameter("id") String id) {
        this.baseUrl = baseUrl;
        this.displayName = displayName;
        this.gpgKeys = gpgKeys;
        this.id = id;
    }

    /**
     * The location of the repository directory.
     * 
    */
    public String getBaseUrl() {
        return this.baseUrl;
    }
    /**
     * The display name of the repository.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * URIs of GPG keys.
     * 
    */
    public List<String> getGpgKeys() {
        return this.gpgKeys == null ? List.of() : this.gpgKeys;
    }
    /**
     * Id of the artifact, which the installation and update steps of this recipe can reference.
     * Artifacts in a recipe cannot have the same id.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesPackageRepositoryYum defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseUrl;
        private @Nullable String displayName;
        private @Nullable List<String> gpgKeys;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesPackageRepositoryYum defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseUrl = defaults.baseUrl;
    	      this.displayName = defaults.displayName;
    	      this.gpgKeys = defaults.gpgKeys;
    	      this.id = defaults.id;
        }

        public Builder baseUrl(String baseUrl) {
            this.baseUrl = Objects.requireNonNull(baseUrl);
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder gpgKeys(@Nullable List<String> gpgKeys) {
            this.gpgKeys = gpgKeys;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GuestPoliciesPackageRepositoryYum build() {
            return new GuestPoliciesPackageRepositoryYum(baseUrl, displayName, gpgKeys, id);
        }
    }
}
