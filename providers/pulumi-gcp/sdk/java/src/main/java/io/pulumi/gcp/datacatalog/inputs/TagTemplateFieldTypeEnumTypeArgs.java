// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeEnumTypeAllowedValueArgs;
import java.util.List;
import java.util.Objects;


public final class TagTemplateFieldTypeEnumTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldTypeEnumTypeArgs Empty = new TagTemplateFieldTypeEnumTypeArgs();

    /**
     * The set of allowed values for this enum. The display names of the
     * values must be case-insensitively unique within this set. Currently,
     * enum values can only be added to the list of allowed values. Deletion
     * and renaming of enum values are not supported.
     * Can have up to 500 allowed values.
     * Structure is documented below.
     * 
     */
    @InputImport(name="allowedValues", required=true)
      private final Input<List<TagTemplateFieldTypeEnumTypeAllowedValueArgs>> allowedValues;

    public Input<List<TagTemplateFieldTypeEnumTypeAllowedValueArgs>> getAllowedValues() {
        return this.allowedValues;
    }

    public TagTemplateFieldTypeEnumTypeArgs(Input<List<TagTemplateFieldTypeEnumTypeAllowedValueArgs>> allowedValues) {
        this.allowedValues = Objects.requireNonNull(allowedValues, "expected parameter 'allowedValues' to be non-null");
    }

    private TagTemplateFieldTypeEnumTypeArgs() {
        this.allowedValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeEnumTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<TagTemplateFieldTypeEnumTypeAllowedValueArgs>> allowedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeEnumTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
        }

        public Builder allowedValues(Input<List<TagTemplateFieldTypeEnumTypeAllowedValueArgs>> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }

        public Builder allowedValues(List<TagTemplateFieldTypeEnumTypeAllowedValueArgs> allowedValues) {
            this.allowedValues = Input.of(Objects.requireNonNull(allowedValues));
            return this;
        }
        public TagTemplateFieldTypeEnumTypeArgs build() {
            return new TagTemplateFieldTypeEnumTypeArgs(allowedValues);
        }
    }
}
