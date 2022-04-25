// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.TagTemplateFieldTypeGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagTemplateFieldGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagTemplateFieldGetArgs Empty = new TagTemplateFieldGetArgs();

    /**
     * A description for this field.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this field.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name for this template.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name for this template.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="fieldId", required=true)
    private Output<String> fieldId;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> fieldId() {
        return this.fieldId;
    }

    /**
     * Whether this is a required field. Defaults to false.
     * 
     */
    @Import(name="isRequired")
    private @Nullable Output<Boolean> isRequired;

    /**
     * @return Whether this is a required field. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> isRequired() {
        return Optional.ofNullable(this.isRequired);
    }

    /**
     * - 
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return -
     * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The order of this field with respect to other fields in this tag template.
     * A higher value indicates a more important field. The value can be negative.
     * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return The order of this field with respect to other fields in this tag template.
     * A higher value indicates a more important field. The value can be negative.
     * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * The type of value this tag field can contain.
     * Structure is documented below.
     * 
     */
    @Import(name="type", required=true)
    private Output<TagTemplateFieldTypeGetArgs> type;

    /**
     * @return The type of value this tag field can contain.
     * Structure is documented below.
     * 
     */
    public Output<TagTemplateFieldTypeGetArgs> type() {
        return this.type;
    }

    private TagTemplateFieldGetArgs() {}

    private TagTemplateFieldGetArgs(TagTemplateFieldGetArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.fieldId = $.fieldId;
        this.isRequired = $.isRequired;
        this.name = $.name;
        this.order = $.order;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagTemplateFieldGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagTemplateFieldGetArgs $;

        public Builder() {
            $ = new TagTemplateFieldGetArgs();
        }

        public Builder(TagTemplateFieldGetArgs defaults) {
            $ = new TagTemplateFieldGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description for this field.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this field.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name for this template.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name for this template.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param fieldId The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder fieldId(Output<String> fieldId) {
            $.fieldId = fieldId;
            return this;
        }

        /**
         * @param fieldId The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder fieldId(String fieldId) {
            return fieldId(Output.of(fieldId));
        }

        /**
         * @param isRequired Whether this is a required field. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder isRequired(@Nullable Output<Boolean> isRequired) {
            $.isRequired = isRequired;
            return this;
        }

        /**
         * @param isRequired Whether this is a required field. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder isRequired(Boolean isRequired) {
            return isRequired(Output.of(isRequired));
        }

        /**
         * @param name -
         * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name -
         * The resource name of the tag template field in URL format. Example: projects/{project_id}/locations/{location}/tagTemplates/{tagTemplateId}/fields/{field}
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param order The order of this field with respect to other fields in this tag template.
         * A higher value indicates a more important field. The value can be negative.
         * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The order of this field with respect to other fields in this tag template.
         * A higher value indicates a more important field. The value can be negative.
         * Multiple fields can have the same order, and field orders within a tag do not have to be sequential.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param type The type of value this tag field can contain.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<TagTemplateFieldTypeGetArgs> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of value this tag field can contain.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder type(TagTemplateFieldTypeGetArgs type) {
            return type(Output.of(type));
        }

        public TagTemplateFieldGetArgs build() {
            $.fieldId = Objects.requireNonNull($.fieldId, "expected parameter 'fieldId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
