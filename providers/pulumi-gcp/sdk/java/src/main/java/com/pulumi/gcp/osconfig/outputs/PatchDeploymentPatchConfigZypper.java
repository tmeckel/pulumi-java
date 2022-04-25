// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PatchDeploymentPatchConfigZypper {
    /**
     * @return Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    private final @Nullable List<String> categories;
    /**
     * @return List of KBs to exclude from update.
     * 
     */
    private final @Nullable List<String> excludes;
    /**
     * @return An exclusive list of kbs to be updated. These are the only patches that will be updated.
     * This field must not be used with other patch configurations.
     * 
     */
    private final @Nullable List<String> exclusivePatches;
    /**
     * @return Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    private final @Nullable List<String> severities;
    /**
     * @return Adds the --with-optional flag to zypper patch.
     * 
     */
    private final @Nullable Boolean withOptional;
    /**
     * @return Adds the --with-update flag, to zypper patch.
     * 
     */
    private final @Nullable Boolean withUpdate;

    @CustomType.Constructor
    private PatchDeploymentPatchConfigZypper(
        @CustomType.Parameter("categories") @Nullable List<String> categories,
        @CustomType.Parameter("excludes") @Nullable List<String> excludes,
        @CustomType.Parameter("exclusivePatches") @Nullable List<String> exclusivePatches,
        @CustomType.Parameter("severities") @Nullable List<String> severities,
        @CustomType.Parameter("withOptional") @Nullable Boolean withOptional,
        @CustomType.Parameter("withUpdate") @Nullable Boolean withUpdate) {
        this.categories = categories;
        this.excludes = excludes;
        this.exclusivePatches = exclusivePatches;
        this.severities = severities;
        this.withOptional = withOptional;
        this.withUpdate = withUpdate;
    }

    /**
     * @return Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    public List<String> categories() {
        return this.categories == null ? List.of() : this.categories;
    }
    /**
     * @return List of KBs to exclude from update.
     * 
     */
    public List<String> excludes() {
        return this.excludes == null ? List.of() : this.excludes;
    }
    /**
     * @return An exclusive list of kbs to be updated. These are the only patches that will be updated.
     * This field must not be used with other patch configurations.
     * 
     */
    public List<String> exclusivePatches() {
        return this.exclusivePatches == null ? List.of() : this.exclusivePatches;
    }
    /**
     * @return Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    public List<String> severities() {
        return this.severities == null ? List.of() : this.severities;
    }
    /**
     * @return Adds the --with-optional flag to zypper patch.
     * 
     */
    public Optional<Boolean> withOptional() {
        return Optional.ofNullable(this.withOptional);
    }
    /**
     * @return Adds the --with-update flag, to zypper patch.
     * 
     */
    public Optional<Boolean> withUpdate() {
        return Optional.ofNullable(this.withUpdate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigZypper defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> categories;
        private @Nullable List<String> excludes;
        private @Nullable List<String> exclusivePatches;
        private @Nullable List<String> severities;
        private @Nullable Boolean withOptional;
        private @Nullable Boolean withUpdate;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigZypper defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
    	      this.severities = defaults.severities;
    	      this.withOptional = defaults.withOptional;
    	      this.withUpdate = defaults.withUpdate;
        }

        public Builder categories(@Nullable List<String> categories) {
            this.categories = categories;
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        public Builder excludes(@Nullable List<String> excludes) {
            this.excludes = excludes;
            return this;
        }
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }
        public Builder exclusivePatches(@Nullable List<String> exclusivePatches) {
            this.exclusivePatches = exclusivePatches;
            return this;
        }
        public Builder exclusivePatches(String... exclusivePatches) {
            return exclusivePatches(List.of(exclusivePatches));
        }
        public Builder severities(@Nullable List<String> severities) {
            this.severities = severities;
            return this;
        }
        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }
        public Builder withOptional(@Nullable Boolean withOptional) {
            this.withOptional = withOptional;
            return this;
        }
        public Builder withUpdate(@Nullable Boolean withUpdate) {
            this.withUpdate = withUpdate;
            return this;
        }        public PatchDeploymentPatchConfigZypper build() {
            return new PatchDeploymentPatchConfigZypper(categories, excludes, exclusivePatches, severities, withOptional, withUpdate);
        }
    }
}
