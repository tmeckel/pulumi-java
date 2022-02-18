// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WindowsUpdateSettingsResponse {
    /**
     * Only apply updates of these windows update classifications. If empty, all updates are applied.
     * 
     */
    private final List<String> classifications;
    /**
     * List of KBs to exclude from update.
     * 
     */
    private final List<String> excludes;
    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
     * 
     */
    private final List<String> exclusivePatches;

    @OutputCustomType.Constructor({"classifications","excludes","exclusivePatches"})
    private WindowsUpdateSettingsResponse(
        List<String> classifications,
        List<String> excludes,
        List<String> exclusivePatches) {
        this.classifications = Objects.requireNonNull(classifications);
        this.excludes = Objects.requireNonNull(excludes);
        this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
    }

    /**
     * Only apply updates of these windows update classifications. If empty, all updates are applied.
     * 
     */
    public List<String> getClassifications() {
        return this.classifications;
    }
    /**
     * List of KBs to exclude from update.
     * 
     */
    public List<String> getExcludes() {
        return this.excludes;
    }
    /**
     * An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations.
     * 
     */
    public List<String> getExclusivePatches() {
        return this.exclusivePatches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> classifications;
        private List<String> excludes;
        private List<String> exclusivePatches;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsUpdateSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classifications = defaults.classifications;
    	      this.excludes = defaults.excludes;
    	      this.exclusivePatches = defaults.exclusivePatches;
        }

        public Builder setClassifications(List<String> classifications) {
            this.classifications = Objects.requireNonNull(classifications);
            return this;
        }

        public Builder setExcludes(List<String> excludes) {
            this.excludes = Objects.requireNonNull(excludes);
            return this;
        }

        public Builder setExclusivePatches(List<String> exclusivePatches) {
            this.exclusivePatches = Objects.requireNonNull(exclusivePatches);
            return this;
        }

        public WindowsUpdateSettingsResponse build() {
            return new WindowsUpdateSettingsResponse(classifications, excludes, exclusivePatches);
        }
    }
}
