// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TagTemplateFieldTypeEnumTypeAllowedValue {
    /**
     * The display name for this template.
     * 
     */
    private final String displayName;

    @OutputCustomType.Constructor
    private TagTemplateFieldTypeEnumTypeAllowedValue(@OutputCustomType.Parameter("displayName") String displayName) {
        this.displayName = displayName;
    }

    /**
     * The display name for this template.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeEnumTypeAllowedValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeEnumTypeAllowedValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public TagTemplateFieldTypeEnumTypeAllowedValue build() {
            return new TagTemplateFieldTypeEnumTypeAllowedValue(displayName);
        }
    }
}
