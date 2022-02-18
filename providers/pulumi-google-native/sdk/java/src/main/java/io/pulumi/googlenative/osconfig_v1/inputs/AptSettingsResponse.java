// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Apt patching is completed by executing `apt-get update && apt-get upgrade`. Additional options can be set to control how this is executed.
 * 
 */
public final class AptSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AptSettingsResponse Empty = new AptSettingsResponse();

    /**
     * List of packages to exclude from update. These packages will be excluded
     * 
     */
    @InputImport(name="excludes", required=true)
    private final List<String> excludes;

    public List<String> getExcludes() {
        return this.excludes;
    }

    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated. If these packages are not installed, they will be ignored. This field cannot be specified with any other patch configuration fields.
     * 
     */
    @InputImport(name="exclusivePackages", required=true)
    private final List<String> exclusivePackages;

    public List<String> getExclusivePackages() {
        return this.exclusivePackages;
    }

    /**
     * By changing the type to DIST, the patching is performed using `apt-get dist-upgrade` instead.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public AptSettingsResponse(
        List<String> excludes,
        List<String> exclusivePackages,
        String type) {
        this.excludes = Objects.requireNonNull(excludes, "expected parameter 'excludes' to be non-null");
        this.exclusivePackages = Objects.requireNonNull(exclusivePackages, "expected parameter 'exclusivePackages' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AptSettingsResponse() {
        this.excludes = List.of();
        this.exclusivePackages = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AptSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> excludes;
        private List<String> exclusivePackages;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AptSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.type = defaults.type;
        }

        public Builder setExcludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }

        public Builder setExclusivePackages(List<String> exclusivePackages) {
            this.exclusivePackages = Objects.requireNonNull(exclusivePackages);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AptSettingsResponse build() {
            return new AptSettingsResponse(excludes, exclusivePackages, type);
        }
    }
}
