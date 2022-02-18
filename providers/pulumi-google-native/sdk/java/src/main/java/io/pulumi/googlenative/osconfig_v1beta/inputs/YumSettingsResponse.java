// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Yum patching is performed by executing `yum update`. Additional options can be set to control how this is executed. Note that not all settings are supported on all platforms.
 * 
 */
public final class YumSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final YumSettingsResponse Empty = new YumSettingsResponse();

    /**
     * List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
     * 
     */
    @InputImport(name="excludes", required=true)
    private final List<String> excludes;

    public List<String> getExcludes() {
        return this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
     * 
     */
    @InputImport(name="exclusivePackages", required=true)
    private final List<String> exclusivePackages;

    public List<String> getExclusivePackages() {
        return this.exclusivePackages;
    }

    /**
     * Will cause patch to run `yum update-minimal` instead.
     * 
     */
    @InputImport(name="minimal", required=true)
    private final Boolean minimal;

    public Boolean getMinimal() {
        return this.minimal;
    }

    /**
     * Adds the `--security` flag to `yum update`. Not supported on all platforms.
     * 
     */
    @InputImport(name="security", required=true)
    private final Boolean security;

    public Boolean getSecurity() {
        return this.security;
    }

    public YumSettingsResponse(
        List<String> excludes,
        List<String> exclusivePackages,
        Boolean minimal,
        Boolean security) {
        this.excludes = Objects.requireNonNull(excludes, "expected parameter 'excludes' to be non-null");
        this.exclusivePackages = Objects.requireNonNull(exclusivePackages, "expected parameter 'exclusivePackages' to be non-null");
        this.minimal = Objects.requireNonNull(minimal, "expected parameter 'minimal' to be non-null");
        this.security = Objects.requireNonNull(security, "expected parameter 'security' to be non-null");
    }

    private YumSettingsResponse() {
        this.excludes = List.of();
        this.exclusivePackages = List.of();
        this.minimal = null;
        this.security = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(YumSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> excludes;
        private List<String> exclusivePackages;
        private Boolean minimal;
        private Boolean security;

        public Builder() {
    	      // Empty
        }

        public Builder(YumSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.minimal = defaults.minimal;
    	      this.security = defaults.security;
        }

        public Builder setExcludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }

        public Builder setExclusivePackages(List<String> exclusivePackages) {
            this.exclusivePackages = Objects.requireNonNull(exclusivePackages);
            return this;
        }

        public Builder setMinimal(Boolean minimal) {
            this.minimal = Objects.requireNonNull(minimal);
            return this;
        }

        public Builder setSecurity(Boolean security) {
            this.security = Objects.requireNonNull(security);
            return this;
        }

        public YumSettingsResponse build() {
            return new YumSettingsResponse(excludes, exclusivePackages, minimal, security);
        }
    }
}
