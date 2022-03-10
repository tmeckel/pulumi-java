// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageTemplateWindowsUpdateCustomizerResponse {
    /**
     * Array of filters to select updates to apply. Omit or specify empty array to use the default (no filter). Refer to above link for examples and detailed description of this field.
     * 
     */
    private final @Nullable List<String> filters;
    /**
     * Friendly Name to provide context on what this customization step does
     * 
     */
    private final @Nullable String name;
    /**
     * Criteria to search updates. Omit or specify empty string to use the default (search all). Refer to above link for examples and detailed description of this field.
     * 
     */
    private final @Nullable String searchCriteria;
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'WindowsUpdate'.
     * 
     */
    private final String type;
    /**
     * Maximum number of updates to apply at a time. Omit or specify 0 to use the default (1000)
     * 
     */
    private final @Nullable Integer updateLimit;

    @OutputCustomType.Constructor
    private ImageTemplateWindowsUpdateCustomizerResponse(
        @OutputCustomType.Parameter("filters") @Nullable List<String> filters,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("searchCriteria") @Nullable String searchCriteria,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("updateLimit") @Nullable Integer updateLimit) {
        this.filters = filters;
        this.name = name;
        this.searchCriteria = searchCriteria;
        this.type = type;
        this.updateLimit = updateLimit;
    }

    /**
     * Array of filters to select updates to apply. Omit or specify empty array to use the default (no filter). Refer to above link for examples and detailed description of this field.
     * 
    */
    public List<String> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * Friendly Name to provide context on what this customization step does
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Criteria to search updates. Omit or specify empty string to use the default (search all). Refer to above link for examples and detailed description of this field.
     * 
    */
    public Optional<String> getSearchCriteria() {
        return Optional.ofNullable(this.searchCriteria);
    }
    /**
     * The type of customization tool you want to use on the Image. For example, "Shell" can be shell customizer
     * Expected value is 'WindowsUpdate'.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Maximum number of updates to apply at a time. Omit or specify 0 to use the default (1000)
     * 
    */
    public Optional<Integer> getUpdateLimit() {
        return Optional.ofNullable(this.updateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateWindowsUpdateCustomizerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> filters;
        private @Nullable String name;
        private @Nullable String searchCriteria;
        private String type;
        private @Nullable Integer updateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateWindowsUpdateCustomizerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.searchCriteria = defaults.searchCriteria;
    	      this.type = defaults.type;
    	      this.updateLimit = defaults.updateLimit;
        }

        public Builder filters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder searchCriteria(@Nullable String searchCriteria) {
            this.searchCriteria = searchCriteria;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder updateLimit(@Nullable Integer updateLimit) {
            this.updateLimit = updateLimit;
            return this;
        }
        public ImageTemplateWindowsUpdateCustomizerResponse build() {
            return new ImageTemplateWindowsUpdateCustomizerResponse(filters, name, searchCriteria, type, updateLimit);
        }
    }
}
