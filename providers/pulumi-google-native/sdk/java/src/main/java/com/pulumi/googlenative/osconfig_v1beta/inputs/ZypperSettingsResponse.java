// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Zypper patching is performed by running `zypper patch`. See also https://en.opensuse.org/SDB:Zypper_manual.
 * 
 */
public final class ZypperSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ZypperSettingsResponse Empty = new ZypperSettingsResponse();

    /**
     * Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    @Import(name="categories", required=true)
    private List<String> categories;

    /**
     * @return Install only patches with these categories. Common categories include security, recommended, and feature.
     * 
     */
    public List<String> categories() {
        return this.categories;
    }

    /**
     * List of patches to exclude from update.
     * 
     */
    @Import(name="excludes", required=true)
    private List<String> excludes;

    /**
     * @return List of patches to exclude from update.
     * 
     */
    public List<String> excludes() {
        return this.excludes;
    }

    /**
     * An exclusive list of patches to be updated. These are the only patches that will be installed using &#39;zypper patch patch:&#39; command. This field must not be used with any other patch configuration fields.
     * 
     */
    @Import(name="exclusivePatches", required=true)
    private List<String> exclusivePatches;

    /**
     * @return An exclusive list of patches to be updated. These are the only patches that will be installed using &#39;zypper patch patch:&#39; command. This field must not be used with any other patch configuration fields.
     * 
     */
    public List<String> exclusivePatches() {
        return this.exclusivePatches;
    }

    /**
     * Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    @Import(name="severities", required=true)
    private List<String> severities;

    /**
     * @return Install only patches with these severities. Common severities include critical, important, moderate, and low.
     * 
     */
    public List<String> severities() {
        return this.severities;
    }

    /**
     * Adds the `--with-optional` flag to `zypper patch`.
     * 
     */
    @Import(name="withOptional", required=true)
    private Boolean withOptional;

    /**
     * @return Adds the `--with-optional` flag to `zypper patch`.
     * 
     */
    public Boolean withOptional() {
        return this.withOptional;
    }

    /**
     * Adds the `--with-update` flag, to `zypper patch`.
     * 
     */
    @Import(name="withUpdate", required=true)
    private Boolean withUpdate;

    /**
     * @return Adds the `--with-update` flag, to `zypper patch`.
     * 
     */
    public Boolean withUpdate() {
        return this.withUpdate;
    }

    private ZypperSettingsResponse() {}

    private ZypperSettingsResponse(ZypperSettingsResponse $) {
        this.categories = $.categories;
        this.excludes = $.excludes;
        this.exclusivePatches = $.exclusivePatches;
        this.severities = $.severities;
        this.withOptional = $.withOptional;
        this.withUpdate = $.withUpdate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZypperSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZypperSettingsResponse $;

        public Builder() {
            $ = new ZypperSettingsResponse();
        }

        public Builder(ZypperSettingsResponse defaults) {
            $ = new ZypperSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories Install only patches with these categories. Common categories include security, recommended, and feature.
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories Install only patches with these categories. Common categories include security, recommended, and feature.
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param excludes List of patches to exclude from update.
         * 
         * @return builder
         * 
         */
        public Builder excludes(List<String> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes List of patches to exclude from update.
         * 
         * @return builder
         * 
         */
        public Builder excludes(String... excludes) {
            return excludes(List.of(excludes));
        }

        /**
         * @param exclusivePatches An exclusive list of patches to be updated. These are the only patches that will be installed using &#39;zypper patch patch:&#39; command. This field must not be used with any other patch configuration fields.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePatches(List<String> exclusivePatches) {
            $.exclusivePatches = exclusivePatches;
            return this;
        }

        /**
         * @param exclusivePatches An exclusive list of patches to be updated. These are the only patches that will be installed using &#39;zypper patch patch:&#39; command. This field must not be used with any other patch configuration fields.
         * 
         * @return builder
         * 
         */
        public Builder exclusivePatches(String... exclusivePatches) {
            return exclusivePatches(List.of(exclusivePatches));
        }

        /**
         * @param severities Install only patches with these severities. Common severities include critical, important, moderate, and low.
         * 
         * @return builder
         * 
         */
        public Builder severities(List<String> severities) {
            $.severities = severities;
            return this;
        }

        /**
         * @param severities Install only patches with these severities. Common severities include critical, important, moderate, and low.
         * 
         * @return builder
         * 
         */
        public Builder severities(String... severities) {
            return severities(List.of(severities));
        }

        /**
         * @param withOptional Adds the `--with-optional` flag to `zypper patch`.
         * 
         * @return builder
         * 
         */
        public Builder withOptional(Boolean withOptional) {
            $.withOptional = withOptional;
            return this;
        }

        /**
         * @param withUpdate Adds the `--with-update` flag, to `zypper patch`.
         * 
         * @return builder
         * 
         */
        public Builder withUpdate(Boolean withUpdate) {
            $.withUpdate = withUpdate;
            return this;
        }

        public ZypperSettingsResponse build() {
            $.categories = Objects.requireNonNull($.categories, "expected parameter 'categories' to be non-null");
            $.excludes = Objects.requireNonNull($.excludes, "expected parameter 'excludes' to be non-null");
            $.exclusivePatches = Objects.requireNonNull($.exclusivePatches, "expected parameter 'exclusivePatches' to be non-null");
            $.severities = Objects.requireNonNull($.severities, "expected parameter 'severities' to be non-null");
            $.withOptional = Objects.requireNonNull($.withOptional, "expected parameter 'withOptional' to be non-null");
            $.withUpdate = Objects.requireNonNull($.withUpdate, "expected parameter 'withUpdate' to be non-null");
            return $;
        }
    }

}
