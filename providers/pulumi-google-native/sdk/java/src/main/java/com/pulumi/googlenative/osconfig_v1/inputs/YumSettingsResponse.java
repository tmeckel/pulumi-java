// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Yum patching is performed by executing `yum update`. Additional options can be set to control how this is executed. Note that not all settings are supported on all platforms.
 * 
 */
public final class YumSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final YumSettingsResponse Empty = new YumSettingsResponse();

    /**
     * List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
     * 
     */
    @Import(name="excludes", required=true)
    private List<String> excludes;

    /**
     * @return List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
     * 
     */
    public List<String> excludes() {
        return this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePackages", required=true)
    private List<String> exclusivePackages;

    /**
     * @return An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
     * 
     */
    public List<String> exclusivePackages() {
        return this.exclusivePackages;
    }

    /**
     * Will cause patch to run `yum update-minimal` instead.
     * 
     */
    @Import(name="minimal", required=true)
    private Boolean minimal;

    /**
     * @return Will cause patch to run `yum update-minimal` instead.
     * 
     */
    public Boolean minimal() {
        return this.minimal;
    }

    /**
     * Adds the `--security` flag to `yum update`. Not supported on all platforms.
     * 
     */
    @Import(name="security", required=true)
    private Boolean security;

    /**
     * @return Adds the `--security` flag to `yum update`. Not supported on all platforms.
     * 
     */
    public Boolean security() {
        return this.security;
    }

    private YumSettingsResponse() {}

    private YumSettingsResponse(YumSettingsResponse $) {
        this.excludes = $.excludes;
        this.exclusivePackages = $.exclusivePackages;
        this.minimal = $.minimal;
        this.security = $.security;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(YumSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private YumSettingsResponse $;

        public Builder() {
            $ = new YumSettingsResponse();
        }

        public Builder(YumSettingsResponse defaults) {
            $ = new YumSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludes List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<String> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes List of packages to exclude from update. These packages are excluded by using the yum `--exclude` flag.
         * 
         * @return builder
         * 
         */
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param exclusivePackages An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePackages(List<String> exclusivePackages) {
            $.exclusivePackages = exclusivePackages;
            return this;
        }

        /**
         * @param exclusivePackages An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field must not be specified with any other patch configuration fields.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePackages(String... exclusivePackages) {
            return exclusivePackages(List.of(exclusivePackages));
        }

        /**
         * @param minimal Will cause patch to run `yum update-minimal` instead.
         * 
         * @return builder
         * 
         */
        public Builder minimal(Boolean minimal) {
            $.minimal = minimal;
            return this;
        }

        /**
         * @param security Adds the `--security` flag to `yum update`. Not supported on all platforms.
         * 
         * @return builder
         * 
         */
        public Builder security(Boolean security) {
            $.security = security;
            return this;
        }

        public YumSettingsResponse build() {
            $.excludes = Objects.requireNonNull($.excludes, "expected parameter 'excludes' to be non-null");
            $.exclusivePackages = Objects.requireNonNull($.exclusivePackages, "expected parameter 'exclusivePackages' to be non-null");
            $.minimal = Objects.requireNonNull($.minimal, "expected parameter 'minimal' to be non-null");
            $.security = Objects.requireNonNull($.security, "expected parameter 'security' to be non-null");
            return $;
        }
    }

}
